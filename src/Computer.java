public class Computer {
    private String marca;
    private String modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public boolean isEncendida() {
        return encendida;
    }
    public void setMarca(String brand) {
        this.marca = brand;
    }




    public void setModelo(String model) {
        this.modelo = model;
    }
    public void encender() {
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora esta encendida");
        }
    }
    public void apagar() {
        if (encendida) {
            encendida = false;
            System.out.println("La computadora esta apagada");
        }
    }

}