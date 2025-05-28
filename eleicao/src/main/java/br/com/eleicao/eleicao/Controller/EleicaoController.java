package br.com.eleicao.eleicao.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EleicaoController {
    @GetMapping("/voto")
    public String getSoma(){
        return "index";
    }

    @PostMapping("/validar")
    public String validarSituacao(@RequestParam("name") String nome,
                                    @RequestParam("age") String idade,
                                    Model model) {
    
    String resultado;
    if(idade >=16 && idade < 18){
        resultado="Votação Facultativa";
    } else if(idade >= 18 && idade < 70){
        resultado="Votação Obrigatoria";
    }else if(idade >= 70){
        resultado="Votação Opcional para idosos";
    }
    model.addAllAttributes("resultado", resultado);
    return "index";

                                    }
}
