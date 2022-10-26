import java.util.Random;

public class MagicBox<T> {

    protected int maxObjects;
    protected T[] items;


    public MagicBox(int maxObjects) {
        this.maxObjects = maxObjects;
        this.items = (T[]) new Object[maxObjects];
    }


    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public int pick() throws RuntimeException {
        if (items != null) {
            throw new RuntimeException("Коробка не полна и осталось ещё заполнить " + items.length + " ячеек");
        } else {
            Random random = new Random();
            int randomInt = random.nextInt(items.length);
            return randomInt;
        }
    }
}

