class Solution {
    private int steps;

    public int numberOfSteps(int num) {
        steps = 0;
        return numberOfStepsRec(num);
    }
    public int numberOfStepsRec(int num) {
        if (num <= 0) {
            return steps;
        }
        steps++;
        if (num % 2 == 0) {
            numberOfStepsRec(num / 2);
        } else {
            numberOfStepsRec(num - 1);
        }
        return steps;
    }
}
