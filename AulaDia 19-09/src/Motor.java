public class Motor {
    private int cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private int rpm;
    private int potencia;

    public Motor(int cilindradas, String modelo, TipoCombustivel tipoCombustivel) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = 0;
        this.potencia = 0;
    }

    public void ligar() {
        System.out.println("Motor ligado.");
        this.rpm = 1000;
    }

    public void desligar() {
        System.out.println("Motor desligado.");
        this.rpm = 0;
        this.potencia = 0;
    }

    public void aumentarPotencia(int incremento) {
        potencia += incremento;
        System.out.println("Potência aumentada para: " + potencia);
    }

    public void reduzirPotencia(int decremento) {
        potencia -= decremento;
        if (potencia < 0) potencia = 0;
        System.out.println("Potência reduzida para: " + potencia);
    }

    public void acelerar(int incrementoRpm) {
        rpm += incrementoRpm;
        System.out.println("RPM aumentado para: " + rpm);
    }

    public void reduzirRpm(int decrementoRpm) {
        rpm -= decrementoRpm;
        if (rpm < 0) rpm = 0;
        System.out.println("RPM reduzido para: " + rpm);
    }
}
