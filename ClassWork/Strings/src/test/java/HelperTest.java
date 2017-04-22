import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by Student18 on 17.04.2017.
 */
public class HelperTest {
    @org.junit.Test
    public void getInitials() throws Exception {
        String name = "Alex Petrov";
        Helper helper = new Helper();

        Assert.assertEquals("AP", Helper.getInitials(name));

    }
    {
        String name = "Alex";
        Assert.assertEquals("A", Helper.getInitials(name));
    }

}