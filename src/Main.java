public class Main {
    public static void main(String[] args) {

        Computer myComputer = new Computer();

        myComputer.setMarca("Asus");
        myComputer.setModelo("Rog Zephyrus");

        System.out.println("Brand: " + myComputer.getMarca());
        System.out.println("Model: " + myComputer.getModelo());

        myComputer.encender();
        myComputer.encender();

        myComputer.apagar();
    }
}