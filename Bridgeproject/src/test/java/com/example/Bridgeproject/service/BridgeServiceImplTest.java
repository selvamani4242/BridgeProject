package com.example.Bridgeproject.service;

import com.example.Bridgeproject.dto.BridgeDTO;
import com.example.Bridgeproject.entity.BridgeEntity;
import com.example.Bridgeproject.repository.BridgeRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;
@ExtendWith(MockitoExtension.class)

class BridgeServiceImplTest {
    @Mock
    BridgeRepo bridgeRepo;
    @Mock
    BridgeService bridgeService;
    @InjectMocks
    BridgeServiceImpl bridgeServiceimpl;

    @Test
    void update() {

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

        Mockito.lenient().when(bridgeRepo.save(bridgeEntity)).thenReturn(bridgeEntity);


    }

    @Test
    void delete() {
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

        bridgeRepo.delete(bridgeEntity);
    }

    @Test
    void findByid() {

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

        Mockito.lenient().when(bridgeRepo.findById(1l)).thenReturn(Optional.of(bridgeEntity));
    }
}