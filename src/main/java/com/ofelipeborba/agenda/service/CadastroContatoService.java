package com.ofelipeborba.agenda.service;

import com.ofelipeborba.agenda.entity.ContatoEntity;
import com.ofelipeborba.agenda.repository.ContatoRepository;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//    ->é possível fazer o logging por meio de um obj da classe Logger ou do bean @Slf4j
//@Slf4j
@Service
public class CadastroContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    private static final Logger logger = LoggerFactory.getLogger(CadastroContatoService.class);

    //Crio um metodo padrão do tipo ContatoEntity que salva (usado para Post)
    public ContatoEntity salvar(ContatoEntity contato){
        logger.info("Foi realizado um POST usando o método salvar:"+contato);
        return contatoRepository.save(contato);

    }

    public void deleteById (Long idContato){
        contatoRepository.deleteById(idContato);
        logger.info("Foi realizado um DELETE usando o método deleteById:"+idContato);
    }

    public List<ContatoEntity> buscarTodos(){
        logger.info("Foi realizado um GET usando o método buscarTodos");
        logger.info("{\"message\" : \"Foi realizado um GET usando o método buscarTodos\"}");
        List<ContatoEntity> todosContatos = contatoRepository.findAll();
        return todosContatos;
    }

    public ContatoEntity buscarPorId(@PathVariable Long id){
        logger.info("Foi realizado um GET usando o método buscarPorId:"+id);
        return contatoRepository.findById(id).get();
    }

}
