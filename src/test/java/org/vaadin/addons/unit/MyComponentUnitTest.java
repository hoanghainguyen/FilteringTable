package org.vaadin.addons.unit;

import org.junit.Test;
import static org.junit.Assert.*;
import org.vaadin.addons.MyComponent;

public class MyComponentUnitTest {

    @Test
    public void testMaxClickCount() {
        MyComponent myComponent = new MyComponent();
        myComponent.setMaxClickCount(2);
        assertEquals(2, myComponent.getMaxClickCount());
    }
    
}
