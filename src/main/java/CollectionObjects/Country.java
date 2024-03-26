package CollectionObjects;


public enum Country{
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

}
