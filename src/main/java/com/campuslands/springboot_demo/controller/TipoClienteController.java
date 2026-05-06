package com.campuslands.springboot_demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campuslands.springboot_demo.model.TipoCliente;
import com.campuslands.springboot_demo.service.TipoClienteService;

@RestController
@RequestMapping("/api/tipo-clientes")
public class TipoClienteController {

    @Autowired
    private TipoClienteService service;

    @GetMapping
    public List<TipoCliente> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<TipoCliente> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public TipoCliente create(@RequestBody TipoCliente tipoCliente) {
        return service.save(tipoCliente);
    }

    @PutMapping("/{id}")
    public TipoCliente update(@PathVariable Long id, @RequestBody TipoCliente tipoCliente) {
        tipoCliente.setId(id);
        return service.save(tipoCliente);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteById(id);
    }
}