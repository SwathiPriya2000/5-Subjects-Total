import java.util.Scanner;
public class Totalof5subjects1 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int english, chemistry, computers, physics, maths; 
	        float total, Percentage, Average;
                String raghavi,aarthi,keerthi,priya,meena;
                
                    
                sc = new Scanner(System.in);
                System.out.println("Enter the name of first student:");
                raghavi = sc.next();
                sc = new Scanner(System.in);
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();

                total = english + chemistry + computers + physics + maths;
		Average = total / 5;
	        Percentage = (total / 500) * 100;

            System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);

                System.out.println("Enter the name of second student:");
                aarthi = sc.next();
                sc = new Scanner(System.in);
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();

                total = english + chemistry + computers + physics + maths;
		Average = total / 5;
	        Percentage = (total / 500) * 100;

            System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
                
                System.out.println("Enter the name of third student:");
                keerthi = sc.next();
                sc = new Scanner(System.in);
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();

                total = english + chemistry + computers + physics + maths;
		Average = total / 5;
	        Percentage = (total / 500) * 100;

            System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
	
		System.out.println("Enter the name of fourth student:");
                priya = sc.next();
                sc = new Scanner(System.in);
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();

                total = english + chemistry + computers + physics + maths;
		Average = total / 5;
	        Percentage = (total / 500) * 100;

            System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);

                System.out.println("Enter the name of fifth student:");
                meena = sc.next();
                sc = new Scanner(System.in);
		System.out.print(" Please Enter the Five Subjects Marks : ");
		english = sc.nextInt();	
		chemistry = sc.nextInt();	
		computers = sc.nextInt();	
		physics = sc.nextInt();	
		maths = sc.nextInt();

                total = english + chemistry + computers + physics + maths;
		Average = total / 5;
	        Percentage = (total / 500) * 100;
	    
	    System.out.println(" Total Marks =  " + total);
	    System.out.println(" Average Marks =  " + Average);
	    System.out.println(" Marks Percentage =  " + Percentage);
	}
}
