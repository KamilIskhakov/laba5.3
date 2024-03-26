package CollectionObjects;


import jakarta.xml.bind.annotation.XmlType;

import jakarta.xml.bind.annotation.XmlElement;

@XmlType(propOrder = {"x", "y","z","name"})
public class Location{
    private int x;
    private Float y;
    private double z;
    private String name;

    public Location(LocationBuilder locationBuilder){
        x = locationBuilder.x;
        y = locationBuilder.y;
        z = locationBuilder.z;
        name = locationBuilder.name;
    }
    public Location(){

    }
    public static class LocationBuilder {

        private int x;
        private Float y; // no null
        private double z;
        private String name; //no null

        //constructor for required fields
        public LocationBuilder(String name, Float y ) {
            this.name = name;
            this.y = y;
        }
        public LocationBuilder setX(int x) {
            this.x = x;
            return this;
        }
        public LocationBuilder setZ(double z) {
            this.z = z;
            return this;
        }
        public Location build() {
            return new Location(this);
        }
    }
    @XmlElement
    public int getX(){
        return x;
    }
    @XmlElement
    public Float getY(){
        return y;
    }
    @XmlElement
    public double getZ(){
        return z;
    }
    @XmlElement
    public String getName(){
        return name;
    }
    public String toString() {
        return "Координата X:" + x + "Координата Y:" + y + "Координата Z:" + z + "Город:" + name;
    }
}
