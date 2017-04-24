import cs1.Keyboard;
import java.util.ArrayList;

public class HelpDesk{

    //stores tickets based on priority
    private ArrayPriorityQueue<Ticket> _tickets;
    //stores services based on priority
    //_services.get(0) will have highest priority
    //_services.get(_services.size()-1) will have lowest priority
    private static ArrayList<String> _services;
    private static ArrayList<String> _categories;

    /*---------------------------------------
      precond: 
      postcond: constructs a HelpDesk with an empty APQ of tickets and an empty AL of services
      ---------------------------------------*/        
    public HelpDesk (){//O(1)
	_tickets = new ArrayPriorityQueue<Ticket>();
	_services = new ArrayList<String>();
	_categories = new ArrayList<String>();
	addServices();
	addCategories();
    }//end HelpDesk

    /*---------------------------------------
      precond: _services is created
      postcond: adds various services to _services
      ---------------------------------------*/        
    public void addServices() { //O(1)
	_services.add("dispatchTech");
	_services.add("passReset");
	_services.add("slowNetwork");
	_services.add("coffee");
    }//end addServices
    /*---------------------------------------
      precond: _services is created
      postcond: adds various categories
      ---------------------------------------*/        
    public void addCategories() { //O(1)
	_categories.add("Computer broke");
	_categories.add("Account not working");
	_categories.add("Network issue");
	_categories.add("Beverages needed");
    }//end addServices
    /*---------------------------------------
      precond: int num
      postcond: returns a service at index num of _services
      if num is invalid, return the last service
      ---------------------------------------*/        
    public static String assignDesc(int num) {//O(1)
	if (num < _categories.size() && num >=0) {
	    return _categories.get(num);
	}
	System.out.println("Invalid selection. Default service chosen . . .");
	return _services.get(_services.size()-1);
    }//end assignDesc	

    /*---------------------------------------
      precond: a HelpDesk is created
      postcond: prints tickets
      ---------------------------------------*/        
    public void printTickets(){//O(n)
	System.out.println(_tickets);
    }//end printTickets

    /*---------------------------------------
      precond: a HelpDesk is created
      postcond: prints services
      ---------------------------------------*/        
    public void printServices() {//O(n)
	String retStr = "";
	for (int x = 0 ; x < _categories.size() ; x ++) {
	    retStr += "\n" + x + ": " + _categories.get(x);
	}
	System.out.println(retStr);
    }//end printServices


    /*---------------------------------------
      precond: HelpDesk is created
      postcond: adds a ticket to ArrayPriorityQueue _tickets based on priority of ticket
      ---------------------------------------*/        
    public void addTicket( Ticket x ){//O(n)
	
	//if empty, just add x at end of AL
	if (_tickets.isEmpty() || _tickets.get(_tickets.size()-1).getPriority() <= x.getPriority() ) {
	    _tickets.add(x);
	}
	//if not empty, find position and insert x at position
	else {
	    for (int y = 0 ; y < _tickets.size() ; y ++) {
		if (_tickets.get(y).getPriority() > x.getPriority() || 
		    _tickets.get(y).getPriority() == x.getPriority() ) {
		    _tickets.add(y,x);
		    return;
		} // if
	    } // for
	}// else
    }// addTicket
    
   /*---------------------------------------
      precond: HelpDesk is created
      postcond: dequeues and returns ticket with highest priority
      if there are no tickets, return null.
      ---------------------------------------*/        
    public Ticket dequeue (){//O(n)
	if (_tickets.isEmpty()) {
	    System.out.println("There are no tickets pending.");
	    return null;
	}
	else {
	    
	    System.out.println(_tickets.get(0).getName() + "'s service has been granted.");
	    Ticket retTicket = _tickets.get(0);
	    _tickets.remove(0);
	
	    return retTicket;
	}
    }//end dequeue

    /*---------------------------------------
      Requests user input and creates a new ticket based on user input
      precond: a HelpDesk is created
      postcond: returns a new ticket 
      ---------------------------------------*/    
    public Ticket newRequest() {//O(n)
	    
	//user inputs name
	System.out.println("Greetings. Please tell us your name.");
	String inputName = Keyboard.readString();

	//user input converted into description
	System.out.println("Hello " + inputName + ". Select one of our categories below (Enter the number):");
	printServices();
	int categoryNum = Keyboard.readInt();
	String inputDesc = assignDesc(categoryNum);
	
	Ticket a = new Ticket (inputName, inputDesc, categoryNum);
	return a;
    }//end newRequest
       	    

    //main
    public static void main (String[] args){
	HelpDesk hDesk = new HelpDesk();

	Ticket ticketA;

	//AI tickets
	hDesk.addTicket(new Ticket ("Bobby Bobberson I" , assignDesc(1) , 1));
	hDesk.addTicket(new Ticket ("Grant Grantington III" , assignDesc(3) , 3));
	hDesk.addTicket(new Ticket ("Welch Welchingloo" , assignDesc(0) , 0));

	//request will always be made until user decides not to
	int input = 0;
	while (input == 0) {
	    System.out.println("Would you like to request a service? (select 0 or 1) \n0: yes\n1: no");
	    input = Keyboard.readInt();
	    if (input == 0) {
		
		ticketA = hDesk.newRequest();
		
		System.out.println("Your ticket has been added to the queue.\n");
		hDesk.addTicket(ticketA);
		//hDesk.printTickets();
		
		System.out.println(hDesk.dequeue());
		System.out.println(hDesk.dequeue());
		
		//hDesk.printTickets();
	    }
	}
	System.out.println("Goodbye!");
    }//end main
}//end class HelpDesk
