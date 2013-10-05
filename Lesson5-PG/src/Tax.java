import java.lang.Math;

public class Tax {
	
	double grossIncome;
	String state;
	int dependents;
	
	Tax (double gi, String st, int depen) {
		
		grossIncome = gi;
		state = st;
		dependents = depen;
	}
	
	public double calcTax() {
		
	      return Math.max(((grossIncome < 30000) ? grossIncome * 0.05 : grossIncome * 0.06) 
	    		  - dependents * 100, 0);	  
		

	}

}
