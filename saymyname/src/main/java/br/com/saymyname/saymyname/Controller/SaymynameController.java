package br.com.saymyname.saymyname.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

@Controller 
public class SaymynameController {
    @GetMapping("/nome")
    public String getMethodName(){
        return "home";
    }
    @PostMapping("/enviarnome")
    public String postEnviar(@RequestParam("nome") String name,
                            Model model) {
        model.addAttribute("resultado", name);
        return "home";            
        }    
}
