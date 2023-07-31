public class Demo5 {
    public static void main(String[] args) {

        String firstDigitsSet = "978";
        String secondDigitSet = "3";
        String thirdDigitSet = "16";
        String fourthDigitsSet = "1484100";

        final String C1 = "\033[32m";
        final String C2 = "\033[33m";
        final String C3 = "\033[34m";
        final String C4 = "\033[35m";

        final String R = "\033[0m";

        System.out.printf("%5$s%1$s%9$s-%6$s%2$s%9$s-%7$s%3$s%9$s-%8$s%4$s%9$s\n",firstDigitsSet,secondDigitSet,thirdDigitSet,fourthDigitsSet,C1,C2,C3,C4,R);


        
    }
    
}
