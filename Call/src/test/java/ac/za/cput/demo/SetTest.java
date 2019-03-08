package ac.za.cput.demo;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SetTest {
    @Test
    public void setNames(){
        Setting sets = new Setting();

        List<String> details = Arrays.asList("Age", "Moipone", "Tina", "Kabai");

        Assert.assertEquals(details.size(), sets.setting().size());
        sets.collect();
    }
}
