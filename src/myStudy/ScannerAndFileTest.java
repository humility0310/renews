package myStudy;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ScannerAndFileTest {

	public static void main(String[] args) {
		Scanner sc = null;
		try {
			File file = new File("0310.txt");
			if (file.exists() == false) {
				System.out.println("파일이 존재하지 않습니다.");
			}

			System.out.println("************ 파일정보 ************");

			System.out.println(file.getAbsolutePath());
			System.out.println(file.length() + "byte");
			Date date = new Date(file.lastModified());
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시mm분ss초");
			System.out.println(sdf.format(date));

			System.out.println("********** 전화번호 리스트 **********");

			sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String name = sc.next();
				String Phone01 = sc.next();
				String Phone02 = sc.next();
				String Phone03 = sc.next();

				System.out.println(name + "\t:" + Phone01 + " - " + Phone02 + " - " + Phone03);
			}
		} catch (IOException e) {
			System.out.println("error : " + e);

		}
	}

}
