import java.util.*;

public class Main {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("A4", 71);
        map.put("B1", 12);
        map.put("C8", 3);
        map.put("F4", 9);


        Map<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            map2.put(entry.getKey(), entry.getValue());
        }

        Queue<Map.Entry<String, Integer>> queue = new LinkedList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            queue.add(entry);
        }

        Stack<Map.Entry<String, Integer>> stack = new Stack<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            stack.push(entry);
        }

        Map<String, Integer> map3 = new HashMap<>();
        for (Map.Entry<String, Integer> entry : queue) {
            map3.put(entry.getKey(), entry.getValue());
        }


        System.out.println("Map: " + map);
        System.out.println("Map2: " + map2);
        System.out.println("Queue: " + queue);
        System.out.println("Stack: " + stack);
        System.out.println("Map3: " + map3);
    }
}
