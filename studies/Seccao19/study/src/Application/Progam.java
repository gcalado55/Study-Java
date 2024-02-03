package Application;

import java.util.Map;
import java.util.TreeMap;

public class Progam {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "9999-9999");

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
        System.out.println("Contains 'user' key: " + cookies.containsKey("user"));
        System.out.println("Contains 'username' key: " + cookies.containsKey("username"));

        System.out.println("\nALL COOKIES:");
        for(String key: cookies.keySet()){
            System.out.println(key + ": " + cookies.get(key));
        }


    }
}