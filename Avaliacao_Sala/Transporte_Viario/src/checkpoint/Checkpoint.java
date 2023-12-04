package checkpoint;

import trecho.Trechos;

public class Checkpoint {
	private Trechos trecho;
    private String horaChegada;

    public Checkpoint(Trechos trecho, String horaChegada) {
        this.trecho = trecho;
        this.horaChegada = horaChegada;
    }
}
