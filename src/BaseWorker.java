public abstract class BaseWorker implements Comparable<BaseWorker> {

    //region Поля
    protected String name;
    protected int age;
    protected double salary;
    protected boolean isSuccessCreateValues;
    protected static final String defaultName = "Jane Doe";
    protected static final int defaultAge = 21;
    //endregion

    //region Конструкторы
    protected BaseWorker (String name, int age, boolean isSuccessCreateValues) {
        this.name = name;
        this.age = age;
        this.isSuccessCreateValues = isSuccessCreateValues;
    }

    //endregion

    //region Методы
    public abstract Double calculateSalary(double value);


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setAge(int age) {
        if (age < 18){
            throw new RuntimeException("Некорректный возраст человека. У работников возраст должен быть 18+");
        }
        if (age > 100){
            throw new RuntimeException("Некорректный возраст человека. В таком возрасте уже точно не работают.");
        }
        this.age = age;
    }

    public void setName(String name) {
        if (name == null || name.length() < 2){
            throw new RuntimeException("Некорректное имя человека, имя не может быть меньше 2 букв.");
        }
        this.name = name;
    }

    @Override
    public String toString() {
        if (!isSuccessCreateValues) {
            return "Внимание, некоторые данные установлены по умолчанию! " + name + ", " + age + ", " + salary;
        }
        return name + ", " + age + ", " + salary;
    }

    @Override
    public int compareTo(BaseWorker element) {
        return this.getAge() - element.getAge();
    }
    //endregion
}
