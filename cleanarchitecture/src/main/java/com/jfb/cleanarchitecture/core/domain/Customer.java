package com.jfb.cleanarchitecture.core.domain;

public class Customer {

    private String id;
    private String nome;
    private String cpfCnpj;
    private Address address;
    private Boolean isValidCpfCnpj;

    public Customer(String id, String nome, String cpfCnpj, Address address, Boolean isValidCpfCnpj) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.address = address;
        this.isValidCpfCnpj = isValidCpfCnpj;
    }

    public Customer() {
        this.isValidCpfCnpj = false;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getValidCpfCnpj() {
        return isValidCpfCnpj;
    }

    public void setValidCpfCnpj(Boolean validCpfCnpj) {
        isValidCpfCnpj = validCpfCnpj;
    }
}
