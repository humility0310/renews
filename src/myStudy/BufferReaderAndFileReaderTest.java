package myStudy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderAndFileReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("0310.txt");
			br = new BufferedReader(fr);
			String line = null;
			int index = 0;
			while ((line = br.readLine()) != null) {
				System.out.print(++index);
				System.out.print(":");
				System.out.print(line);
				System.out.print("\n");
			}
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.out.println("error :" + e);
			}
		}
	}
}
