package week_21_day51_Map;

public class TestEnum {
    public static void main(String[] args) {
//   String browser = "Wooden Spoon";
        Browser browser = Browser.SAFARI;

switch (browser){
    case EDGE:
        System.out.println("firefox selected");
        break;
    case SAFARI:
        System.out.println("Safari is selected");
        break;

    case OPERA:
        System.out.println("Opera is selected");
        break;

     default:
        System.out.println("Chrome is selected");
}

        Season season = Season.SUMMER;


    }

}
