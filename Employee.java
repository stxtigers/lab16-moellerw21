

public class Employee
{
  protected String lastName;
  protected double payRate;
  private static int EmployeeCount = 0;

  public Employee()
  {
    lastName = "Johnson";
    payRate = 1;
    EmployeeCount++;
  }

  public void setLastName(String name)
  {
    lastName = name;
  }

  public String getLastName()
  {
    return lastName;
  }

  public void setPayRate(double pr)
  {
    payRate = pr;
  }

  public double getPayRate()
  {
    return payRate;
  }

  public String toString()
  {
    return "Employee, last name: " + lastName + ", pay rate: " + payRate;
  }

  public static int getCount()
  {
    return EmployeeCount;
  }

}