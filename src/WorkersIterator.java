import java.util.Iterator;
import java.util.List;

public class WorkersIterator<T> implements Iterator<T> {

    //region Поля
    private int counter;
    private final List<T> elements;
    //endregion

    //region Конструкторы
    public WorkersIterator (List<T> elements) {
        this.elements = elements;
        this.counter = 0;
    }
    //endregion

    //region Методы
    @Override
    public boolean hasNext() {
        return counter < elements.size();
    }

    @Override
    public T next() {
        if(!hasNext()) return null;

        return elements.get(counter++);
    }
    //endregion
}
