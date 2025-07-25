package view;

import java.util.ArrayList;

import static view.AnsiColor.*;

public class TeamView {

    public static void printTeams(ArrayList<String> names) {
        System.out.println(BOLD + "\n📌 팀 구성 결과\n" + RESET);
        System.out.println(CYAN + "──────────────────────────────────────────────" + RESET);

        int index = 0;
        int teamNumber = 1;

        // 4인 팀 6개 (0 ~ 23)
        for (int i = 0; i < 6; i++) {
            System.out.print(getTeamColor(i) + "【 " + teamNumber++ + "팀 】 " + RESET);
            for (int j = 0; j < 4; j++) {
                System.out.print(names.get(index++) + "   ");
            }
            System.out.println();
        }

        // 3인 팀 2개 (24 ~ 29)
        for (int i = 0; i < 2; i++) {
            System.out.print(getTeamColor(i + 6) + "【 " + teamNumber++ + "팀 】 " + RESET);
            for (int j = 0; j < 3; j++) {
                System.out.print(names.get(index++) + "   ");
            }
            System.out.println();
        }

        System.out.println(CYAN + "──────────────────────────────────────────────" + RESET);
    }

    private static String getTeamColor(int teamIndex) {
        return switch (teamIndex % 6) {
            case 0 -> RED;
            case 1 -> GREEN;
            case 2 -> YELLOW;
            case 3 -> BLUE;
            case 4 -> MAGENTA;
            case 5 -> CYAN;
            default -> RESET;
        };
    }
}