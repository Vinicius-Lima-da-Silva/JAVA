package trajeto;

import java.util.ArrayList;
import java.util.List;

import trecho.Trechos;

public class Trajeto {
    private String localizacao;
    private List<Trechos> trechos;

    public Trajeto(String localizacao) {
        this.localizacao = localizacao;
        this.trechos = new ArrayList<>();
    }

   
}

