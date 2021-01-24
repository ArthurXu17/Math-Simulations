import java.util.*;
public class Threedie {

	public static int min(int a, int b, int c) {
		int ans = a;
		
		if (a<=b && a <= c) {
			
		}
		else if (b <= c && b<=a) {
			ans = b;
		}
		else if(c <= a && c <= b) {
			ans = c;
		}
		
		return ans;
	}
	public static int max(int a, int b, int c) {
		int ans = a;
		
		if (a>=b && a >= c) {
			
		}
		else if (b >= c && b>=a) {
			ans = b;
		}
		else if(c >= a && c >= b) {
			ans = c;
		}
		
		return ans;
	}
	public static double chance(int n) {
		double numerator = 0.0;
		double denominator = n;
		for (int i = 0; i < n;i++) {
			int a = (int) (Math.random()*6+1);
			int b = (int) (Math.random()*6+1);
			int c = (int) (Math.random()*6+1);
			if(max(a,b,c) == 2*min(a,b,c)) {
				numerator++;
			}
		}
		return numerator/denominator;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(chance(1000000));
		System.out.println(chance(99999999));
		
	}

}
