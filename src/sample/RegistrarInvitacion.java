package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import sample.Bsn.invitadoBsn;
import sample.RegistrarBanquete;

import java.util.List;

public class RegistrarInvitacion{
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


    @FXML
    protected ComboBox nomSal;
    @FXML
    protected ComboBox tipoFiesta;
    @FXML
    protected ComboBox<invitado> opcionInvitado;
    @FXML
    protected TextField txtMesa;
    @FXML
    protected TextField txtCelAdd;
    @FXML
    protected TextField txtId;
    @FXML
    protected RadioButton btSi;
    @FXML
    protected RadioButton btNo;

    private invitadoBsn invBsn = new invitadoBsn();
    List<invitado> invitados = invBsn.listarInvitados();
    List<String> idInvitados = invBsn.listarIdInvitados();
    @FXML
    public void initialize(){


        ObservableList idInvitadosObservables = FXCollections.observableList(idInvitados);
        opcionInvitado.setItems(idInvitadosObservables);
        tipoFiesta.setItems(fiesta);
        nomSal.setItems(salon);
    }

    public void btGuard_accion(){
        String id = txtId.getText();
        int mesa = Integer.parseInt(txtMesa.getText());
        String fiestaInv = (String) tipoFiesta.getValue();
        String salonInv = (String) nomSal.getValue();
        Invitacion inv = new Invitacion(salonInv,fiestaInv,id,mesa);
        String idInv2 = String.valueOf(opcionInvitado.getValue());
        invitado invi = null;
        for (invitado Inv:invitados) {
            if(idInv2.equals(Inv.getIdInvitado())){
                invi = Inv;
                System.out.println(idInv2);
                System.out.println(invi);
            }
        }
        if(btSi.isSelected()){
            int celAdd = Integer.parseInt(txtCelAdd.getText());
            inv.setCedulaAdicional(celAdd);
            System.out.println("si");
        }
        inv.setInvitadoRegistrado(invi);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Registro invitacion");
        alert.setContentText("Registro exitoso!!");
        alert.showAndWait();
        limpiarCampos();

    }

    public void limpiarCampos(){
        opcionInvitado.getSelectionModel().clearSelection();
        tipoFiesta.getSelectionModel().clearSelection();
        nomSal.getSelectionModel().clearSelection();
        txtCelAdd.clear();
        txtId.clear();
        txtMesa.clear();
        btSi.setSelected(false);
        btNo.setSelected(false);

    }

}
