package za.ac.cput;

import java.util.HashSet;
import java.util.Set;

public class Setting implements Collection{
    public Set setting() {

        Set set = new HashSet();

        set.add("Age");
        set.add("Moipone");
        set.add("Tina");
        set.add("Kabai");
        return set;
    }
    @Override
    public String collect() {
        System.out.println("Collect set");
        return "Collect set";
    }
}
