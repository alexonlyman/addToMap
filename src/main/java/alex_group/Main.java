package alex_group;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 5, 6, 7,7};
        getArray(arr);

    }

    public static void getArray(int[] arr) {
        Map<Integer, Integer> integerMap = new HashMap<>();
        int counter = 1;

        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                counter++;
            } else {
                integerMap.put(arr[i], counter);
                counter = 1;
            }
        }

        System.out.println(integerMap);
    }
}