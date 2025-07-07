package com.dicoding.javafundamental.basic;

import java.util.Date;

import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.musik.Gitar;

import org.apache.commons.lang3.time.DateUtils;

public class Main {
	public static void main(String[] args) {
		System.out.println("Hello World");

		Gitar.bunyi();
		Mobil.tampilaknJumlahBan();
		Motor.tampilaknJumlahBan();
		Kereta.tampilaknJumlahBan();

		Date today = new Date();
		System.out.println("Hari ini = " + today);

		Date tomorrow = DateUtils.addDays(today, 1);
		System.out.println("Besok = " + tomorrow);
	}

}
