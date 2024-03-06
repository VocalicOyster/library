package Types;

import java.util.Objects;
import java.util.Scanner;

public class EBook extends Book {
    private String format;
    private float dimension;

    private float price;

    public EBook() throws InterruptedException {
        super();
        setFormat();
        setDimension();
        setPrice();
    }


    private void setFormat() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.print("Inserisci il fromato dell'ebook (pdf, epub, ecc..) -> ");
            String format = scanner.nextLine();
            if (Objects.equals(format, "")) {
                System.out.println("Inserire un titolo valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("Il fromato " + format + " inserito è corretto? si/no");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    System.out.println("Fromato inserito correttamente!");
                    this.format = format;
                    Thread.sleep(2000);
                    clear();
                    break;
                case "no":
                    clear();
                    continue;
                default:
                    System.out.println("Inserire si o no!");
                    Thread.sleep(2000);
                    clear();
                    continue;
            }
            break;
        }
    }

    public void setPrice() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.print("Inserisci il prezzo di vendita -> ");
            String price = scanner.nextLine();
            if (Objects.equals(title, "")) {
                System.out.println("Inserire un prezzo valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("Il libro costa " + price + "€?  si/no");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    try {
                        this.price = Float.parseFloat(price);
                        System.out.println("Prezzo inserito correttamente!");
                        Thread.sleep(2000);
                        clear();
                        break;
                    } catch (Exception e) {
                        System.out.println("Inserire un prezzo valido!");
                        Thread.sleep(2000);
                        clear();
                    }
                case "no":
                    clear();
                    continue;
                default:
                    System.out.println("Inserire si o no!");
                    Thread.sleep(2000);
                    clear();
                    continue;
            }
            break;
        }
    }

    private void setDimension() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.print("Inserisci la grandezza del formato (in Kb) -> ");
            String dimension = scanner.nextLine();
            if (Objects.equals(dimension, "")) {
                System.out.println("Inserire una dimensione valida!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("Il libro pesa " + dimension + "Kb?  si/no");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    try {
                        this.dimension = Float.parseFloat(dimension);
                        System.out.println("Grandezza file inserita correttamente!");
                        Thread.sleep(2000);
                        clear();
                        break;
                    } catch (Exception e) {
                        System.out.println("Inserire una dimensione valida!");
                        Thread.sleep(2000);
                        clear();
                    }
                case "no":
                    clear();
                    continue;
                default:
                    System.out.println("Inserire si o no!");
                    Thread.sleep(2000);
                    clear();
                    continue;
            }
            break;
        }
    }

    public float getPrice() {
        return price;
    }

    public String toString() {
        return "Title: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Year of Publishing: " + getYearOfPublishing() + "\n" +
                "Price: " + getPrice();
    }
}
