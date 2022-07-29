public class Main {

    public static void main(String[] args) {
        Solution solution = new SolutionHashMap();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));

        System.out.println("-----------------------------------------------------");

        Solution solution2 = new SolutionEnum();
        System.out.println(solution2.romanToInt("III"));
        System.out.println(solution2.romanToInt("LVIII"));
        System.out.println(solution2.romanToInt("MCMXCIV"));
    }
}