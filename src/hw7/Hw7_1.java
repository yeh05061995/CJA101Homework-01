package hw7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Hw7_1 {
	public static void main(String[]args) {
		
		try {
			File file = new File("C:\\CJA101_Workspace\\Homework-01\\src\\hw7\\Sample.txt");     //建立目錄物件
			FileReader fr = new FileReader("C:\\CJA101_Workspace\\Homework-01\\src\\hw7\\Sample.txt");
			BufferedReader br = new BufferedReader(fr) ;
			
			int i;
			int countline= 0;
			int countchar = 0;
			String str;
			while ((str = br.readLine()) != null) {
				System.out.println(str);
				countline++;
				countchar+=str.length();
			}
				
				// Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
			System.out.println("\n------------------------------------------------------------------------------------------");
			System.out.print(file.getName() +"檔案共有：\n");
			System.out.println(file.length() + "個位元組");
			System.out.println(countchar + "個字元");
			System.out.println(countline + "列資料");
				

			br.close();
			fr.close();

		} catch (IOException e) {
		}
		
		
	}

}
