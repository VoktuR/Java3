import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr<E> implements MyArray<E> {

    @Override
    public void swapArrayElements(E[] arr, int firstElement, int secondElement) {
        E temp = arr[firstElement];
        arr[firstElement] = arr[secondElement];
        arr[secondElement] = temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    @Override
    public List<E> arrayToArrayList(E[] arr) {
        return Arrays.asList(arr);
    }


}
