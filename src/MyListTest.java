public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add(0,"cho");
        list.add(1,"meo");
        list.add(1,"lon");
        list.add(1,"ga");


        list.remove(3);
        for (Object s : list.elements) {
            System.out.println(s);
        }
        System.out.println(list.contains("a"));
    }
}
