import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MyCollection {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("msg");
        c.add(":qqsg");

        System.out.println(((ArrayList) c).get(0));
        System.out.println(c.contains("msg"));


        System.out.println(c.isEmpty());

        System.out.println(c.size());
        Iterator iterator = c.iterator();

        Object[] objects = c.toArray();

        for (Object o:objects
             ) {
            System.out.println(o);
        }

        while (iterator.hasNext()){
            iterator.next();
        }
    }

}
