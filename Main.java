package com.company;

public class Main {

    public static void main(String[] args) {
        //System.out.println(pow(2,4));
        System.out.println(palindrome(121));
        //System.out.println(binary(31));



   }
   //שאלה 1
   public static int pow(int x, int index){

        if(index == 1){
            return x;
        }
        if(x == 0){

        }

    return pow(x, index-1) * x;


   }

   //שאלה 2
public static boolean palindrome(int num){
    int x, sum=0, temp;

    temp=num;
    while(num > 0){
        x = num % 10;
        //System.out.println(x);
        sum = (sum * 10) + x;
        //System.out.println(sum);
        palindrome(num /= 10);
        //System.out.println(num);
    }
    if(temp == sum) {
        return true;
    }
    else {
        return false;
    }

}

private static String binary(int num) {
            if (num == 1) {
                return "1";
            }
            if (num == 0) {
                return "0";
            }
            return binary(num / 2) + num % 2;
        }

    }
