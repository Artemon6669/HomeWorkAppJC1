package Lession3.Task1;

public class Change<T> {

    T intermediate;

    public T[] change(T[] array, int A, int B) {
        intermediate = array[A];
        array[A] = array[B];
        array[B] = intermediate;
        return array;
    }
}
