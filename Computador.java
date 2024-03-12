public class Computador {

    // Atributos
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private String processador;
    private int memoriaRAM;

    // Construtor Default
    public Computador() {
    }

    // Construtor com parâmetros
    public Computador(String marca, String modelo, int anoFabricacao, String processador, int memoriaRAM) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    // Setters e Getters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getProcessador() {
        return processador;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getMemoriaRAM() {
        return memoriaRAM;
    }

    // Método para imprimir os atributos
    public void imprimir() {
        System.out.println("______________________");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Processador: " + processador);
        System.out.println("Memória RAM: " + memoriaRAM + "GB");
        System.out.println();
    }
}
