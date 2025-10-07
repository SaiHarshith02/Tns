package com.tns.arrays;

public class array2Ddy {

	public static void main(String[] args) {

			int[][] num = new int [2][2];
			for(int i=0;i<2;i++)
			{
				for(int j=0;j<2;j++)
				{
					num[i][j] = (int)(Math.random()*100);
				}
				
			}
			
			
			for(int[] x : num)  
			{
				for(int y : x)
				{
					System.out.print(y+" " );
				}
				System.out.println();
			}

		

	}

}
