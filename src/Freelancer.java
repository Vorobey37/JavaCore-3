public class Freelancer extends BaseWorker {
    //region Поля
    private double hourRate;
    private static final double defaultHourRate = 100;
    //endregion

    //region Конструкторы
    protected Freelancer (String name, int age, boolean isisSuccessCreateValues) {
        super(name, age, isisSuccessCreateValues);
    }
    //endregion

    //region Методы

    public static Freelancer create(String name, int age, double hourRate) {

        boolean values = true;

        if (age < 18 || age > 100) {
            age = defaultAge;
            values = false;
        }
        if (name.length() < 2) {
            name = defaultName;
            values = false;
        }
        if (hourRate < 100) {
            hourRate = defaultHourRate;
            values = false;
        }

        Freelancer freelancer = new Freelancer(name, age, values);
        freelancer.calculateSalary(hourRate);

        return freelancer;

    }

    public void setHourRate(double hourRate) {
        if (hourRate < 100) {
            throw new RuntimeException("Неверно задана почасовая оплата!");
        }
        this.hourRate = hourRate;
    }

    public double getHourRate() {
        return this.hourRate;
    }

    @Override
    public Double calculateSalary(double hourRate) {
        this.salary = 20.8 * 8 * hourRate;
        return salary;
    }



    //endregion
}
