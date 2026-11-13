
package Assignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

class Team {

    String name;
    int points;
    int goalDifference;

    Team(String name, int points, int goalDifference) {
        this.name = name;
        this.points = points;
        this.goalDifference = goalDifference;
    }

    @Override
    public String toString() {
        return name + "(" + points + "," + goalDifference + ")";
    }
}

class Leaderboard<T> {

    List<T> items = new ArrayList<>();
    Comparator<? super T> order;

    Leaderboard(Comparator<? super T> order) {
        this.order = order;
    }

    void add(T item) {
        items.add(item);
    }

    void addAll(List<? extends T> newItems) {
        items.addAll(newItems);
    }

    List<T> ranking() {
        List<T> result = new ArrayList<>(items);
        Collections.sort(result, order);
        return result;
    }
}

public class task5 {

    public static void main(String[] args) {

        Comparator<Team> byRank =
            Comparator.comparingInt((Team t) -> t.points).reversed()
            .thenComparing(
                Comparator.comparingInt((Team t) -> t.goalDifference).reversed()
            )
            .thenComparing(t -> t.name);

        Leaderboard<Team> board = new Leaderboard<>(byRank);

        board.add(new Team("Panthers", 9, 4));
        board.add(new Team("Eagles", 9, 6));
        board.add(new Team("Cobras", 6, 1));
        board.add(new Team("Bisons", 9, 4));

        System.out.println("Team Ranking:");
        System.out.println(board.ranking());

    }
}
