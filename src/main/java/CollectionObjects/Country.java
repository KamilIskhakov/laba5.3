package CollectionObjects;


public enum Country implements PersonComposite{
        FRANCE,
        VATICAN,
        SOUTH_KOREA;

        public static String nameList() {
            String nameList = "";
            for (Country nationality : values()) {
                nameList += nationality.name() + ", ";
            }
            return nameList.substring(0, nameList.length()-2);
        }

    @Override
    public String getNameComposite() {
        return null;
    }
}
