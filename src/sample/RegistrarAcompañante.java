package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import sample.Bsn.invitadoBsn;

import java.util.List;

public class RegistrarAcompañante {

    ObservableList<String> menus =
            FXCollections.observableArrayList(
                    "Vegetariano",
                    "Vegano",
                    "Carnes",
                    "Comida de mar",
                    "Variados"
            );

    invitadoBsn invBsn = new invitadoBsn();
    @FXML
    ComboBox opcMenu;
    @FXML
    ComboBox<String> opcInvi;
    @FXML
    TextField txtCed;
    @FXML
    TextField txtNom;
    @FXML
    TextField txtTel;

    List<invitado> invitados = invBsn.listarInvitados();
    List<String> idInvitados = invBsn.listarIdInvitados();
    @FXML
    public void initialize(){


        ObservableList<String> invitadosObservables = FXCollections.observableList(idInvitados);
        opcInvi.setItems(invitadosObservables);
        opcMenu.setItems(menus);
    }

    public void btGuardar_accion(){
        int cedula = Integer.parseInt(txtCed.getText());
        String nombre = txtNom.getText();
        int telefono = Integer.parseInt(txtTel.getText());
        String menu = (String) opcMenu.getValue();
        String idInv2 = String.valueOf(opcInvi.getValue());
        invitado invi = null;
        for (invitado Inv:invitados) {
            if(idInv2.equals(Inv.getIdInvitado())){
                invi = Inv;
                System.out.println(idInv2);
                System.out.println(invi);
            }
        }
        invitacionExtra invExtra = new invitacionExtra(invi,cedula,nombre,telefono,menu);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro banquete");
        alert.setContentText("Registro exitoso!!");
        alert.showAndWait();
        limpiarCampos();
    }

    public void limpiarCampos(){
        txtCed.clear();
        txtNom.clear();
        txtTel.clear();
        opcInvi.getSelectionModel().clearSelection();
        opcMenu.getSelectionModel().clearSelection();
    }
}
