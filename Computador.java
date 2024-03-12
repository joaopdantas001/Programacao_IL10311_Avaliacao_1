public class Computador { 

  

    private String marca; 

    private String modelo; 

    private int anoFabricacao; 

    private String processador; 

    private double memoriaRAM; 

  

    public Computador() { 

    } 

  

    public Computador(String marca, String modelo, int anoFabricacao, String processador, double memoriaRAM) { 

        this.marca = marca; 

        this.modelo = modelo; 

        this.anoFabricacao = anoFabricacao; 

        this.processador = processador; 

        this.memoriaRAM = memoriaRAM; 

    } 

  

    public String getMarca() { 

        return marca; 

    } 

  

    public void setMarca(String marca) { 

        this.marca = marca; 

    } 

  

    public String getModelo() { 

        return modelo; 

    } 

  

    public void setModelo(String modelo) { 

        this.modelo = modelo; 

    } 

  

    public int getAnoFabricacao() { 

        return anoFabricacao; 

    } 

  

    public void setAnoFabricacao(int anoFabricacao) { 

        this.anoFabricacao = anoFabricacao; 

    } 

  

    public String getProcessador() { 

        return processador; 

    } 

  

    public void setProcessador(String processador) { 

        this.processador = processador; 

    } 

  

    public double getMemoriaRAM() { 

        return memoriaRAM; 

    } 

  

    public void setMemoriaRAM(double memoriaRAM) { 

        this.memoriaRAM = memoriaRAM; 

    } 

  

    public void imprimir() { 

        System.out.println("Marca: " + marca); 

        System.out.println("Modelo: " + modelo); 

        System.out.println("Ano de Fabricação: " + anoFabricacao); 

        System.out.println("Processador: " + processador); 

        System.out.println("Memória RAM: " + memoriaRAM + " GB"); 

        System.out.println(); 

    } 

} 