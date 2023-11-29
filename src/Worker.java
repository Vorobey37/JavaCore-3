public class Worker extends  BaseWorker {

    //region Поля
    private double fixSalary;
    private static final double defaultfixSalary = 18000;
    //endregion

    //region Конструкторы
    protected Worker(String name, int age, boolean isisSuccessCreateValues) {
        super(name, age, isisSuccessCreateValues);
    }
    //endregion

    //region Методы

    public static Worker create(String name, int age, double fixSalary) {

        boolean values = true;

        if (age < 18 || age > 100) {
            age = defaultAge;
            values = false;
        }
        if (name.length() < 2) {
            name = defaultName;
            values = false;
        }
        if (fixSalary < 18000) {
            fixSalary = defaultfixSalary;
            values = false;
        }

        Worker worker = new Worker(name, age, values);
        worker.calculateSalary(fixSalary);

        return worker;

    }

    public void setFixSalary(double fixSalary) {
        if (fixSalary < 18000) {
            throw new RuntimeException("Неверно задана фиксированная оплата!");
        }
        this.fixSalary = fixSalary;
    }

    public double getFixSalary() {
        return fixSalary;
    }

    @Override
    public Double calculateSalary(double fixSalary) {
        this.salary = fixSalary;
        return salary;
    }

    //endregion
}
