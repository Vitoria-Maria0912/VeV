package com.vandv.sistema_ingressos.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelatorioShow {

    @JsonProperty("ingressos_normal_vendidos")
    @Column(name="ds_ingressos_normal_vendidos", nullable = false)
    private Integer ingressos_normal_vendidos;

    @JsonProperty("ingressos_vip_vendidos")
    @Column(name="ds_ingressos_vip_vendidos", nullable = false)
    private Integer ingressos_vip_vendidos;

    @JsonProperty("ingressos_meia_vendidos")
    @Column(name="ds_ingressos_meia_vendidos", nullable = false)
    private Integer ingressos_meia_vendidos;

    @JsonProperty("receita_liquida")
    @Column(name = "ds_receita_liquida", nullable = false)
    private Double receita_liquida;

    @JsonProperty("status_financeiro")
    @Enumerated(EnumType.STRING)
    @Column(name = "ds_status_financeiro", nullable = false)
    private StatusFinanceiro status_financeiro;
}
