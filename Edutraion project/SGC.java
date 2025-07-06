package EDUTRAION1;
import java.util.*;
public class SGC {

	public static void main(String[] args) {
		
		        Scanner sc=new Scanner(System.in);
		        System.out.println("======STUDENT GRADE CALCULATOR======");
		        System.out.println("Enter the number of subjects:");
		     
		        int s=sc.nextInt();
		        int total=0;
		        System.out.println("Enter the marks obtained in "+s+" subjects respectively: ");
		        for(int i=0;i<s;i++){
		            int marks=sc.nextInt();
		            total=total+marks;
		        }
		        
		         double avg=(double)total/s;
		         String Grade;
		         if (avg>=90){
		           Grade="A+"; 
		         }
		         else if(avg>=80){
		            Grade="A";
		         }
		         else if(avg>=70){
		            Grade="B";
		         }
		         else if(avg>=60){
		            Grade="C";
		         }
		         else if(avg>=50){
		            Grade="D";
		         }
		         else if(avg>=40){
		            Grade="E";
		         }
		         else{
		            Grade="Fail(F)";
		           
		         }
		         System.out.println("Total marks = "+total);
		         System.out.println("Avreage Percentage= "+avg+" %");
		         System.out.println("Grade is : "+Grade);

		    }
		

}
