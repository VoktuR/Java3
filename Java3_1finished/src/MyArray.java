import java.util.List;

public interface MyArray<E> {
    void swapArrayElements(E[] arr, int firstElement, int secondElement);
    List<E> arrayToArrayList(E[] arr);
}
