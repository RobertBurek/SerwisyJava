package pl.robworkjava.payroll;

import java.util.Optional;
import java.util.ServiceLoader;

/**
 * Created by Robert Burek
 */
public interface PayrollService {

    String getCurrency();

    static PayrollService getInstance(){

        ServiceLoader<PayrollService> services = ServiceLoader.load(PayrollService.class);

        Optional<PayrollService> first = services.findFirst();

        return first.orElseThrow(()->new RuntimeException("Missing service implementation"));

//        if (first.isPresent()){
//            return first.get();
//        } else {
//            throw new RuntimeException("Missing service implementation");
//        }
    }
}
