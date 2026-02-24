package Learning;

public class Ch_29_ArrayPractice {

	public static void main(String[] args) {
		
//		int[] flats = {1, 2,3 ,4 ,5};
//		int sum=0;
//		for (int i : flats) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
//	
//		int [] arr = {1,2,3,4,5,6,7,8,9};
//		int num = 5;
//		boolean isArrbol = false;
//		for (int i : arr) {
//			isArrbol = true;
//		}
//	if (isArrbol) {
//		System.out.println("Its arr present");
//	} else {
//		System.out.println("Its not in arr present");
//	}
//	
//	int[] marks = {1, 2,3 ,4 ,5};
//	int sum1=0;
//	for (int i : flats) {
//		sum1 = sum1+i;
//	}
//	System.out.println(sum1/marks.length);
//	
//	int [][] mat1 = {{1, 2, 3},
//            {4, 5, 6}};
//int [][] mat2 = {{2, 6, 13},
//            {3, 7, 1}};
//int [][] result = {{0, 0, 0},
//              {0, 0, 0}};
//
//for (int i=0;i<mat1.length;i++){ // row number of times
//    for (int j=0;j<mat1[i].length;j++) { // column number of time
//        System.out.format(" Setting value for i=%d and j=%d\n", i, j);
//        result[i][j] = mat1[i][j] + mat2[i][j];
//    }
//}
//	
//	// Printing the elements of a 2-D Array
//    for (int i=0;i<mat1.length;i++){ // row number of times
//        for (int j=0;j<mat1[i].length;j++) { // column number of time
//            System.out.print(result[i][j] + " ");
//            result[i][j] = mat1[i][j] + mat2[i][j];
//        }
//        System.out.println(""); // Prints a new line
//    }
//	
//	int[] array = {1,2,3,4,5,6,7};
//	int l = array.length;
//	int n = Math.floorDiv(l, 2);
//	int temp;
//	
//	for (int i = 0; i < n; i++) {
//		temp = array[i];
//		array[i] = array[l-1-i];
//		array[l-1-i] = temp;
//	}
//	for (int i : array) {
//	System.out.print(i + " ");	
//	}
//	int[] role = {1,12,133,24,65,67,97};
//	int max= 0;
//	for (int i : role) {
//		if (i>max) {
//			max = i;
//		}
//	}
//	System.out.println(max);
//	
//	int[] Number = {1,12,133,24,65,67,97};
//	int min =Integer.MAX_VALUE;
//	for (int i : Number) {
//		if (i<min) {
//		min = i;
//	}
//}
//	System.out.println(min);
   
	int[] sort = {1, 2,3 ,4 ,5};
	boolean isSorted = true;
	for (int i = 0; i < sort.length-1; i++) {
		if (sort[i]>sort[i+1]) {
			isSorted = false;
			break;
		}
	}
		if (isSorted) {
			System.out.println("done");
		} else {
			System.out.println("not");
		}
	
	}

}
