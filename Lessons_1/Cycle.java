public class Cycle {

	public static void main(String[] args) {

		int result = 0;
		for(int i = 0; i < 20; i++) {
			result = 1 + i;
			System.out.println(result);
		}
		
		int j = 6;
		while(j >= - 6) {
			System.out.println(j);
			j = j - 2;
		}

		int x = 10;
		int summ = 0;
		do {
			if(x % 2 != 0) {	
				summ = x + summ;
				System.out.println(summ);
			}	
			x = x + 1;
		}
		while(x <= 20); 
	}
}