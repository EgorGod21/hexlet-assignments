package exercise.data;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    ArrayCollection<Integer> arrayCollection=new ArrayCollection<>();
        System.out.println(arrayCollection.isEmpty());
        arrayCollection.add(2);
        arrayCollection.add(3);
        arrayCollection.add(1);
        arrayCollection.add(5);
        arrayCollection.add(8);
        Collection<Integer> testInstance2 = new ArrayCollection<>();
        Collections.addAll(testInstance2,1);
        arrayCollection.forEach(x-> System.out.print(x+" "));
        System.out.println();
        testInstance2.forEach(x-> System.out.print(x+" "));
        arrayCollection.retainAll(testInstance2);
        System.out.println();
        arrayCollection.forEach(x-> System.out.print(x+" "));
    }
}
