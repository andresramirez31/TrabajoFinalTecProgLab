package sample.DAO;

import sample.DAO.Exception.LlaveDuplicadaException;
import sample.invitado;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class invitadoDAOList implements invitadoDAO  {
    private static List<invitado> lt = new ArrayList();
    private static List ltAux = new ArrayList();

    public void registrarInvitado(invitado invi) throws LlaveDuplicadaException{
        Optional<invitado> invitadoOptional = consultarInvitadoPorId(invi.getIdInvitado());
        if(invitadoOptional.isPresent()){
            throw new LlaveDuplicadaException(invi.getIdInvitado());
        }
        lt.add(invi);
        ltAux.add(invi.getIdInvitado());
    }

    @Override
    public Optional<invitado> consultarInvitadoPorId(String id) {
        return lt.stream().filter(invitado -> invitado.getIdInvitado().equals(id)).findFirst();
    }

    @Override
    public List<invitado> listarInvitados() {
        return new ArrayList<>(lt);
    }

    @Override
    public List listarIdInvitados() {
        return  new ArrayList<>(ltAux);
    }


}
