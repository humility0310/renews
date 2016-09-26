package myStudy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("Xshell5.exe");
			fos = new FileOutputStream("Xshell5.copy.exe");
			int data = -1;

			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			System.out.println("error" + e);
		} catch (IOException e) {
			System.out.println("Error :" + e);
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
				if (fos != null) {
					fos.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
