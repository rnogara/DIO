public class ContaPoupanca extends Conta {

    public void imprimirExtrato() {
       System.out.println("=== Extrato da Conta Poupança ===");
       super.imprimirInfosComuns();
    }

}
