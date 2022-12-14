package week_13_day37_Inharitance.scrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "ProductOwner", id, salary, companyName);
    }


}
