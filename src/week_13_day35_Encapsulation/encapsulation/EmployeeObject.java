package week_13_day35_Encapsulation.encapsulation;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee e1=new Employee("ahmet",'M',29,5400);
        System.out.println(e1);

        Employee e2=new Employee("",'^',-99,-65896);
        System.out.println(e2);

        /*
        Employee{name='null', gender= , age=0, salary=0.0}
        ADVANTAGES OF WRITING CODES THIS TYPE!!!!
        setName(name);
        setGender(gender);
        setAge(age);
        setSalary(salary);
         */

e2.setAge(37);
e2.setSalary(52000);
e2.setGender('F');

        System.out.println(e2); // Employee{name='null', gender=F, age=37, salary=52000.0}
        e2.setSalary(e2.getSalary()+1500);
        e2.setName("Z"+e1.getName());
        System.out.println(e2);// Employee{name='Zahmet', gender=F, age=37, salary=53500.0}
    }
}
