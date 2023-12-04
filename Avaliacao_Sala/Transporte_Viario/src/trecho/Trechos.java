package trecho;
import java.util.List;

import passageiro.Passageiro;
import pontoDeParada.PontoDeParada;

import java.util.ArrayList;

public class Trechos {
	private int id;
    private PontoDeParada origem;
    private PontoDeParada destino;
    private int tempoEstimado; // Em minutos
    private List<Passageiro> passageirosEmbarcados;
    private List<Passageiro> passageirosDesembarcados;

    public void Trecho(int id, PontoDeParada origem, PontoDeParada destino, int tempoEstimado) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.tempoEstimado = tempoEstimado;
        this.passageirosEmbarcados = new ArrayList<>();
        this.passageirosDesembarcados = new ArrayList<>();
    }

}
