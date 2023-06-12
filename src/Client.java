import iterators.IteratorInterface;
import subjects.Arts;
import subjects.Science;
import subjects.SubjectInterface;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        SubjectInterface scSubject = new Science();
        SubjectInterface artSubject = new Arts();

        IteratorInterface scIterator = scSubject.createIterator();
        IteratorInterface artIterator = artSubject.createIterator();

        System.out.println("\nScience Subjects: ");
        print(scIterator);
        System.out.println("\nArts Subjects: ");
        print(artIterator);
    }

    public static void print(IteratorInterface iterator) {
        while (!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}