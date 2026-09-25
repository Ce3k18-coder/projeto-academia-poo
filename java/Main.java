public class Main {

    public static void main(String[] args) {

        Plano planoComum = new Plano(150.0);
        Plano planoFamilia = new Plano(300.0);

        AlunoComum aluno1 =
            new AlunoComum("Carlos", "123456789", planoComum);

        AlunoPlanoFamilia aluno2 =
            new AlunoPlanoFamilia(
                "Mariana",
                "987654321",
                planoFamilia,
                3
            );

        System.out.println(
            "Mensalidade aluno comum: R$ "
            + aluno1.valorMensalidade()
        );

        System.out.println(
            "Mensalidade plano família: R$ "
            + aluno2.valorMensalidade()
        );

        aluno1.realizarCheckIn("25/09/2026 18:00");

        planoComum.vencer();

        aluno1.realizarCheckIn("26/09/2026 18:00");

        Turma turma = new Turma("Funcional");

        turma.adicionarAluno(aluno1);
        turma.adicionarAluno(aluno2);
    }
}
