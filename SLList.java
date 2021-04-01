package ds.cs61b;

// a SLList is a list of intergers, which hides the terrible truth of the nakedness within

public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first;
    private int size;

    public SLList(int x) {
        first = new IntNode(x, null);
        size+=1;
    }

    /**
     * Adds an item to the front of the list.
     */
    public void addFirst(int x) {
        size+=1;
        first = new IntNode(x, first);
    }

    /**
     * Retrieves the front item from the list.
     */
    public int getFirst() {
        return first.item;
    }

    /**
     * Adds an item to the end of the list.
     */
    public void addLast(int x) {
        size+=1;
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);


    }
    public int size3(){
        return size;
    }

    /**
     * Returns the number of items in the list using recursion.
     */
    public int size() {
        IntNode p = first;
        int count = 1;

        while (p.next != null) {
            p = p.next;
            count++;
        }

        return count;
    }

    public static int size2(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size2(p.next);

    }

    public int size2() {
        return size2(first);

    }
}