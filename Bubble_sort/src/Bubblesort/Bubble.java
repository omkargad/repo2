package Bubblesort;

public class Bubble {
	int arr[]= null;
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	public static void sort(int array[])
	{
		//int arr[] = null ; //{4,2,1,3,5,9,8,7,6};
		
		
		int temp;
		int i=0,j;
		int n= array.length;
		
		
		System.out.println("list before sorting: ");
		for(i=0;i<n;i++){
			System.out.println(""+array[i]);
		}
		
		
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(array[j]>array[j+1]){
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
			
		System.out.println("sorted array: ");
		for(i=0;i<n;i++){
			System.out.println("" +array[i]);
		}
	}
	public int[] getArr() {
		return arr;
	}
	public void setArr(int[] arr) {
		this.arr = arr;
	}
	public Bubble(int[] arr) {
		this.arr = arr;
	}
 
	public Bubble(){
		arr= null;
	}
}
