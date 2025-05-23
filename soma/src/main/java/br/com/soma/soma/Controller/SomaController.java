package br.com.soma.soma.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SomaController {
    @GetMapping("/soma")
    public String getSoma(){
        return "index";
    }
    @PostMapping("/somar")
    public String somar(@RequestParam("n1") int numero1,
                        @RequestParam("n2") int numero2,
                        Model model   ) {
        int resultado;

        resultado = numero1 + numero2;
        model.addAttribute("resultadosoma", resultado);

        return "resultado";
    }
}
