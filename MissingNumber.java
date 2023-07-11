package Program;

public class MissingNumber {
	public static void main(String[] args) {
		System.out.println(missingNumber(new int[] {1,2,3,4,5}));
	}
	 public static int missingNumber(int[] nums) {
	        int n=nums.length+1;
	    int sum=(n*(n+1))/2;
	    for(int i:nums){
	        sum-=i;
	    }
	    return sum;
	    }}
