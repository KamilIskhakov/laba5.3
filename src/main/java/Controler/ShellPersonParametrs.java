package Controler;

import Client.Main;
import CollectionObjects.Color;
import CollectionObjects.Coordinates;
import CollectionObjects.Country;
import CollectionObjects.Location;

import java.util.Scanner;

public class ShellPersonParametrs {
    private final Float MAX_Y = Float.valueOf(103);
    private final Integer MIN_HEIGHT = Integer.valueOf(0);
    private final double MIN_WEIGHT = 0;

    private Scanner userScanner;

    public ShellPersonParametrs(Scanner userScanner) {
        this.userScanner = userScanner;
    }

    public String askNameConsole() {
        Scanner scanner = new Scanner(System.in);

        boolean check = false; //правильно ли введено с консоли

        System.out.println("Введите имя: ");
        String name = null;
        while (!check) {
            try {
                name = scanner.nextLine();
                if (name != null && !name.equals(""))
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите имя: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите имя: ");
            }
        }
        return name;
    }

    public String askNameScript() {
        String name = Main.scriptLines.poll();
        return name;
    }
    public Coordinates askCoordinatesConsole() {
        Scanner scanner = new Scanner(System.in);

        boolean check = false; //правильно ли введено с консоли

        System.out.println("Введите координату X: ");
        Float x = null;
        while (!check) {
            try {
                x = Float.parseFloat(scanner.nextLine());
                if (x != null)
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите координату X: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите координату X: ");
            }
        }

        scanner = new Scanner(System.in);

        check = false; //правильно ли введено с консоли

        System.out.println("Введите координату Y: ");
        Float y = null;
        while (!check) {
            try {
                y = Float.parseFloat(scanner.nextLine());
                if (y != null && y <= MAX_Y)
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите координату Y: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите координату Y: ");
            }
        }
        return new Coordinates(x,y);
    }

    public Coordinates askCoordinatesScript() {
        Float x = Float.parseFloat(Main.scriptLines.poll());
        Float y = Float.parseFloat(Main.scriptLines.poll());
        return new Coordinates(x,y);
    }
    public Location askLocationConsole() {
        Scanner scanner = new Scanner(System.in);

        boolean check = false; //правильно ли введено с консоли

        System.out.println("Введите координату X: ");
        Integer x = null;
        while (!check) {
            try {
                x = Integer.parseInt(scanner.nextLine());
                if (x != null)
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите координату X: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите координату X: ");
            }
        }

        scanner = new Scanner(System.in);

        check = false; //правильно ли введено с консоли

        System.out.println("Введите координату Y: ");
        Float y = null;
        while (!check) {
            try {
                y = Float.parseFloat(scanner.nextLine());
                if (y != null)
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите координату Y: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите координату Y: ");
            }
        }

        scanner = new Scanner(System.in);

        check = false; //правильно ли введено с консоли

        System.out.println("Введите координату Z: ");
        Double z = null;
        while (!check) {
            try {
                z = Double.parseDouble(scanner.nextLine());
                if (y != null)
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите координату Z: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите координату Z: ");
            }
        }
        scanner = new Scanner(System.in);

        check = false; //правильно ли введено с консоли

        System.out.println("Введите имя: ");
        String name = null;
        while (!check) {
            try {
                name = scanner.nextLine();
                if (name != null && !name.equals(""))
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите имя: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите имя: ");
            }
        }

        return new Location(x,y,z,name);
    }

    public Location askLocationScript() {
        Integer x = Integer.parseInt(Main.scriptLines.poll());
        Float y = Float.parseFloat(Main.scriptLines.poll());
        Double z = Double.parseDouble(Main.scriptLines.poll());
        String name = Main.scriptLines.poll();
        return new Location(x,y,z,name);
    }

    public Color askColorConsole() {
        Scanner scanner = new Scanner(System.in);

        boolean check = false; //правильно ли введено с консоли

        System.out.println("Введите цвет: ");
        Color color = null;
        while (!check) {
            try {
                color = Color.valueOf(scanner.nextLine().toUpperCase());
                check = true;
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите цвет: ");
            }
        }
        return color;
    }

    public Color askColorScript() {
        Color color = Color.valueOf(Main.scriptLines.poll().toUpperCase());
        return color;
    }
    public Country askCountryConsole() {
        Scanner scanner = new Scanner(System.in);

        boolean check = false; //правильно ли введено с консоли

        System.out.println("Введите Страну: ");
        Country country = null;
        while (!check) {
            try {
                country = Country.valueOf(scanner.nextLine().toUpperCase());
                check = true;
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите Страну: ");
            }
        }
        return country;
    }

    public Country askCountryScript() {
        Country country = Country.valueOf(Main.scriptLines.poll().toUpperCase());
        return country;
    }

    public Integer askHeightConsole() {
        Scanner scanner = new Scanner(System.in);

        boolean check = false; //правильно ли введено с консоли

        System.out.println("Введите рост: ");
        Integer height = null;
        while (!check) {
            try {
                height = Integer.parseInt(scanner.nextLine());
                if (height != null & height > MIN_WEIGHT)
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите рост: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите рост: ");
            }
        }

        return height;
    }

    public Integer askHeightScript() {
        Integer height = Integer.parseInt(Main.scriptLines.poll());
        return height;
    }

    public double askWeightConsole() {
        Scanner scanner = new Scanner(System.in);

        boolean check = false; //правильно ли введено с консоли

        System.out.println("Введите вес: ");
        Double weight = null;
        while (!check) {
            try {
                weight = Double.parseDouble(scanner.nextLine());
                if (weight != null & weight > MIN_WEIGHT)
                    check = true;
                else {
                    System.out.println("\nДанные введены неверно");
                    System.out.println("Введите вес: ");
                }
            } catch (Exception e) {
                System.out.println("\nДанные введены неверно");
                System.out.println("Введите вес: ");
            }
        }

        return weight;
    }

    public double askWeightScript() {
        Double weight = Double.parseDouble(Main.scriptLines.poll());
        return weight;
    }



    public String toString() {
        return "ShellPersonParametrs (вспомогательный класс для запросов пользователю)";
    }
}
