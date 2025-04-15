package com.example.hw;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Введите целое положительное число больше 1: ");
		while(!sc.hasNextInt()) {
			System.out.println("Вы ввели не целое число");
			sc.nextLine();
		}
		n = sc.nextInt();
		
		if(n < 2) {
			System.out.println("Введенное число меньше 2");
			return;
		}
		
		int sum = 0;
		
		if(isPrimeNumber(n)) {
			System.out.println("Число " + n + " является простым.");
			for (int i = 2; i < n; i++) {
	        	if(isPrimeNumber(i)) {
	        		sum = sum + i;
	        	}
	        	
	        }
			
			System.out.println("Сумма всех простых чисел, меньших " + n + ", равна " + sum);
			
		} else {
			System.out.println("Число не простое");
		}
		
		sc.close();

	}
	
	public static boolean isPrimeNumber(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            } 
        }
        return true;
            
           
    }
	}

