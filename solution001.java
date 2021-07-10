package euler;

import java.util.Scanner;

public class solution001 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int times = input.nextInt();
        long sum = 0, number = 0;
                
        for(int run = 0; run < times; run++){
            
            number = input.nextInt();
            long three = (number-1) / 3;
            long five = (number-1) / 5;
            long fifteen = (number-1) / 15;
            
            sum = 3*(three*(three+1)/2)+5*(five*(five+1)/2)-15*(fifteen*(fifteen+1)/2);
            
            System.out.println(sum);
            sum = 0;
        }        
        input.close();
    }
}
