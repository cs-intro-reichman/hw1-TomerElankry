// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int rnd = Integer.parseInt(args[0]); //Here I'm recieving a limit to my random numbers.
		int a = (int)((Math.random())*rnd); //Doubling the random numbers 0.0 to 1.0 times the limit that was recieved.
		int b = (int)((Math.random())*rnd);
		int c = (int)((Math.random())*rnd); 
		System.out.println(a + " " + b + " " + c); // Printing the random numbers.
		int max = Math.max(Math.max(a,b), c);
		int min = Math.min(Math.min(a, b), c);
		System.out.println(min + " " + (a+b+c-min-max) + " " + max); // Printing the numbers by ascending order.

	}
}
