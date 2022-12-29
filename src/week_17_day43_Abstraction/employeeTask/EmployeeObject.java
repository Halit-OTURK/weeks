package week_17_day43_Abstraction.employeeTask;

public class EmployeeObject {
    public static void main(String[] args) {

        //Person person = new Person("Josh", 35, 'M');
        //Employee employee = new Employee("Ali",30,'M',42,"SDET",145000.00);

        Tester tester = new Tester("Ali", 30, 'M', 42, "SDET", 145000.00);
        Developer developer = new Developer("Alex", 28, 'M', 32, "Web Developer", 155000.00);
        Teacher teacher = new Teacher("Angel", 28, 'F', 22, "English Teacher", 85000.00);
        Driver driver = new Driver("Jhon", 34, 'M', 42, "Lyft Driver", 75000.00);

        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(driver);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

        System.out.println("=>".repeat(44));

        developer.work();
        developer.sleep();
        // developer.bugReport();
        developer.eat();
        developer.unitTest();

        System.out.println("=>".repeat(44));

        teacher.work();
        teacher.sleep();
        teacher.eat();


    }
}
