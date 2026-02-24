package Learning;

public class Ch_26_Array {

	public static void main(String[] args) {
		
		int [] marks = {100, 200, 300, 400, 500, 600 };
		
		System.out.println(marks.length);
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		for (int i = marks.length-1; i>= 0; i--) {
			System.out.println(marks[i]);
		}
	
		int [] number = {2, 3 , 4, 5, 6, 7, 37, 88, 44};
		for (int i : number) {
			System.out.println(i);
		}
		
		int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println("Printing a 2-D array using for loop");
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
	}

}
