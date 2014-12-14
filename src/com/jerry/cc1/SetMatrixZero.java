package com.jerry.cc1;

public class SetMatrixZero {
	public static void main(String[] args){
		int matrix[][] = generateMatrix(10,12,50);
		printMatrix(matrix);
		setMatrix(matrix);
		System.out.println();
		printMatrix(matrix);
	}
	public static void setMatrix(int[][] matrix){
		boolean row[] = new boolean[matrix.length];
		boolean col[] = new boolean[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j] == 0){
					row[i] = true;
					col[j] = true;
				}
			}
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i] || col[j]){
					matrix[i][j] = 0;
				}
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
