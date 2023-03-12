import java.text.DateFormat;
public class Practica {
	
	//Funciones
	
	static void primerMetodo() { // Si le ponemos un argumento le tienes que especificar el tipo de dato
		System.out.println("Holaaa");
	}
	
	//Ejercicio 1
	
	//Ejercicio 2
	static void circulo (double radio) {
		double perimetro = 0;
		double area = 0;
		perimetro = 2*Math.PI*radio;
		area = Math.PI * (radio*radio);
		DecimalFormat formato1 = new DecimalFormat("#.00");
		System.out.println("Radio:"+formato1.format(radio));
		System.out.println("Perimetro:"+ formato1.format(perimetro));
		System.out.println("Area:"+formato1.format(area));
	}
	
	static void horaSistema() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Date date = new Date();
		System.out.println("Hora actual: " + dateFormat.format(date));
	}
	
	static void changeSec(double seg) {
		double horas;
		double minutos;
		horas = seg/3600;
		minutos = seg/60;
		System.out.println(seg+"segundos = "+horas+"horas = " + minutos+"minutos = "+seg+"segundos");
	}
	
	static void volEsfera(double radio) {
		double volumen;
		DecimalFormat formato1 = new DecimalFormat("#.00");
		volumen = (4/3)*Math.PI*(Math.pow(radio, 3));
		System.out.println("Volumen: "+formato1.format(volumen));
	}
	
	static void volCono(double radio,double altura) {
		double volumen;
		DecimalFormat formato1 = new DecimalFormat("#.00");
		volumen = (1/3)*altura*Math.PI*(radio*radio);
		System.out.println("Volumen: "+formato1.format(volumen));
	}
	
	static void areaSuper(double lado) {
		double area;
		DecimalFormat formato1 = new DecimalFormat("#.00");
		area = 6*(lado*lado);
		System.out.println("Area superficial: "+formato1.format(area));
	}
	
	static boolean bisiesto(int year) {
	    return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
	}

	//Ejercicio 9
	static boolean numPrimo(int n){
		int cont =0;
		boolean primo=true;
	    for(int i=2;i<n;i++){
	        if(n%i==0){
	            cont++;
	        }
	    }
	    if(cont>0){
	        primo =false;
	    }else{
	        primo =true;
	    }
	    return primo;
		
	}
	
	//Ejercicio 10 usando exponencial y logaritmo
	static void suma(double a, double b) {
		double sum = Math.log(Math.exp(a)*Math.exp(b));
		System.out.println(sum);
	}
	
	//Ejercicio 11
	static void numPalindrome(int n) {
		String numStr = Integer.toString(n);
		String rev = new StringBuilder(numStr).reverse().toString();
		int numRev = Integer.parseInt(rev);
		
		if(n == numRev) {
			System.out.println("Es palindromo");
		}else {
			System.out.println("No es palindromo");
		}
	}
	
	//Ejercicio 12
	
	//Ejercicio 13
	static void removeSpaces(String str) {
		String newStr = str.replace(" ", "");
		System.out.println(newStr);
	}
	
	//Ejercicio 14
	static void stringReverse(String str) {
		String strReverso = new StringBuilder(str).reverse().toString();
		System.out.println(strReverso);
	}
	
	//Ejercicio 15

	
	public static void main(String[] args) {
		
		primerMetodo();
		
		circulo(3.0);
		System.out.println("\n");
		horaSistema();
		System.out.println("\n");
		changeSec(3600);
		System.out.println("\n");
		volEsfera(4.0);
		System.out.println("\n");
		volCono(3.0,10.0);
		System.out.println("\n");
		System.out.println(bisiesto(2024));
		System.out.println("\n");

		//primeros 100 primos
		for(int i=2;i<=30;i++){
			if(numPrimo(i)){
			     System.out.println(i);
			}
		}
		System.out.println("\n");
		
		suma(3,5);
		System.out.println("\n");
		
		numPalindrome(123);
		numPalindrome(313);
		System.out.println("\n");
		
		removeSpaces("Hola Mundo");
		System.out.println("\n");
		
		stringReverse("Hola");
		
	}

}
