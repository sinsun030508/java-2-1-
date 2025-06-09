package W13_01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileWriteEx {
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		FileWriter fw = null;
		int i;
		try {
			fw = new FileWriter("C:\\Temp\\test.txt");
			while((i = isr.read()) != -1) {
				fw.write(i);
			}
		
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(fw != null) {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				}
			}
			if(isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
}
}
