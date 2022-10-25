import java.util.*;
public class RunBloodData {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     
        BloodData bd = new BloodData();
     
     System.out.println("Enter blood type of patient: ");
     	 String bt = sc.nextLine();
     System.out.println("Enter the Rhesus Factor(+ or -): ");
     	 String rh = sc.nextLine();
     	 
   	if(bt.equalsIgnoreCase("A")||bt.equalsIgnoreCase("B")||bt.equalsIgnoreCase("AB")||bt.equalsIgnoreCase("O")){
 		bd.BloodData(bt,rh);
   		bd.display();
   		}
   	else if(bt.isEmpty()){
		bd.display();
   		}
   	else{
   		System.out.println("Invalid Blood type.");
   	  }
   }
} 	 	
