public class Produtos {
    private String nomeProduto;
    private String tamanhoProduto;
    private String tipoProduto;
    private String corProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getTamanhoProduto() {
        return tamanhoProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getCorProduto() {
        return corProduto;
    }


    Produtos(String nomeProduto, String tamanhoProduto, String tipoProduto, String corProduto){
        this.nomeProduto = nomeProduto;
        this.tamanhoProduto = tamanhoProduto;
        this.tipoProduto = tipoProduto;
        this.corProduto = corProduto;
    }



}
