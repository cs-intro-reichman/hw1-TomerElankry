// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int isum = Integer.parseInt(args[0]);
		int prc = Integer.parseInt(args[1]);
		int yrs = Integer.parseInt(args[2]);
		// I've recieved 3 numbers from the user (initial sum , annuel intrest , and number of years invested)
		double fv1 = Math.pow((prc/100.0+1), yrs);
		fv1=fv1*isum;
		//The two lines above calculated the future sum
		System.out.println("After " + yrs + " years, " + "$" + isum+ " saved at "+ prc+ "% will yield $" + (int)fv1);

		
		
	
	}
}