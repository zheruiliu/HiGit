package com.jerry.trie;
import java.util.*;
public class TestTrie {
	public static void main(String[] args){
		String list[] = {"apple","banana","egg","app","bank","data","break","elephant","bind"};
		Trie tire = new Trie(list);
		System.out.println(Arrays.toString(list));
		System.out.println("contians apple: " + tire.contains("apple"));
		System.out.println("contians app: " + tire.contains("app"));
		System.out.println("contians banks: " + tire.contains("banks"));
		System.out.println("contians data: " + tire.contains("data"));
		System.out.println("contians bre: " + tire.contains("bre"));
		System.out.println("contians ata: " + tire.contains("ata"));
		System.out.println("contians ind: " + tire.contains("ind"));
		System.out.println("contians ele: " + tire.contains("ele"));
		System.out.println("contians ge: " + tire.contains("ge"));
	}
}
