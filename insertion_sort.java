package newproject;

public class insertion_sort {
	public void insert(int[] array) {
		int n= array.length;
		for(int i=1;i<n;i++) {
			int key=array[i];
			int j=i-1;
			while(j>=0 && array[j]>key) {
				array[j+1]=array[j];
				j=j-1;
			}
			array[j+1]=key;
		}
	}
	public void display(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String args[]) {
		int[] array= {12,45,1,78,24,35};
		insertion_sort insert = new insertion_sort();
		insert.insert(array);
		insert.display(array);
		
	}

}
