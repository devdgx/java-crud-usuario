package application;

import controller.UsuarioController;
import repository.UsuarioRepository;
import service.UsuarioService;

public class Main {
    public static void main(String[] args) {
        UsuarioRepository usuarioRepository = new UsuarioRepository();
        UsuarioService usuarioService = new UsuarioService(usuarioRepository);
        UsuarioController usuarioController = new UsuarioController(usuarioService);


        usuarioController.inicarPainelDeMenu();
    }
}
