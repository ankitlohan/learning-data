package Learning;

public class LoopPractice {
	
	public static void main(String[] args) {
		
		int rows =5;
//		int n=5;
		int m=4;
        String x ="*****";
        String p= "     ";
        for (int i = 1; i <= rows; i++) {
//        	 for (int j = 1; j <= rows; j++) {
//        		 if(j>=n) {
//        		   System.out.print("*"); 
//        		 }else {
//        			 System.out.print(" "); 
//        		 }   
//        	 } 
//        	 n--; 
//        	 System.out.println("");
        	System.out.println(p.substring(i, rows)+x.substring(m,rows));
        	m--;
        }
        
        
        
        
		
}
}
