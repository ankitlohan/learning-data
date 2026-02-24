package Java;

public class testing {
	
	    public static void main(String[] args) {
	        int[] XX = {1, 2, 3, 4, 5};  // Array initialization

	

	        // Using Java 8 Streams
	        int sumStream = java.util.Arrays.stream(XX).sum();
	        System.out.println("Sum of array (using streams): " + sumStream);
	    }
	}

