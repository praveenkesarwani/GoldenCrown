package com.geektrust;

import java.util.HashMap;
/**
 * Change this file to add more kingdoms and their emblems.
 */
public class Kingdom {
    public static String getEmblem(String kingdom){
        HashMap<String,String> kingdomWithEmblems = new HashMap<>();

        kingdomWithEmblems.put("SPACE", "GORILLA");
        kingdomWithEmblems.put("LAND", "PANDA");
        kingdomWithEmblems.put("ICE", "MAMMOTH");
        kingdomWithEmblems.put("AIR", "OWL");
        kingdomWithEmblems.put("WATER", "OCTOPUS");
        kingdomWithEmblems.put("FIRE", "DRAGON");

        return kingdomWithEmblems.get(kingdom);
    }
}
