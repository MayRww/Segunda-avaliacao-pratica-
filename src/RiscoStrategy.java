
// Interface que define o contrato das estrategias de calculo
// de risco financeiro. Cada algoritmo concreto devera
// implementar este metodo de calculo.


import java.util.Map;

public interface RiscoStrategy {
    void calcular(Map<String, Double> parametros);
}
