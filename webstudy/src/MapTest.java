import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("msg1",1);
        hashMap.put("msg2",2);
        hashMap.put("msg3",3);

        Set set1 = hashMap.entrySet();

        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
