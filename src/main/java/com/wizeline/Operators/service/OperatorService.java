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

     Operator saveOperator(Operator operator);

    List<Operator> getAllOperator();

     Operator getOperator(long cedula);
      void deleteOperator(long cedula);
}
