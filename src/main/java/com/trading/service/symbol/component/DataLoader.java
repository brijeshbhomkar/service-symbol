package com.trading.service.symbol.component;

import com.trading.service.symbol.entity.DataGranularity;
import com.trading.service.symbol.entity.Range;
import com.trading.service.symbol.repository.DataGranularityRepository;
import com.trading.service.symbol.repository.RangeRepsoitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class DataLoader {

    @Autowired
    private RangeRepsoitory rangeRepsoitory;

    @Autowired
    private DataGranularityRepository dataGranularityRepository;

    @PostConstruct
    public void loadData() {
        rangeRepsoitory.saveAll(getRanges());
        dataGranularityRepository.saveAll(getGranularity());
    }

    private List<DataGranularity> getGranularity() {
        return null;
    }

    private List<Range> getRanges() {
        return null;
    }
}
