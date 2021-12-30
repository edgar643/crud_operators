/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizeline.operators.service.impl;

import com.wizeline.operators.model.Operator;
import com.wizeline.Operators.repository.OperatorsRepository;
import com.wizeline.operators.exception.ResourceNotFoundException;
import com.wizeline.operators.service.OperatorService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Edgar J García L
 */
@Service
public class OperatorServiceImpl implements OperatorService {

    private final OperatorsRepository operatorRepository;

    public OperatorServiceImpl(OperatorsRepository operatorRepository) {
        this.operatorRepository = operatorRepository;
    }

    @Override
    public Operator saveOperator(Operator operator) {

        return operatorRepository.save(operator);
    }

    @Override
    public List<Operator> getAllOperator() {
        return operatorRepository.findAll();
    }

    @Override
    public Operator getOperator(long cedula) {
//        Optional<Operator> operator = operatorRepository.findById(cedula);
//        if (operator.isPresent()) {
//            return operator.get();
//        } else {
//            throw new ResourceNotFoundException("Operator", "Cedula", cedula);
//        }

return operatorRepository.findById(cedula).orElseThrow(()->new ResourceNotFoundException("Operator", "cedula", cedula));
    }

}
