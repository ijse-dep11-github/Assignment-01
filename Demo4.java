public class Demo4 {
    public static void main(String[] args) {
        int day = 28;
        int month = 12;
        int year = 2023;

        int hour = 23;
        int minute = 59;
        int second = 59;

        final String DAY = "\033[31m";
        final String MONTH = "\033[32m";
        final String YEAR = "\033[33m";

        final String HOUR = "\033[34m";
        final String MINUTE = "\033[35m";
        final String SECOND = "\033[36m";

        final String RESET = "\033[0m";

        System.out.printf("%7$s%1$s%13$s/%8$s%2$s%13$s/%9$s%3$s%13$s %10$s%4$s%13$s:%11$s%5$s%13$s:%12$s%6$s%13$s\n",day,month,year,hour,minute,second,DAY,MONTH,YEAR,HOUR,MINUTE,SECOND,RESET);
        
    }
    
}
