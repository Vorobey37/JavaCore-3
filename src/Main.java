
public class Main {

    public static void main(String[] args) {

        BaseWorker worker1 = Worker.create("Ы", 56, 50000);
        BaseWorker worker2 = Worker.create("Алексей", 150, 75500);
        BaseWorker worker3 = Worker.create("W", -15, 90000);
        BaseWorker worker4 = Worker.create("Андрей", 39, 18000);
        BaseWorker freelancer1 = Freelancer.create("Юлия", 25, 300);
        BaseWorker freelancer2 = Freelancer.create("Петр", 65, 50);

        Workers workers = new Workers();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);
        workers.add(worker4);
        workers.add(freelancer1);
        workers.add(freelancer2);

        workers.printDisplayInfo();

        workers.sortElements();
        workers.printDisplayInfo();

        workers.sortSalary();
        workers.printDisplayInfo();

    }
}