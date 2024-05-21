package exercise.oop3;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numOfBooks;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti libri vuoi aggiungere? ");
        numOfBooks = scanner.nextInt();
        scanner.nextLine();

        Book[] books=new Book[numOfBooks];

        for(int i=0; i<numOfBooks; i++){
            try{
                System.out.println("Inserisci il libro numero " + (i + 1));

                System.out.print("Titolo: ");
                String titolo= scanner.nextLine();

                System.out.print("Editore: ");
                String editor= scanner.nextLine();

                System.out.print("Autore: ");
                String author= scanner.nextLine();

                System.out.print("Numero di pagine: ");
                int numPage= scanner.nextInt();
                scanner.nextLine();

                Book book=new Book(titolo, editor, author, numPage);
                books[i]=book;
            }catch (Exception e){
                System.out.println( "errore durante l'inserimento"+ e.getMessage());
                System.out.println(" ");
                i--;
            }

        }

    }
}
