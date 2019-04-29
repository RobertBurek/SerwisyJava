/**
 * Created by Robert Burek
 */
module pl.robworkjava.SupplyModule {

    requires java.logging;


    exports pl.robworkjava.supply;


    // poniższy exports jest konieczny aby można było używać metod z tego pakietu
    // w innym razie metody w tym pakiecie mimo public nie są widoczne w main
    // poza tym zauważyłem że metoda musi być static aby można było jej użeć w main
    exports pl.robworkjava.supply.warehouses;

    // a gdyby wyekpostować cały muduł poprzez *  // nie da się
    // exports pl.robworkjava.supply.*;  // nie da się
}