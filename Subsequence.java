package pack1;

import java.util.HashSet;

public class Subsequence {

		public static void main(String[] args) {
		    System.out.println("Program Started");
			int[] arr1= {3,9,1,10,4,20,2,11,12};
			HashSet<Integer>h1=new HashSet<>();
			for(int i=0;i<arr1.length;i++) {
				h1.add(arr1[i]);
			}
			int long_Length=0;
			for(int i=0;i<arr1.length;i++) {
				if(!h1.contains(arr1[i]-1)) {
					int no=arr1[i];
					while(h1.contains(no)) {
						no++;
					}
					if(long_Length<no-arr1[i]) {
						long_Length=no-arr1[i];
					}
					}
				}
			System.out.println("The Longest Subsequence Length is : "+long_Length);
			System.out.println("Program Ended");
		}
	
}
