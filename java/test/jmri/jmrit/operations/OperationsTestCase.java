package jmri.jmrit.operations;

import jmri.util.JUnitOperationsUtil;
import jmri.util.JUnitUtil;
import org.junit.After;
import org.junit.Before;

/**
 * Common setup and tear down for operation tests.
 *
 * @author Dan Boudreau Copyright (C) 2015
 * @author Paul Bender Copyright (C) 2016
 *
 */
public class OperationsTestCase {

    @Before
    public void setUp() {
        JUnitUtil.setUp();

        // Set things up outside of operations
        JUnitUtil.resetInstanceManager();
        JUnitUtil.initInternalTurnoutManager();
        JUnitUtil.initInternalLightManager();
        JUnitUtil.initInternalSensorManager();
        JUnitUtil.initDebugThrottleManager();
        JUnitUtil.initIdTagManager();
        JUnitUtil.initShutDownManager();
        JUnitUtil.resetProfileManager();

        JUnitOperationsUtil.resetOperationsManager();
    }

    @After
    public void tearDown() {
        JUnitUtil.tearDown();
    }
}
