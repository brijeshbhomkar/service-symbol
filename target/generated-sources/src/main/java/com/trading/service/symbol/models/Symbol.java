package com.trading.service.symbol.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Symbol
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-11-20T08:48:07.627367+05:30[Asia/Kolkata]")
public class Symbol   {
  @JsonProperty("id")
  private UUID id = null;

  @JsonProperty("symbolid")
  private Integer symbolid = null;

  @JsonProperty("symbol")
  private String symbol = null;

  @JsonProperty("exchange")
  private String exchange = null;

  public Symbol id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "d290f1ee-6c54-4b01-90e6-d701748f0851", required = true, value = "")
      @NotNull

    @Valid
    public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Symbol symbolid(Integer symbolid) {
    this.symbolid = symbolid;
    return this;
  }

  /**
   * Get symbolid
   * @return symbolid
  **/
  @ApiModelProperty(example = "11234", required = true, value = "")
      @NotNull

    public Integer getSymbolid() {
    return symbolid;
  }

  public void setSymbolid(Integer symbolid) {
    this.symbolid = symbolid;
  }

  public Symbol symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  /**
   * Get symbol
   * @return symbol
  **/
  @ApiModelProperty(example = "symbol like 'SBI'", required = true, value = "")
      @NotNull

    public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  public Symbol exchange(String exchange) {
    this.exchange = exchange;
    return this;
  }

  /**
   * Get exchange
   * @return exchange
  **/
  @ApiModelProperty(example = "can be nse or bse", required = true, value = "")
      @NotNull

    public String getExchange() {
    return exchange;
  }

  public void setExchange(String exchange) {
    this.exchange = exchange;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Symbol symbol = (Symbol) o;
    return Objects.equals(this.id, symbol.id) &&
        Objects.equals(this.symbolid, symbol.symbolid) &&
        Objects.equals(this.symbol, symbol.symbol) &&
        Objects.equals(this.exchange, symbol.exchange);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, symbolid, symbol, exchange);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Symbol {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    symbolid: ").append(toIndentedString(symbolid)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
    sb.append("    exchange: ").append(toIndentedString(exchange)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
