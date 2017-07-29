package com.sud.project;

class Array{
	private long [] arr=new long[100];
	private int NoOfElements=0;
	/*public Array(int Size){
		arr = new long[Size];
	}*/
	public void AddElementsInArray(int ele){
		arr[ NoOfElements] = ele;
		NoOfElements++;
		
	}
	public void PrintElements(){
		for(int i=0;i<NoOfElements;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public void Sort(){
		for(int i=0;i<NoOfElements;i++){
			for(int j=0;j<NoOfElements-i-1;j++){
				if(arr[j]>arr[j+1]){
					Swap(j,j+1);
				}
				
			}
		}
	}
	private void Swap(int l, int m) {
		long  temp = arr[l];
		arr[l]=arr[m];
		arr[m]=temp;
	}
}
public class BubbleSort {

	public static void main(String[] args) {
		//int MaxSize=100;
		//creating an instance of array class
		Array  a = new Array();
		//calling array method for adding elements
		a.AddElementsInArray(10);
		a.AddElementsInArray(30);
		a.AddElementsInArray(43);
		a.AddElementsInArray(5);
		a.AddElementsInArray(12);
		a.AddElementsInArray(8);
		//printing before sorting
		a.PrintElements();
		a.Sort();
		a.PrintElements();
	}

}
