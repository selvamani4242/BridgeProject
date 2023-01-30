package com.example.Bridgeproject.controller;
import com.example.Bridgeproject.dto.BridgeDTO;
import com.example.Bridgeproject.entity.BridgeEntity;
import com.example.Bridgeproject.service.BridgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bridge")
public class BridgeCtrl {

    @Autowired
    BridgeService bridgeService;

    @PostMapping("/update")

        ResponseEntity<?> updateBridge(@RequestBody BridgeDTO bridgeDTO){
        BridgeEntity bridge = bridgeService.update(bridgeDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(bridge);
    }

    @GetMapping("/delete/{id}")
    void deleteBridge(@PathVariable Long id){

        bridgeService.delete(id);

    }
    @GetMapping("/get/{id}")

        ResponseEntity<?> getByid(@PathVariable Long id){
        BridgeEntity bridgeEntity = bridgeService.findByid(id);
        return ResponseEntity.status(HttpStatus.OK).body(bridgeEntity);
    }

}
