public class Main {
    public static void main(String[] args) {
        Employee[] e1 = new Employee[4];
        e1[0] = new Employee(4757, "Tanjid", 50000);
        e1[1] = new Administrator(4755, "Rohan", 600000, "CSE");
        e1[2] = new Professor(4777, "John ", 65000, "OOP");
        e1[3] = new SupportStaff(4888, "Jack", 45000, "CEO");

        for (Employee e : e1) {
            System.out.println(e);
        }
        double totalSalary = Employee.totalSalary(e1);
        System.out.println("Total salary: " + totalSalary);
    }
}
