package hw1;

public class InterestCalculation {
	
	public static void main(String[] args) {
		
	
	
	double pv = 1500000.0; //本金
	double ir = 0.02; //年利率
	double fv = pv * ( 1 + ir) * ( 1 + ir ) * ( 1 + ir ) * ( 1 + ir) * ( 1 + ir) * ( 1 + ir) * ( 1 + ir) * ( 1 + ir) * ( 1 + ir) * ( 1 + ir); //本利和複利計算
	
	System.out.printf( "10年後的本利和為:%.2f元" , fv );
	
	}

}
