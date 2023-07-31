public class Demo6_task_b {
    public static void main(String[] args) {

        final String STRING1 = "NAME";
        final String STRING2 = "AGE";

        String name1 = "Alice";
        int age1 = 24;

        String name2 = "Bob";
        int age2 = 30;

        final String SET1 = "\033[34;1m";
        final String SET2 = "\033[31m";
        final String RESET = "\033[0m";

        final String ROW = "+------------------+---+";
        final String DATA = "|%1$-18s|%3$s%2$3s%4$s|\n";

        System.out.println(ROW);
        System.out.printf("|%1$s%3$-18s%2$s|%1$s%4$3s%2$s|\n",SET1,RESET,STRING1,STRING2);
        System.out.println(ROW);
        System.out.printf(DATA,name1,age1,SET2,RESET);
        //System.out.println();
        System.out.printf(DATA,name2,age2,SET2,RESET);
        System.out.println(ROW);
        
    }
    
}
