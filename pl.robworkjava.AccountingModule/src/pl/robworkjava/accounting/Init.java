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

        ServiceLoader<PayrollService> services = ServiceLoader.load(PayrollService.class);
//        services.findFirst().ifPresent(PayrollService::getCurrency); zwraca Stringa
        services.findFirst().ifPresent(serv->LOG.info(serv.getCurrency()));
    }
}
