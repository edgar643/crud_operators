/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wizeline.Operators.controller;

import com.wizeline.operators.model.Operator;
import com.wizeline.operators.service.OperatorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Edgar J García L
 */
@RestController
@RequestMapping("/api/operator")
public class OperatorController {

    private OperatorService operatorService;

    public OperatorController(OperatorService operatorService) {
        this.operatorService = operatorService;
    }

    @PostMapping("/insert")
    public ResponseEntity<Operator> saveOperator(@RequestBody Operator operator) {
        return new ResponseEntity<>(operatorService.saveOperator(operator), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Operator>> getAll() {
        return new ResponseEntity<>(operatorService.getAllOperator(), HttpStatus.OK);
    }
    
     @PutMapping("/update")
    public ResponseEntity<Operator> update(@RequestBody Operator operator) {
     return new ResponseEntity<>(operatorService.saveOperator(operator), HttpStatus.OK);
    }
    @DeleteMapping("/{cedula}")

    public ResponseEntity<String>deleteOpertorByCedula(@PathVariable("cedula") long cedula){
        operatorService.deleteOperator(cedula);
        return new ResponseEntity<>(("Deleted "+cedula),HttpStatus.OK);}
    @GetMapping("/{cedula}")
    public ResponseEntity<Operator> getOperatorByCedula(@PathVariable("cedula") long cedula) {
        return new ResponseEntity<>(operatorService.getOperator(cedula), HttpStatus.OK);
    }
    
}
