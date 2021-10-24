package biblioteka;

public class Main {
    public static void main(String[] args) {

        Author authorOne = new Author("Jan", "Brzechwa");
        Author authorTwo = new Author("Adam", "Mickiewicz");
        Copy copyOne = new Book(authorOne, "Bajki dla dzieci");
        Copy copyTwo = new Magazine(authorTwo, "Pan Tadeusz");
        Copy[] copies = new Copy[]{copyOne, copyTwo, copyOne, copyOne};
        Library library = new Library(copies);

     /*   try {
            System.out.println(Arrays.toString(library.findByTitle("akademia kleklsa")));
        } catch (NoBookFoundException e) {
            e.printStackTrace();
            System.out.println("Nie znaleziono ksiazki o takim tytule");
        }
*/

       /* System.out.println(Arrays.toString(library.findByAuthor(authorOne)));
        System.out.println(Arrays.toString(library.findByAuthor(authorTwo)));
*/

        //System.out.println(library.findAuthorWithMostBooks());

    }
}
