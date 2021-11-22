package com.trading.service.symbol.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "symbol")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Symbol implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "exchange")
    private String exchange;

    @Column(name = "dtfrom")
    private String datafrom;

    @OneToMany(mappedBy = "range")
    private List<Range> rangeList;

    @OneToMany(mappedBy = "datagranularity")
    private List<DataGranularity> granularityList;
}