package com.example.Bridgeproject.service;
import com.example.Bridgeproject.dto.BridgeDTO;
import com.example.Bridgeproject.entity.BridgeEntity;
import com.example.Bridgeproject.repository.BridgeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class BridgeServiceImpl implements BridgeService {
    @Autowired
    BridgeRepo bridgeRepo;

    @Override
    public BridgeEntity update(BridgeDTO bridgeDTO) {

        BridgeEntity bridgeEntity = new BridgeEntity();

        bridgeEntity.setId(bridgeDTO.getId());
        bridgeEntity.setName(bridgeDTO.getName());
        bridgeEntity.setEmail(bridgeDTO.getEmail());
        bridgeEntity.setSubject(bridgeDTO.getSubject());
        bridgeEntity.setMessage(bridgeDTO.getMessage());
        return bridgeRepo.save(bridgeEntity);
    }

    @Override
    public void delete(Long id) {

     Optional<BridgeEntity> bridge = bridgeRepo.findById(id);
     bridgeRepo.delete(bridge.get());
    }

    @Override
    public BridgeEntity findByid(Long id) {

       Optional<BridgeEntity> bridgeEntity =bridgeRepo.findById(id);
       return bridgeEntity.get();
    }

}
