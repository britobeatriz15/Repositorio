package com.sp.senac.br.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
    public class IndexController{

    @GetMapping("/")
    public String paginaInicial(){
            return "index";
        }

    @GetMapping("/sobre")
    public String  paginaSobre(){
            return "sobre";
    }
    @GetMapping("/tabela_periodica")
    public String tabelaPeriodica(){
        return "tabela_periodica";
    }
    }

