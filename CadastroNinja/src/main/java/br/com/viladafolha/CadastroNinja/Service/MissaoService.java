package br.com.viladafolha.CadastroNinja.Service;

import br.com.viladafolha.CadastroNinja.Entity.MissaoEntity;
import br.com.viladafolha.CadastroNinja.Repository.MissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
<<<<<<< HEAD

public class MissaoService {
    @Autowired
    private MissaoRepository missaoRepository;

    //CADASTRAR
    public MissaoEntity cadastrar(MissaoEntity missao){
        return missaoRepository.saveAndFlush(missao);
    }


    //LISTAR
    public List<MissaoEntity> listar(){
        return missaoRepository.findAll();
    }


    //PESQUISAR
    public Optional<MissaoEntity> pesquisar(Long name){
        return Optional.ofNullable(missaoRepository.findById(name)
                .orElseThrow( () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Missão não encontrada")));
    }

    //DELETAR
    public HashMap<String, Object> deleteCliente(Long id) {
        Optional<MissaoEntity> missao =
                Optional.ofNullable(missaoRepository.findById(id).
                        orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                                "Missão não encontrada!")));

=======
public class MissaoService {

    @Autowired
    private MissaoRepository missaoRepository;
    /* # CADASTRAR # */
    public MissaoEntity cadastrarMissao(MissaoEntity missao){
        return missaoRepository.saveAndFlush(missao);
    }

    /* # LISTAR # */
    public List<MissaoEntity> listarMissao(){
        return missaoRepository.findAll();
    }

    /* # PESQUISAR # */
    public List<MissaoEntity> pesquisarMissao(String nome) {
        List<MissaoEntity> todas = missaoRepository.findAll();
        List<MissaoEntity> filtradas = todas.stream()
                .filter(m -> m.getNome() != null && m.getNome().toLowerCase().contains(nome.toLowerCase()))
                .toList();
        if (filtradas.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Nenhuma missão encontrada com esse nome.");
        }
        return filtradas;
    }

    /* # DELETAR # */
    public HashMap<String, Object> deletarMissao(Long id){
        Optional<MissaoEntity> missao =
                Optional.ofNullable(missaoRepository.findById(id)
                        .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Missão não encontrada!")));
>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8
        missaoRepository.delete(missao.get());
        HashMap<String, Object> resultado = new HashMap<String, Object>();
        resultado.put("resultado", "Missão: " + missao.get().getNome() + " excluída com sucesso!");
        return resultado;
    }

<<<<<<< HEAD

    //ALTERAR
    public HashMap<String, Object> alterar(Long id, MissaoEntity missaoAlterado){
        MissaoEntity missaoId = missaoRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Missão não encontrada, não é possível alterar."));
        missaoAlterado.setId(id);
        missaoRepository.saveAndFlush(missaoAlterado);
        HashMap<String, Object> resultado = new HashMap<>();
        resultado.put("resultado", "Missão: " + missaoAlterado.getNome() + " atualizada com sucesso!");
=======
    /* # ALTERAR # */
    public HashMap<String, Object> alterarMissao(Long id, MissaoEntity missaoAlterada){
        MissaoEntity missaoId = missaoRepository.findById(id)
                .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Ninja não encontrado, não é possível alterar."));
        missaoAlterada.setId(id);
        missaoRepository.saveAndFlush(missaoAlterada);
        HashMap<String, Object> resultado = new HashMap<>();
        resultado.put("resultado", "Missão: " + missaoAlterada.getNome() + " atualizada com sucesso!");
>>>>>>> ad23d0235b774d0f7657a2262f0f44e67b01e3e8
        return resultado;
    }

}
