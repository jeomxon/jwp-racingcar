package racingcar.repository.mapper;

import java.time.LocalDateTime;

public class RacingGameDto {

    private int id;
    private String winners;
    private LocalDateTime createdAt;
    private int trial;

    public RacingGameDto(final int id, final String winners, final LocalDateTime createdAt, final int trial) {
        this.id = id;
        this.winners = winners;
        this.createdAt = createdAt;
        this.trial = trial;
    }
}
