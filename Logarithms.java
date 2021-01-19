import java.util.*;
public class Logarithms {

	public static double simulate(int n, double base) {
		double num = 0.0;
		double denom = 0.0;
		
		for(int i = 0; i < n;i++) {
			double a = Math.random();
			double b = Math.random();
			int x = (int) (Math.floor(Math.log(a)/Math.log(base)));
			int y = (int) (Math.floor(Math.log(b)/Math.log(base)));
			if(x == y) {
				num++;
			}
			denom++;
		}
		return num/denom;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter in the base.");
		double base = sc.nextDouble();
		
		System.out.println("10^3 simulations: " + simulate(1000,base));
		System.out.println("10^4 simulations: " + simulate(10000,base));
		System.out.println("10^5 simulations: " + simulate(100000,base));
		System.out.println("10^6 simulations: " + simulate(1000000,base));
		System.out.println("Theoretical: " + (base-1)/(base+1));
	}

}
