package Models.Exceptions;

public class BusinessExceptions extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BusinessExceptions(String message){
        super(message);
    }

}
