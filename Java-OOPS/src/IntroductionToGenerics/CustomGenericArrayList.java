package IntroductionToGenerics;

import java.util.Arrays;

public class CustomGenericArrayList<T> {
    // Here we are going to create our own custom array list.
    // We will also provide these same utilities to the user via following OOPS principle.
    // We will make sure to use Encapsulation and Abstraction principles which helps us to hide data properly.
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericArrayList() {
        this.data = new Object[DEFAULT_SIZE];
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

        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        list.add(2);
        list.add(4);
        list.add(6);

        System.out.println(list);

        for (int i = 0 ; i < list.size ; i++) {
            System.out.println(list.getIndex(i));
        }
    }
}
