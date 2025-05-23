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
    if(idade)
                                    }
}
