import javax.xml.soap.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public void add(int index, E element){
        System.out.println("Hàm add");
    }
    public void addFirst(E e) {
        System.out.println("hàm addFirst");
    }

    public void addLast(E e) {
        System.out.println("Hàm addLast");
    }
    public E remove(int index) {
        return null;
    }
    public boolean remove(Object e) {
        return true;
    }
    public int size() {
        int a =0;
        return a;
    }
    public E clone(){

        return null;
    }
    public boolean contains(E o) {
        return true;
    }

    public int indexOf(E o) {

        return 0;
    }
    public boolean add(E e ){

        return false;
    }
    public void ensureCapacity(int minCapacity) {
        System.out.println("hàm minCapacity");
    }

    public E get(int i) {

        return null;
    }
    public E getFirst() {

        return null;
    }
    public E getLast() {

        return null;
    }

    public void clear() {
        System.out.println("clear");
    }
}
