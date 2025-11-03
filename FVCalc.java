// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
	int investedSum = Integer.parseInt(args [0]);
	double annualRate = Double.parseDouble (args [1]);
	int years = Integer.parseInt(args [2]);
	int futureValue = (int) (investedSum * (Math.pow(1 + annualRate / 100.0, years)));
	System.out.println("After " + years + " years, $" + investedSum + " saved at " + annualRate + "% will yield $" + futureValue);


	}
}