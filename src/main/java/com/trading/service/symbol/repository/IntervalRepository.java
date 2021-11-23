package com.trading.service.symbol.repository;

import com.trading.service.symbol.entity.Interval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntervalRepository extends JpaRepository<Interval, Long> {
}
