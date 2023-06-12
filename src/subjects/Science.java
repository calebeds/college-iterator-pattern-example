package subjects;

import iterators.IteratorInterface;
import iterators.ScienceIterator;
import subjects.SubjectInterface;

import java.util.LinkedList;

public class Science implements SubjectInterface {
    private LinkedList<String> subjects;

    public Science() {
        this.subjects = new LinkedList<>();
        subjects.addLast("Maths");
        subjects.addLast("Comp. Sc.");
        subjects.addLast("Physics");
    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}
