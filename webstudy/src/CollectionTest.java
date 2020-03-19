import java.util.ArrayList;

public class CollectionTest {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("123");
        arrayList.add(true);

        arrayList.set(2,false);

        System.out.println(arrayList.get(0));
        for (Object o : arrayList) {
            System.out.print(o+" ");
        }


    }
}
