package exercise.oop3;

public class Book {
    private String titolo;
    private int numPage;
    private String author;
    private String editor;

    public Book(String titolo, String editor, String author, int numPage ) {
        setTitolo(titolo);
        setNumPage(numPage);
        setAuthor(author);
        setEditor(editor);
    }

    /*setter*/
    public void setTitolo(String titolo) throws IllegalArgumentException{
        if (titolo == null || titolo.trim().isEmpty()) {
            throw new IllegalArgumentException(" Il titolo non puo essere vuoto");
        }

        this.titolo=titolo;
    }

    public void setEditor(String editor) throws IllegalArgumentException{
        if (editor == null || editor.trim().isEmpty()) {
            throw new IllegalArgumentException(" l' editore non puo essere vuoto");
        }
        this.editor=editor;
    }

    public void setAuthor(String author) throws IllegalArgumentException{
        if (author == null || author.trim().isEmpty()) {
            throw new IllegalArgumentException(" l'autore non puo essere vuoto");
        }
        this.author=author;
    }

    public void setNumPage(int numPage )throws IllegalArgumentException{
        if (numPage <= 0) {
            throw new IllegalArgumentException("Il numero di pagine deve essere maggiore di zero");
        }
        this.numPage=numPage;
    }


    /*getter*/
    public String getTitolo() {
        return titolo;
    }
    public String getEditor(){
        return editor;
    }
    public String getAuthor(){
        return author;
    }
    public int getNumPage(){
        return numPage;
    }

    @Override
    public String toString() {
        return "Libro: Titolo "+titolo+" Autore "+author+" editore "+editor+" numero di pagine "+numPage;
    }
}
