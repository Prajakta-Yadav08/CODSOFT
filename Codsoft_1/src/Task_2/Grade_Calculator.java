/* Task 3 : Grade Calculation
 
Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user
 */
 
 
package Task_2;
import java.util.Scanner;

public class Grade_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
         //A = 90-100
		 //B =  80-90
		 //C = 70-80
		 //D = 60-70
		 //E = 60-50
		 //F = below 50
		int Eng, Math, Phy, Chem, Bio;

		System.out.println("Enter the marks obtained (out of 100) in English:");
		Eng = sc.nextInt();
		
		System.out.println("Enter the marks obtained(out of 100) in Mathematics:");
		Math = sc.nextInt();
		
		System.out.println("Enter the marks obtained(out of 100) in Physics:");
		Phy = sc.nextInt();
		
		System.out.println("Enter the marks obtained(out of 100) in chemistry:");
		Chem = sc.nextInt();
		
		System.out.println("Enter the marks obtained(out of 100) in Biology:");
		Bio = sc.nextInt();
		
		int sum = Eng+Math+Phy+Chem+Bio;
		System.out.println("Total Marks " +sum);
		
		double percentage = (sum/5.0);
		System.out.println("average percentage " +percentage);
		
		String Grade ;// = calculateGrade(percentage);

		
		 if (percentage >= 90 && percentage <= 100) 
		 {
	            Grade = "A+";
	        } 
		    else if (percentage >= 80 && percentage < 90) 
	        {
	            Grade = "A";
	        } 
	        else if (percentage >= 70 && percentage < 80)
	        {
	           Grade = "B";
	        } 
	        else if (percentage >= 60 && percentage < 70) 
	        {
	        	Grade = "C";
	        } 
	        else if (percentage >= 50 && percentage < 60)
	        {
	        	Grade = "D";
	        } 
	        else
	        {
	        	Grade = "F";
	        }
		 System.out.println("\nGrade" +Grade);
	}

}
