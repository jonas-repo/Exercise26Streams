package com.exercise26.app;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;

public class WriterApp {

	public static void main(String[] args) 
	{
		File file =  null;
		FileWriter fileW = null;
		BufferedWriter buferW = null;
		Scanner input = new Scanner(System.in);
		int table = 0;
		
		try 
		{
			//process
			file = new File("C:\\a\\b.txt");
			fileW = new FileWriter(file);
			buferW = new BufferedWriter(fileW);
			
			buferW.write("El Jonas \n"); // write in archive of file using file writer and buffered writer
			
			for (int i = 0; i < 10; i++) {
				buferW.write("Hello \n");
			}
			
			System.out.println("Input the multiplication table: ");
			table = input.nextInt();
			
			for (int i = 0; i <= 10; i++) 
			{
				System.out.println(table+"X"+i+"="+(table*i));
				buferW.write(table+"X"+i+"="+(table*i)+"\n");
			}
			
			
		} 
		catch (IOException e) 
		{
			e.getStackTrace();
		}
		finally 
		{
			file =  null;
			fileW = null;
			try 
			{
				buferW.close();  //to write in the archive we have to close the buffer writer
			} 
			catch (IOException e) 
			{
				
				e.printStackTrace();
			};

		}

	}

}
