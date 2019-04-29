package pl.robworkjava.polishpayroll;

import pl.robworkjava.payroll.PayrollService;

/**
 * Created by Robert Burek
 */
public class PayrollServiceImpl implements PayrollService {

    public String getCurrency(){
        return "PLN";
    }

}