import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Workers implements Iterable<BaseWorker> {

    //region Поля
    private List<BaseWorker> workers;
    //endregion

    //region Конструкторы
    public Workers() {
        workers = new ArrayList<>();
    }
    //endregion

    //region Методы
    public void add(BaseWorker element) {
        workers.add(element);
    }

    public int getSize() {
        return workers.size();
    }

    public BaseWorker getElement(int index) {
        return workers.get(index);
    }

    public void sortElements() {
        Collections.sort(workers);
    }

    public void sortSalary() {
        SalaryComparator salaryComparator = new SalaryComparator();
        Collections.sort(workers, salaryComparator);
    }

    @Override
    public Iterator<BaseWorker> iterator() {
        return new WorkersIterator<>(workers);
    }

    public void printDisplayInfo() {
        for (BaseWorker element: workers) {
            System.out.println(element);
        }
        System.out.println();
    }
    //endregion
}
