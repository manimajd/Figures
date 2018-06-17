/*
								nested loop - Part 2
Created by:		Mani Majd
Date:			July 26th 2017
Purpose:		Training

*/

public class SecondFigure {

	public static void main(String[] args) {
		int size = 3;
		//creating lines
		for(int line = 1; line <=size; line++){
			
			//Creating slash
			for (int slash = 1; slash <=-4*line+4*size; slash++){
				System.out.print("/");
			}// end of Slash loop
			
			//Creating Stars
			for (int star = 1; star <= 8*line-8; star++){
				System.out.print("*");
			}//end of Stars loop
			
			//Creating Back-Slash
			for (int star = 1; star <= -4*line+4*size; star++){
				System.out.print("\\");
			}//end of Back-Slash loop
			
			System.out.println();
			
		}//end of line loop
	}

}
