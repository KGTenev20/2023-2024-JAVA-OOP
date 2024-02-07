package Theory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        // raw usage of list(priema vsichki vidoe data types)
//        List strings = new ArrayList();

//        // list koito iska samo string-ove zatova dava greshka
//        List<String> strings = new ArrayList<>();
////        strings.add(1);
//        strings.add("asd");
//
//        // trqbva da go cast-name kum String shtoto rabotim s objects
//        String first = (String) strings.get(0);
//        System.out.println(first);

//        Theory.IntegerPrinter integerPrinter = new Theory.IntegerPrinter(1);
//        integerPrinter.print();
//
//        Theory.StringPrinter stringPrinter = new Theory.StringPrinter("asdw");
//        stringPrinter.print();
//
//        System.out.println();

//        // generic
//        Theory.Printer<Integer, String> printer1 = new Theory.Printer<>(10, "second");
//        printer1.print();
//
//        // generic
//        Theory.Printer<String, Double> printer2 = new Theory.Printer<>("bruh", 3.14);
//        printer2.print();

        //veche ne sa ni nujni Theory.StringPrinter and Theory.IntegerPrinter class-ovete

//        Theory.MyCollection<Double> doubleMyCollection = new Theory.MyCollection<>();
//        // veche ochakva samo double bez get() kato index vinagi e int i ochakva samo tova
//        doubleMyCollection.add(4.50);
//        doubleMyCollection.get(1);
//
//        // Cat implements Animal, Serializable
//        Theory.Printer<Cat> printer = new Theory.Printer<>(new Cat());
//        printer.print();

//        shout("Ivan");
//        shout(1);

//        shout(3.14, true);

//        List<Integer> ints = new ArrayList<>();
//        ints.add(10);
//        printList(ints);
//
//        List<String> strings = new ArrayList<>();
//        strings.add("asdw");
//        printList(strings);
    }

//    public static <T, V> void shout(T thingToShout, V secondThingToShout) {
//        System.out.println(thingToShout + "!!!" + " " + secondThingToShout);
//    }

    // list<Object> ne se nasledqva ot list<Integer> and list<String> i zatova ne moje
    // wild card - list priema vsqkakvi data types
//    public static void printList(List<?> myList) {
//        System.out.println(myList);
//    }
}