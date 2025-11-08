

// Implementacao concreta da estrategia de calculo de risco
// "Stress Testing".


import java.util.Map;

public class StressTesting implements RiscoStrategy {

    @Override
    public void calcular(Map<String, Double> parametros) {
        System.out.println("Executando Stress Testing...");
        System.out.println("Taxa de juros simulada: " + parametros.get("juros"));
        System.out.println("Resultado simulado: Perda estimada = 5.7%\n");
    }
}
