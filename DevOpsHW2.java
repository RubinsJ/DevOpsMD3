class DevOpsHW2 {
    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = addNumbers(1, 2);
        System.out.println("Sum is: " + result);

        int result2 = square(10);
        System.out.println("Squared value of 10 is: " + result2);
    }
}