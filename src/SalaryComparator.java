import java.util.Comparator;

public class SalaryComparator implements Comparator<BaseWorker> {

    //region Методы
    @Override
    public int compare(BaseWorker o1, BaseWorker o2) {
        return Double.compare(o1.getSalary(), o2.getSalary());
    }
    //endregion
}
