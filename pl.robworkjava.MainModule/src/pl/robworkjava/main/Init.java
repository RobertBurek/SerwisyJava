package pl.robworkjava.main;

/**
 * Created by Robert Burek
 */
public class Init {

    public static void main(String[] args) {

        pl.robworkjava.accounting.Init.init();
        pl.robworkjava.hr.Init.init();
        pl.robworkjava.supply.Init.init();


        pl.robworkjava.supply.warehouses.WarehousesManager.listSuplies(); // metoda powinna być static
//        pl.robworkjava.supply.warehouses.WarehousesManager.supportMethod();  metoda private
    }
}
