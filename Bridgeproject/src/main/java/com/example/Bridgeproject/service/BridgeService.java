package com.example.Bridgeproject.service;
import com.example.Bridgeproject.dto.BridgeDTO;
import com.example.Bridgeproject.entity.BridgeEntity;

public interface BridgeService {

    BridgeEntity update(BridgeDTO bridgeDTO);

    void delete(Long id);

    BridgeEntity findByid(Long id);

}
