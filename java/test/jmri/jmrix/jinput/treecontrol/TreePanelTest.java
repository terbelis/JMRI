package jmri.jmrix.jinput.treecontrol;

import jmri.util.JUnitUtil;
import org.junit.*;

/**
 * Test simple functioning of TreePanel
 *
 * @author	Paul Bender Copyright (C) 2016
 */
public class TreePanelTest {

    @Test
    public void testCtor() {
        TreePanel action = new TreePanel();
        Assert.assertNotNull("exists", action);
    }

    @Before
    public void setUp() {
        JUnitUtil.setUp();
    }

    @After
    public void tearDown() {        JUnitUtil.tearDown();    }
}
