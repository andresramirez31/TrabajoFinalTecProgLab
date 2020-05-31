package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class Controller {
    @FXML
    private BorderPane marco;

    public void btCrear_accion(){
        try {
            AnchorPane registrarInvitado = FXMLLoader
                    .load(getClass().getResource("registrar-invitado.fxml"));
            this.marco.setCenter(registrarInvitado);

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public void btCrearI_accion(){
        try{
            AnchorPane registrarInvitacion = FXMLLoader
                    .load(getClass().getResource("registrar-Invitacion.fxml"));
            this.marco.setCenter(registrarInvitacion);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void btRegistro_accion(){
        try{
            AnchorPane registrarInvitadoExtra = FXMLLoader
                    .load(getClass().getResource("registrar-Acompañante.fxml"));
            this.marco.setCenter(registrarInvitadoExtra);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public void btBanquete_accion(){
        try{
            AnchorPane registrarBanquete = FXMLLoader
                    .load(getClass().getResource("registrar-Banquete.fxml"));
            this.marco.setCenter(registrarBanquete);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
