
public class Zadatak {

//Postojecu aplikaciju potrebno je obezbediti tako da ne prijavljuje gresku
	
////postavka	
	static int digitron (int a, int b, String operator) {
		if(operator.equals("+"))
			return a+b;
		if(operator.equals("-"))
			return a-b;
		if(operator.equals("/"))
			return a/b;
		if(operator.equals("*"))
			return a*b;
		
		return 0;
	}	
	
//	public static void main (String[] args) { //app
//		
//		int x = digitron (5, 0, "/");
//		System.out.println(x);
//	}
//  ovaj kod mora da se ubaci u try 
	
////resenje
	public static void main (String[] args) { 	
	
		
		int x = 0; //samo smo morali da je definisemo ispred
		
		try {
				x = digitron (5, 0, "/");
				System.out.println(x);
		}
		catch (ArithmeticException izuzetak) {
			System.out.println("Rezultat nije moguce izvrsiti");
		}
		
		
		
		
	}
}
