import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Empresas {
    private String nomeEmpresa;
    private String cnpj;
    private String nomeResponsavel;
    private String telefone;
    private ArrayList<Produtos> listaProdutos;


   Empresas(String nomeEmpresa, String cnpj, String nomeResponsavel, String telefone, ArrayList<Produtos> listaProdutos){
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
        this.listaProdutos = listaProdutos;
    }
    Empresas(String nomeEmpresa, String cnpj, String nomeResponsavel, String telefone){
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.nomeResponsavel = nomeResponsavel;
        this.telefone = telefone;
        this.listaProdutos = new ArrayList<>();
    }
    public void addProduto(Produtos novoProduto){
        listaProdutos.add(novoProduto);
    }
    public void printarEmpresas() {
        String mensagem = "Nome da Empresa: " + nomeEmpresa + "\n" +
                "CNPJ: " + cnpj + "\n" +
                "Nome do Responsável pela Empresa: " + nomeResponsavel + "\n" +
                "Telefone da Empresa: " + telefone + "\n" +
                "--------------------\n";

        mensagem += printarProdutos();

        JOptionPane.showMessageDialog(null, mensagem, "Detalhes da Empresa", JOptionPane.INFORMATION_MESSAGE);
    }

    public String printarProdutos() {
        StringBuilder produtosString = new StringBuilder("Produtos da empresa " + nomeEmpresa + ":\n");

        for (Produtos produto : listaProdutos) {
            produtosString.append("Nome: ").append(produto.getNomeProduto()).append("\n");
            produtosString.append("Tipo: ").append(produto.getTipoProduto()).append("\n");
            produtosString.append("Tamanho: ").append(produto.getTamanhoProduto()).append("\n");
            produtosString.append("Cor: ").append(produto.getCorProduto()).append("\n");
            produtosString.append("--------------------\n");
        }

        return produtosString.toString();
    }


    }







