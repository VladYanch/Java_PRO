import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Traning {
    int position1;
    int position2;
    int active;
    boolean won;

    SnakesLadders() {
        this.active = 1;
    }

    private Map<Integer, Integer> ladders = new HashMap<>();

    {
        ladders.put(2, 38);
        ladders.put(7, 14);
        ladders.put(8, 31);
        ladders.put(15, 26);
        ladders.put(21, 42);
        ladders.put(28, 84);
        ladders.put(36, 44);
        ladders.put(51, 67);
        ladders.put(71, 91);
        ladders.put(78, 98);
        ladders.put(87, 94);
    }

    Map<Integer, Integer> snakes = new HashMap<>();

    {
        snakes.put(16, 6);
        snakes.put(49, 11);
        snakes.put(46, 25);
        snakes.put(62, 19);
        snakes.put(64, 60);
        snakes.put(74, 53);
        snakes.put(89, 68);
        snakes.put(92, 88);
        snakes.put(95, 75);
        snakes.put(99, 80);
    }

    public String play(int die1, int die2) {
        if (won) return "Game over!";
        int position = active == 1 ? position1 : position2;
        position = position + die1 + die2;
        if (position>100) position = 200 - position;
        if (ladders.containsKey(position)) position = ladders.get(position);
        else if (snakes.containsKey(position)) position = snakes.get(position);
        if (position == 100)  {
            won = true;
            return "Player " + active + " Wins!";
        }
        String result = "Player " + active + " is on square " + position;
        if (active == 1 && (die1 == die2)) position1 = position;
        else if (active == 2 && (die1 == die2)) position2 = position;
        else if (active == 1 && (die1 != die2)) {
            position1 = position;
            active = 2;
        }
        else {
            position2 = position;
            active = 1;
        }
        return result;
    }
}