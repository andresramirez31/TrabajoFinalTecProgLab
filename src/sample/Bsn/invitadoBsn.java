package sample.Bsn;

import sample.DAO.Exception.LlaveDuplicadaException;
import sample.DAO.invitadoDAO;
import sample.DAO.invitadoDAOList;
import sample.invitado;

import java.util.List;

public class invitadoBsn {
    private invitadoDAO invitadoDAO;

    public invitadoBsn() {
        this.invitadoDAO = new invitadoDAOList();
    }

    public void registrarInvitado(invitado inv){

        try{
            this.invitadoDAO.registrarInvitado(inv);
        }catch(LlaveDuplicadaException lde){
            System.out.println(lde);
        }
    }

    public List<invitado> listarInvitados(){
        return this.invitadoDAO.listarInvitados();
    }

    public List listarIdInvitados(){ return this.invitadoDAO.listarIdInvitados(); }


}
