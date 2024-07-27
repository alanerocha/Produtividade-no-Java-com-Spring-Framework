package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.service.FreteStrategy;

public class NormalFreteStrategy implements FreteStrategy {
    @Override
    public double calcularFrete(double peso) {
        return peso * 1.0;
    }
}
