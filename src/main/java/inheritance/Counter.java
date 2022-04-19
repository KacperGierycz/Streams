package inheritance;

public class Counter {
	
	private int n=2;

	void incremetI() {
		for (int i=0;i<10;i++) {
			n=n+i;
		}
	}
	
	void  getN() {
		System.out.println(this.n);
		
	}

    public int addToNumber(int number) {
        return number + 1;
    }
    
    public int subtractFromNumber(int number) {
        return number - 1;
    }
}
