package CollectionObjects;

public enum Color {
    BLACK,
    BLUE,
    ORANGE;
    public static String nameList() {
        String nameList = "";
        for (Color eyeColor : values()) {
            nameList += eyeColor.name() + ", ";
        }
        return nameList.substring(0, nameList.length()-2);
    }
}