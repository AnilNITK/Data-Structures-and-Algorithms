public class binary_search {
	public int binary(int[] arr,int n,int x) {
		int low=0;
		int high=n-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==x) return mid;
			if(arr[mid]<x) {
				low=mid+1;
			}
			else {
				high=mid-1;
			}
			
			
		}
		return -1;
	}
	public static void main(String args[]) {
		int[] array= {12,13,4,54,18,57};
		binary_search li=new binary_search();
		System.out.println(li.binary(array,array.length, 4));
		System.out.println(li.binary(array,array.length, 0));
	}

}
