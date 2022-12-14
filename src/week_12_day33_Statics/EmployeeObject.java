package week_12_day33_Statics;

public class EmployeeObject {




    public static void main(String[] args) {
        Employee employee1=new Employee();
        Employee employee2=new Employee();

        Employee employee3=new Employee();



        employee1.name = "hakan";
        employee2.name ="halil";
        employee3.name ="hamit";

        System.out.println("employee1 = " + employee1.name);//employee1 = hamit => public static String name;
        // public String name; => hakan
        System.out.println("employee2 = " + employee2.name);//employee1 = hamit => public static String name;
        // public String name; => halil
        System.out.println("employee3 = " + employee3.name);//employee1 = hamit => public static String name;
        // public String name; => hamit

        employee1.salary = 110000;
        employee2.salary = 130000;
        employee3.salary = 150000;

        System.out.println("employee1.salary = " + employee1.salary);// public static double salary; => 150000.0
        System.out.println("employee2.salary = " + employee2.salary);// public static double salary; => 150000.0
        System.out.println("employee3.salary = " + employee3.salary);// public static double salary; => 150000.0


    }





}
