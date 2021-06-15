package co.yedam.app.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	   public static void filecreate()throws IOException {
		      //파일 생성
		            File file = new File("d:/temp/diart.txt");
		            boolean result =  file.createNewFile();//true이면 새로은 파일 만들어내고 false이면 있으니까 안만든다.
		            System.out.println(result);
		   }

		   public static void main(String[] args) throws IOException {
		      //filecreate()
		      //makefolder();
		      //fileinfo();
		      folderlist();
		   }

		   private static void folderlist() {
		      File file = new File("d:/temp");   
		      if(file.isDirectory()) {
		         File[] list =file.listFiles();
		         for(File file1: list) {
		            System.out.println(file1.getName());
		         }
		      }
		   }

		   private static void fileinfo() {
		      File file = new File("d:/temp/image.jpg");
		      
		      System.out.println("파일크기"+file.length());
		      System.out.println("파일이름"+file.getName());
		   }
		
	

	}


