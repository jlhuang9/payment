package com.spruce.payment.dao;

import com.spruce.payment.dto.GroupPojo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupDao extends JpaRepository<GroupPojo, Long> {
    GroupPojo getByNameAndLevel(String name, int level);
}
