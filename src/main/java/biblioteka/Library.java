package biblioteka;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Library {
    private Copy[] copies;

    public Library(Copy[] copies) {
        this.copies = copies;
    }

    public List<Copy> findByTitle(String title) throws NoBookFoundException {
        if (title != null) {
            int counterOfFoundBooks = 0;
            for (Copy copy : copies) {
                if (copy.getTitle().contains(title)) {
                    counterOfFoundBooks++;
                }
            }
            Copy[] foundBooks = new Copy[counterOfFoundBooks];
            for (int i = 0; i < copies.length; i++) {
                if (copies[i].getTitle().contains(title)) {
                    foundBooks[--counterOfFoundBooks] = copies[i];
                }
            }
            if (foundBooks.length == 0) {
                throw new NoBookFoundException();
            }
            return Arrays.asList(foundBooks);

        }
        return null;
    }

    public Copy[] findByAuthor(Author author) {
        /*
        TODO: dorobić logikę tej metody - podobną do findByTitle()
        */
        return null;
    }

    public Optional<Author> findAuthorWithMostBooks() {
        Author[] tableOfAuthorsFromAllBooks = new Author[copies.length];
        for (int i = 0; i < copies.length; i++) {
            tableOfAuthorsFromAllBooks[i] = copies[i].getAuthor();
        }
        tableOfAuthorsFromAllBooks = removeDuplicates(tableOfAuthorsFromAllBooks);

        int[] numberOfBooksFromAuthor = new int[tableOfAuthorsFromAllBooks.length];

        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            numberOfBooksFromAuthor[i] = findByAuthor(tableOfAuthorsFromAllBooks[i]).length;
        }

        int indexOfMostProductiveAuthor = findIndexOfMaxValue(numberOfBooksFromAuthor);

        return Optional.ofNullable(tableOfAuthorsFromAllBooks[indexOfMostProductiveAuthor]);
    }

    private int findIndexOfMaxValue(int[] numberOfBooksFromAuthor) {
        int currentMax = 0;
        int indexOfMaxElement = 0;
        for (int i = 0; i < numberOfBooksFromAuthor.length; i++) {
            if (numberOfBooksFromAuthor[i] > currentMax) {
                currentMax = numberOfBooksFromAuthor[i];
                indexOfMaxElement = i;
            }
        }
        return indexOfMaxElement;
    }

    private Author[] removeDuplicates(Author[] tableOfAuthorsFromAllBooks) {

        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            Author original = tableOfAuthorsFromAllBooks[i];
            if (tableOfAuthorsFromAllBooks[i] != null) {
                original = tableOfAuthorsFromAllBooks[i];
            }
            for (int j = i + 1; j < tableOfAuthorsFromAllBooks.length - 1; j++) {
                if (original != null && original.equals(tableOfAuthorsFromAllBooks[j])) {
                    tableOfAuthorsFromAllBooks[j] = null;
                }
            }
        }
        return trimTable(tableOfAuthorsFromAllBooks);
    }

    private Author[] trimTable(Author[] tableOfAuthorsFromAllBooks) {
        int counterOfNotNulls = 0;
        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            if (tableOfAuthorsFromAllBooks[i] != null) {
                counterOfNotNulls++;
            }
        }
        Author[] distinctAuthors = new Author[counterOfNotNulls];
        for (int i = 0; i < tableOfAuthorsFromAllBooks.length; i++) {
            if (tableOfAuthorsFromAllBooks[i] != null) {
                distinctAuthors[--counterOfNotNulls] = tableOfAuthorsFromAllBooks[i];
            }
        }
        return distinctAuthors;
    }

}
