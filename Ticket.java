// Team Dum: Kevin Bao, Jackie Woo, Datian Zhang

import cs1.Keyboard;

//ticket class for a help desk
public class Ticket {

    private String username;
    private static int _ID = 1;
    private int uniqueID;
    public String desc;
    private int priority;

    //default constructor to construct a ticket
    //won't really be used that often; not very useful; 
    public Ticket() {
	uniqueID = _ID;
	_ID = _ID+1;
	username = "User #" + uniqueID;
	desc = "help";
	priority = 1; // use a method to determine
    }
    
    //overloaded constructor to construct a ticket
    public Ticket(String name , String description) { 
	uniqueID = _ID;
	_ID = _ID+1;
	username = name;
	desc = description;
	priority = 1; // use a method to determine
    }
    
    public Ticket(String name , String description, int prior) { 
	uniqueID = _ID;
	_ID = _ID+1;
	username = name;
	desc = description;
	priority = prior; // use a method to determine
    }

    public int getID() {
        return uniqueID;
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
	retStr += "\n==========Ticket #" + uniqueID + "==========\n\n";
	retStr += "Name: \t\t" + username + "\n\n";
	retStr += "Description: \t" + desc + "\n\n";
	retStr += "Priority: \t" + priority + "\n\n";
	retStr += "================================";
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
