package pl.robworkjava.supply;

import java.util.logging.Logger;

/**
 * Created by Robert Burek
 */
public class Init {

    private static final Logger LOG = Logger.getLogger(Init.class.getName());

    public static void init(){
        LOG.info("Supply Module has been initialized");
    }
}
