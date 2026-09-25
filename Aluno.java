import java.util.ArrayList;
import java.util.List;

public abstract class Aluno {

    private String nome;
    private String documento;
    private Plano plano;
    private List<CheckIn> checkIns;

    public Aluno(String nome, String documento, Plano plano) {
        this.nome = nome;
        this.documento = documento;
        this.plano = plano;
        this.checkIns = new ArrayList<>();
    }

    public Plano getPlano() {
        return plano;
    }

    public void realizarCheckIn(String dataHora) {
        if (plano.estaAtivo()) {
            CheckIn checkIn = new CheckIn(dataHora);
            checkIns.add(checkIn);
            System.out.println("Check-in realizado.");
        } else {
            System.out.println("Check-in não permitido. Plano inativo.");
        }
    }

    public abstract double valorMensalidade();
}