package controller;

import service.UsuarioService;

import java.util.Scanner;

public class UsuarioController {
    private UsuarioService usuarioService;

    Scanner scanner = new Scanner(System.in);

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    public void inicarPainelDeMenu(){
        int opcao = -1;

        while (opcao != 0){
            System.out.println("---MENU---");

            System.out.println("1- adicionar Usuario");
            System.out.println("2- Remover Usuario");
            System.out.println("2- Listar Usuarios");
            System.out.println("2- Buscar por ID Usuario");


        }
    }
}
