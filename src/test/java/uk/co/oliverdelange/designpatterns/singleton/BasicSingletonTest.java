package uk.co.oliverdelange.designpatterns.singleton;

import org.junit.Test;

public class BasicSingletonTest {

    @Test
    public void testGetInstance() throws Exception {
        BasicSingleton singletonOne = BasicSingleton.getInstance();
        BasicSingleton singletonTwo = BasicSingleton.getInstance();
        assert singletonOne.equals(singletonTwo);
    }
}
