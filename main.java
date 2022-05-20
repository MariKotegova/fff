import java.util.*;

public class main {
    public static void main(String[] args){
        MyMap<String, UserInfo> map = new MyMap<>();

        map.put("Tanya", new UserInfo(16));
        map.put("Kolya", new UserInfo(55));

        System.out.println(map.get("Tanya"));
       // System.out.println(map.get("Kolya"));
        map.put("Kolya", new UserInfo(66));
        System.out.println(map.get("Kolya"));
    }
}