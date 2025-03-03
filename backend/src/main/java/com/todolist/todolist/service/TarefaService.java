package com.todolist.todolist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todolist.todolist.model.TarefaModel;
import com.todolist.todolist.repository.TarefaRepository;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
      this.tarefaRepository = tarefaRepository;
    }

    public List<TarefaModel> listarTarefas(){
        return tarefaRepository.findAll();
    }

    public TarefaModel salvarTarefa(TarefaModel tarefa){
        return tarefaRepository.save(tarefa);
    }

    public void removerTarefa(Long id){
        tarefaRepository.deleteById(id);
    }
}

