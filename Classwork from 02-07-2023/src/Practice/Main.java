package Practice;

public class Main {
    public static void main(String[] args) {
        CustomList<String> myList = new CustomList();
        myList.add("aa");
        myList.add("bb");
        myList.add("cc");
        System.out.println(myList.getMax());
        System.out.println(myList.getMin());
        System.out.println(myList.countGreaterThan("aa"));
        myList.swap(0, 2);
        System.out.println(myList.contains("aa"));
        myList.print();
    }
}