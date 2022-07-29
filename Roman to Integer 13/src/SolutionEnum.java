public class SolutionEnum implements Solution {
    private enum Rom {
        I(1),
        IV(4),
        V(5),
        IX(9),
        X(10),
        XL(40),
        L(50),
        XC(90),
        C(100),
        CD(400),
        D(500),
        CM(900),
        M(1000);

        private final int value;
        Rom(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public int romanToInt(String s) {
        String[] chars = s.split("");
        int result = 0;
        int sLength = chars.length;
        for (int i = 0; i < sLength; i++) {
            if (i + 1 < sLength && Rom.valueOf(chars[i]).getValue() < Rom.valueOf(chars[i + 1]).getValue()) {
                result += Rom.valueOf(chars[i] + chars[i + 1]).getValue();
                i++;
            } else {
                result += Rom.valueOf(chars[i]).getValue();
            }
        }
        return result;
    }
}
