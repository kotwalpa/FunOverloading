public class Employee
{
    int EmpId;
    String Name;

   public Employee(int EmpId,String Name)
    {
        this.EmpId=EmpId;
        this.Name=Name;
        System.out.println("Constructor Of Emp....");
    }

    public int getEmpId()
    {
        return EmpId;
    }
   // public void SetEmpId(int EmpId)
   // {
     //   this.EmpId=EmpId;
    //}
    public String getName()
    {
        return Name;
    }
    //public void SetName(String Name)
   // {
    //    this.Name=Name;
   // }
    public static void main(String[] args)
    {
       Employee E1 = new Employee(5,"pranjal");
     //  E1.SetEmpId(7);
     //  E1.SetName("Anil");


       System.out.println(E1.getEmpId());
        System.out.println(E1.getName());
    }
}
