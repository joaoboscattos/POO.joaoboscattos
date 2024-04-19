public class Atividade05_05 {

    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidade;

    public Atividade05_05(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidade = 0.0;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void acelerar(double incremento) {
        this.velocidade += incremento;
        System.out.println("Acelerando. Velocidade atual: " + this.velocidade + " km/h");
    }

    public void frear(double decremento) {
        if (this.velocidade - decremento < 0) {
            this.velocidade = 0;
        } else {
            this.velocidade -= decremento;
        }
        System.out.println("Freando. Velocidade atual: " + this.velocidade + " km/h");
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public static void main(String[] args) {
        Atividade05_05 meuCarro = new Atividade05_05("Toyota", "Corolla", 2022, "Preto");
        meuCarro.acelerar(50);
        meuCarro.exibirInfo();
        meuCarro.frear(20);
        meuCarro.exibirInfo();
    }
}

class CarroTeste {
    public static void main(String[] args) {
        // Exemplo de uso da classe Carro
        Atividade05_05 meuCarro = new Atividade05_05("Honda", "Civic", 2023, "Branco");
        meuCarro.acelerar(30);
        meuCarro.exibirInfo();
        meuCarro.frear(10);
        meuCarro.exibirInfo();
    }
}
