package iterators;

public interface IteratorInterface {
    void first(); //Reset to first element
    String next();//get next element
    boolean isDone();// end of collection check
    String currentItem();//retrieve current item
}