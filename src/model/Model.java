package model;

import java.util.ArrayList;

import database.Database;
import database.Student;

public class Model {
	public static void main(String[] args) {
		Database db = new Database();
		ArrayList<Student> students = db.getAllStudents();
		
		for(Student st : students) {
			System.out.println(st.getName());
		}
	}
}
