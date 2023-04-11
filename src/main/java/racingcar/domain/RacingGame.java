package racingcar.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class RacingGame {

    private final CarGroup carGroup;
    private final RandomNumberGenerator numberGenerator;

    public RacingGame(CarGroup group, RandomNumberGenerator randomNumberGenerator) {
        this.carGroup = group;
        this.numberGenerator = randomNumberGenerator;
    }

    //TODO: 테스트
    public void race() {
        carGroup.race(numberGenerator);
    }

    public RacingResult produceRacingResult() {
        Map<Name, Position> history = new LinkedHashMap<>();
        for (Car car : carGroup.getCars()) {
            history.put(car.getName(), car.getPosition());
        }

        return new RacingResult(history);
    }
}
