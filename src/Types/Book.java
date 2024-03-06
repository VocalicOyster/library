package Types;

import java.util.Objects;
import java.util.Scanner;

public abstract class Book {

    protected String title;
    protected int yearOfPublishing;
    protected String author;
    protected int totalPages;


    public Book() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        setTitle();
        setYearOfPublishing();
        setAuthor();
        setTotalPages();
    }


    public void setTitle() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.print("Inserisci il titolo -> ");
            String title = scanner.nextLine();
            clear();
            if (Objects.equals(title, "")) {
                System.out.println("Inserire un titolo valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("Il titolo " + title + " inserito è corretto? si/no");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    System.out.println("Titolo inserito correttamente!");
                    Thread.sleep(2000);
                    clear();
                    this.title = title;
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

    public String getTitle() {
        return title;
    }

    public void setYearOfPublishing() throws InterruptedException {
        while (true) {
            Scanner scanner = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Inserisci l'anno di pubblicazione -> ");
            String year = scanner.nextLine();
            if (Objects.equals(year, "")) {
                System.out.println("Inserire un anno valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("L'anno " + year + " inserito è corretto? si/no");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    try {
                        this.yearOfPublishing = Integer.parseInt(year);
                        System.out.println("Anno inserito correttamente!");
                        Thread.sleep(2000);
                        clear();
                        break;
                    } catch (Exception e) {
                        System.out.println("Inserisci un anno valido!");
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setAuthor() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.print("Inserisci l'autore -> ");
            String author = scanner.nextLine();
            if (Objects.equals(author, "")) {
                clear();
                System.out.println("Inserire un autore valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.print("L'autore " + author + " inserito è corretto? si/no -> ");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    System.out.println("Autore inserito correttamente!");
                    Thread.sleep(2000);
                    clear();
                    this.author = author;
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

    public String getAuthor() {
        return author;
    }

    public void setTotalPages() throws InterruptedException {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        while (true) {
            System.out.print("Quante pagine ha in totale? -> ");
            String pages = scanner.nextLine();
            if (Objects.equals(pages, "")) {
                System.out.println("Inserire un numero valido!");
                Thread.sleep(2000);
                clear();
                continue;
            }
            System.out.println("Quindi il libro ha " + pages + " totali? si/no ->");
            String choice = scanner.nextLine().toLowerCase().replace(" ", "");
            switch (choice) {
                case "si":
                    try {
                        this.totalPages = Integer.parseInt(pages);
                        System.out.println("numero delle paine inserito correttamente!");
                        Thread.sleep(2000);
                        clear();
                        break;
                    } catch (Exception e) {
                        System.out.println("Inserisci un numero di pagine valido!");
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

    public int getTotalPages() {
        return totalPages;
    }

    protected void clear() {
        for (int i=0; i<40; i++) {
            System.out.println();
        }
    }


}
