package Types;

import java.util.Objects;
import java.util.Scanner;

public class PaperBook extends Book{

    private String weight;
    private float price;

    public PaperBook() throws InterruptedException {
        super();
        setWeight();
        setPrice();
    }

    public void setWeight() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        while (true) {
            System.out.print("Inserisci il peso de libro (in grammi) -> ");
            String weight = scanner.nextLine();
            if(Objects.equals(weight, "")) {
                System.out.println("Inserire un peso valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("I libro pesa " + weight + "g?  si/no");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    System.out.println("Peso inserito correttamente!");
                    this.weight = weight;
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
            if(Objects.equals(title, "")) {
                System.out.println("Inserire un prezzo valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("Il libro costa " + price+ "€?  si/no");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    try {
                        this.price = Float.parseFloat(price);
                        System.out.println("Prezzo inserito correttamente!");
                        Thread.sleep(2000);
                        clear();
                        break;
                    }
                    catch (Exception e) {
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

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Title: " + getTitle() + "\n" +
                "Author: " + getAuthor() + "\n" +
                "Year of Publishing: " + getYearOfPublishing() + "\n" +
                "Price: " + getPrice();
    }
}
