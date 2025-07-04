package view;

// [테스트용 클래스] ConsoleView 단독 실행을 위한 클래스
// 컨트롤러가 구현되기 전까지 View 로직을 테스트하기 위한 용도

public class ViewTest {
    public static void main(String[] args) {
        ConsoleView view = new ConsoleView();

        // 테스트용 임의의 학생 이름 30명
        String[] names = {
            "김영수", "이지훈", "박준형", "송지민", "최은우", "정하늘", "문서현", "고현석",
            "김하린", "이서준", "윤지호", "안도윤", "홍예진", "백지민", "임승현", "조하영",
            "남기현", "하은서", "장예린", "노지안", "최민재", "서다은", "강하윤", "유하람",
            "신유찬", "배유진", "오지후", "전도영", "김태윤", "박시윤"
        };

        // 4행 8열 자리배치 배열
        String[][] seatArray = new String[4][8];
        int index = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 8; j++) {
                if (index < names.length) {
                    seatArray[i][j] = names[index++];
                } else {
                    seatArray[i][j] = ""; // 빈 자리
                }
            }
        }

        // 메뉴 및 출력 테스트
        view.showMainMenu();
        int choice = view.getUserChoice();

        if (choice == 1) {
            view.printSeatLayout(seatArray);
        } else if (choice == 0) {
            view.printExitMessage();
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }
}
