package com.rafael.todo.domain;

import java.io.Serializable;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public  class Todo  implements Serializable{ 
    private static final long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String descricao;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    private LocalDateTime dataParaFinalizar;
    public LocalDateTime getDataParaFinalizar() {
        return dataParaFinalizar;
    }
    public void setDataParaFinalizar(LocalDateTime dataParaFinalizar) {
        this.dataParaFinalizar = dataParaFinalizar;
    }
    private Boolean finalizado=false;
    public Boolean getFinalizado() {
        return finalizado;
    }
    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }
    public Todo(Integer id, String titulo, String descricao, LocalDateTime dataParaFinalizar, Boolean finalizado) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataParaFinalizar = dataParaFinalizar;
        this.finalizado = finalizado;
    }
    public Todo() {
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Todo other = (Todo) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

        
    }