/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizeline.operators.service;

import com.wizeline.operators.model.Operator;
import java.util.List;

/**
 *
 * @author Edgar J García L
 */
public interface OperatorService {

    public Operator saveOperator(Operator operator);

    public List<Operator> getAllOperator();

    public Operator getOperator(long cedula);
}
