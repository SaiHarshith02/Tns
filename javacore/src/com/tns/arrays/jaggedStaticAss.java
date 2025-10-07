package com.tns.arrays;

public class jaggedStaticAss {

	public static void main(String[] args) {
		int[][] nums = new int[3][];
		nums[0] = new int[3]; 
        nums[1] = new int[2]; 
        nums[2] = new int[4];
		 nums[0][0] = 1; nums[0][1] = 2; nums[0][2] = 3;
	        nums[1][0] = 4; nums[1][1] = 5;
	        nums[2][0] = 6; nums[2][1] = 7; nums[2][2] = 8; nums[2][3] = 9;

				
				for(int[] x : nums)
				{
					for(int y: x)
					{
						System.out.print(y+" ");
					}
					System.out.println();

		}

}
}
