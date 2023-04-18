package racingcar.dao;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import racingcar.dao.mapper.RacingGameDtoMapper;

public class RacingGameInMemoryDao implements RacingGameDao {

    private final List<RacingGameDtoMapper> racingGames = new ArrayList<>();

    private int id = 0;

    @Override
    public int save(String winners, int count) {
        RacingGameDtoMapper racingGame = new RacingGameDtoMapper(id, winners, LocalDateTime.now(), count);
        racingGames.add(racingGame);
        id++;

        return id;
    }

    @Override
    public Optional<RacingGameDtoMapper> findById(int id) {
        for (final RacingGameDtoMapper racingGame : racingGames) {
            if (racingGame.getId() == id) {
                return Optional.ofNullable(racingGame);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<RacingGameDtoMapper> findAll() {
        return List.copyOf(racingGames);
    }
}
