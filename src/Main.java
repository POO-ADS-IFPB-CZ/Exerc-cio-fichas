public class Main {
    public static void main(String[] args) {
        //TODO: Criar um loop infinito para solicitar a criação das fichas.

        Ficha ficha1 = new Ficha();
        Ficha ficha2 = new Ficha();

        System.out.println(ficha1.getNumero());
        System.out.println(ficha1.getDataHora());
        System.out.println(ficha2.getNumero());
        System.out.println(ficha2.getDataHora());
    }
}