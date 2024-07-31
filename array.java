import java.util.Arrays;

// Custom ArrayList class
public class CustomArrayList<E> {
    private static final int INITIAL_CAPACITY = 10; // Initial capacity of the array
    private Object[] elements; // Array to store the elements
    private int size = 0; // Number of elements in the array

    // Constructor to initialize the array with the initial capacity
    public CustomArrayList() {
        elements = new Object[INITIAL_CAPACITY];
    }

    // Method to add an element to the array
    public void add(E e) {
        if (size == elements.length) {
            resize(); // Resize the array if capacity is reached
        }
        elements[size++] = e;
    }

    // Method to get an element from the array by index
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (E) elements[index];
    }

    // Method to return the size of the array
    public int size() {
        return size;
    }

    // Private method to resize the array when capacity is reached
    private void resize() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    // Main method to test the CustomArrayList
    public static void main(String[] args) {
        CustomArrayList<Integer> customArrayList = new CustomArrayList<>();

        // Adding elements to the CustomArrayList
        for (int i = 1; i <= 15; i++) {
            customArrayList.add(i);
        }

        // Printing the elements in the CustomArrayList
        for (int i = 0; i < customArrayList.size(); i++) {
            System.out.print(customArrayList.get(i) + " ");
        }

        // Printing the size of the CustomArrayList
        System.out.println("\nSize of CustomArrayList: " + customArrayList.size());
    }
}
