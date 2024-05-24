package IntroductionToGenerics;

import java.util.Arrays;
import java.util.List;

public class Wildcard<T extends Number> {
    // Here we are going to create our own custom array list.
    // Here we are going to restrict this List to only take data types belongs
    // to Number class or its subclasses rest will be discarded.
    // We will also provide these same utilities to the user via following OOPS principle.
    // We will make sure to use Encapsulation and Abstraction principles which helps us to hide data properly.
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Wildcard() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void getList (List<? extends Number> list) {
        // do Something
        // Now this method will accept Number type and the types present in its subclasses too.
    }

    public void add (T num) {
        if(isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull () {
        return size == data.length;
    }

    private void resize () {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0 ; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public T remove (int index) {
        return (T)data[size--];
    }

    public T getIndex (int index) throws Exception {
        if(index > size) {
            throw new Exception("Invalid index");
        }
        return (T)data[index];
    }

    public int size () {
        return size;
    }

    public void set (int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList { " + "data= " + Arrays.toString(data) + ", size" + size + " }";
    }

    public static void main(String[] args) throws Exception {
        // These below are inbuilt utilities:

        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // System.out.println(list.getFirst());
        // list.removeFirst();
        // System.out.println(list.size());
        // list.add(2);
        // System.out.println(list.size());
        // System.out.println(list.getFirst());

        Wildcard<Integer> list = new Wildcard<>();
        list.add(2);
        list.add(4);
        list.add(6);

        // The below line is restricted because we can only now use types belongs to Number class
        // We used wildcard to implements this restriction.
        // Wildcard<String> list = new Wildcard<>();

        System.out.println(list);

        for (int i = 0 ; i < list.size ; i++) {
            System.out.println(list.getIndex(i));
        }
    }
}
