package controller;

import service.UsuarioService;

import java.util.Scanner;

public class UsuarioController {
    private UsuarioService usuarioService;

    Scanner scanner = new Scanner(System.in);

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void inicarPainelDeMenu() {
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("---MENU---");

            System.out.println("1- adicionar Usuario");
            System.out.println("2- Listar Usuario");
            System.out.println("3- Remover Usuarios");
            System.out.println("4- Atualizar Dados Usuario");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    usuarioService.adicionarUsuario();
                    break;

                case 2:
                    usuarioService.listarUsuario();
                    break;
                case 3:
                    usuarioService.removerUsuario();
                    break;

                case 4:
                    usuarioService.atualizarDadosUsuario();
                    break;

            }
        }
    }
}
