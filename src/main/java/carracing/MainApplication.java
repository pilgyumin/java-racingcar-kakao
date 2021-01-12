package carracing;

import carracing.domain.Car;
import carracing.domain.CarRacingProgram;
import carracing.ui.ProgramInputView;

import java.util.List;

public class MainApplication {

    public static void main(String[] args) {
        String[] names = ProgramInputView.getCarNamesToUser();
        int round = ProgramInputView.getRaceCountToUser();

        List<Car> winnerList = new CarRacingProgram(names, round).race();

        ProgramInputView.printWinnerPharse(winnerList);
    }
}
