package service;

import controller.UsuarioController;
import repository.UsuarioRepository;

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

        usuarioRepository.adicionarNovoUsuario(nome,email,idade);

    }


}
