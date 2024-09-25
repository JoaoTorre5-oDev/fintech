<h1>Sistema de Conta Digital para Fintech</h1>

Uma fintech está desenvolvendo um sistema de contas digitais que permite realizar operações bancárias como depósito, saque, e transferência entre contas. 
O sistema deve seguir os princípios da Orientação a Objetos, aplicando os 4 pilares: Encapsulamento, Herança, Polimorfismo e Abstração.
Você foi contratado para implementar a primeira versão desse sistema. Ele deverá conter as seguintes funcionalidades:

<h2>Requisitos:Encapsulamento:</h2>
Crie uma classe Conta com os atributos titular, saldo e numeroConta. Todos os atributos devem ser privados.
Forneça métodos para acessar e modificar esses atributos, garantindo que o saldo não seja alterado diretamente (somente através de métodos como depositar e sacar).

<h2>Herança:</h2>

A fintech oferece dois tipos de contas: ContaCorrente e ContaPoupanca, ambas devem herdar de Conta.
Cada tipo de conta deve ter uma regra específica:
ContaCorrente: Pode ter um limite de cheque especial (valor negativo permitido no saldo).
ContaPoupanca: Gera rendimento automático (aumento de saldo) mensal baseado em uma taxa fixa.

<h2>Polimorfismo:</h2>

Crie uma interface Transacao que possua os métodos realizarDeposito, realizarSaque e realizarTransferencia.
As classes ContaCorrente e ContaPoupanca devem implementar essa interface, mas cada uma deve aplicar as operações de depósito, saque e transferência de acordo com suas regras específicas.

<h2>Abstração:</h2>

Crie uma classe abstrata RelatorioFinanceiro com um método abstrato gerarRelatorio(). Esse método será implementado nas subclasses RelatorioContaCorrente e RelatorioContaPoupanca, que gerarão relatórios detalhados para cada tipo de conta.
Funcionalidades Específicas:O sistema deve permitir criar contas, realizar depósitos, saques e transferências entre contas.
Deve ser possível gerar um relatório financeiro contendo o saldo e o histórico de transações para cada tipo de conta.
Ao final de cada mês, o sistema deve aplicar o rendimento para as contas poupança e gerar relatórios financeiros.
O saldo da conta corrente pode ser negativo, respeitando o limite de cheque especial.

<h2>Exemplo de Interações:</h2>

Criar uma ContaCorrente com um limite de cheque especial de R$ 500.
Criar uma ContaPoupanca com uma taxa de rendimento de 0,5% ao mês.
Realizar depósitos, saques e transferências entre as contas.
Gerar um relatório financeiro ao final do mês para ambas as contas.

<h2>Dicas para Implementação:</h2>

Utilizar o encapsulamento para proteger os atributos das contas.
Aplique a herança para que ContaCorrente e ContaPoupanca herdem os comportamentos comuns da classe Conta.
Use polimorfismo para que as operações de transação funcionem de maneira diferente em cada tipo de conta.
A abstração será importante para gerar relatórios financeiros distintos para as contas.
Critérios de Avaliação:Correta aplicação dos conceitos de orientação a objetos (4 pilares).Funcionamento correto das operações bancárias (depósito, saque e transferência).
Implementação de um relatório financeiro claro e correto para cada tipo de conta.

Testes de funcionamento que demonstrem o uso dos pilares.

Orientações de como podem aplicar os 4 pilares da orientação a objetos: Os atributos titular, saldo e numeroConta da classe Conta são privados e 
só podem ser acessados e modificados através de métodos. Assim conseguem aplicar o encapsulamento: 
ContaCorrente e ContaPoupanca herdam da classe Conta.: ContaCorrente e ContaPoupanca podem implementar a interface Transacao, cada uma com suas regras específicas.: 
O relatório pode ser uma classe RelatorioFinanceiro que será abstrata e deve possuir o método gerarRelatorio() 
que é implementado pelas classes concretas RelatorioContaCorrente e RelatorioContaPoupanca.
