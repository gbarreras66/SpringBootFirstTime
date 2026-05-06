package com.campuslands.springboot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campuslands.springboot_demo.model.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Long> {
}