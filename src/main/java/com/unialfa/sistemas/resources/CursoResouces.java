package com.unialfa.sistemas.resources;


import com.unialfa.sistemas.models.CursoModel;
import com.unialfa.sistemas.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;




@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")

public class CursoResouces {



    @Autowired
    CursoRepository cursoRepository;


    @GetMapping("/cursos")
    public List<CursoModel> listaProdutos() {
        return cursoRepository.findAll();
    }


    @GetMapping("/curso/{id}")
    public CursoModel listaProdutoUnico(@PathVariable(value = "id") long id) {
        return cursoRepository.findById(id);
    }


    @PostMapping("/curso")
    public CursoModel salvaProduto(@RequestBody @Valid CursoModel cursoModel) {
        return cursoRepository.save(cursoModel);
    }


    @DeleteMapping("/curso")
    public void deletaProduto(@RequestBody @Valid CursoModel cursoModel) {
        cursoRepository.delete(cursoModel);
    }


    @PutMapping("/curso")
    public CursoModel atualizaProduto(@RequestBody @Valid CursoModel cursoModel) {
        return cursoRepository.save(cursoModel);
    }

















}
