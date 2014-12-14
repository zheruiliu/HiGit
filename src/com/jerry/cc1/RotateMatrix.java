package com.jerry.cc1;


public class RotateMatrix {
	public static void main(String[] args){
		int arr[][] = generateMatrix(4,4,100);
		printMatrix(arr);
		rotate(arr);
		System.out.println();
		printMatrix(arr);
	}
	
	public static void rotate(int arr[][]){
		if(arr == null || arr.length == 0){
			return;
		}
		int n = arr.length;
		for(int k=0;k<n/2;k++){
			int end = n-1;
			for(int i=k;i<end-k;i++){
				int top = arr[k][i];
				arr[k][i] = arr[end-i][k];
				arr[end-i][k] = arr[end-k][end-i];
				arr[end-k][end-i] = arr[i][end-k];
				arr[i][end-k] = top;
			}
		}
	}
	
	
	
	public static int[][] generateMatrix(int row,int col,int range){
		int arr[][] = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j] = (int)(Math.random()*range);
			}
		}
		return arr;
	}
	
	public static void printMatrix(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[0].length;j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
