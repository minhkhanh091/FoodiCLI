package app.khanhlm091.foodicli.database;

import java.util.List;
import java.util.ArrayList;

class StoresLocation {
    private List<List<Integer>> locations = new ArrayList<>();

    public StoresLocation(int numberOfStore) {
        for (int i = 0; i < numberOfStore; ++i) {
            locations.add(new ArrayList<>());
        }
    }

    
}

public class LocationDatabase {
    public int userLocationId = 0;
    public String userLocationName = "Nhà riêng";

    private
}
