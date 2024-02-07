package Theory;

import java.io.Serializable;

// generic class - priema vsichki stoinostti kato mu zadadahme type koito ne sushtestvuva(suzdavame si nov type)
// ako iskame da izpolzvame konkretni data types(granici)

public class Printer<T> {
    // tova e praktikata za list-ite(samo T)
    private T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

//rabotim s data types koito nasledqvat Animal & Serializable (nqkoi drug class/interface)
//public class Printer<T extends Animal & Serializable> {
//    // tova e praktikata za list-ite(samo T)
//    private T thingToPrint;
//
//    public Printer(T thingToPrint) {
//        this.thingToPrint = thingToPrint;
//    }
//
//    public void print() {
//        System.out.println(thingToPrint);
//    }
//}