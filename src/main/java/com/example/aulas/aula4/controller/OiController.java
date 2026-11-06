package com.example.aulas.aula4.controller;


import com.example.aulas.aula4.model.Mensagem;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aula4")
public class OiController {

    @GetMapping("/ola")
    public String ola() {
        return "Olá, Elas Tech";
    }

    @GetMapping("/mensagem")
    public Mensagem mensagem() {
        return new Mensagem("Bem vindas ao Spring!", "Bea");
    }

    @GetMapping("/ola/{nome}")
    public String olaPorNome(@PathVariable String nome) {
        return "Olá " + nome + "!";
    }

    @GetMapping("/saudacao")
    public String saudacao(@RequestParam(defaultValue = "visitante") String nome) {
        return "Seja bem-vinda, " + nome + "!";
    }

}
