package com.platzi.market.web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    @GetMapping("/hola")
    public String saludar(){
        return "Nunca pares de aprender";
    }

    @PostMapping
    public String crearMensaje(@RequestBody String mensaje) {
        return "Mensaje recibido: " + mensaje;
    }

}
