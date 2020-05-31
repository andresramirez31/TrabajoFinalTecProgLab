package sample.DAO;

import sample.DAO.Exception.LlaveDuplicadaException;
import sample.invitado;

import java.util.List;
import java.util.Optional;

public interface invitadoDAO {
    void registrarInvitado(invitado invitado) throws LlaveDuplicadaException;
    Optional<invitado> consultarInvitadoPorId(String id);
    List<invitado> listarInvitados();
    List listarIdInvitados();


}
