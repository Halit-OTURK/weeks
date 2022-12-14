package week_15_day39_Recap.shapeTask;

public class Shape {

    private String name;

    public Shape(String name) {

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);//something gone wrong
        }
        if (name.isEmpty()|| name.isBlank()){
            System.err.println("Name can not be empty or blank ");
            System.exit(1);//something gone wrong
        }
        this.name = name;
    }

    public double area (){

        return 0;
    }

    public double perimeter(){

        return 0;
    }



    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
