
public class ObserverPatternDemo {

	public static void main(String[] args) {
	      Subject subject = new Subject();

	    
	      new BinaryObserver(subject);

	      System.out.println("First state change: 25");	
	      subject.setState(15);
	      System.out.println("Second state change: 9");	
	      subject.setState(10);
	   }
	
}