public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();

        cc.abrirConta("Roberta", 28, "00011122233", 123456);
        //cc.fecharConta();
		cc.depositar(300);
        //cc.sacar(200);

        Conta poupanca = new ContaPoupanca();
        
        poupanca.abrirConta("Roberta", 28, "00011122233", 654321);
        //poupanca.fecharConta();
		poupanca.depositar(250);
        //poupanca.sacar(100);

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
