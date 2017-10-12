/*
Theatre.java
@ author
21 2 /2017
*/

//Application to ask the user what day they want to go to the theatre.
//Mon - thurs - 20 euros
//Fri, sat or sun - 30 euros


/*
*Theatre1.java
*author@L Murphy
*10th Aug 2014
*This lesson is about comparing stings - .equals is used for strings
*if you want it to accept upper and lower case use .equalsIgnoreCase
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
