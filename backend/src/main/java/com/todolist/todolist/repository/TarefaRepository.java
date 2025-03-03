package com.todolist.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.todolist.todolist.model.TarefaModel;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaModel, Long> {
    
}
