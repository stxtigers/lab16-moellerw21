

public class TestEmployee
{
  public static void main(String[] args)
  {
    Employee e1 = new Employee();
    TechEmployee e2 = new TechEmployee();

    System.out.println(e2.getLastName());
    System.out.println(e2.getPayRate());
    System.out.println(e2.getQual());

    e2.setQual("robotics tech");
    e2.setPayRate(1);

    System.out.println(e2.toString());

    System.out.println(e1.getCount());



    /*
    System.out.println(e1.getLastName());
    System.out.println(e1.getPayRate());

    e1.setLastName("Jordan");
    e1.setPayRate(5);

    System.out.println(e1.toString());
    */
  }
}