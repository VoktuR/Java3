package secondTask;

import java.util.ArrayList;

public class Box<T extends Fruit>  {
    private ArrayList<T> fruitList;

    public Box() {
        fruitList = new ArrayList<T>();
    }

    public void putToAnotherBox(Box<T> box) {
        box.getFruitList().addAll(fruitList);
        fruitList.clear();
    }

    public float getWeight() {
        if (fruitList.isEmpty()) {
            return 0;
        } else {
            return fruitList.size() * fruitList.get(0).getFruitWeight();
        }
    }

    public void add(T newFruit) {
        fruitList.add(newFruit);
    }

    public boolean compare(Box b) {
        return b.getWeight() == this.getWeight();
    }

    public ArrayList<T> getFruitList() {
        return fruitList;
    }

}
