package co.yedam.app.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;

public class ScoreInputTest {
	
	public static void main(String[] args) {
		try {
			BufferedReader fr = new BufferedReader(new FileReader("d:/temp/score.txt"));
			PrintStream out = System.out;
			String a;
			while(true) {
				a = fr.readLine();
				String[] score = a.split("");
				
				
				if(a == null) break;
				out.println(a);
			}
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
