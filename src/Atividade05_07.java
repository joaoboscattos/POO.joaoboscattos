public class Atividade05_07 {
    public static void main(String[] args) {
        Produto produto = new Produto(1, "Camiseta", 50.0, 100);
        produto.exibirInfo();
        produto.adicionarEstoque(50);
        produto.removerEstoque(30);

        System.out.println("\nQuantidade em Estoque Atualizada:");
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());
    }
}

class Produto {
    private int codigo;
    private String descricao;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(int codigo, String descricao, double preco, int quantidadeEmEstoque) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Método para adicionar ao estoque
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEmEstoque += quantidade;
            System.out.println("Adicionado " + quantidade + " unidades ao estoque.");
        } else {
            System.out.println("Quantidade inválida para adicionar ao estoque.");
        }
    }

    // Método para remover do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidadeEmEstoque) {
            this.quantidadeEmEstoque -= quantidade;
            System.out.println("Removido " + quantidade + " unidades do estoque.");
        } else {
            System.out.println("Quantidade insuficiente em estoque ou valor inválido.");
        }
    }

    // Método para exibir informações do produto
    public void exibirInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em Estoque: " + quantidadeEmEstoque);
    }
}
