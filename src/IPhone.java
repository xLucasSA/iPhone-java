public class IPhone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    
    @Override
    public void pausar() {
        System.out.println("iPhone pausando música!");
    }
    
    @Override
    public void tocar() {
        System.out.println("iPhone tocando música!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar " + musica + " no iPhone!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba no iPhone!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar a página no iPhone!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página " + url + " no iPhone!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo pelo iPhone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz do iPhone!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligação para" + numero + " pelo iPhone!");
    }
}   
