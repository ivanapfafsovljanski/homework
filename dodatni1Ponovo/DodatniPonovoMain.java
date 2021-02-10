package dodatni1Ponovo;

import java.lang.reflect.Method; 
import java.lang.reflect.Field; 
import java.lang.reflect.Constructor; 
  
import java.util.Scanner;

public class DodatniPonovoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sportista[] clan = new Sportista[5];
		 clan[0] = new Sportista("Ime", "Prezime", 1956);
		 clan[1] = new Sportista("Ime1", "Prezime", 1956);
		 clan[2] = new Sportista("Ime2", "Prezime", 1956);
		 clan[3] = new Sportista("Ime3", "Prezime", 1956);
		 clan[4] = new Sportista("Ime4", "Prezime", 1956);
		 
		 Klub klub1 = new Klub("Neki", "Grad", 2021, clan);
		 for (int i = 0; i < clan.length; i++) {
			 System.out.println(klub1.getSportista()[i].getIme());
			 
		}
		 Sportista noviclan = new Sportista("NovoIme", "NovoPrezime", 1996);
		klub1.promenaClana(noviclan);
		
		for (int i = 0; i < clan.length; i++) {
			 System.out.println(klub1.getSportista()[i].getIme());
			 
		}
		//sa: https://www.geeksforgeeks.org/reflection-in-java/
		//daje naziv klase
		Class  cls = klub1.getClass(); 
        System.out.println("The name of class is " + cls.getName()); 
        
       
        //neæe da radi za konstruktora
       /* Constructor constructor = cls.getConstructor(); 
        System.out.println("The name of constructor is " + 
                            constructor.getName());*/
        
		Method[] methods = cls.getDeclaredMethods(); 
		  
        // Printing method names 
        for (Method method:methods) 
            System.out.println("Metoda klase Klub je " + method.getName()); 
        
        Field[] fields = cls.getDeclaredFields();
     // Printing fields names 
        for (Field field:fields) 
            System.out.println("Atribut je "+ field.getName()); 
  
	}

}
