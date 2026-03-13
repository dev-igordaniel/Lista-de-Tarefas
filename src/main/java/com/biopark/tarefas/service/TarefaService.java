package com.biopark.tarefas.service;

import com.biopark.tarefas.model.Tarefa;
import com.biopark.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa salvar(Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarPendentes() {
        List<Tarefa> pendentes = new ArrayList<>();
        for (Tarefa tarefa : tarefaRepository.findAll()) {
            if (tarefa.getConcluida() == false) {
                pendentes.add(tarefa);
            }
        }
        return pendentes;
    }

    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    public List<Tarefa> listarConcluidas() {
        List<Tarefa> concluidas = new ArrayList<>();
        for (Tarefa tarefa : tarefaRepository.findAll()) {
            if (tarefa.getConcluida() == true) {
                concluidas.add(tarefa);
            }
        }
        return concluidas;
    }

    public Optional<Tarefa> buscarPorId(Long id) {
        return tarefaRepository.findById(id);
    }

    public void excluir(Long id) {
        tarefaRepository.deleteById(id);
    }

    public void alterarStatus(Long id) {
        tarefaRepository.findById(id).ifPresent(tarefa -> {
            tarefa.setConcluida(!tarefa.getConcluida());
            tarefaRepository.save(tarefa);
        });
    }
}
