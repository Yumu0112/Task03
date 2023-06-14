import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> users = new HashMap<>();
            users.put("user1", 12345);
            users.put("user2", 23456);
            users.put("user3", 34567);

        for (Map.Entry<String, Integer> entry : users.entrySet()) {
            System.out.println("id:" + entry.getValue() + "\n" + "name:" + entry.getKey());
        }

        try {
            int id = 234456;

           if (!users.containsValue(id)) {
                   throw new NoSuchElementException();
               } else {
                   System.out.println("Your id is exist!!");
               }
           } catch (NoSuchElementException e) {
                System.out.println("Not found");
            }
        }
    }
