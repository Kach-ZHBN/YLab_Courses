package Lesson_3.dateMap;

public class DatedMapTest {
    public static void main(String[] args) throws InterruptedException {
        DatedMap datedMap = new DatedMapImpl();
        datedMap.put("1", "apple");
        datedMap.put("2", "orange");
        datedMap.put("3", "strawberry");
        datedMap.put("4", "lemon");
        datedMap.put("5", "pineapple");
        datedMap.put("6", "cherry");

        System.out.println(datedMap.get("4")); //lemon
        System.out.println(datedMap.get("fourth")); //null

        System.out.println(datedMap.containsKey("2")); //true
        System.out.println(datedMap.containsKey("j")); //false

        System.out.println(datedMap.get("3")); //strawberry
        datedMap.remove("3");
        System.out.println(datedMap.get("3")); //null

        System.out.println(datedMap.keySet()); // 1, 2, 4, 5, 6

        System.out.println(datedMap.getKeyLastInsertionDate("1")); //Date
        System.out.println(datedMap.getKeyLastInsertionDate("2")); //Date
        System.out.println(datedMap.getKeyLastInsertionDate("3")); //null
        System.out.println(datedMap.getKeyLastInsertionDate("8")); //null
        Thread.sleep(5000);
        datedMap.put("1", "updatedValue");
        System.out.println(datedMap.getKeyLastInsertionDate("1")); //UpdatedDate

    }
}
