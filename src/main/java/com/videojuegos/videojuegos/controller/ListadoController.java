package com.videojuegos.videojuegos.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.videojuegos.videojuegos.domain.Videojuego;
import com.videojuegos.videojuegos.service.VideojuegoService;


@Controller
public class ListadoController {
    
    private final VideojuegoService videojuegoService;

    public ListadoController(VideojuegoService videojuegoService) {
        this.videojuegoService = videojuegoService;
    }

    @RequestMapping("/")
    public String ListarVideojuegos (Model model) {
        List<Videojuego> destacados = videojuegoService.buscarDestacados();
        model.addAttribute("videojuegos", destacados);
        //busqueda de  los videojuegos
        return "index";
    }

}
