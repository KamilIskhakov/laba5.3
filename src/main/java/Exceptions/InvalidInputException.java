package Exceptions;

public class InvalidInputException extends Exception {
    public String getMessage() {
        return "Invalid input. Work with the collection will be finished";
    }
}
