package Learning;

public class Ch_21_loop {

	public static void main(String[] args) {
		
		int i = 1;
		while (i<=6) {
			System.out.println(i);
			i++;	
		}
		int a = 10;
		do {
			System.out.println(a);
			a--;
		} while (a>=0);
	
	do {
		System.out.println(a);
		a++;
	} while (a<=0);
	
	for (int j = 0; j <=10; j++) {
		
		System.out.println("for loop start " + j);
		
	}
	// 2n even number
	
	for(int w = 0; w<10; w++){
		System.out.println(2*w);
	}
	
	// 2n+1 odd number
	int n=10;
	for(int q=0; q<n; q++) {
		System.out.println(2*q+1);
	}

	for (int j = 10; j>0; j--) {
		System.out.println(j);
	}
	
	
	
	
	
	}
}
