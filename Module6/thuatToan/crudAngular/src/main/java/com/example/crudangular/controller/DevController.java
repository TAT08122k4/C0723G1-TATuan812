package com.example.crudangular.controller;


import com.example.crudangular.model.Dev;
import com.example.crudangular.service.IDevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/dev")
public class DevController {
    @Autowired
    IDevService iDevService;
    @GetMapping("")
    public ResponseEntity<?> getAllListDev(){
        List<Dev> devList = iDevService.getAllListDev();
        if (devList.size() <= 0){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }else {
            return new ResponseEntity<>(devList,HttpStatus.OK);
        }
    }
    @PostMapping("/add")
    public ResponseEntity<?> saveDev(@RequestBody Dev dev){
        iDevService.save(dev);
       return new ResponseEntity<>(HttpStatus.OK);
    }
}
