package W5_7RockScissorsPaperTest;


import java.util.Arrays;
import java.util.List;

public class Players {

    private static List<Player> players = Arrays.asList(
        new Human(), new Computer()
    );


    public static List<Player> getTwoPlayers() {
        return players;
    }
}
