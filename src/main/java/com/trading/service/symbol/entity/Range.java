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
@Table(name = "range")
public class Range implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "rangeid")
    private String rangeId;

    @ManyToOne
    @JoinColumn(name = "name", nullable = false)
    private Symbol symbol;
}
