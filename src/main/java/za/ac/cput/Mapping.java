package za.ac.cput;

import java.util.HashMap;
import java.util.Map;

public class Mapping {
    public Map mapping() {

        Map map = new HashMap();
        map.put("first", "Hopolang");
        map.put("second", "COSAT");


        String hope = (String) map.get("first");
        System.out.println("Elements added to a Map instance are:\n"+map+"\nThe value of the first element is "+hope+".");
        return map;
    }
}
