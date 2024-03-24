package CollectionObjects;


import Client.Main;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Builder;

import java.util.Date;


@XmlRootElement(name = "person")
@XmlType(propOrder = { "id","creationDate", "name", "coordinates", "height", "weight", "eyeColor", "nationality", "location"})
public class Person implements Comparable<Location>{
    private Integer id;
    private String name;
    private Coordinates coordinates;
    private Date creationDate;
    private Integer height;
    private double weight;
    private Color eyeColor;
    private Country nationality;
    private Location location;

    public Person(String name, Coordinates coordinates,Integer height, double weight,
                  Color eyeColor, Country nationality, Location location) {
        this.name = name;
        this.coordinates = coordinates;
        this.height = height;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
        this.location = location;
        creationDate = new Date();
    }
    public Person(){
    }
    @XmlElement
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    @XmlElement
    public Coordinates getCoordinates() {
        return coordinates;
    }
    @XmlElement
    public Date getCreationDate() {
        return creationDate;
    }
    @XmlElement
    public Integer getHeight() {
        return height;
    }
    @XmlElement
    public double getWeight() {
        return weight;
    }
    public Color getEyeColor() {
        return eyeColor;
    }

    public Country getNationality() {
        return nationality;
    }
    @XmlElement
    public Location getLocation(){
        return location;
    }

    public int compareTo(Person personObj) {
        return id.compareTo(personObj.getId());

    }
    public String toString() {
        String info = "";
        info += "Человек" + id;
        info += " (добавлен " + creationDate.toString() + " " + creationDate.toString() + ")";
        info += "\n Имя: " + name;
        info += "\n Местоположение: " + coordinates;
        info += "\n Рост: " + height;
        info += "\n Цвет глаз: " + eyeColor;
        info += "\n Страна проживания: " + nationality;
        info += "\n Местоположение: " + location;
        info += "\n id: " + id;
        return info;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }


    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


    @Override
    public int compareTo(Location location) {
        return (this.location).getName().length() - location.getName().length();
    }
}
