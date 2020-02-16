package com;

public class Problem3 {
    public static boolean isPrime(long n){
        if (n<=1){
            return false;
        }
        for (long i=2; i<=n/2; i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long number= 600851475143L;
        for (long i = 2L; i<=number; i++){
            if (isPrime(i)&&number%i==0) {
                number = number / i;
            }
            if (number==1) {
                System.out.println(i);
            }
        }
    }
}




