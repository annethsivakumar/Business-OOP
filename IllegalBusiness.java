/*
 * Program Name: BusinessException.java
 * Description: This class represents a custom exception, used to handle errors that may occur in the application.
 */
public class IllegalBusiness extends Exception{
    /**
     * Constructs a new IllegalBusiness exception with the specified error message.
     * @param message The error message to be associated with the exception.
     */
    public IllegalBusiness(String message){
        super(message);
    }
}
