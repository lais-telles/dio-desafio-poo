public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet{

    @Override
    public void tocarMusica() {
        System.out.println("Tocando musica no Iphone");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando a musica no Iphone");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica no Iphone");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando do Iphone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo do Iphone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Iphone");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pa agina no Iphone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Iphone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina no Iphone");
    }
    
}
