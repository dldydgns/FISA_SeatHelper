package view;

import static view.AnsiColor.*;

public class ConsoleView {
    private final MenuInputHandler inputHandler;
    private final SeatPrinter seatPrinter;

    public ConsoleView() {
        inputHandler = new MenuInputHandler();
        seatPrinter = new SeatPrinter();
    }

    public void showMainMenu() {
        System.out.println();
        System.out.println(RED + " ,---.  ,------.  ,---. ,--------.    ,--.  ,--.,------.,--.   ,------. ,------.,------.  " + RESET);
        System.out.println(YELLOW + "'   .-' |  .---' /  O  '\\--.  .--'    |  '--'  ||  .---'|  |   |  .--. '|  .---'|  .--. ' " + RESET);
        System.out.println(GREEN + "`.  `-. |  `--, |  .-.  |  |  |       |  .--.  ||  `--, |  |   |  '--' ||  `--, |  '--'.' " + RESET);
        System.out.println(CYAN + ".-'    ||  `---.|  | |  |  |  |       |  |  |  ||  `---.|  '--.|  | --' |  `---.|  |\\  \\ " + RESET);
        System.out.println(PURPLE + "`-----' `------'`--' `--'  `--'       `--'  `--'`------'`-----'`--'     `------'`--' '--' " + RESET);
        System.out.println(BLUE + "=========================================================================================" + RESET);
        System.out.println(BOLD + "                             우리 FISA 자리 배치 프로그램" + RESET);
        System.out.println(BLUE + "=========================================================================================" + RESET);
        System.out.println(YELLOW + " 1. 모든 수강생 보기");
        System.out.println(YELLOW + " 2. 랜덤 자리 배치 보기");
        System.out.println(" 0. 종료" + RESET);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.print(" 메뉴를 선택하세요 " + GREEN + "▶ " + RESET);
    }

    public int getUserChoice() {
        return inputHandler.getUserChoice();
    }

    public void printSeatLayout(String[][] seatArray) {
        seatPrinter.print(seatArray);
    }

    public void printExitMessage() {
        System.out.println(RED + "\n❌ 프로그램을 종료합니다. 다음에 또 만나요! 💫" + RESET);
    }
}
