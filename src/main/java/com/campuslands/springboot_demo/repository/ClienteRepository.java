package com.campuslands.springboot_demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.campuslands.springboot_demo.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    List<Cliente> findByNombre(String nombre);
    List<Cliente> findBySaldoGreaterThan(Double saldo);
}