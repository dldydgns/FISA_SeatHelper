package controller;

import database.Student;
import model.Model;

// git 올려
public class Controller {
    private static final Model model = Model.getModel();
    
    // 1. 전체 수강생 목록 가져오기
    public static void getAllStudents() {
        Student[] students = model.getStudents();

        if (students.length != 0) {
            for (Student stu : students) {
                System.out.println("이름: " + stu.getName() + " / ID: " + stu.getId());
            }
        } else {
            System.out.println("학생 데이터 없음");
        }
    }
    
    // 2. 랜덤 자리 출력
    public static void printRandomSeats() {
        int rows = 4;
        int cols = 8;

        String[][] seatArr = model.getRandomSeat(rows, cols);
        
        
        // view로 이동할 부분
        System.out.println("\n*** 랜덤 자리 배치도 ***");
        for (int r = 0; r < seatArr.length; r++) {
            for (int c = 0; c < seatArr[r].length; c++) {
                System.out.printf("[%s]\t", seatArr[r][c]);
            }
            System.out.println();
        }
    }

}
