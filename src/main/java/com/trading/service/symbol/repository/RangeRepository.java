package com.trading.service.symbol.repository;

import com.trading.service.symbol.entity.Range;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RangeRepository extends JpaRepository<Range, Long> {
}
