package tcp_Project2;

import java.util.HashMap;
import java.util.Map;

public class New {

public static void main(String[] args) {
	HashMap<Integer,String> hashmap = new HashMap<Integer,String>();
	//HashMap<String, HashMap> selects = new HashMap<String, HashMap>();
	HashMap<Integer,String> hashmap2 = new HashMap<Integer,String>();
	hashmap.put(1, "Sachin");
	hashmap.put(2, "Sachi");
	hashmap.put(3, "Sach");
	hashmap.put(4, "Sac");
	hashmap.put(5, "Sa");
	for(Map.Entry<Integer,String> entry : hashmap.entrySet()) {
	    int key =  (Integer) entry.getKey();
	    String value = (String) entry.getValue();
	    if(key<4){
	    hashmap2.put(key, value);}
}
	for(Map.Entry<Integer,String> entry : hashmap2.entrySet()) {
	    int key =  (Integer) entry.getKey();
	    String value = (String) entry.getValue();
	    System.out.println(key+""+value);}
}
}
