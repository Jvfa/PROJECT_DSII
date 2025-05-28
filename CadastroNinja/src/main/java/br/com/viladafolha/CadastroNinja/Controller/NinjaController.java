package br.com.viladafolha.CadastroNinja.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/ninja")
public class NinjaController {
    @GetMapping("/boasvindas")
    public String ninjaBoasVindas(){
        return "Ola voce acessou o sistema de cadastro de ninjas";
    }
}