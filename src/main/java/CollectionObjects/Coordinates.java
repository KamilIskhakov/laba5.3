package CollectionObjects;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



@XmlType(propOrder = {"x", "y"})
public class Coordinates {
    private Float x;
    private Float y;

    public Coordinates(Float x, Float y) {
        this.x = x;
        this.y = y;
    }
    public Coordinates(){

    }
    @XmlElement
    public Float getX() {
        return x;
    }
    @XmlElement
    public Float getY() {
        return y;
    }

    public String toString() {
        return "X:" + x + " Y:" + y;
    }

}
