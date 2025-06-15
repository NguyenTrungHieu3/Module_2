package ss11_dsa_stack_queue.bai_tap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class DemSoLanXuatHienCuaMoiTu {
    public static void demSoLanXuatHienCuaMoiTu(String string) {
        Map<String, Integer> map = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            String key = string.substring(i, i + 1);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }

        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + ":" + map.get(key));
        }
    }

    public static void main(String[] args) {
        String string = "Hello World";
        demSoLanXuatHienCuaMoiTu(string);
    }
}
