public class Dado {

    private NumeroDado valor;

    public Dado() {
        //this.valor = NumeroDado.UNO;
        this.tirar();
    }

    public NumeroDado getValor() {
        return valor;
    }

    public int getValorEntero() {
        switch (this.valor) {
            case DOS: return 2;
            case TRES: return 3;
            case CUATRO: return 4;
            case CINCO: return 5;
            case SEIS: return 6;
            case UNO:
            default: return 1;
        }
    }

    public void tirar() {
        int cara = (int)(Math.random() * 6) + 1; // aleatorio 1-6

        switch (cara) {
            case 2:
                this.valor = NumeroDado.DOS;
                break;
            case 3:
                this.valor = NumeroDado.TRES;
                break;
            case 4:
                this.valor = NumeroDado.CUATRO;
                break;
            case 5:
                this.valor = NumeroDado.CINCO;
                break;
            case 6:
                this.valor = NumeroDado.SEIS;
                break;
            case 1:
            default:
                this.valor = NumeroDado.UNO;
                break;
        }
    }

    @Override
    public String toString() {
        return String.format("[Dado %s (%d)]", this.getValor(), this.getValorEntero());
    }
}
