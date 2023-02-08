package examen;

public class Examen {
		
		}

public String primeraMayuscula(String) {
	String base = "anita lava la tina";
    String[] words = base.split(" ");
    for(String word:words){
        System.out.print(word.substring(0,1).toUpperCase());
    }
}

public String invertirCadena(String) {
	StringBuffer base = new StringBuffer("Hasta luego cocodrilo");
    System.out.println(base);

    //Invertir cadena
    base.reverse();
    System.out.println("Frase invertida: " + base);
}

public String vocalesMayuscula(String) {
	String base = "Hasta luego cocodrilo";
	//Primero pongo todo en minusculas, para luego remplazar las vocales en mayuscula.
	String vocales_mayus = base.toLowerCase().replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U"); 
	
	System.out.println(vocales_mayus); //Imprimir con solo las vocales en mayus. 
}

public void fizzBuzz() {
    int i = 1; //asigno la variable i a 1
 for (i = 1; i <= 100; i++) { //for para que se hagan numeros hasta el 100
     if (i==15 || i==30 || i==60) { //if para saber si alguno de esos 3 numeros imprima FizzBuzz (son multiplos de 3 y 5)
    	 System.out.println("FizzBuzz");
    	 }
     else if (i%5==0) { //me da los multiplos de 5
    	 System.out.println("Buzz");
    	 }
     else if (i%3==0) { //me da los multiplos de 3
    	 System.out.println("Fizz");
     }
     else{ //imprime todos los demas numeros
          System.out.println(i);
     }
}
}

public boolean palindromo(String) {
	String str = "anita lava la tina", reverseStr = "";
    String[] words = str.split(" ");
    String algo = "";

    for(int i=0; i<words.length;i++) {
    	algo = algo + words[i];
    }
    
    int strLength = algo.length();

    for (int i = (strLength - 1); i >=0; --i) {
      reverseStr = reverseStr + algo.charAt(i);
    }

    if (algo.toLowerCase().equals(reverseStr.toLowerCase())) {
      System.out.println(str + " is a Palindrome String.");
    }
    else {
      System.out.println(str + " is not a Palindrome String.");
    }
}































