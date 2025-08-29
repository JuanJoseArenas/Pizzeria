package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String getCategory(){
        return "Nunca pares de Aprender";

    }

    @PostMapping
    public String crearMensaje(@RequestBody String mensaje) {
        return "Mensaje recibido: " + mensaje;
    }

}
