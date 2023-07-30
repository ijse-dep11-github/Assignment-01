public class Demo3 {

    public static void main(String[] args) {

        String firstDigitsSet = "123";
        String middleDigitsSet = "456";
        String lastDigitsSet = "7890";

        final String SET_HIGHLIGHT = "\033[45m";
        final String RESET = "\033[0m";
        System.out.printf("(%4$s%1$s%5$s) %2$s-%3$s\n",firstDigitsSet,middleDigitsSet,lastDigitsSet,SET_HIGHLIGHT,RESET);
        
    }
    
}
