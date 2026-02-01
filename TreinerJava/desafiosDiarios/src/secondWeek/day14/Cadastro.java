package secondWeek.day14;

import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Pessoa> pessoas;

    public Cadastro() {
        pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
        System.out.println("Pessoa adicionada com sucesso!");
    }

    public void listarPessoas() {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
            return;
        } else {
            for (Pessoa p : pessoas) {
                System.out.println(p);
            }
        }
    }


    public void buscarPorNome(String nome) {
        boolean encontrado = false;
        for (Pessoa p : pessoas) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Encontrado: " + p);
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("Nenhuma pessoa com o nome \"" + nome + "\" foi encontrada.");
        }
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }
}

