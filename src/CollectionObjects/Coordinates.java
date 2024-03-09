package CollectionObjects;

public class Coordinates {
    private Float x;
    private Float y;

    public Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }

    public Float getX() {
        return x;
    }

    public Float getY() {
        return y;
    }

    public String toString() {
        return "X:" + x + " Y:" + y;
    }

}
