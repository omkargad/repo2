package Bubblesort;

public class Bubble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={4,2,1,3,5,9,8,7,6};
		int temp;
		int i=0,j;
		int n=arr.length;
		
		
		System.out.println("list before sorting: ");
		for(i=0;i<n;i++){
			System.out.println(""+arr[i]);
		}
		
		
		for(i=0;i<n;i++){
			for(j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
			
		System.out.println("sorted array: ");
		for(i=0;i<n;i++){
			System.out.println("" +arr[i]);
		}
	}

}
