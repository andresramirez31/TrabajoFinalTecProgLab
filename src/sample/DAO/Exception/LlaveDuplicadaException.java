package sample.DAO.Exception;

public class LlaveDuplicadaException extends  Exception {
    public LlaveDuplicadaException(String Llave){
        super(String.format("Ya se ha creado un registro con esta clave: %s", Llave));
    }
}
