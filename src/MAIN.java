import java.util.ArrayList;
import java.util.Comparator;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        states.add("Франция"); // 1. void add(int index, E obj):

        ArrayList<String> states_1 = new ArrayList<String>();

        states_1.add("Дания");
        states_1.add("Великобритания");

        states.addAll(1,states_1); // 2. boolean addAll(int index, Collection<? extends E> col)

        System.out.println(states.get(1)); // 3. E get(int index)
        System.out.println(states.indexOf("Дания")); // 4. int indexOf(Object obj)
        System.out.println(states.lastIndexOf("Дания")); // 5. int lastIndexOf(Object obj)
        System.out.println(states.remove("Франция")); // 6. E remove(int index)
        states.set(0, "Дания"); // 7. E set(int index, E obj)
       
        for(String state : states){
            System.out.println(states.get(2));
        }
        if(states.contains("Германия")){
            System.out.println("Список содержит государство Германия");
        }
        // удалим несколько объектов states.remove("Германия"); states.remove(0);
        Object[] countries = states.toArray();
        for(Object country : countries){
            System.out.println(country); }
    }
}