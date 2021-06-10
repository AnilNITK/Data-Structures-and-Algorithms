package newproject;

public class selection_sort {
	public void selection(int[] array) {
		int n=array.length;
		for(int i=0;i<n;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(array[min]>array[j]) {
					min=j;
				}
				
			}
			int temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
	}
	public void display(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String args[]) {
		int[] array= {12,45,35,8,56,54,47};
		selection_sort selection = new selection_sort();
		selection.selection(array);
		selection.display(array);
		
	}
	

}
