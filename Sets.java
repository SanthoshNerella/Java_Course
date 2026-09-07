import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Sets {
    public static void main(String[] args) {
        Collection <Integer> seen = new HashSet<>();
        seen.add(0);
        seen.add(6);
        seen.add(3);
        seen.add(7);
        seen.add(0);

        seen.remove(6);
        seen.contains(2);


        System.out.println(seen.isEmpty());
        System.out.println(seen);
        System.out.println(seen.size());



    Iterator<Integer> element = seen.iterator();
    while(element.hasNext()){
        System.out.println(element.next());
    }


    }
    
}
