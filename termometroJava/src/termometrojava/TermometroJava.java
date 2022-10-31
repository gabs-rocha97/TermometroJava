package termometrojava;
import java.util.Scanner;
public class TermometroJava {
    public static void main(String[] args) {
        double valorEntrada;
        String undEntrada, undSaida;
		 

		Scanner entrada = new Scanner(System.in);
                ConversorTemperatura conversor = new ConversorTemperatura();
                 
		System.out.println("Converter de:");
		System.out.println("Celcius: c");
		System.out.println("Fireheight: f");
		System.out.println("Kelvin: k");
		conversor.setUnidadeEntrada(entrada.nextLine());
	
		System.out.println("Converter para:");
		System.out.println("Celcius: c");
		System.out.println("Fireheight: f");
		System.out.println("Kelvin: k");
		conversor.setUnidadeSaida(entrada.nextLine());
	
	
		System.out.println("Digite o valor da temperatura que deseja converter:");
		conversor.setValorEntrada(entrada.nextDouble());
		
                undEntrada = conversor.getUnidadeEntrada();
                undSaida = conversor.getUnidadeSaida();
                valorEntrada = conversor.getValorEntrada();
                
		conversor.escolheFuncao(undEntrada, undSaida, valorEntrada);
                conversor.mostraConversao(undSaida);

	}
    }
