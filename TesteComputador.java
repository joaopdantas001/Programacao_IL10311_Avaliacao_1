import java.util.Scanner; 

public class TesteComputador { 

    public static void main(String[] args) { 

        Scanner scanner = new Scanner(System.in); 

        Computador[] computadores = new Computador[4]; 

        // Criando dois computadores com o construtor default 

        computadores[0] = new Computador(); 
        computadores[1] = new Computador(); 

        // Preenchendo os dados dos computadores com construtor default 

        for (int i = 0; i < 2; i++) { 
            System.out.println("Digite a marca do computador " + (i + 1) + ": "); 
            computadores[i].setMarca(scanner.nextLine()); 

            System.out.println("Digite o modelo do computador " + (i + 1) + ": "); 
            computadores[i].setModelo(scanner.nextLine()); 

            System.out.println("Digite o ano de fabricação do computador " + (i + 1) + ": "); 
            computadores[i].setAnoFabricacao(scanner.nextInt()); 
            scanner.nextLine(); // Consumir quebra de linha 
            
            System.out.println("Digite o processador do computador " + (i + 1) + ": "); 
            computadores[i].setProcessador(scanner.nextLine()); 

            System.out.println("Digite a memória RAM do computador " + (i + 1) + " (GB): "); 
            computadores[i].setMemoriaRAM(scanner.nextDouble()); 

            scanner.nextLine(); // Consumir quebra de linha 

        } 

  

        // Criando dois computadores com o construtor com parâmetros 

        computadores[2] = new Computador("Dell", "XPS 13", 2023, "Intel Core i7", 16); 

        computadores[3] = new Computador("Apple", "MacBook Pro", 2022, "Apple M1 Pro", 32); 

  

        // Imprimindo os dados de todos os computadores 

        for (Computador computador : computadores) { 

            computador.imprimir(); 

        } 

    } 

} 

 