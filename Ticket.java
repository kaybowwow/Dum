// Team Dum: Kevin Bao, Jackie Woo, Datian Zhang

import cs1.Keyboard;

//ticket class for a help desk
public class Ticket {

    private String username;
    private static int customerNumber = 1;
    private int _ID;
    public String desc;
    private int priority;

    //default constructor to construct a ticket
    //won't really be used that often; not very useful; 
    public Ticket() {
	_ID = customerNumber;
	customerNumber ++;
	username = "User #" + _ID;
	desc = "help";
	priority = 1; // use a method to determine
    }
    
    //overloaded constructor to construct a ticket
    public Ticket(String name , String description) { 
	_ID = customerNumber;
	customerNumber++;
	username = name;
	desc = description;
	priority = 1; // use a method to determine
    }
    
    public Ticket(String name , String description, int prior) { 
	_ID = customerNumber;
	customerNumber++;
	username = name;
	desc = description;
	priority = prior; // use a method to determine
    }

    public int getID() {
        return _ID;
    }

    public String getName() {
        return username;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }

    //returns contents of a ticket
    public String toString() {
	String retStr = "";
	retStr += "\n==========Ticket #" + _ID + "===========\n";
	retStr += "Name: \t\t" + username + "\n";
	retStr += "Description: \t" + desc + "\n";
	retStr += "Priority: \t" + priority + "\n";
	retStr += "==============================";
	return retStr;
    }

    public static void main (String[] args) {
/*
	//user inputs name
	System.out.println("Greetings. Please tell us your name.");
	String inputName = Keyboard.readString();

	//user inputs description
	System.out.println("Hello " + inputName + ". How may I help you?");
    String inputDesc = Keyboard.readString();

	Ticket hero0 = new Ticket();
    Ticket hero = new Ticket(inputName , inputDesc);
	Ticket hero1 = new Ticket(inputName , inputDesc);
	Ticket hero2 = new Ticket(inputName , inputDesc);
	System.out.println(hero0);
	System.out.println(hero);
	System.out.println(hero1);
	System.out.println(hero2);
*/
    }//end main

}//end 
