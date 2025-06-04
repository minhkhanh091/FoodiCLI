package app.khanhlm091.foodicli.service;

import app.khanhlm091.foodicli.database.StoreList;
import app.khanhlm091.foodicli.datastructure.Pair;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class CaculateDistance {
    private static final List<List<Pair<Integer, Integer>>> locations = StoreList.getLocations();
    private static final int n = StoreList.getNumberOfStore();

    static int[] caculateDistance() {
        int[] bestRoute = new int[n];
        Arrays.fill(bestRoute, Integer.MAX_VALUE);
        bestRoute[0] = 0;

        PriorityQueue<Pair<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.getKey(), b.getKey())
        );        pq.add(new Pair<>(0, 0));

        while (!pq.isEmpty()) {
            Pair<Integer, Integer> pair = pq.poll();
            int d = pair.getKey();
            int u = pair.getValue();

            if (d > bestRoute[u]) continue;

            for (Pair<Integer, Integer> nei : locations.get(u)) {
                int v = nei.getKey();
                int w = nei.getValue();

                if (bestRoute[v] > bestRoute[u] + w) {
                    bestRoute[v] = bestRoute[u] + w;
                    pq.add(new Pair<>(bestRoute[v], v));
                }
            }
        }

        return bestRoute;
    }
}

public class RouteService {
    private static final int[] bestRoute;

    static {
        bestRoute = CaculateDistance.caculateDistance();
    }

    public static int getShortestPath(int end) {
        return bestRoute[end];
    }
}
