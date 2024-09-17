import java.util.HashMap;
import java.util.Map;


class MapEx1{
    public static void main(String args[]){
        System.out.println("Hash Map");
        Map<String,String> map3=new HashMap<>();
        map3.put("koala","bamboo");
        map3.put("lion","meat");
        map3.put("giraffe","leaf");
        System.out.println("koala eats "+map3.get("koala"));
        String food=map3.get("koala");
        System.out.println("koala eats "+food);

        System.out.println("lion eats "+map3.getOrDefault("lion","default"));
        System.out.println("cow eats "+map3.getOrDefault("cow","default"));
        System.out.println("cow eats "+map3.get("cow"));

        map3.put("cow","grass");
        for(Map.Entry<String, String> me: map3.entrySet()){
            System.out.println("key ="+me.getKey()+" value "+me.getValue());
        }
        map3.put("cow","plants");

        for(String key: map3.keySet()){
            System.out.println("key="+key+"="+map3.get(key));
        }

        System.out.println("map3.containsKey(\"koala\"):"+map3.containsKey("koala"));
        System.out.println("map3.containsValue(\"leaf\"):"+map3.containsValue("bread"));
        System.out.println(map3.size());

        System.out.println("remove "+map3.remove("koala"));
        System.out.println("replace "+map3.replace("koala","gr"));
        System.out.println("replace "+map3.replace("cow","gr"));
    }
}