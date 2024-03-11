package CollectionObjects;


import jakarta.xml.bind.annotation.XmlType;

import jakarta.xml.bind.annotation.XmlElement;

@XmlType(propOrder = {"x", "y","z","name"})
public class Location  {
    private int x;
    private Float y;
    private double z;
    private String name;

    public Location(int x, Float y, Double z, String name){
        this.x = x;
        this.y = y;
        this.z = z;
        this.name = name;
    }
    public Location(){

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
