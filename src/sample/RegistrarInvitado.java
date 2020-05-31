package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import sample.Bsn.invitadoBsn;

import java.util.ArrayList;
import java.util.List;

public class RegistrarInvitado {

    ObservableList<String> generos =
            FXCollections.observableArrayList(
                    "Masculino",
                    "Femenino"
            );
    ObservableList<String> menus =
            FXCollections.observableArrayList(
                    "Vegetariano",
                    "Vegano",
                    "Carnes",
                    "Comida de mar",
                    "Variados"
            );


    @FXML
    protected ComboBox opcionGenero = new ComboBox(generos);
    @FXML
    protected ComboBox opcionMenu= new ComboBox(menus);
    @FXML
    private TextField txtid;
    @FXML
    private TextField txtnom;
    @FXML
    private TextField txtnrodoc;
    @FXML
    private TextField txttel;
    @FXML
    private TextField txtap;
    @FXML
    private TextField txtedad;

    private invitadoBsn invitadoBsn = new invitadoBsn();

    @FXML
    public void initialize() {
        txtnrodoc.setTextFormatter(new TextFormatter<>(change -> {
            if (change.getControlNewText().matches("([1-9][0-9]*)?") && change.getControlNewText().length() <= 12) {
                return change;
            }
            return null;
        }));
        txtedad.setTextFormatter(new TextFormatter<>(change -> {
                    if (change.getControlNewText().matches("([1-9][0-9]*)?") && change.getControlNewText().length() <= 12) {
                        return change;
                    }
                    return null;
                }));
        txttel.setTextFormatter(new TextFormatter<>(change -> {
                            if (change.getControlNewText().matches("([1-9][0-9]*)?") && change.getControlNewText().length() <= 12) {
                                return change;
                            }
                            return null;
                        }));

    }



    public void opcionGenero_click(){
        opcionGenero.setItems(generos);

    }

    public void opcionMenu_click(){
        opcionMenu.setItems(menus);

    }


    public void btGuardar_accion(){
        String id = txtid.getText().trim();
        String nom = txtnom.getText().trim();
        String ap = txtap.getText().trim();
        int edad = Integer.parseInt(txtedad.getText().trim());
        int nrodoc = Integer.parseInt(txtnrodoc.getText().trim());
        int tel = Integer.parseInt(txttel.getText().trim());
        String genero = (String) opcionGenero.getValue();
        String menu = (String) opcionMenu.getValue();
        invitado Invitado = new invitado(id,nrodoc,nom,ap,genero,edad,tel,menu);

        invitadoBsn.registrarInvitado(Invitado);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro de invitado");
        alert.setContentText("El registro ha sido exitoso");
        alert.showAndWait();
        limpiarCampos();

    }

    public void limpiarCampos(){
        txtid.clear();
        txtap.clear();
        txtedad.clear();
        txtnom.clear();
        txtnrodoc.clear();
        txttel.clear();
        opcionMenu.getSelectionModel().clearSelection();
        opcionGenero.getSelectionModel().clearSelection();
    }



}
