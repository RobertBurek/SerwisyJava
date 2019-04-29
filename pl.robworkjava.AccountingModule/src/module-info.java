/**
 * Created by Robert Burek
 */
module pl.robworkjava.AccountingModule {

    requires java.logging;
    requires pl.robworkjava.PayrollService;
    requires pl.robworkjava.PolishPayroll;

    exports pl.robworkjava.accounting;

    uses pl.robworkjava.payroll.PayrollService;
}