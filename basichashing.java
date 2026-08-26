import java.util.HashMap;
import java.util.HashSet;

public class basichashing {

    public static HashMap<Integer,Integer> frequency(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,1,1,1,2,1};
        HashMap<Integer,Integer> map = new  HashMap<>(frequency(arr));
        int maxfre = 0 , minfre = arr.length;
        int maxkey = 0, minkey = -1;

        for (int i : map.keySet()) {
            if(map.get(i) > maxfre){
                maxkey = i;
                maxfre = map.get(i);
            }
            if(map.get(i) < minfre){
                minfre = map.get(i);
                minkey = i;
            }
        }
        System.out.println("max--" + maxfre + "--" +maxkey);
        System.out.println("min--" + minfre + "--" +minkey);

    }
}

