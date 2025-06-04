package app.khanhlm091.foodicli.database;

import app.khanhlm091.foodicli.file.ReadFile;
import app.khanhlm091.foodicli.logger.Logger;
import app.khanhlm091.foodicli.datastructure.Pair;

import java.util.ArrayList;
import java.util.List;

public class StoreList {
    private static List<List<Pair<Integer, Integer>>> locations = new ArrayList<>();

    public static void initializeStoreListFromFile(int numberOfStore) {
        Logger.getMessage("Initializing number of store:" + numberOfStore);
        for (int i = 0; i <= numberOfStore; ++i) {
            locations.add(new ArrayList<>());
        }

        Logger.getMessage("Getting store from file...");
        ReadFile rf = new ReadFile("store_location.txt");

        for (String line : rf.getLines()) {
            String[] edge = line.split(" ");

            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            int w = Integer.parseInt(edge[2]);

            locations.get(u).add(new Pair<>(v, w));
        }

        Logger.getMessage("Getting store list successfully");
    }

    public static void getStoreConnections(int storeId) {
        for (Pair<Integer, Integer> pair : locations.get(storeId)) {
            Logger.getMessage(pair.getKey() + " " + pair.getValue());
        }
    }

    public static List<List<Pair<Integer, Integer>>> getLocations() {
        return locations;
    }

    public static int getNumberOfStore() {
        return locations.size();
    }
}
