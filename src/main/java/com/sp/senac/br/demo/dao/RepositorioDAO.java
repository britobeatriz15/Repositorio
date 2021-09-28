package com.sp.senac.br.demo.dao;

import com.sp.senac.br.demo.model.RepositorioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

  public interface RepositorioDAO extends JpaRepository<RepositorioEntity, Integer>{

    }

