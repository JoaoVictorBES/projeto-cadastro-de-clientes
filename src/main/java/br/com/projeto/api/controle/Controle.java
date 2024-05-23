package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Controle {

    @GetMapping("/")
    public String teste(){
        return "Hello World!";
    }

}
