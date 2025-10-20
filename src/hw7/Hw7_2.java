package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hw7_2  {
		
	public static void main(String[]args)  {
			
		try {
			FileWriter fw = new FileWriter("C:\\CJA101_Workspace\\Homework-01\\src\\hw7\\Data.txt",true);

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);
					
			Set<Integer>  set = new HashSet<Integer>();			
			
			while(set.size() <10){			
				set.add((int)(Math.random()*1000 +1));
			}
			
			pw.println(set);
			
			Iterator setNumber = set.iterator();
			
			System.out.println("SET裡元素有 ：" + set.size() + "個");
			System.out.println("=====================================================");
			
			int i=0;
			while (setNumber.hasNext()) {
				i++;
				System.out.println("【" + i + "】" + setNumber.next());
			}
					
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		
	}

}
