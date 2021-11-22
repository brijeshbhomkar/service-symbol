package com.trading.service.symbol.repository;

import com.trading.service.symbol.entity.DataGranularity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataGranularityRepository extends JpaRepository<DataGranularity, Long> {
}
