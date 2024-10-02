public class MyArrays {
    public static String arrayToString(int[] nums) {
        String result = "{";
        for(int i = 0; i < nums.length  - 1; i++) {
            result += nums[i] + ", ";
        }
        result += nums[nums.length - 1] + "}";
        return result;
    }

    public static int[] returnCopy(int[]ary) {
        int[] result = new int[ary.length];
        for (int i = 0; i < ary.length; i++) {
            result[i] = ary[i];
        }
        return result;
    }

    public static int[] concatArray(int[]ary1, int[]ary2) {
        int[] result = new int[ary1.length + ary2.length];
        for(int i = 0; i < ary1.length; i++) {
            result[i] = ary1[i];
        }
        for(int i = 0; i < ary2.length; i++) {
            result[ary1.length + i] = ary2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] test1 = new int[] {2, 3, 4, 5};
        System.out.println(arrayToString(test1));
        if (returnCopy(test1) != test1) {
            System.out.println("It works");
        }
        else {
            System.out.println("It doesn't work");
        }
        System.out.println(arrayToString(test1));

        int[] test2 = new int[] {3, 4, 5, 6, 7};
        System.out.println(arrayToString(concatArray(test1, test2)));
    }
}