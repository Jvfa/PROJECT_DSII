package main.java.br.com.saymyname.saymyname.Controller;

import javax.management.modelmbean.ModelMBean;

@Controller 
public class SaymynameController {
    @GetMapping("/nome")
    public String getMethodName(){
        return "home";
    }
    @PostMapping("/enviarnome")
    public String postEnviar(@ReqeustParam("nome") String name,
                            Model model) {
        model.addAttribute(attributeName:"resultado", name);
        return "home";            
        }    
}
