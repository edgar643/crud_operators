/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizeline.operators.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Edgar J García L
 */
@Data
@Entity
@Table(name = "operadores")
public class Operator {

    @Id
    private long cedula;
    @Column(name = "pnombre")
    private String pnombre;
    @Column(name = "snombre")
    private String snombre;
    @Column(name = "papellido")
    private String papellido;
    @Column(name = "sapellido")
    private String sapellido;
    @Column(name = "email ")
    private String email;
    @Column(name = "idpersonal")
    private String idpersonal="AAAA";

}
