package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucas@gmail.com");
        usuario.setTelefono("213456554");
        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios =new ArrayList<>();
        Usuario usuario=new Usuario();
        usuario.setId(212L);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucas@gmail.com");
        usuario.setTelefono("213456554");

        Usuario usuario2=new Usuario();
        usuario2.setId(154L);
        usuario2.setNombre("Maria");
        usuario2.setApellido("Gonzales");
        usuario2.setEmail("maria.gon@gmail.com");
        usuario2.setTelefono("123533566");

        Usuario usuario3=new Usuario();
        usuario3.setId(11L);
        usuario3.setNombre("Gabriel");
        usuario3.setApellido("Aliaa");
        usuario3.setEmail("aliaga124@gmail.com");
        usuario3.setTelefono("5545666332");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

    /*@RequestMapping(value = "usuario")
    public Usuario Editar(@PathVariable Long id){
        Usuario usuario=new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucas@gmail.com");
        usuario.setTelefono("213456554");
        return usuario;
    }*/

}
