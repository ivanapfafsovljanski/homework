package domaci;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program gde korisnik unese datum rodjenja i program vrati koji je to
		 * horoskopski znak (istrazite dobro granicne vrednosti ovde)
		 */

		// datumi od kad do kad je koji znak je preuzeto sa sajta
		// https://www.horoscope.com/horoscope-dates/
		// razlièiti izvori razlièito navode

		/*
		 * Aries Dates: March 21 – April 19 
		 * Taurus Dates: April 20 – May 20 
		 * Gemini Dates: May 21 – June 20 
		 * Cancer Dates: June 21 – July 22 
		 * Leo Dates: July 23 – August 22 
		 * Virgo Dates: August 23 – September 22 
		 * Libra Dates: September 23 – October 22 
		 * Scorpio Dates: October 23 – November 21 
		 * Sagittarius Dates:November 22 – December 21 
		 * Capricorn Dates: December 22 – January 19 
		 * Aquarius Dates: January 20 – February 18 
		 * Pisces Dates: February 19 – March 20
		 */

		int mesecRodjenja;
		int danRodjenja;
		Scanner sken = new Scanner(System.in);

		System.out.println("Unesite i redni broj dana iz datuma roðenja");
		danRodjenja = sken.nextInt();
		
		System.out.println("Unesite broj meseca u kojem ste roðeni");
		mesecRodjenja = sken.nextInt();
		
		switch (mesecRodjenja) {
		case 4: {

			if (danRodjenja <= 19) {
				System.out.println("Roðeni ste u znaku OVNA");
			} else if(danRodjenja > 19 && danRodjenja < 31){
				System.out.println("Roðeni ste u znaku BIKA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 5: {

			if (danRodjenja <= 20) {
				System.out.println("Roðeni ste u znaku BIKA");
			} else if(danRodjenja > 20 && danRodjenja < 32){
				System.out.println("Roðeni ste u znaku BLIZANCA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 6: {

			if (danRodjenja <= 20) {
				System.out.println("Roðeni ste u znaku BLIZANCA");
			} else if(danRodjenja > 20 && danRodjenja < 31){
				System.out.println("Roðeni ste u znaku RAKA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 7: {

			if (danRodjenja <= 22) {
				System.out.println("Roðeni ste u znaku RAKA");
			} else if(danRodjenja > 22 && danRodjenja < 32){
				System.out.println("Roðeni ste u znaku LAVA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 8: {

			if (danRodjenja <= 22) {
				System.out.println("Roðeni ste u znaku LAVA");
			} else if(danRodjenja > 22 && danRodjenja < 32){
				System.out.println("Roðeni ste u znaku DEVICE");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 9: {

			if (danRodjenja <= 22) {
				System.out.println("Roðeni ste u znaku DEVICE");
			} else if(danRodjenja > 22 && danRodjenja < 31){
				System.out.println("Roðeni ste u znaku VAGE");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 10: {

			if (danRodjenja <= 22) {
				System.out.println("Roðeni ste u znaku VAGE");
			} else if(danRodjenja > 22 && danRodjenja < 32){
				System.out.println("Roðeni ste u znaku ŠKORPIJE");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 11: {

			if (danRodjenja <= 21) {
				System.out.println("Roðeni ste u znaku ŠKORPIJE");
			} else if(danRodjenja > 21 && danRodjenja < 31){
				System.out.println("Roðeni ste u znaku STRELCA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 12: {

			if (danRodjenja <= 21) {
				System.out.println("Roðeni ste u znaku STRELCA");
			} else if(danRodjenja > 21 && danRodjenja < 32){
				System.out.println("Roðeni ste u znaku JARCA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 1: {

			if (danRodjenja <= 19) {
				System.out.println("Roðeni ste u znaku JARCA");
			} else if(danRodjenja > 20 && danRodjenja < 32){
				System.out.println("Roðeni ste u znaku VODOLIJE");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 2: {

			if (danRodjenja <= 18) {
				System.out.println("Roðeni ste u znaku VODOLIJE");
			} else if(danRodjenja > 20 && danRodjenja < 30){
				System.out.println("Roðeni ste u znaku RIBA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			break;
		}
		case 3: {

			if (danRodjenja <= 20) {
				System.out.println("Roðeni ste u znaku RIBA");
			} else if(danRodjenja > 20 && danRodjenja < 32){
				System.out.println("Roðeni ste u znaku OVNA");
			}
			else {
				System.out.println("Niste uneli validan dan roðenja");
				System.out.println("Opet pokrenite program i pokušajte ponovo");
			}
			
		}
		default:
			System.out.println("Niste uneli dobru vrednost za mesec");
			System.out.println("Opet pokrenite program i pokušajte ponovo");
		}
			System.out.println("Kraj programa");
	}

}
