package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    @Test
    public void map(){
        Mapping maps = new Mapping();

        Map<String, String> expected = new HashMap<>();
        expected.put("third", "CPUT");
        expected.put("fourth", "Working");

        Assert.assertNotEquals(expected, maps.mapping());
    }
}
