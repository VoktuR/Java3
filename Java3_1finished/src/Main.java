import secondTask.Apple;
import secondTask.Box;
import secondTask.Fruit;
import secondTask.Orange;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        MyArray и Arr для перового и второго пункта дз.
         */

        // 1, 2

        Integer[] intArray = new Integer[] {
                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        String[] strArray = new String[] {
                "a", "b", "c", "d", "e", "f", "g", "h", "i", "j"
        };

        MyArray<Integer> myIntArr = new Arr<>();
        myIntArr.swapArrayElements(intArray, 3, 7);
        List<Integer> listInteger = myIntArr.arrayToArrayList(intArray);
        System.out.println(listInteger);

        System.out.println();

        MyArray<String> myStrArr = new Arr<>();
        myStrArr.swapArrayElements(strArray, 3, 7);
        List<String> listString = myStrArr.arrayToArrayList(strArray);
        System.out.println(listString);
        System.out.println();


        // 3

        Box<Apple> firstBox = new Box<>();
        Box<Orange> secondBox = new Box<>();
        Box<Apple> thirdBox = new Box<>();

        for (int i = 0; i < 6; i++) {
            firstBox.add(new Apple());
        }
        for (int i = 0; i < 4; i++) {
            secondBox.add(new Orange());
        }
        for (int i = 0; i < 10; i++) {
            thirdBox.add(new Apple());
        }

        System.out.println(firstBox.getWeight());
        System.out.println(secondBox.getWeight());
        System.out.println(thirdBox.getWeight());

        System.out.println(firstBox.compare(secondBox));
        System.out.println(firstBox.compare(thirdBox));

        secondBox.add(new Orange());
        System.out.println(firstBox.compare(secondBox));

        firstBox.putToAnotherBox(thirdBox);
        System.out.println(firstBox.getWeight());
        System.out.println(thirdBox.getWeight());
    }


}
