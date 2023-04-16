package Core.Models;

import java.util.Random;

public class Map {



    public int[][] CreateMap(int stationAmount) {
        Random rnd = new Random();

        int[][] result = new int[stationAmount][stationAmount];
        for (int i = 0; i < stationAmount; i++) {
            for (int j = 0; j < stationAmount; j++) {
                var distance = GenerateRandom(rnd, 5, 9);

                if (i == j)
                    distance = 0;

                result[i][j] = distance;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        return result;
    }

    // 70% chance of getting 0
    private int GenerateRandom(Random rnd, int lowest, int highest) {
        return rnd.nextInt(10) < 7 ? 0 : rnd.nextInt(lowest, highest);
    }
}
