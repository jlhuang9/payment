package com.spruce.payment.dao;

import com.spruce.payment.dto.StorageStandardPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageStandardDao extends JpaRepository<StorageStandardPojo, Long>{
}
