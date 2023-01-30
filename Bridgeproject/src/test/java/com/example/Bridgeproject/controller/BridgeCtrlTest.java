package com.example.Bridgeproject.controller;

import com.example.Bridgeproject.dto.BridgeDTO;
import com.example.Bridgeproject.entity.BridgeEntity;
import com.example.Bridgeproject.repository.BridgeRepo;
import com.example.Bridgeproject.service.BridgeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)

class BridgeCtrlTest {

     @Mock
     BridgeService bService;
     @InjectMocks
     BridgeCtrl bridgeCtrl;
     @Mock
     BridgeRepo bridgeRepo;

    @Test
    public void updateBridge(){

        BridgeDTO bridgeDTO = new BridgeDTO();
        bridgeDTO.setId(1);
        bridgeDTO.setEmail("test@test.com");
        bridgeDTO.setName("testName");
        bridgeDTO.setSubject("subject");
        bridgeDTO.setMessage("testMsg");

        BridgeEntity bridgeEntity = new BridgeEntity();
        bridgeEntity.setId(1);
        bridgeEntity.setEmail("test@test.com");
        bridgeEntity.setName("testName");
        bridgeEntity.setSubject("subject");
        bridgeEntity.setMessage("testMsg");

        Mockito.when(bService.update(bridgeDTO)).thenReturn(bridgeEntity);
        ResponseEntity resEntity = ResponseEntity.status(HttpStatus.CREATED).body(bridgeEntity);
        resEntity = bridgeCtrl.updateBridge(bridgeDTO);
    }

    @Test
    void getByid() {

        BridgeDTO bridgeDTO = new BridgeDTO();
        bridgeDTO.setId(1);
        bridgeDTO.setEmail("test@test.com");
        bridgeDTO.setName("testName");
        bridgeDTO.setSubject("subject");
        bridgeDTO.setMessage("testMsg");

        BridgeEntity bridgeEntity = new BridgeEntity();
        bridgeEntity.setId(1);
        bridgeEntity.setEmail("test@test.com");
        bridgeEntity.setName("testName");
        bridgeEntity.setSubject("subject");
        bridgeEntity.setMessage("testMsg");

       Mockito.when(bService.findByid(1l)).thenReturn(bridgeEntity);
        ResponseEntity response = ResponseEntity.status(HttpStatus.OK).body(bridgeEntity);
        response = bridgeCtrl.getByid(1l);
    }
    @Test
    void deleteBridge() {

        BridgeDTO bridgeDTO = new BridgeDTO();
        bridgeDTO.setId(1);
        bridgeDTO.setEmail("test@test.com");
        bridgeDTO.setName("testName");
        bridgeDTO.setSubject("subject");
        bridgeDTO.setMessage("testMsg");

        BridgeEntity bridgeEntity = new BridgeEntity();
        bridgeEntity.setId(1);
        bridgeEntity.setEmail("test@test.com");
        bridgeEntity.setName("testName");
        bridgeEntity.setSubject("subject");
        bridgeEntity.setMessage("testMsg");

        bService.delete(1l);
    }
}