package repository;

import model.Usuario;

import java.util.LinkedList;
import java.util.List;

public class UsuarioRepository {
    private List<Usuario> usuariosList;


    public UsuarioRepository() {
        this.usuariosList = new LinkedList<>();
    }

    public void adicionarNovoUsuario(String nome, String email, int idade) {
        Usuario usuario = new Usuario(nome, idade, email);
        usuariosList.add(usuario);
        System.out.println("Usuario Criado Com Sucesso!");
    }

    public List<Usuario> listarUsuarios() {
        return usuariosList;
    }

    public void removerUsuario(String nome) {
        usuariosList.removeIf(usuario -> usuario.getNome().equalsIgnoreCase(nome));


    }

    public Usuario BuscarPorEmail(String nome) {
        for (Usuario usuario : usuariosList) {
            if (usuario.getEmail().equalsIgnoreCase(nome)) {
                return usuario;
            }

        }return null;
    }


    }









