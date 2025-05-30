package br.com.viladafolha.CadastroNinja.Controller;


import br.com.viladafolha.CadastroNinja.Entity.NinjaEntity;
import br.com.viladafolha.CadastroNinja.Service.NinjaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/ninja")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String ninjaBoasVindas(){
        return "Ola voce acessou o sistema de cadastro de ninjas";
    }


    //Cadastrar
    @PostMapping("/cadastrar")
    public NinjaEntity cadastrar(@RequestBody NinjaEntity ninja){
        return ninjaService.cadastrar(ninja);
    }

}

