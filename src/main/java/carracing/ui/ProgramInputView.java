package carracing.ui;

import carracing.domain.Car;

import java.util.List;
import java.util.Scanner;

public class ProgramInputView {

    public static final String CAR_NAMES_INPUT_PHRASE = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    public static final String RACE_COUNT_PHRASE = "시도할 회수는 몇회인가요?";
    public static final String RESULT_PHRASE = "실행 결과";
    public static final String WINNER_PHRASE = "가 최종 우승했습니다.";

    private static final String NAMES_DELIMETER = ",";

    private static Scanner scanner = new Scanner(System.in);

    public static String[] getCarNamesToUser() {
        System.out.println(CAR_NAMES_INPUT_PHRASE);
        return scanner.nextLine().split(NAMES_DELIMETER);
    }

    public static int getRaceCountToUser() {
        System.out.println(RACE_COUNT_PHRASE);
        return scanner.nextInt();
    }

    public static void printResultPharse() {
        System.out.println(RESULT_PHRASE);
    }

    public static void printWinnerPharse(List<Car> winners) {
        StringBuilder winnerBuilder = new StringBuilder();

        for (int i = 0; i < winners.size() - 1; i++) {
            winnerBuilder.append(winners.get(i).getName());
            winnerBuilder.append(", ");
        }
        winnerBuilder.append(winners.get(winners.size() - 1).getName());

        winnerBuilder.append(WINNER_PHRASE);

        System.out.println(winnerBuilder.toString());
    }

    public static void printCarPosition(Car car) {
        System.out.println(car.getCarInfoString());
    }

    public static void printBlankLine() {
        System.out.println();
    }
}
