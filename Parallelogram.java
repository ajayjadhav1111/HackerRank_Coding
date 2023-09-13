package HackerRank_Coding;

import java.util.Scanner;

class Parallelogram
{
    public static void main(String[] args){

        int breadth , height , area ;
        Scanner sc = new Scanner(System.in);

        breadth = sc.nextInt();
        height = sc.nextInt();

        area = breadth * height ;

        System.out.println("Area of Parallelogram is : " +area);

    }
}