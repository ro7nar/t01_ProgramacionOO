package t01_ProgramacionOO;
import java.util.Scanner;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		int SueldoA = 300;
	    int SueldoB = 400;
	System.out.println("----Ingrese el valor de su Sueldo-----");
	int A = lector.nextInt();
	if(A< SueldoA) {
		int B= A+100 ;
		
		System.out.println("***Su Sueldo Neto es: "+B+"***");
	}else if(A>=300 || A<=400){
		int C= A+70 ;
		System.out.println("***Su Sueldo Neto es: "+C+"***");
	}else if(A > SueldoB){ 
		int D = A+50;
		System.out.println("***Su Sueldo Neto es: "+D+"***");
	}
	}
}
	
