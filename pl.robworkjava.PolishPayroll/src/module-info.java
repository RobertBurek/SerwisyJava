/**
 * Created by Robert Burek
 */
module pl.robworkjava.PolishPayroll {

    requires pl.robworkjava.PayrollService;

    provides pl.robworkjava.payroll.PayrollService with pl.robworkjava.polishpayroll.PayrollServiceImpl;

}