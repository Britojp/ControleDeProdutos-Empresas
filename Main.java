import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String nomeEmpresa;
        String cnpj;
        String telefone;
        String nomeResponsavel;
        String nomeProduto, tipoProduto, corProduto;
        String tamanhoProduto;
        ArrayList<Empresas> listaEmpresas = new ArrayList<Empresas>();
        int input;



        input = JOptionPane.showConfirmDialog(null,
                "Deseja cadastrar uma empresa?", "Cadastro de empresas", JOptionPane.YES_NO_OPTION);

        while (input == 0) {
            nomeEmpresa = JOptionPane.showInputDialog("Entre com o nome da empresa");
            cnpj = JOptionPane.showInputDialog("Insira o CNPJ da " + nomeEmpresa);
            nomeResponsavel = JOptionPane.showInputDialog("Qual o nome do responsável pela empresa?");
            telefone = JOptionPane.showInputDialog("Qual o telefone da empresa " + nomeEmpresa);
            Empresas empresa = new Empresas(nomeEmpresa, telefone, nomeResponsavel, cnpj);

            input = JOptionPane.showConfirmDialog(null,
                    "Deseja cadastrar produtos para a empresa?", "Cadastro de produtos", JOptionPane.YES_NO_OPTION);

            while (input == 0) {
                nomeProduto = JOptionPane.showInputDialog("Qual o nome do produto que deseja cadastrar?");
                tipoProduto = JOptionPane.showInputDialog("Qual o tipo do produto?");
                tamanhoProduto = JOptionPane.showInputDialog("Qual o tamanho do produto?");
                corProduto = JOptionPane.showInputDialog("Qual a cor do produto?");
                Produtos produtoEmpresa = new Produtos(nomeProduto, tipoProduto, tamanhoProduto, corProduto);
                empresa.addProduto(produtoEmpresa);

                input = JOptionPane.showConfirmDialog(null,
                        "Deseja cadastrar mais produtos para a empresa?", "Cadastro de produtos",
                        JOptionPane.YES_NO_OPTION);
            }

            listaEmpresas.add(empresa);

            input = JOptionPane.showConfirmDialog(null,
                    "Deseja cadastrar outra empresa?", "Cadastro de empresas", JOptionPane.YES_NO_OPTION);
        }

        for (Empresas empresa : listaEmpresas) {
            empresa.printarEmpresas();
        }

        JOptionPane.showConfirmDialog(null,
                "Obrigado por usar o app!", "Obrigado!", JOptionPane.DEFAULT_OPTION);
    }


}
