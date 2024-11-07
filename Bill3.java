// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int price = Integer.parseInt(args[3]);
		//Basiclly, I've recieved 3 names and the price of the bill.
		double fixed = Math.ceil(price/3.0); // Here I've wanted to round the price up.
		System.out.println("Dear " + name1 + ", " + name2 + ", " + name3 + ": pay " + fixed + " Shekels each.");
		
		
	}
}