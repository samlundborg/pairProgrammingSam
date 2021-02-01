public class SmolExerciseTDD {

    public int count3(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i == 3) {
                count++;
            }
        }
        return count;
    }

    public int[] turn3(int number) {
        int[] array = new int[number-1];
        for(int i : array) {
            i = 3;
        }
        return array;
    }
}
