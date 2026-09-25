public class AlunoPlanoFamilia extends Aluno {

    private int quantidadeDependentes;

    public AlunoPlanoFamilia(
        String nome,
        String documento,
        Plano plano,
        int quantidadeDependentes
    ) {
        super(nome, documento, plano);

        if (quantidadeDependentes <= 0) {
            quantidadeDependentes = 1;
        }

        this.quantidadeDependentes = quantidadeDependentes;
    }

    @Override
    public double valorMensalidade() {
        return getPlano().getValor() / quantidadeDependentes;
    }
}
