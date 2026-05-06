package com.campuslands.springboot_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TipoCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tbTipoCliente;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTbTipoCliente() {
        return tbTipoCliente;
    }

    public void setTbTipoCliente(String tbTipoCliente) {
        this.tbTipoCliente = tbTipoCliente;
    }
}