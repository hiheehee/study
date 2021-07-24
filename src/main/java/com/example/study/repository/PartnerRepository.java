package com.example.study.repository;

import com.example.study.model.entity.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface PartnerRepository extends JpaRepository<Partner, Long> {
}
