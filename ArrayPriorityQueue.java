

import java.util.ArrayList;

public class ArrayPriorityQueue<T> implements PriorityQueue<T>{

    private ArrayList<T> freedo;
    private int _size;

    //construct empty AL with _size 0
    public ArrayPriorityQueue() {
	freedo = new ArrayList<T>();
	_size = 0;
    }

	public void add (T x){
		freedo.add(x);
	}
    public void add (int i , T x){
    	freedo.add(i, x);
    }
    
    //O(n^2)
    /*
	//if empty, just add x at end of AL
	if (isEmpty() || compareTo(_size-1, x) < 0) {
	    freedo.add(x);
	    _size ++;
	}
	//if not empty, find position and insert x at position
	else {
	    for (int y = 0 ; y < _size ; y ++) {
		if (compareTo(y, x) > 0 || compareTo(y, x) == 0) {
		    freedo.add(y,x);
		    _size++;
		    return;
		}
	    }
	}
	*/
    

    //is the AL empty?
    public boolean isEmpty(){//O(1)
	return _size == 0;
    }

    //returns smallest int in AL
    //if empty, return -1
    public T peekMin(){//O(1)
	if (isEmpty()) {
	    return null;
	}
	return freedo.get(0);
    }

    //removes and returns smallest int in AL
    //if empty, return -1
    public T removeMin(){//O(n)
	if (isEmpty()) {
	    return null;
	}
	T retVal = peekMin();
	freedo.remove(0);
	_size--;
	return retVal;
    }
    
    
    //returns contents of AL
    public String toString() {//O(n)
	String retStr = "[";
	for (int x = 0 ; x < _size ; x ++) {
	    retStr += freedo.get(x);
	    retStr += ",";
	}
	retStr += "]";
	return retStr;
    }
    
    
    public static void main(String[] args) {

	ArrayPriorityQueue<String> tracer = new ArrayPriorityQueue<String>();

/*
	System.out.println("Cheers, love! The cavalry's here! " + tracer.isEmpty() + "\n");
	
	tracer.add(1);
	System.out.println("Time's up! " + tracer);
	tracer.add(7);
	System.out.println("Here you go! " + tracer);
	tracer.add(4);
	System.out.println("Gotcha! " + tracer);
	tracer.add(5);
	System.out.println("Wait for it... " + tracer);
	tracer.add(2);
	System.out.println("Bombs away! " + tracer);


	System.out.println("\nCheers, love! The cavalry's here! " + tracer.isEmpty() + "\n");
	
	System.out.println("Tracer here! " + tracer.peekMin());
	System.out.println("Well, that just happened. " + tracer.removeMin());
	System.out.println("Tracer here! " + tracer.peekMin());
	System.out.println("Well, that just happened. " + tracer.removeMin());
	System.out.println("Tracer here! " + tracer.peekMin());
	System.out.println("Well, that just happened. " + tracer.removeMin());
	System.out.println("Tracer here! " + tracer.peekMin());
	System.out.println("Well, that just happened. " + tracer.removeMin());
	System.out.println("Tracer here! " + tracer.peekMin());
	System.out.println("Well, that just happened. " + tracer.removeMin());
	System.out.println("Let's try that again. " + tracer.peekMin());
	System.out.println("Whew! I think I hit the wall! " + tracer.removeMin());
*/
    }//end main
}//end
