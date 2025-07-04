package model;

import database.Database;
import database.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// git 올려
public class Model {

    private Database db = new Database();

    private static Model model = new Model();

    public static Model getModel() {
        return model;
    }

    // 1. 전체 수강생 목록 가져오기
    public Student[] getStudents() {
        return db.getStudents();
    }

    // 2. 랜덤 자리 반환
    public String[][] getRandomSeat(int rows, int cols) {
        Student[] students = db.getStudents();

        List<Student> shuffled = new ArrayList<>(Arrays.asList(students));
        Collections.shuffle(shuffled);

        String[][] seatArr = new String[rows][cols];
        int index = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {

                // 4행 3열, 4행 4열은 빈자리로 고정 (인덱스: [3][2], [3][3])
                if (r == 3 && (c == 2 || c == 3)) {
                	seatArr[r][c] = "빈자리";
                    continue;
                }

                if (index < shuffled.size()) {
                	seatArr[r][c] = shuffled.get(index).getName();
                    index++;
                } else {
                	seatArr[r][c] = "빈자리";  // 학생 다 채운 후 나머지도 빈자리
                }
            }
        }

        return seatArr;
    }

}
