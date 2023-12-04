package jornadas;


import java.util.Date;
import java.util.List;
import cobrador.Cobrador;
import motorista.Motorista;
import trajeto.Trajeto;
import veiculos.Veiculos;
import java.util.ArrayList;

public class Jornadas {
    private List<Trajeto> trajetos;
    private Motorista motorista;
    private Veiculos veiculo;
    private Cobrador cobrador;

    private Date inicioJornada;
    private Date fimJornada;

    public void Jornada(Motorista motorista, Veiculos veiculo, Cobrador cobrador) {
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.cobrador = cobrador;
        this.trajetos = new ArrayList<>();
    }

}

