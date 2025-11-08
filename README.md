Questão 01 – Sistema de Processamento de Risco Financeiro

O problema foi resolvido com a aplicação do padrão Strategy, que possibilita definir uma família de algoritmos intercambiáveis, encapsulando cada um em uma classe separada.
Com isso, o comportamento do sistema pode ser alterado em tempo de execução, mantendo o código cliente desacoplado das implementações concretas.

A escolha do Strategy se justifica pelo requisito de troca dinâmica de algoritmos, preservando os princípios de abstração e extensibilidade.

Princípios SOLID aplicados

OCP: Novas estratégias podem ser adicionadas sem alterar código existente, 
DIP: O contexto depende da abstração (RiscoStrategy), 
SRP: Cada classe tem apenas uma responsabilidade (um cálculo de risco).
