class MaxValueInInArrayUsingForEach {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 5, 10, 9, 8, 7};
        MaxValueInInArrayUsingForEach ob = new MaxValueInInArrayUsingForEach();
        System.out.println("The max number in the array is: "+ob.max(array));
    }

    public int max(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max)
                max = num;
        }
        return max;
    }
}