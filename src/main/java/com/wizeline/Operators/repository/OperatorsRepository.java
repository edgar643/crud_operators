/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizeline.Operators.repository;

import com.wizeline.operators.model.Operator;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Edgar J García L
 */
 

public interface OperatorsRepository extends JpaRepository<Operator,Long> {
    
}
