package com.spruce.payment.dao;

import com.spruce.payment.dto.StaffPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffDao extends JpaRepository<StaffPojo, Long> {
}
