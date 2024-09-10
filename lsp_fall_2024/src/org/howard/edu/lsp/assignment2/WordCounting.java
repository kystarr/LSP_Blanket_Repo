package org.howard.edu.lsp.assignment2;
import java.io.File;
import java.util.Scanner;


public class WordCounting {

	public static void main(String[] args) throws Exception
	{
		Scanner inputfile = new Scanner (new File ("words.txt"));
		
		while(inputfile.hasNextLine())
		{
			System.out.print(inputfile.nextLine() + " ");
		}
		System.out.println();

	}

}
