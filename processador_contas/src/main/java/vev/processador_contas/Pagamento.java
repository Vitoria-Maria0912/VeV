package vev.processador_contas;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
public class Pagamento {

    private double valorPago;
    private LocalDate data;

    public Pagamento(LocalDate data, double valorPago) {
        this.data = data;
        this.valorPago = valorPago;
    }

    public boolean verificarPagamento() {
        return (0.01 < this.valorPago && this.valorPago < 5000);
    }

    public double getValorPago() { return this.valorPago; }

    public LocalDate getData() { return this.data; }
}
