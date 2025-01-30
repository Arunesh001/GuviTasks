package GuviTasks1;

public class Question6 {

	public static void main(String[] args) {
		  int n = 5; 

	        for (int i = 0; i < n; i++) { 
	            int num = 5; 
	            for (int j = 0; j < n; j++) { 
	                System.out.print(num); 
	               
	                if (j < i) {
	                    num--; 
	                }
	            }
	            System.out.println();
	        }
	}

}
