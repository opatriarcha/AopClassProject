package br.com.sysped.aop.aspect.sampleAspects;

import java.util.logging.Logger;



public class SecuredMethod {
    private static final Logger logger = Logger.getLogger("SecuredMethod");

    @Secured(isLocked = true)
    public void lockedMethod() throws Exception {
        logger.info("lockedMethod");
    }

    @Secured(isLocked = false)
    public void unlockedMethod() {
        logger.info("unlockedMethod");
    }

    public static void main(String[] args) throws Exception {
        SecuredMethod sv = new SecuredMethod();
        sv.lockedMethod();
    }
}