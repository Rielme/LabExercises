import java.util.*;
public class RunBloodData {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
    	String data;
    	BloodData bd = new BloodData();
    	 
    	System.out.println("Enter the blood type of the patient: ");
    		String input1 = s.nextLine();
    		bd.setBloodType(input1);
    	System.out.println("Enter the Rhesus factor (+ or -): ");
    		String input2 = s.nextLine();
    		bd.setRhFactor(input2);
    		data = input1 + input2;
    		
    		if(data.isEmpty()) {    			
    			bd = new BloodData();
    			bd.setBloodType("O");
    			bd.setRhFactor("+");
    			System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
    			
    		}
    		else if(data.equals("A+")||data.equals("B+")||data.equals("B-")||data.equals("AB+")||data.equals("AB-")||data.equals("O+")||data.equals("O-")) {
    			System.out.println(bd.getBloodType() + bd.getRhFactor() + " is added to the blood bank.");
    			bd = new BloodData();
    			
    		}
   		else {
   			System.out.println("Invalid Input!");
   		}
    	s.close();
    }
    
}