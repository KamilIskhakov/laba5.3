package CollectionObjects;


import java.time.ZonedDateTime;

public class Person {
    private Integer id;
    private String name;
    private Coordinates coordinates;
    private ZonedDateTime creationDate;
    private Integer height;
    private Color eyeColor;
    private Country nationality;
    private Location location;

    public Person(Integer id, String name, Coordinates coordinates, ZonedDateTime creationDate, Integer height,
                  Color eyeColor, Country nationality, Location location) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.creationDate = creationDate;
        this.height = height;
        this.eyeColor = eyeColor;
        this.nationality = nationality;
        this.location = location;
    }

    public Integer getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public Coordinates getCoordinates() {
        return coordinates;
    }
    public ZonedDateTime getCreationDate() {
        return creationDate;
    }
    public Integer getHeight() {
        return height;
    }
    public Color getEyeColor() {
        return eyeColor;
    }

    public Country getNationality() {
        return nationality;
    }
    public Location getLocation(){
        return location;
    }

    public int compareTo(Person personObj) {
        return id.compareTo(personObj.getId());

    }
    public String toString() {
        String info = "";
        info += "Человек" + id;
        info += " (добавлен " + creationDate.toLocalDate() + " " + creationDate.toLocalTime() + ")";
        info += "\n Имя: " + name;
        info += "\n Местоположение: " + coordinates;
        info += "\n Рост: " + height;
        info += "\n Цвет глаз: " + eyeColor;
        info += "\n Страна проживания: " + nationality;
        info += "\n Местоположение: " + location;
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

    public void setCreationDate(ZonedDateTime creationDate) {
        this.creationDate = creationDate;
    }

    public void setHeight(Integer height) {
        this.height = height;
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
}
