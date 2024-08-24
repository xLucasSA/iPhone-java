public class App {
    public static void main(String[] args) throws Exception {
        IPhone smartPohone = new IPhone();
        
        smartPohone.adicionarNovaAba();
        smartPohone.atender();
        smartPohone.atualizarPagina();
        smartPohone.exibirPagina("google");
        smartPohone.iniciarCorreioVoz();
        smartPohone.ligar("38992101911");
        smartPohone.pausar();
        smartPohone.selecionarMusica("Numb");
        smartPohone.tocar();
    }
}
