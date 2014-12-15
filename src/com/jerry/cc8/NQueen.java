package com.jerry.cc8;

public class NQueen {
	public static void main(String[] args){
		generateNQueen(4);
	}
	
	public static void generateNQueen(int n){
		compute(n,0,new int[n]);
	}
	
	public static void compute(int n,int cur,int visited[]){
		if(n == cur){
			printBoard(visited);
			return;
		}
		for(int i=0;i<n;i++){
			visited[cur] = i;
			if(check(cur,visited)){
				compute(n,cur+1,visited);
			}
		}
	}
	
	public static void printBoard(int visited[]){
		for(int i=0;i<visited.length;i++){
			for(int j=0;j<visited.length;j++){
				if(j == visited[i]){
					System.out.print("Q|");
				} else{
					System.out.print(" |");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean check(int cur,int visited[]){
		for(int i=0;i<cur;i++){
			if(visited[i] == visited[cur] || Math.abs(visited[i]-visited[cur]) == cur - i){
				return false;
			}
		}
		return true;
	}
}
