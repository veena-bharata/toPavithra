package tests;



public class program4 {

	public static void main(String[] args) {
	int[]arr1 = {2,4,5,5,6,7,7,8};
	int len = arr1.length;
	int[] temp = new int[len];
	/* sorting the array in ascending  */
	for(int i = 0;i<len;i++) {
	for(int j=i;j<len;j++)	{
		if(arr1[i] >= arr1[j]) {
			int temp1 = arr1[j];
			arr1[j]= arr1[i];
			arr1[i] = temp1;
		}}
	
	}
	/* printing sorted arrary  */
	for(int num:arr1)
		System.out.print(num);
		System.out.println();
		
	/*removing duplicates  */
	int	j=0;
	for( int i=0;i<len-1;i++) {
		
		if(arr1[i]==arr1[i+1]) {
				continue;
			
				}else 
				{
					temp[j]=arr1[i];
					j++;
		
				}
	}
	/* printing the array after removing duplicates  */
	for(int k=0;k<j;k++) {
		System.out.print(temp[k]);
		
	}
}
}
	
