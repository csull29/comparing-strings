/*
*Theatre1.java
*@author C Sullivan
*10th March 2017
*/
import javax.swing.*;
public class Theatre{
	public static void main(String args[]){


	//Declare variables
	String day;

	//input
	day = JOptionPane.showInputDialog(null, "Please enter the day of the week");


	//process & Output
	if(day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Tuesday")||day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Thursday")){ //if the day equals monday - different for strings
		JOptionPane.showMessageDialog(null, "The cost of your theatre ticket is 20 euro.");

	}
	else if(day.equalsIgnoreCase("Friday") || day.equalsIgnoreCase ("Saturday") || day.equalsIgnoreCase ("Sunday")){
		JOptionPane.showMessageDialog(null, "The cost of your theatre ticket is 30 euro.");
	}
	else{
		JOptionPane.showMessageDialog(null,"That is not a valid day");
		}
		}
}
