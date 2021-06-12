package newproject;

public class Bubble_sort {
	public void bubble(int[] array) {
		int n=array.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp= array[j+1];
					array[j+1]=array[j];
					array[j]=temp;					
				}
			}
		}
		
		
	}
	public void display(int n,int[] array) {
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String arg[]) {
		int[] array= {12,15,2,14,89,57,54};
		Bubble_sort buble=new Bubble_sort();
		buble.bubble(array);
		buble.display(array.length, array);
	}

}
