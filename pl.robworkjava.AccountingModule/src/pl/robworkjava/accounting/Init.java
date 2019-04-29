package pl.robworkjava.accounting;

import pl.robworkjava.payroll.PayrollService;

import java.util.ServiceLoader;
import java.util.logging.Logger;

/**
 * Created by Robert Burek
 */
public class Init {

    private static final Logger LOG = Logger.getLogger(Init.class.getName());

    public static void init(){

        LOG.info("Accounting Module has been initialized");

        PayrollService instance = PayrollService.getInstance();

        LOG.info(instance.getCurrency());
    }
}
