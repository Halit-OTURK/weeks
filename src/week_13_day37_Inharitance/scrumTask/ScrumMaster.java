package week_13_day37_Inharitance.scrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }
}
