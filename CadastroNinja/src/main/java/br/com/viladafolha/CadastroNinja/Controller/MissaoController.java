package br.com.viladafolha.CadastroNinja.Controller;

import br.com.viladafolha.CadastroNinja.Entity.MissaoEntity;
import br.com.viladafolha.CadastroNinja.Exception.ResponseGenericException;
import br.com.viladafolha.CadastroNinja.Service.MissaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/missao")
<<<<<<< HEAD

=======
>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8
public class MissaoController {
    @Autowired
    private MissaoService missaoService;

<<<<<<< HEAD
    @GetMapping("/missoes")
    public String Missoes(){
        return "Bem vindo ao sistema de missoes da Vila da Folha.";
    }

    //Cadastrar
    @PostMapping("/cadastrar")
    public ResponseEntity<Object> salvar(@Valid @RequestBody MissaoEntity missao){
        MissaoEntity resultado = missaoService.cadastrar(missao);
        return ResponseEntity.ok().body(ResponseGenericException.response(resultado));
    }

    //Listar
    @GetMapping("/listar")
    public List<MissaoEntity> listar(){
        return missaoService.listar();
    }

    //Pesquisar
    @GetMapping("/pesquisar/{id}")
    public ResponseEntity<Object> pesquisarMissao (@PathVariable Long id){
        Optional<MissaoEntity> resultado = missaoService.pesquisar(id);
        return ResponseEntity.ok().body(ResponseGenericException.response(resultado));
    }

    //Delete
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Object> deletar(@PathVariable Long id){
        HashMap<String, Object> resultado = missaoService.deleteCliente(id);
        return  ResponseEntity.ok().body(ResponseGenericException.response(resultado));
    }

    //ALTERAR
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterar(@PathVariable Long id, @RequestBody @Valid MissaoEntity missaoAlterado){
        return ResponseEntity.ok(missaoService.alterar(id,missaoAlterado));
    }
=======
    //ROTA - CADASTRAR
    @PostMapping("/cadastrar")
    public ResponseEntity<Object> salvar(@Valid @RequestBody MissaoEntity missao){
        MissaoEntity resultado = missaoService.cadastrarMissao(missao);
        return ResponseEntity.ok().body(ResponseGenericException.response(resultado));
    }

    //ROTA - LISTAR
    @GetMapping("/listar")
    public List<MissaoEntity> listar(){
        return missaoService.listarMissao();
    }

    //ROTA - PESQUISAR
    @GetMapping("/pesquisar/{nome}")
    public List<MissaoEntity> pesquisarMissao (@PathVariable String nome){
        return missaoService.pesquisarMissao(nome);
    }

    //ROTA - DELETAR
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Object> deletarMissao(@PathVariable Long id){
        HashMap<String, Object> resultado = missaoService.deletarMissao(id);
        return  ResponseEntity.ok().body(ResponseGenericException.response(resultado));
    }

    //ROTA - ALTERAR
    @PutMapping("/alterar/{id}")
    public ResponseEntity<?> alterarMissao(@PathVariable Long id, @RequestBody @Valid MissaoEntity missaoAlterada){
        return ResponseEntity.ok(missaoService.alterarMissao(id,missaoAlterada));
    }




>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8
}
