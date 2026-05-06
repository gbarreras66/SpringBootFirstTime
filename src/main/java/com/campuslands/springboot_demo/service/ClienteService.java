package com.campuslands.springboot_demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.campuslands.springboot_demo.model.Cliente;
import com.campuslands.springboot_demo.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public Optional<Cliente> findById(Long id) {
        return repository.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public List<Cliente> findByNombre(String nombre) {
        return repository.findByNombre(nombre);
    }

    public List<Cliente> findBySaldoGreaterThan(Double saldo) {
        return repository.findBySaldoGreaterThan(saldo);
    }
}