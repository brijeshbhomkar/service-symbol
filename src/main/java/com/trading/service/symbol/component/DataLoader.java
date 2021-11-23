package com.trading.service.symbol.component;

import com.trading.service.symbol.entity.Interval;
import com.trading.service.symbol.entity.Range;
import com.trading.service.symbol.repository.IntervalRepository;
import com.trading.service.symbol.repository.RangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class DataLoader {

    //URL
    //https://query1.finance.yahoo.com/v8/finance/chart/SBIN.NS?interval=2m&range=1d

    @Autowired
    private RangeRepository rangeRepository;

    @Autowired
    private IntervalRepository intervalRepository;

    @PostConstruct
    public void loadData() {
        clear();
        rangeRepository.saveAll(getRanges());
        intervalRepository.saveAll(getIntervals());
    }

    private void clear() {
        rangeRepository.deleteAll();
        intervalRepository.deleteAll();
    }

    private List<Interval> getIntervals() {
        return Stream.of(interval).map(this::mapToInterval).collect(Collectors.toUnmodifiableList()).get(0);
    }

    private List<Interval> mapToInterval(List<String> intervals) {
        List<Interval> intervalList = new ArrayList<>();
        intervals.stream().filter(s -> !s.isEmpty()).forEach(s -> {
            Interval interval = new Interval();
            interval.setInterval(s);
            intervalList.add(interval);
        });
        return intervalList;
    }

    private List<Range> getRanges() {
        return Stream.of(ranges).map(this::mapToRanges).collect(Collectors.toUnmodifiableList()).get(0);
    }

    private List<Range> mapToRanges(List<String> ranges) {
        List<Range> rangeList = new ArrayList<>();
        ranges.stream().filter(s -> !s.isEmpty()).forEach(s -> {
            Range range = new Range();
            range.setRangeId(s);
            rangeList.add(range);
        });
        return rangeList;
    }

    private static List<String> ranges = Arrays.asList("1d",
            "5d",
            "1mo",
            "3mo",
            "6mo",
            "1y",
            "2y",
            "5y",
            "10y",
            "ytd",
            "max");

    private static List<String> interval = Arrays.asList("1m",
            "2m",
            "5m",
            "15m",
            "30m",
            "60m",
            "90m",
            "1h",
            "1d",
            "5d",
            "1wk",
            "1mo",
            "3mo");
}
