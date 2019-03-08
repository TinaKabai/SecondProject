package ac.za.cput.demo;

import java.util.ArrayList;
import java.util.List;

public class Listing implements Collection{
    public List listing(){

        List list = new ArrayList();

        list.add("First name");
        list.add("Second name");
        list.add("Last name");
        list.add(0, "Age");
        return list;
    }
    @Override
    public String collect() {
        System.out.println("Collect list");
        return "Collect list";
    }
}
