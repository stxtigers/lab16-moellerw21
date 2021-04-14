

public class TechEmployee extends Employee
{
  String qual;

  public TechEmployee()
  {
    super();
    qual = "forklift driver";
  }

  public void setQual(String ql)
  {
    qual = ql;
  }

  public String getQual()
  {
    return qual;
  }

  public String toString()
  {
    return "Employee, last name: " + lastName + ", pay rate: " + payRate + ", qualifications: " + qual;
  }

  public void setPayRate(double p)
  {
    payRate = p*2;
  }

  


}