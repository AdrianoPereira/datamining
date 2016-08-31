import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Predicao{
	public static void main(String args[]) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int TAM = 5;
		int x[] = new int [TAM];
		int y[] = new int [TAM];
		x[0] = 0; x[1] = 2; x[2] = 4; x[3] = 6; x[4] = 8;
		y[0] = 38; y[1] = 40; y[2] = 45; y[3] = 47; y[4] = 50;

		double mediax=0, mediay=0;
		for(int i=0; i<TAM; i++){
			mediax += x[i];
			mediay += y[i];
		}
		mediax /= TAM;
		mediay /= TAM;

		double primeiroTermo, segundoTermo;
		double numerador=0;
		double denominador=0;
		
		for(int i=0; i<TAM; i++){
			primeiroTermo = x[i]-mediax;
			segundoTermo = y[i]-mediay;
			numerador += (primeiroTermo*segundoTermo);
			denominador += Math.pow((primeiroTermo),2);
		}

		double w1 = numerador/denominador;
		double w0 = mediay-(w1*mediax);
		// double Y, X; 
		int teste = 0;

		for(int i=0; i<TAM; i++){
			System.out.printf("%.1f\n",(w0+w1*teste));
			teste+=2;
		}








	}
}