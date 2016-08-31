import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Predicao{
	public static void main(String args[]) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Quantidade de linhas de dados: ");
		int n = Integer.parseInt(br.readLine());
		
		int TAM = n;

		int x[] = new int [TAM];
		int y[] = new int [TAM];
		
		for(int i=0; i<TAM; i++){
			System.out.println((i+1)+"ª linha");
			System.out.print("Valor de x: ");
			x[i] = Integer.parseInt(br.readLine());
			System.out.print("Valor de y: ");
			y[i] = Integer.parseInt(br.readLine());
			System.out.println();
		}

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