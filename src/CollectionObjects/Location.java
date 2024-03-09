package CollectionObjects;

public class Location {
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
    public int getX(){
        return x;
    }
    public Float getY(){
        return y;
    }
    public double getZ(){
        return z;
    }
    public String getName(){
        return name;
    }
    public String toString() {
        return "Координата X:" + x + "Координата Y:" + y + "Координата Z:" + z + "Город:" + name;
    }

}
