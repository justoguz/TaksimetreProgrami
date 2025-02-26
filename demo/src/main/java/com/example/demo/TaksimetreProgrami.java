package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Scanner;

@SpringBootApplication
public class TaksimetreProgrami {

	public static void main(String[] args) {
		SpringApplication.run(TaksimetreProgrami.class, args);
		int km;
		double perKm = 2.20, total , startPrice = 10;

		Scanner scan = new Scanner(System.in);
		System.out.print("Mesafeyi KM cinsinden giriniz : ");
		km = scan.nextInt();

		total = (km * perKm);
		total += startPrice;

		total = (total < 20) ? 20 : total;
		System.out.println("Toplam Tutar : " + total);

	}

}
