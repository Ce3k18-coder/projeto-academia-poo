public class Plano {

    private double valor;
    private String estado;

    public Plano(double valor) {
        this.valor = valor;
        this.estado = "ATIVO";
    }

    public double getValor() {
        return valor;
    }

    public void vencer() {
        if (estado.equals("ATIVO")) {
            estado = "VENCIDO";
        }
    }

    public void cancelar() {
        if (estado.equals("VENCIDO")) {
            estado = "CANCELADO";
        }
    }

    public void renovar() {
        if (estado.equals("VENCIDO") || estado.equals("CANCELADO")) {
            estado = "ATIVO";
        }
    }

    public boolean estaAtivo() {
        return estado.equals("ATIVO");
    }
}
