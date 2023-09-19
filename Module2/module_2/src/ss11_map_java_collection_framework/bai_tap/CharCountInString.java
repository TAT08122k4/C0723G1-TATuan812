package ss11_map_java_collection_framework.bai_tap;

import java.util.Map;
import java.util.TreeMap;

public class CharCountInString {
    public static String countCharInArr(String str){
        Map<String,Integer> treeMap = new TreeMap<>();
        str.toUpperCase();
        String [] arr = new String[str.length()];
         arr = str.split(" ");
         int getValue = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!treeMap.containsKey(arr[i])){
                treeMap.put(arr[i],1);
            }else {
                getValue = treeMap.get(arr[i]);
                treeMap.put(arr[i],getValue + 1);
            }
        }
        return treeMap.toString();
    }
    public static void main(String[] args) {
        System.out.println(CharCountInString.countCharInArr("Tran Anh Tuan Tuan Tuan Anh Tran Tuan Anh Tran Tran"));
    }

}
