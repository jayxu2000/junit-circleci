package runner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JunitTest {

    @Before
    public void setUp() throws Exception{
        System.out.println(" =====Before Test=====");
    }

    @Test
    public void testAdd() {
        int x=1, y=1;
        Assert.assertEquals(x, y);
        System.out.println(" =====Test: x=y");
    }

    @After
    public void tearDown() throws Exception{
        System.out.println(" =====After Test=====");
    }
}
