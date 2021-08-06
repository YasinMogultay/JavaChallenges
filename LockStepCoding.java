public class LockStepCoding {
    //first tutorial question about page
    public static int solve(int weight0, int weight1, int weight2) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
        if(weight0 == Math.max(weight2, Math.max(weight0, weight1))){
            return 0;
        } else if (weight1 == Math.max(weight2, Math.max(weight0, weight1))){
            return 1;
        } else {
            return 2;
        }
    }

}
