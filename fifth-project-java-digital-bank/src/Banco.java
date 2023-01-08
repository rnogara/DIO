import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Banco extends Conta {

    private @Getter @Setter String nome;
    private List<Conta> contas;

    public List<Conta> getContas() {
        return contas;
    }

    public Banco setContas(List<Conta> contas) {
        this.contas = contas;
        return this;
    }
}
