public class CountOnes {

    public static void main(String[] args) {
        int count = countOnesInRange(1, 99);
        System.out.println("Цифра '1' встречается " + count + " раз(а) в числовом ряду от 1 до 99.");
    }

    public static int countOnesInNumber(int number) {
        int count = 0;
        String numberStr = String.valueOf(number);
        for (char digit : numberStr.toCharArray()) {
            if (digit == '1') {
                count++;
            }
        }
        return count;
    }

    public static int countOnesInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            count += countOnesInNumber(i);
        }
        return count;
    }
}
