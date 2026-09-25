public class AlunoComum extends Aluno {

    public AlunoComum(String nome, String documento, Plano plano) {
        super(nome, documento, plano);
    }

    @Override
    public double valorMensalidade() {
        return getPlano().getValor();
    }
}