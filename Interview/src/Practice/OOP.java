package Practice;

class library{
	private int roll;
	 private String name;
	 private double salary;
	
	 public library(int roll,String name,double salary){
		this.name=name;
		this.roll=roll;
		this.salary=salary;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		library l1=new library(20,"shubham",5000.00);
		library l2=new library(21,"shivam",5000.00);
		library l3=new library(22,"shambhu",5000.00);
		library l4=new library(23,"rahul",5000.00);
		library[] obj= {l1,l2,l3,l4};
		for (int i = 0; i < obj.length-1; i++) {
			for (int j = 0; j < obj.length-1-i; j++) {
				if(obj[j].getName().compareTo(obj[j+1].getName())>0) {
					library temp=obj[j];
					obj[j]=obj[j+1];
					obj[j+1]=temp;
				}
			}
		}
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i].getRoll()+" "+obj[i].getName()+" "+obj[i].getSalary());
		}
		
	}

}
