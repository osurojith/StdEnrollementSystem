package com.vikas.main;

import java.util.Scanner;

import com.vikas.getsetData.ViewData;

import com.vikas.readText.ReadText;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id");
		String id = sc.next();
		sc.close();
		new ReadText().readData(id);
	//	new ViewData().view();
		
	}

}
