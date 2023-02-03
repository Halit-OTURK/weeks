package Replit_Task_Empty;

import java.util.LinkedHashMap;
import java.util.Map;

public class assess {
    public abstract class movie {
        public abstract void makeMovie();
    }

    public abstract class comedy extends movie {
        public abstract void makeJoke();
    }

    class StandUp extends comedy {

        public void makeJoke() {
            System.out.println("joke");
        }

        @Override
        public void makeMovie() {

        }
    }

    public static void main(String[] args) {
        Map<String, Double> unit6 = new LinkedHashMap<>();
        unit6.put("OOP Abstraction", 14.5);
        unit6.put("OOP Polymorphism", 8.5);
        unit6.put("Collection", 9.5);
        unit6.put("Map", 7.5);


    }
}
