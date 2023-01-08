import lombok.Getter;
import lombok.Setter;

public abstract class Conta extends Cliente {

    private static final String AGENCIA_PADRAO = "0001";
    private static int SEQUENCIAL = 1;

    protected @Getter @Setter String agencia;
    protected @Getter @Setter int numero;
    protected @Getter @Setter double saldo;
    private @Getter boolean status;

    public void abrirConta(String nome, int idade, String cpf, int senha){
        if (this.isStatus() == true) {
			System.out.println("A conta já existe");
		} else {
            this.agencia = AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
			super.setNome(nome);
			super.setIdade(idade);
			super.setCpf(cpf);
			super.setSenha(senha);
			System.out.println("Conta aberta com sucesso!");
		}
    };

    public void sacar(double valor) {
        saldo -= valor;
    }
    public void depositar(double valor) {
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
	public void setStatus(boolean status) {
		this.status = status;
	}

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", super.getNome()));
        System.out.println(String.format("CPF: %s", super.getCpf()));
        System.out.println(String.format("Agencia: %s", this.agencia));
        System.out.println(String.format("Conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    public void imprimirExtrato() {
    }
}
