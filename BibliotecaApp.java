import java.util.*;

/** Representa um livro */
record Livro(String titulo, String autor, int paginas, int ano) {}

class Biblioteca {
    private final List<Livro> livros = new ArrayList<>();

    public void adicionar(Livro l) { livros.add(l); }

    /** Bubble Sort por número de páginas */
    public void ordenarPorPaginas() {
        for (int i = 0; i < livros.size() - 1; i++) {
            for (int j = 0; j < livros.size() - i - 1; j++) {
                if (livros.get(j).paginas() > livros.get(j + 1).paginas()) {
                    // troca manual
                    Livro tmp = livros.get(j);
                    livros.set(j, livros.get(j + 1));
                    livros.set(j + 1, tmp);
                }
            }
        }
    }

    /** Divide em faixas: Pequenos , Médios , Grandes, Gigantes  */
    public Map<String,List<Livro>> classificarPorFaixa() {
        Map<String,List<Livro>> mapa = new LinkedHashMap<>();
        mapa.put("Pequenos", new ArrayList<>());
        mapa.put("Médios",   new ArrayList<>());
        mapa.put("Grandes",  new ArrayList<>());
        mapa.put("Gigantes", new ArrayList<>());

        for (var l : livros) {
            if (l.paginas() <= 100)      mapa.get("Pequenos").add(l);
            else if (l.paginas() <= 300) mapa.get("Médios").add(l);
            else if (l.paginas() <= 600) mapa.get("Grandes").add(l);
            else                         mapa.get("Gigantes").add(l);
        }
        return mapa;
    }

    public List<Livro> buscarPorTitulo(String termo) {
        var lower = termo.toLowerCase();
        List<Livro> res = new ArrayList<>();
        for (var l : livros) if (l.titulo().toLowerCase().contains(lower)) res.add(l);
        return res;
    }

    public List<Livro> buscarPorAutor(String termo) {
        var lower = termo.toLowerCase();
        List<Livro> res = new ArrayList<>();
        for (var l : livros) if (l.autor().toLowerCase().contains(lower)) res.add(l);
        return res;
    }

    public List<Livro> todos() { return livros; }
}

