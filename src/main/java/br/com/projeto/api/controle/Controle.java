package br.com.projeto.api.controle;

import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.modelo.Cliente;
import br.com.projeto.api.repositorio.Repositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
@RequestMapping("/api")
public class Controle {

    @Autowired
    private Repositorio acao;

    @PostMapping("/cadastrar")
    public ResponseEntity<Object> cadastrar(@RequestBody Cliente cliente){
        acao.save(cliente);
        return ResponseEntity.ok(cliente);
    }

    @GetMapping("/")
    public Iterable<Cliente> selecionar(){
        return acao.findAll();
    }

    @PutMapping("/editar")
    public ResponseEntity<Object> editar(@RequestBody Cliente cliente) {
       acao.save(cliente);
       return ResponseEntity.ok(cliente);
    } 
    

    @DeleteMapping("/{codigo}")
    public void deletar(@PathVariable Long codigo){
        acao.deleteById(codigo);
    }
}
