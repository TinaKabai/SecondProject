package ac.za.cput.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ListingTest {
    @Test
    public void listNames() {

        Listing lists = new Listing();

        List<String> names = Arrays.asList("Age", "First name", "Second name", "Last name");

        Assert.assertEquals(names, lists.listing());
    }
}
