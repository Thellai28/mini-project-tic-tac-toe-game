package models.exceptions;

public class GameInvalidationException extends Exception {
    public GameInvalidationException(String message) {
        super( message );
    }
}