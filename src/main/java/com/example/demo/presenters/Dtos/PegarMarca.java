package com.example.demo.presenters.Dtos;

public class PegarMarca {
    String nomeMarca;

    public PegarMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }
}
