package exercise6;

import java.util.Arrays;
import java.util.Comparator;

public class LibraryManagementSystem {

    static Book[] books = {
            new Book(101, "Java", "James"),
            new Book(102, "Python", "Guido"),
            new Book(103, "C", "Dennis"),
            new Book(104, "Spring", "Rod")
    };

    static void linearSearch(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println("Linear Search Found: " + b);
                return;
            }
        }
        System.out.println("Book Not Found");
    }

    static void binarySearch(String title) {
        Arrays.sort(books, Comparator.comparing(b -> b.title));

        int low = 0, high = books.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = books[mid].title.compareToIgnoreCase(title);

            if (cmp == 0) {
                System.out.println("Binary Search Found: " + books[mid]);
                return;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        System.out.println("Book Not Found");
    }

    public static void main(String[] args) {

        linearSearch("Python");

        binarySearch("Spring");
    }
}