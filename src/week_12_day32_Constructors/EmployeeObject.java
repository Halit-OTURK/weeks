package week_12_day32_Constructors;

public class EmployeeObject {

    public static void main(String[] args) {
        Employee employee1=new Employee("serdar");

        System.out.println(employee1);

        employee1.gender='m';
        employee1.jobTitle="mamger";
        System.out.println(employee1);


        Employee employee2=new Employee("aisha",'f');
        System.out.println(employee2);

Employee employee3=new Employee("murat",'m',"teacher");

        System.out.println(employee3);

        Employee employee4= new Employee("fikriye",'f',"doctor",20.5);
        System.out.println(employee3);
        System.out.println(employee4);

    }


}
