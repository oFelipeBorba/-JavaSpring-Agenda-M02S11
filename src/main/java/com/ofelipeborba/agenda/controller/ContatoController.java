package com.ofelipeborba.agenda.controller;

import com.ofelipeborba.agenda.entity.ContatoEntity;
import com.ofelipeborba.agenda.service.CadastroContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contato")
public class ContatoController {

    @Autowired
    private CadastroContatoService cadastroContatoService;

    @PostMapping
    public ResponseEntity<ContatoEntity> cadastrar(@RequestBody ContatoEntity contatoEntity){
        ContatoEntity contato = cadastroContatoService.salvar(contatoEntity);
        return new ResponseEntity<ContatoEntity>(
                contato,
                HttpStatus.CREATED
        );
    }
    @GetMapping
    public ResponseEntity<List<ContatoEntity>> buscarTodos(){
        List<ContatoEntity> todosContatos = cadastroContatoService.buscarTodos();
        return new ResponseEntity<List<ContatoEntity>>(todosContatos,HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ContatoEntity> buscarPorId(@PathVariable Long id){
        ContatoEntity contatoEncontrado = cadastroContatoService.buscarPorId(id);
        return new ResponseEntity<ContatoEntity>(contatoEncontrado,HttpStatus.OK);
    }
}
