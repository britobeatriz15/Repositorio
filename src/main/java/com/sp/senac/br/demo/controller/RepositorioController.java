package com.sp.senac.br.demo.controller;

import com.sp.senac.br.demo.dao.RepositorioDAO;
import com.sp.senac.br.demo.model.RepositorioEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class RepositorioController {

    @Autowired
    private RepositorioDAO dao;
    private Object repositorios;

    @PostMapping("/salvarRepositorio")
    public String salvarRepositorio(@ModelAttribute RepositorioEntity repositorio) {
        dao.save(repositorio);
        return "cadastro_repositorio";
    }

    @GetMapping("/cadastrar_repositorio")
    public ModelAndView paginaCadastroRepositorio(RepositorioEntity repositorio) {
        ModelAndView mv = new ModelAndView("cadastro_repositorio");
        mv.addObject("repositorio", repositorio);
        return mv;
    }

    @GetMapping("/repositorios")
    public ModelAndView paginaRepositorio(){
        List<RepositorioEntity> repositorios = dao.findAll();

        ModelAndView mv = new ModelAndView("repositorios");
        mv.addObject("repositorios", repositorios);
        return mv;
    }

    @GetMapping("/excluir")
    public String excluir(@PathVariable Integer id){

        dao.deleteById(id);

        return "repositorios";

    }
}
