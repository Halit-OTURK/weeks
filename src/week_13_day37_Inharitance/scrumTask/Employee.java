package week_13_day37_Inharitance.scrumTask;

public class Employee extends Person {


    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;

// before own attributes after then extend and constructor with generate


    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name + "is working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +

                '}';
    }

    // selected both toString person and employee
}

/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */