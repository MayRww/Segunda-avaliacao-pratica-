
// Implementação concreta da estratégia de cálculo de risco
// "Value at Risk (VaR)".

import java.util.Map;

public class ValueAtRisk implements RiscoStrategy {

    @Override
    public void calcular(Map<String, Double> parametros) {
        System.out.println("Executando cálculo de Value at Risk (VaR)...");
        System.out.println("Volatilidade utilizada: " + parametros.get("volatilidade"));
        System.out.println("Resultado simulado: Risco diário = 2.5%\n");
    }
}
