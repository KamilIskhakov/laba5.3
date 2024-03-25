package CollectionObjects;


import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;



@XmlType(propOrder = {"x", "y"})
public class Coordinates implements PersonComposite{
    private Float x;
    private Float y;

    public Coordinates(CoordinatesBuilder coordinatesBuilder) {
        x  = coordinatesBuilder.x;
        y = coordinatesBuilder.y;
    }
    public Coordinates(){

    }
    public static class CoordinatesBuilder {

        private Float x;
        private Float y;

        //constructor for required fields
        public CoordinatesBuilder(Float x, Float y) {
            this.x = x;
            this.y = y;
        }
        public Coordinates build() {
            return new Coordinates(this);
        }
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

    @Override
    public String getNameComposite() {
        return "Coordinates";
    }
}
