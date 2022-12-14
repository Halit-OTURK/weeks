package week_11_day30_C_Class_Intro;

public class CapitolOne {

   public static void main(String[] args) {
      Employee e1=new Employee();
      Employee e2=new Employee();
      Employee e3=new Employee();
      Employee e4=new Employee();
      Employee e5=new Employee();

      e1.setInfo("Muhtar",'m',35,85476,"JavaMentor",200,true);
      e2.setInfo("Nadir",'m',40,21456,"SoftSkillsMentor",200,false);
      e3.setInfo("Hakim",'m',47,487962,"GroupMentor",300,true);
      e4.setInfo("Asiya",'f',33,89547,"SoftSkillMentor",200,true);
      e5.setInfo("Adam",'m',30,87456,"JavaMentor",200,false);

      Employee [] employees= {e1,e2,e3,e4,e5};


      int countFullTime = 0;
      int countPartTime = 0;
      double max = employees[0].salary;
      double min = employees[0].salary;

      for (Employee employee : employees) {

         if(employee.isFullTime){
            countFullTime++;
         }else{
            countPartTime++;
         }

         if(employee.salary > max){
            max = employee.salary;
         }

         if(employee.salary < min){
            min = employee.salary;
         }

      }


      System.out.println("countPartTime = " + countPartTime);
      System.out.println("countFullTime = " + countFullTime);
      System.out.println("min = " + min);
      System.out.println("max = " + max);



   }


}
