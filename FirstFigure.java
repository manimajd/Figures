/*
								nested loop - Part 2
Created by:		Mani Majd
Date:			July 26th 2017
Purpose:		Training

*/

public class FirstFigure {

	public static void main(String[] args) {

		int size = 5;
		//creating lines
		for(int line = 1; line <=size; line++){
			
			//Creating Spaces
			for (int space = 1; space <=-1*line+size;space++){
				System.out.print(" ");
			}// end of Space loop
			
			//Creating Stars
			for (int star = 1; star <= 2*line-1; star++){
				System.out.print("*");
			}//end of Stars loop
			
			System.out.println();
			
		}//end of line loop
		
		
		
//		DrawTrinagle(7,"*");
	}
	
	
	
	
	
	
	
	public static void DrawTrinagle(int size, String fill){
		
		for (int line = 1; line <=size; line++){
			printString(-1*line+size , " " );
			printString(2*line-1 , fill );
			System.out.println();
		}
	}


	public static void printString(int fillSize , String fillChar){
		for(int i = 1; i<= fillSize; i++){
			System.out.print(fillChar);
		}
	}

}
