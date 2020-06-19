package com.paulo.os.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.paulo.os.domain.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
