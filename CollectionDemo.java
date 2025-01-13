import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList();
        number.add(99);
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        System.out.println(number.get(0));
        System.out.println(number.contains(20));

        System.out.println(number.size());
        number.remove(1);
        System.out.println(number.size());

        number.clear();
        System.out.println(number.size());

        ArrayList<String> name = new ArrayList();
        name.add("Alice");
        name.add("Ben");
        name.add("karan");

        System.out.println(name);
        name.remove(2);
        System.out.println(name);
    }
}
