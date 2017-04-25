// Team Dum: Kevin Bao, Jackie Woo, Datian Zhang

import cs1.Keyboard;

//ticket class for a help desk
public class Ticket {

    private String username;
    private static int customerNumber = 1;
    private String _ID;
    public String desc;
    private int priority;
    private String resolution;

    //default constructor to construct a ticket
    //won't really be used that often; not very useful; 
    public Ticket() {
	_ID = "EGJ2IO4EKLE" + customerNumber + "JE5GKMLE" ;
	customerNumber ++;
	username = "ID " + _ID;
	desc = "help";
	priority = 1; // use a method to determine
    }
    
    //overloaded constructor to construct a ticket
    public Ticket(String name , String description) { 
	_ID = "EMT" +  customerNumber + "DJ";
	customerNumber++;
	username = name;
	desc = description;
	priority = 1; // use a method to determine
    }
    
    public Ticket(String name , String description, int prior) { 
	_ID = "DDJ" + customerNumber + "KHALE" + (int)(Math.random() * 10) ; // randomized/ambiguous
	customerNumber++;
	username = name;
	desc = description;
	if(prior != 4){
	    priority = prior; // use a method to determine
	}
	System.out.println(prior);
	if( prior == 4){
	    priority=readDesc();	
	}
    }
    public int readDesc(){
		
	String[] arr = desc.split(" ");
	System.out.println(arr[0]);
	for( String words: arr){
	    if(words.equals("tech") ||words.equals( "dispatch")){
		return 0;
	    }
	    if(words.equals("password" )|| words.equals( "pw") ||words.equals( "sign-in") ||
	       words.equals("log") || words.equals("sign")){
		return 1;
	    }
	    if(words.equals("computer") || words.equals("network") ||words.equals( "internet")){
		return 2;
	    }
	    if(words.equals("coffee") || words.equals("drink") ) {
		return 3;
	    }
	    
	}
	return 4;   
    }

    public String getID() {
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
	retStr += "\n==========Ticket " + _ID + "===========\n";
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
