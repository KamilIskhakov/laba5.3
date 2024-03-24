package Exceptions;

public class TakeAwayParException<T> {
    private T par;
    public TakeAwayParException(T par){
        this.par = par;
    }

    public String getMessage() {
        return "недостаточно параметров для создания Person";
    }
    public T getParName() {
        return par;
    }
}
