import java.time.LocalDateTime;

public class Ficha {

    private int numero;
    private LocalDateTime dataHora;
    private static int contFicha;
    //TODO: Colocar no construtor
    private TipoFicha tipo;

    public Ficha(){
        numero = ++contFicha;
        dataHora = LocalDateTime.now();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
