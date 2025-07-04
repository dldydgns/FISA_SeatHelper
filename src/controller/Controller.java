package controller;

import java.util.ArrayList;

import database.Student;
import model.Model;
import view.SeatPrinter;

public class Controller {
    private static final Model model = Model.getModel();
    private static final SeatPrinter printer = new SeatPrinter();
    
    // 1. 전체 수강생 목록 가져오기
    public static void getAllStudents() {
        ArrayList<Student> students = model.getStudents();

        if (!students.isEmpty()) {
            for (Student stu : students) {
                System.out.println("이름: " + stu.getName() + " / ID: " + stu.getNo());
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
        printer.print(seatArr);
    }

}
