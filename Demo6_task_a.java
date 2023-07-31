public class Demo6_task_a {
    public static void main(String[] args) {

        String num1 = "5";
        String num2 = "0";
        String syn1 ="[";
        String syn2 = "]";

        

        final String B1 = "\033[41m";
        final String B2 = "\033[42m";
        final String R = "\033[0m";

        final String F = "\033[30;1m";


        System.out.printf("%5$s%1$s%2$7s%8$s%6$s%7$s%3$s%%%4$7s%8$s\n",syn1,num1,num2,syn2,B1,B2,F,R);
        
    }
    
}