public class BibliotecaApp {
    public static void main(String[] args) {
        var b = new Biblioteca();

      
        b.adicionar(new Livro("O Nome da Rosa", "Umberto Eco", 512, 1980));
        b.adicionar(new Livro("O Corvo", "Edgar Allan Poe", 15, 1845));
        b.adicionar(new Livro("Refactoring", "Martin Fowler", 448, 1999));
        b.adicionar(new Livro("20 Mil Léguas Submarinas", "Jules Verne", 656, 1870));
        b.adicionar(new Livro("Um Estudo em Vermelho", "Arthur Conan Doyle", 188, 1887));
        b.adicionar(new Livro("Introdução ao Git", "Scott Chacon", 12, 2009));
        b.adicionar(new Livro("As Aventuras de Sherlock Holmes", "Arthur Conan Doyle", 307, 1892));
        b.adicionar(new Livro("Design Patterns", "Erich Gamma", 395, 1994));
        b.adicionar(new Livro("O Caso do Roubo da Joia", "Agatha Christie", 48, 1924));
        b.adicionar(new Livro("A Lógica do Algoritmo", "Material Acadêmico", 8, 2015));
        b.adicionar(new Livro("Snow Crash", "Neal Stephenson", 440, 1992));
        b.adicionar(new Livro("Domain-Driven Design", "Eric Evans", 560, 2003));
        b.adicionar(new Livro("Sherlock Holmes: O Signo dos Quatro", "Arthur Conan Doyle", 160, 1890));
        b.adicionar(new Livro("Clean Architecture", "Robert C. Martin", 432, 2017));
        b.adicionar(new Livro("O Alienista", "Machado de Assis", 112, 1882));
        b.adicionar(new Livro("O Gato Preto", "Edgar Allan Poe", 10, 1843));
        b.adicionar(new Livro("A Noite das Bruxas", "Agatha Christie", 156, 1969));
        b.adicionar(new Livro("Um Corpo na Biblioteca", "Agatha Christie", 192, 1942));
        b.adicionar(new Livro("Cemitério Maldito", "Stephen King", 424, 1983));
        b.adicionar(new Livro("Computer Networks", "Andrew S. Tanenbaum", 960, 1981));
        b.adicionar(new Livro("Neuromancer", "William Gibson", 271, 1984));
        b.adicionar(new Livro("Engenharia de Software", "Ian Sommerville", 832, 2011));
        b.adicionar(new Livro("The Pragmatic Programmer", "Andrew Hunt", 352, 1999));
        b.adicionar(new Livro("A Ilha Misteriosa", "Jules Verne", 650, 1874));
        b.adicionar(new Livro("Padrões de Código Simples", "Fowler & Beck", 180, 2012));
        b.adicionar(new Livro("Umberto Eco", "Donna Tartt", 629, 1992));
        b.adicionar(new Livro("A Carta Roubada", "Edgar Allan Poe", 12, 1844));
        b.adicionar(new Livro("Solaris", "Stanislaw Lem", 204, 1961));
        b.adicionar(new Livro("O Coração Delator", "Edgar Allan Poe", 14, 1843));
        b.adicionar(new Livro("A Garota no Trem", "Paula Hawkins", 378, 2015));
        b.adicionar(new Livro("The Mythical Man-Month", "Fred Brooks", 322, 1975));
        b.adicionar(new Livro("Depois do Funeral", "Agatha Christie", 272, 1953));
        b.adicionar(new Livro("A História Secreta", "Donna Tartt", 629, 1992));
        b.adicionar(new Livro("Cryptonomicon", "Neal Stephenson", 918, 1999));
        b.adicionar(new Livro("O Homem Invisível", "H. G. Wells", 192, 1897));
        b.adicionar(new Livro("Assassinato no Expresso do Oriente", "Agatha Christie", 256, 1934));
        b.adicionar(new Livro("It - A Coisa", "Stephen King", 1104, 1986));
        b.adicionar(new Livro("Clean Code Principles (cheat sheet)", "Robert Martin", 9, 2008));
        b.adicionar(new Livro("Os Crimes ABC", "Agatha Christie", 288, 1936));
        b.adicionar(new Livro("Misery", "Stephen King", 368, 1987));
        b.adicionar(new Livro("Garota Exemplar", "Gillian Flynn", 422, 2012));
        b.adicionar(new Livro("Sherlock Holmes: O Cão dos Baskerville", "Arthur Conan Doyle", 256, 1902));
        b.adicionar(new Livro("Um Estudo em Vermelho", "Arthur Conan Doyle", 188, 1887));
        b.adicionar(new Livro("O Fantasma da Ópera", "Gaston Leroux", 324, 1910));
        b.adicionar(new Livro("The Mythical Man-Month", "Fred Brooks", 322, 1975));
        b.adicionar(new Livro("Effective Java", "Joshua Bloch", 416, 2001));
        b.adicionar(new Livro("O Segredo do Bosque Velho", "Dino Buzzati", 180, 1935));
        b.adicionar(new Livro("Caixa de Pássaros", "Josh Malerman", 272, 2014));
        b.adicionar(new Livro("Introdução ao Java", "James Gosling", 140, 1995));
        b.adicionar(new Livro("O Vale do Medo", "Arthur Conan Doyle", 320, 1915));
        b.adicionar(new Livro("Unix Philosophy (resumo)", "Mike Gancarz", 14, 1994));
        b.adicionar(new Livro("Artificial Intelligence: A Modern Approach", "Russell & Norvig", 1152, 1995));
        b.adicionar(new Livro("The Pragmatic Programmer", "Andrew Hunt", 352, 1999));
        b.adicionar(new Livro("Domain-Driven Design", "Eric Evans", 560, 2003));
        b.adicionar(new Livro("Rebecca", "Daphne du Maurier", 449, 1938));
        b.adicionar(new Livro("O Chamado de Cthulhu (conto)", "H. P. Lovecraft", 13, 1928));
        b.adicionar(new Livro("Head First Design Patterns", "Eric Freeman", 694, 2004));
        b.adicionar(new Livro("O Silêncio dos Inocentes", "Thomas Harris", 367, 1988));
        b.adicionar(new Livro("Microservices Quick Guide", "Sam Newman", 110, 2016));
        b.adicionar(new Livro("Patterns of Enterprise Application Architecture", "Martin Fowler", 560, 2002));
        b.adicionar(new Livro("O Médico e o Monstro", "R. L. Stevenson", 96, 1886));
        b.adicionar(new Livro("Code Complete", "Steve McConnell", 960, 1993));
        b.adicionar(new Livro("Introdução ao Python (Mini Guia)", "Guido van Rossum", 120, 2010));
        b.adicionar(new Livro("Compilers: Principles, Techniques, and Tools", "Aho, Lam, Sethi, Ullman", 1000, 1986));
        b.adicionar(new Livro("A Máquina do Tempo", "H. G. Wells", 118, 1895));
        b.adicionar(new Livro("Morte no Nilo", "Agatha Christie", 288, 1937));
        b.adicionar(new Livro("O Código Da Vinci", "Dan Brown", 480, 2003));
        b.adicionar(new Livro("Viagem ao Centro da Terra", "Jules Verne", 183, 1864));
        b.adicionar(new Livro("10 Princípios de Arquitetura Limpa", "Robert C. Martin", 90, 2018));
        b.adicionar(new Livro("The Pragmatic Programmer", "Andrew Hunt", 352, 1999));
        b.adicionar(new Livro("Algorithms", "Robert Sedgewick", 976, 1983));
        b.adicionar(new Livro("A Ilha do Tesouro", "Robert Louis Stevenson", 180, 1883));
        b.adicionar(new Livro("The Pragmatic Programmer", "Andrew Hunt", 352, 1999));
        b.adicionar(new Livro("Os Homens que Não Amavam as Mulheres", "Stieg Larsson", 465, 2005));
        b.adicionar(new Livro("A Paciente Silenciosa", "Alex Michaelides", 336, 2019));
        b.adicionar(new Livro("Drácula", "Bram Stoker", 418, 1897));
        b.adicionar(new Livro("Modern Operating Systems", "Andrew S. Tanenbaum", 1136, 1992));
        b.adicionar(new Livro("O Iluminado", "Stephen King", 447, 1977));
        b.adicionar(new Livro("Introdução ao Algoritmos", "Cormen, Leiserson, Rivest, Stein", 1312, 1990));
        b.adicionar(new Livro("O Mistério dos Sete Relógios", "Agatha Christie", 318, 1929));
        b.adicionar(new Livro("O Colecionador", "John Fowles", 283, 1963));
        b.adicionar(new Livro("A Carta Roubada", "Edgar Allan Poe", 12, 1844));
        b.adicionar(new Livro("Clean Architecture", "Robert C. Martin", 432, 2017));
        b.adicionar(new Livro("O Signo dos Quatro (trecho resumido)", "Arthur Conan Doyle", 11, 1890));

		// 1) Ordenar por páginas
        b.ordenarPorPaginas();
        System.out.println("=== Lista Ordenada por páginas ===");
        b.todos().forEach(System.out::println);

        // 2) Classificar por faixa
        var faixas = b.classificarPorFaixa();
        System.out.println("\n=== Livros por faixa de páginas ===");
        faixas.forEach((nome, lista) -> {
            System.out.println("\n-- " + nome + " --");
            lista.forEach(System.out::println);
        });

        // 3) Exemplo de buscas
        System.out.println("\nBusca por autor 'Agatha':");
        b.buscarPorAutor("Agatha").forEach(System.out::println);

        System.out.println("\nBusca por título contendo 'code':");
        b.buscarPorTitulo("code").forEach(System.out::println);
    }
}