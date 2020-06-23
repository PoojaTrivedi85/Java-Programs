
class Student
{
	int rollNo;
	
	void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}
	int getRollNo() 
	{
		return rollNo;
	}
}

class Test extends Student{
	
	int subject1,subject2;
	
	void setMarks(int subject1, int subject2) {
		
		this.subject1 = subject1;
		this.subject2 = subject2;
	}
	
	int getMarks() {
		return subject1 + subject2;
	}
}

interface Sports{
	int extraMark=20;
	void addOnMarks();
}

class Results extends Test implements Sports{
	int total;
	
	public void addOnMarks() {
		System.out.println("Add on marks 20 of sports will also be added");
	}
	
	void display() {
		total = subject1 + subject2 + extraMark;
		System.out.println("Roll No: "+ getRollNo());
		
		System.out.println("Total of 2 subjects: "+ getMarks());
		
		addOnMarks();
		
		System.out.println("Final Total: "+ total);
	
	}
}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		
		Results s1=new Results();
		s1.setRollNo(70);
		s1.setMarks(50, 50);
		s1.display();

	}

}
