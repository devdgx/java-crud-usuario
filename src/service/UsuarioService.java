package service;

import controller.UsuarioController;
import model.Usuario;
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


        System.out.println(usuarioRepository.listarUsuarios());
    }

    public void removerUsuario(){
        System.out.print("Nome do Usuario: ");
        String nome = scanner.nextLine();
        usuarioRepository.removerUsuario(nome);
    }

    //

    public void atualizarDadosUsuario(){

        System.out.println("Nome do Email: ");
        String email = scanner.nextLine();

        Usuario usuario = usuarioRepository.BuscarPorEmail(email);

                int opcao = -1;
                do {
                    System.out.println("--MENU DE ATUALIZAÇÂO");
                    System.out.println("1- Atualizar Nome");
                    System.out.println("2- Atualizar E-mail");
                    System.out.println("3- Atualizar Idade");
                    System.out.println("0- Sair");

                    opcao = scanner.nextInt();
                    scanner.nextLine();


                    switch (opcao){

                        case 1:
                            System.out.print("Novo Nome: ");
                            String novoNomeDoUsuario = scanner.nextLine();
                            usuario.setNome(novoNomeDoUsuario);
                            break;
                        case 2:
                            System.out.print("Novo E-mail: ");
                            String novoEmailDoUsuario = scanner.nextLine();
                            usuario.setEmail(novoEmailDoUsuario);
                            break;

                        case 3:
                            System.out.print("Nova Idade: ");
                            int novaIdadeUsuario = scanner.nextInt();
                            scanner.nextLine();
                            usuario.setIdade(novaIdadeUsuario);
                            break;

                        case 0:
                            System.out.println("Saindo...");
                            break;

                        default:
                            System.out.println("Digite numero valido");

                    }



                }while (opcao!=0);
    }


}
