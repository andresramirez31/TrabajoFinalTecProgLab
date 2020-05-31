package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import sample.Bsn.invitadoBsn;
import sample.RegistrarInvitacion;
import java.util.ArrayList;
import java.util.List;

public class RegistrarBanquete {
    ObservableList<String> fiesta =
            FXCollections.observableArrayList(
                    "tematica",
                    "basica",
                    "lunch"
            );
    ObservableList<String> salon =
            FXCollections.observableArrayList(
                    "Discotek",
                    "Hawaiano",
                    "Formal"
            );
    RegistrarInvitacion inv = new RegistrarInvitacion();
    @FXML
    ComboBox opcionFiesta = new ComboBox(fiesta);
    @FXML
    ComboBox nomSalon = new ComboBox(salon);

    public void opcionFiesta_click(){
        opcionFiesta.setItems(fiesta);
    }

    public void nomSalon_click(){
        nomSalon.setItems(salon);
    }

    public void btGuardar_click(){

        String fiestas = (String) opcionFiesta.getValue();
        String salones = (String) nomSalon.getValue();
        Banquete banquete = new Banquete(salones, fiestas);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro banquete");
        alert.setContentText("Registro exitoso!!");
        alert.showAndWait();
        limpiarCampos();
        System.out.println(fiestas);
        System.out.println(salones);
    }

    public void limpiarCampos(){
        opcionFiesta.getSelectionModel().clearSelection();
        nomSalon.getSelectionModel().clearSelection();
    }
}
