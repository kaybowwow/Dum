import cs1.Keyboard;

public class HelpDesk{
	
	ArrayPriorityQueue<Ticket> _tickets;
	
	public HelpDesk (){
		_tickets = new ArrayPriorityQueue<Ticket>();
	}
	
	// adds ticket based on priority
	public void add( Ticket x ){
	
		
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
	
	// determines priority of task, returns priority
	// takes in description to be parsed
	public int determinePriority( String desc ){
		return 1;
	}
	
	// takes ticket out of APQ
	public Ticket dequeue (){
		return new Ticket();
	}
	
	public String printQueue(){
		return _tickets.toString();
	}
	
	public static void main (String[] args){
		HelpDesk hd = new HelpDesk();
		//user inputs name
		System.out.println("Greetings. Please tell us your name.");
		String inputName = Keyboard.readString();

		//user inputs description
		System.out.println("Hello " + inputName + ". How may I help you?");
    	String inputDesc = Keyboard.readString();
    	

    	Ticket blah = new Ticket (inputName, inputDesc);
    	hd.add(blah);
    	System.out.println(hd.printQueue());
	}

	
}