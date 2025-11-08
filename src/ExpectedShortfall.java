
// Implementacao concreta da estrategia de calculo de risco
// "Expected Shortfall (ES)".


import java.util.Map;

public class ExpectedShortfall implements RiscoStrategy {

    @Override
    public void calcular(Map<String, Double> parametros) {
        System.out.println("Executando cálculo de Expected Shortfall...");
        System.out.println("Nível de confiança: " + parametros.get("confianca"));
        System.out.println("Resultado simulado: Perda esperada = 3.1%\n");
    }
}
