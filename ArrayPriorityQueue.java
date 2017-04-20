/*Kevin Bao
APCS2 pd1
HW32 -- Getting Past the Velvet Rope
2017-04-19 */

import java.util.ArrayList;

public class ArrayPriorityQueue{

    private ArrayList freedo;
    private int _size;

    public ArrayPriorityQueue() {
	freedo = new ArrayList();
	_size = 0;
    }

    public void add (int x){
	if (isEmpty() || (int)freedo.get(_size-1) < x) {
	    freedo.add(x);
	    _size ++;
	}
	else {
	    for (int y = 0 ; y < _size ; y ++) {
		if ((int)freedo.get(y) >= x) {
		    freedo.add(y,x);
		    _size++;
		    return;
		}
	    }
	}
    }

    public boolean isEmpty(){
	return _size == 0;
    }

    public int peekMin(){
	if (isEmpty()) {
	    return -1;
	}
	return (int)freedo.get(0);
    }

    public int removeMin(){
	if (isEmpty()) {
	    return -1;
	}
	int retVal = peekMin();
	freedo.remove(0);
	_size--;
	return retVal;
    }

    public String toString() {
	String retStr = "";
	for (int x = 0 ; x < _size ; x ++) {
	    retStr += freedo.get(x);
	}
	return retStr;
    }

    public static void main(String[] args) {

	ArrayPriorityQueue tracer = new ArrayPriorityQueue();

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

	
	

    }
}
