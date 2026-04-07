import java.util.Scanner;

class Parent
{
    Scanner sc = new Scanner(System.in);

    String name;
    int age;
    String gender;

    void input() 
	{
        System.out.print("Enter Name: ");
        this.name = sc.nextLine();

        System.out.print("Enter Age: ");
        this.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Gender: ");
        this.gender = sc.nextLine();
    }

    void display() 
	{
        System.out.println("| Name : " + this.name);
        System.out.println("| Age : " + this.age);
        System.out.println("| Gender : " + this.gender);
    }
}

class StudentClass extends Parent 
{

    int rollno;
    String dept;
    int sem;

    void input() 
	{
        System.out.print("Enter Roll Number: ");
        this.rollno = sc.nextInt();
        sc.nextLine();

        super.input();

        System.out.print("Enter Department: ");
        this.dept = sc.nextLine();

        System.out.print("Enter Semester: ");
        this.sem = sc.nextInt();
        sc.nextLine();
    }

    void display() 
	{
        System.out.println("--------------------------------------");
        System.out.println("| Student's Information              |");
        System.out.println("--------------------------------------");
        System.out.println("| Roll Number : " + this.rollno);
        super.display();
        System.out.println("| Dept : " + this.dept);
        System.out.println("| Sem : " + this.sem);
        System.out.println("--------------------------------------");
    }
}

class StaffClass extends Student 
{

    int staff_id;
    String dept;
    String designation;

    void input() 
	{
        System.out.print("Enter Staff ID: ");
        this.staff_id = sc.nextInt();
        sc.nextLine();

        super.input();

        System.out.print("Enter Department: ");
        this.dept = sc.nextLine();

        System.out.print("Enter Designation: ");
        this.designation = sc.nextLine();
    }

    void display() 
	{
        System.out.println("--------------------------------------");
        System.out.println("| Staff's Information                |");
        System.out.println("--------------------------------------");
        System.out.println("| Staff's Number : " + this.staff_id);
        super.display();
        System.out.println("| Dept : " + this.dept);
		System.out.println("| Designation :" +this.designation);
        System.out.println("--------------------------------------");
    }
}

public class St1
{
    public static void main(String[] args) 
	{

        StudentClass obj = new StudentClass();
        obj.input();
        obj.display();

        StaffClass obj1 = new StaffClass();
        obj1.input();
        obj1.display();
    }
}