package Exceptions;

public class PersonAskException extends Exception {
    private String par;
    public PersonAskException(String par){
        this.par = par;
    }

    public String getMessage() {
        return "недостаточно параметров для создания Person";
    }
    public String getParName() {
        return par;
    }
    public void setParName() {
        this.par = par;
    }
}
