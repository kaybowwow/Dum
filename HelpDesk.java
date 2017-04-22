import cs1.Keyboard;
import java.util.ArrayList;

public class HelpDesk{

    //stores tickets based on priority
    private ArrayPriorityQueue<Ticket> _tickets;
    //stores services based on priority
    //_services.get(0) will have highest priority
    //_services.get(_services.size()-1) will have lowest priority
    private static ArrayList<String> _services;;

    /*---------------------------------------
      precond: 
      postcond: constructs a HelpDesk with an empty APQ of tickets and an empty AL of services
      ---------------------------------------*/        
    public HelpDesk (){
	_tickets = new ArrayPriorityQueue<Ticket>();
	_services = new ArrayList();
	addServices();
    }

    /*---------------------------------------
      precond: a HelpDesk is created
      postcond: adds various services to _services
      ---------------------------------------*/        
    public void addServices() {
	_services.add("dispatchTech");
	_services.add("passReset");
	_services.add("slowNetwork");
	_services.add("coffee");
    }
    	
    /*---------------------------------------
      precond: int num
      postcond: returns a service at index num of _services
      if num is invalid, return the last service
      ---------------------------------------*/        
    public String assignDesc(int num) {
	if (num < _services.size()) {
	    return _services.get(num);
	}
	System.out.println("Invalid selection. Default service chosen . . .");
	return _services.get(_services.size()-1);
    }	

    /*---------------------------------------
      precond: a HelpDesk is created
      postcond: prints tickets
      ---------------------------------------*/        
    public void printTickets(){
	System.out.println(_tickets);
    }

    /*---------------------------------------
      precond: a HelpDesk is created
      postcond: prints services
      ---------------------------------------*/        
    public void printServices() {
	String retStr = "";
	for (int x = 0 ; x < _services.size() ; x ++) {
	    retStr += "\n" + x + ": " + _services.get(x);
	}
	System.out.println(retStr);
    }

    /*---------------------------------------
      Requests user input and creates a new ticket based on user input
      precond: a HelpDesk is created
      postcond: returns a new ticket 
      ---------------------------------------*/    
    public Ticket newRequest() {
	//user inputs name
	System.out.println("Greetings. Please tell us your name.");
	String inputName = Keyboard.readString();

	//user input converted into description
	System.out.println("Hello " + inputName + ". How may I help you? Select one of our services below:");
        printServices();
    	int serviceNum = Keyboard.readInt();
	String inputDesc = assignDesc(serviceNum);
	
    	Ticket a = new Ticket (inputName, inputDesc, serviceNum);
	return a;
    }

    /*---------------------------------------
      precond: Ticket x
      postcond: adds a ticket to ArrayPriorityQueue _tickets based on priority of ticket
      ---------------------------------------*/        
    public void addTicket( Ticket x ){
	
	//if empty, just add x at end of AL
	if (_tickets.isEmpty() || _tickets.get(_tickets.size()-1).getPriority() < x.getPriority() ) {
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
    }// add
    
    // takes ticket out of APQ
    public Ticket dequeue (){
	return new Ticket();
    }

    
    public static void main (String[] args){
	HelpDesk hDesk = new HelpDesk();
	
    	Ticket ticketA = hDesk.newRequest();

    	hDesk.addTicket(ticketA);

    	hDesk.printTickets();
    }

	
}
