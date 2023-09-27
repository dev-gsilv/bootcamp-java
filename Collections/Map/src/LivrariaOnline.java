import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrariaMap;

    public LivrariaOnline() {
        this.livrariaMap = new HashMap<>();
    }

    public void adicionarLivro(String url, String titulo, String autor, double preco){
        livrariaMap.put(url, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        String url = "";
        if (!livrariaMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                    url = entry.getKey();
                }
            }
        }
        livrariaMap.remove(url);
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> livrosOrdenadosListMap = new ArrayList<>(livrariaMap.entrySet());
        Collections.sort(livrosOrdenadosListMap, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosLinkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : livrosOrdenadosListMap) {
            livrosOrdenadosLinkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return livrosOrdenadosLinkedHashMap;
    }

    public void pesquisarLivrosPorAutor(String autor){
        Map<String, Livro> livrosPorAutor = new HashMap<>();
        if (!livrariaMap.isEmpty()){
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.put(entry.getKey(), entry.getValue());
                }
            }
            System.out.println("Livros do autor "+autor+":\n"+livrosPorAutor);
        }
    }

    public void obterLivroMaisCaro(){
        // Objeto para guardar o(s) livro(s) mais caro(s), se acaso houver 2+ livros com o mesmo maior preço.
        Map<String, Livro> livrosMaisCaros = new HashMap<>();
        // Inicializa com o menor valor possível para um double.
        double maiorPreco = Double.MIN_VALUE;
        if (!livrariaMap.isEmpty()){
            // Percorre o map dos livros
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                // Para cada livro, compara o preço. Se o preço for maior que o anterior, armazena esse valor.
                if (entry.getValue().getPreco() > maiorPreco){
                    maiorPreco = entry.getValue().getPreco();
                }
            }
            // Percorre o map de livros outra vez, e guarda todos os livros que tenham o maior valor.
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                if(entry.getValue().getPreco() == maiorPreco){
                    livrosMaisCaros.put(entry.getKey(), entry.getValue());
                }
            }
            System.out.println("Livro(s) mais caro(s): "+livrosMaisCaros);
        }
    }
    public void exibirLivroMaisBarato(){
        // Objeto para guardar o(s) livro(s) mais barato(s), se acaso houver 2+ livros com o mesmo menor preço.
        Map<String, Livro> livrosMaisBarato = new HashMap<>();
        // Inicializa com o maior valor possível para um double.
        double menorPreco = Double.MAX_VALUE;
        if (!livrariaMap.isEmpty()){
            // Percorre o map dos livros
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                // Para cada livro, compara o preço. Se o preço for menor que o anterior, armazena esse valor.
                if (entry.getValue().getPreco() < menorPreco){
                    menorPreco = entry.getValue().getPreco();
                }
            }
            // Percorre o map de livros outra vez, e guarda todos os livros que tenham o menor valor.
            for (Map.Entry<String, Livro> entry : livrariaMap.entrySet()){
                if(entry.getValue().getPreco() == menorPreco){
                    livrosMaisBarato.put(entry.getKey(), entry.getValue());
                }
            }
            System.out.println("Livro(s) mais barato(s): "+livrosMaisBarato);
        }
    }


}
