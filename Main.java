package ds.cs61b;

public class Main {
    public static void main(String[] args) {
        /* Creates a list of one Interger, namely 10 */
        SLList L = new SLList(10);

        L.addFirst(10);
        L.addFirst(5);
        L.addLast(20);
        L.addLast(100);


        System.out.println(L.size());
        System.out.println(L.size2());
        System.out.println(L.size3());
    }

}
