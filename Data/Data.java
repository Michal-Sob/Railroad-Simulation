package Data;

import Core.Models.Locomotive;
import Core.Models.Map;
import Core.Models.Station;
import Core.Models.Wagons.Wagon;
import Core.Threads.TrainThread;

import java.util.ArrayList;
import java.util.Random;

public final class Data {
    public static ArrayList<TrainThread> trainThreads  = new ArrayList<>();
    public static ArrayList<Locomotive> locomotives = new ArrayList<>();
    public static ArrayList<Wagon> wagons = new ArrayList<>();
    public static ArrayList<Station> stations  = new ArrayList<>();
    public static Map map  = new Map();
    public static Random random = new Random();
}
