package exercise.oop3;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
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
        File file = new File("./src/Resources/File.txt");
        System.out.println(file.exists());

        /*scrittura del file*/
        FileWriter fileWriter=null;

        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(Arrays.toString(books));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fileWriter!= null){
                try{
                    fileWriter.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }

        /*lettura del file*/
        try{
            scanner=new Scanner(file);
            while(scanner.hasNextLine()){
                String line= scanner.nextLine();
                System.out.println(line);
            }
        }catch(FileNotFoundException e){
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }

    }
}
