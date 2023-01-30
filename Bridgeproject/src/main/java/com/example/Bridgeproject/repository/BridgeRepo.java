package com.example.Bridgeproject.repository;

import com.example.Bridgeproject.entity.BridgeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BridgeRepo extends JpaRepository<BridgeEntity,Long> {

}
