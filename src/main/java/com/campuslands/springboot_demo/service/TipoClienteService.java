package com.campuslands.springboot_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.springboot_demo.model.TipoCliente;
import com.campuslands.springboot_demo.repository.TipoClienteRepository;

@Service
public class TipoClienteService {

    @Autowired
    private TipoClienteRepository repository;

    public List<TipoCliente> findAll() {
        return repository.findAll();
    }

    public Optional<TipoCliente> findById(Long id) {
        return repository.findById(id);
    }

    public TipoCliente save(TipoCliente tipoCliente) {
        return repository.save(tipoCliente);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}