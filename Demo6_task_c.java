public class Demo6_task_c {
    public static void main(String[] args) {
    
        final String STRING1 = "CITY";
        final String STRING2 = "STATE";
        final String STRING3 = "POPULATION";

        String city1 = "Los Angeles";
        String state1 = "California";
        int pop1 = 3_966_936;

        String city2 = "California";
        String state2 = "New";
        String state3 = "York";
        int pop2 = 8_336_817;

        

        final String SET1 = "\033[34;1m";
        final String SET2 = "\033[31m";
        final String SET3 = "\033[33m";
        final String RESET = "\033[0m";        

        final String ROW = "+------------------+----------+----------+";
        final String STATE_2 = "\033[32m New \033[0mYork";
        final String DATA = "|%1$-18s|%2$3s|%3$s%5$10s%4$s|\n";
        

        System.out.println(SET3+ROW+RESET);
        System.out.printf("%6$s|%1$s%3$-18s%2$s%6$s|%1$s%4$-10s%2$s%6$s|%1$s%5$10s%2$s%6$s|\n",SET1,RESET,STRING1,STRING2,STRING3,SET3);
        System.out.println(SET3+ROW+RESET);
        System.out.printf("%6$s|%4$s%1$-18s%6$s|%4$s%2$3s%6$s|%4$s%3$s%5$10s%4$s%6$s|%4$s\n",city1,state1,SET2,RESET,pop1,SET3);
        //System.out.println();
        System.out.printf("%6$s|%4$s%1$-18s%6$s|%4$s%2$3s%6$s|%4$s%3$s%5$10s%4$s%6$s|%4$s\n",STATE_2,STATE_2,SET2,RESET,pop1,SET3);
        //System.out.printf("|%1$s %2$s|%1$s %2$5s|%3$3s|\n",state2,state3,pop2);
        System.out.println(SET3+ROW+RESET);
    }
    
}
