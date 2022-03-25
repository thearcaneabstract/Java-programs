package javaprograms;
 
class EmployeeDetails {  
int YOJ;
int Salary;  
String Name, Address;  


public int getSalary() {  
  return Salary;  
}  
public void setSalary(int Salary) {  
  this.Salary = Salary;  
}
public int getYOJ() {
	return YOJ;
}
public void setYOJ(int YOJ) {
	this.YOJ = YOJ;
}
public String getName() {  
  return Name;  
}  
public void setName(String Name) {  
  this.Name = Name;  
}  
public String getAddress() {  
  return Address;  
}  
public void setAddress(String Address) {  
  this.Address = Address;  
}  


//Overriding toString() method  
@Override  
public String toString() {  
  return  "Employee [Name = " + Name + ", YOJ = "+ YOJ +", Salary = " + Salary + ", Address = " + Address +"]"; 
  }  
    
}  
//Creating main class  
public class Employee{  
	
  public static void main(String args[]) {  
        

      EmployeeDetails emp1 = new EmployeeDetails();    
      emp1.setName("Robert");
      emp1.setYOJ(1994);
      emp1.setSalary(35000);
      emp1.setAddress("64C-WallsStreet");
      
      EmployeeDetails emp2 = new EmployeeDetails();    
      emp2.setName("Sam");  
      emp2.setYOJ(2000);
      emp2.setSalary(20000);  
      emp2.setAddress("68D-WallsStreet");
      
      EmployeeDetails emp3 = new EmployeeDetails();    
      emp3.setName("John");
      emp3.setYOJ(1999);
      emp3.setSalary(25000);  
      emp3.setAddress("26B-WallsStreet");
      
      
      System.out.println(emp1);
      System.out.println(emp2);
      System.out.println(emp3);


	}

}
