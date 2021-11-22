package com.trading.service.symbol.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "datagranularity")
public class DataGranularity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "granularity")
    private String dataGranularity;

    @ManyToOne
    @JoinColumn(name = "name", nullable = false)
    private Symbol symbol;
}
