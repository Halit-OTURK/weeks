package week_13_day37_Inharitance.PhoneTask;

public class Phone {

    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public static boolean hasBattery=true;

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

  public void call(long number){

      System.out.println(brand+" "+model+" is calling");
  }

    public void text(long number){

        System.out.println(brand+" "+model+ " is texting");
    }


    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", has battery='" + hasBattery + '\'' +
                '}';
    }





}
