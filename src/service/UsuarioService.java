package service;

import controller.UsuarioController;
import repository.UsuarioRepository;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class UsuarioService {

    private UsuarioRepository usuarioRepository;
    Scanner scanner = new Scanner(System.in);

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public void adicionarUsuario(){
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        usuarioRepository.adicionarNovoUsuario(nome,email,idade);

    }

    public void listarUsuario(){
        usuarioRepository.listarUsuarios();
    }

    public void removerUsuario(){
        System.out.print("Nome do Usuario: ");
        String nome = scanner.nextLine();
        usuarioRepository.removerUsuario(nome);
    }

    //

    public void atualizarDadosUsuario(){
        usuarioRepository.atualizarDadosUsuario();
    }


}
