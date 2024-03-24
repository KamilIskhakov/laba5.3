package Exceptions;

public class GiveParPersonException extends Exception {
    private String par;
    public GiveParPersonException(String par){
        this.par = par;
    }

    public String getMessage() {
            return "недостаточно параметров для создания Person";
        }
    public String getParName() {
        return par;
    }
}
