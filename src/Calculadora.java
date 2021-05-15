import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        double investimento, original, compart, maxvisual;
        double Float = 2.16; // Valor resultante da multiplicação entre porcentagens de cliques e compartilhamentos, número máximo de vezes em que um anúncio é compartilhado e número de visualizações geradas por cada compartilhamento.
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do investimento em reais: ");
        
        investimento = leitor.nextDouble();
        System.out.println("Investimento = " + investimento);

        original = investimento*30;
        System.out.println("Número de visualizações do anúncio original: " + original);

        compart = original*Float;
        System.out.println("Número máximo de visualizações do anúncio compartilhado: " + compart);
        
        maxvisual = (original + compart);
        System.out.println("Número máximo de visualizações = " + maxvisual);

        leitor.close();
    
    }

}

