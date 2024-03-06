import Types.Library;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (true) {
            printMenu();
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        clear();
                        library.addBook();
                        break;
                    case 2:
                        clear();
                        library.removeBook();
                        break;
                    case 3:
                        clear();
                        library.printPaperBooks();
                        Thread.sleep(2000);
                        clear();
                        break;
                    case 4:
                        clear();
                        library.printEBooks();
                        clear();
                        break;
                    case 5:
                        clear();
                        library.printAllBooks();
                        break;
                    case 6:
                        clear();
                        System.out.println("********** GRAZIE E ARRIVEDERCI **********");
                        Thread.sleep(5000);
                        System.exit(0);
                }
            }
            catch (Exception e) {
                System.out.println("Inserisci un'opzione valida! ");
                Thread.sleep(1000);
                continue;
            }

        }
    }

    public static void printMenu() {
        System.out.println("********** BENVENUTO NELLA TUA LIBRERIA **********");
        System.out.print("[1] AGGIUNGI UN LIBRO \n" +
                "[2] RIMUOVI UN LIBRO \n" +
                "[3] MOSTRA TUTTI I LIBRI CARTACEI \n" +
                "[4] MOSTRA TUTTI I LIBRI DIGITALI \n" +
                "[5] MOSTRA TUTTI I LIBRI \n" +
                "[6] ESCI \n" +
                "Cosa vuoi fare? -> ");
    }
    public static void clear() {
        for (int i=0; i<40; i++) {
            System.out.println();
        }
    }
}
