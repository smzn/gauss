package gauss;

public class Gauss_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a[][] = {{3,1,2,2},{1,-1,2,2},{2,1,3,2},{1,1,1,1}};//行を入力
		double b[] = {5,7,6,2};//列で入力
		/*
		 3  1 2 2	5
		 1 -1 2 2	7
		 2  1 3 2	6
		 1  1 1 1	2
		 */
		double x[] = new double[b.length];
		
		Gauss_lib glib = new Gauss_lib(a, b, b.length);
		x = glib.calcGauss(); 
		for(int i = 0; i < b.length; i++){
			System.out.println(x[i]);
		}

	}

}
