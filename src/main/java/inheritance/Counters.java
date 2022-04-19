package inheritance;

public class Counters {
	



	public static void main(String[] args) {
	    Counter counter = new Counter();
	    Counter superCounter = new SuperCounter();
	    int number = 3;
	    number = superCounter.subtractFromNumber(number);
	    number = superCounter.subtractFromNumber(number);
	    number = counter.addToNumber(number);
	    System.out.println(number);
	    counter.getN();
	    counter.incremetI();
	    counter.getN();
	    System.out.println(number);
	    number =number+1;
	    System.out.println(number);
	    
	    call(number);
	    System.out.println(number);
	}
	
    public static void call(int number) {
        System.out.println("Number in the beginning: " + number);
        number = number + 1;
        System.out.println("Number in the end: " + number);
    }
}
