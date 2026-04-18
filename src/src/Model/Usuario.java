package Model;

public class Usuario {

    private long id;
    private String nome;
    private String telefone;

    public Usuario(String nome, String telefone, long id) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("O nome do cliente não pode ser vazio.");
        }
        this.nome = nome;
        this.telefone = telefone;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public long getId() {
        return id;
    }
}