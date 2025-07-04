package database;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Database {
	private static String studentFile = "C:\\ce5\\01.java\\01_SeatHelper\\src\\database\\student.txt";
	private static String seatFile = "C:\\\\ce5\\\\01.java\\\\01_SeatHelper\\\\src\\\\database\\\\seat.txt";
	
	private static ArrayList<Student> students = new ArrayList<>();
	
	static {
		try {
			// 학생정보 읽기
			FileReader fileReader = new FileReader(new File(studentFile));
			BufferedReader br = new BufferedReader(fileReader);
			
			String line = "";
			while((line = br.readLine()) != null) {
				StringTokenizer st = new StringTokenizer(line, "#");
				
				int num = Integer.parseInt(st.nextToken());
				String name = st.nextToken();
				int age = Integer.parseInt(st.nextToken());
				String mbti = st.nextToken();
				boolean glass = (st.nextToken() == "TRUE");
				
				students.add(new Student(num, name, age, mbti, glass));
			}
			
			// 책상정보 읽기
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public ArrayList<Student> getAllStudents() {
		return students;
	}
	
	public ArrayList<int[][]> getAllSeat() {
		return null;
	}
	
}
