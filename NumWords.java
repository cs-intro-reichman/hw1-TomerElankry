// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
	    int nw = Integer.parseInt(args[0]);
		System.out.println(nw%1000/100 +" hundreds, "+(nw%100)/10+" tens, "+nw%10+" ones");
	}
}
