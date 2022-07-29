import java.util.HashMap;

public class SolutionHashMap implements Solution{
    private final static HashMap<String, Integer> rom = new HashMap<>();

    static {
        rom.put("I", 1);
        rom.put("IV", 4);
        rom.put("V", 5);
        rom.put("IX", 9);
        rom.put("X", 10);
        rom.put("XL", 40);
        rom.put("L", 50);
        rom.put("XC", 90);
        rom.put("C", 100);
        rom.put("CD", 400);
        rom.put("D", 500);
        rom.put("CM", 900);
        rom.put("M", 1000);
    }

    public int romanToInt(String s) {
        String[] chars = s.split("");
        int result = 0;
        int sLength = chars.length;
        for (int i = 0; i < sLength; i++) {
            if (i + 1 < sLength && rom.get(chars[i]) < rom.get(chars[i + 1])) {
                result += rom.get(chars[i] + chars[i + 1]);
                i++;
            } else {
                result += rom.get(chars[i]);
            }
        }
        return result;
    }
}
