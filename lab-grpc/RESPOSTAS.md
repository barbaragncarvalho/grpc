# Parte A

## 4.1 Sobre o repositório de revisão de redes

1. O endereço do servidor estava escrito diretamente no código do cliente do TCP (localhost), UDP (localhost), Multicast (230.0.0.1) e WebSocket (localhost). Isso prejudica diretamente a transparência de localização, pois, em um sistema distribuído com transparência de localização, o cliente não deveria precisar saber onde o servidor está fisicamente hospedado para conseguir usá-lo. Assim, fixar o IP e a porta no código gera acoplamento com a máquina onde o servidor está executando, prejudicando a transparência.

2. Para perguntar algo ao servidor, o cliente precisa montar uma string de texto manualmente sim, e isso indica a ausência de transparência de acesso. A transparência de acesso significa que chamar uma função remota deveria parecer igual a chamar uma função local do próprio programa, entretanto, nas quatro soluções, teve que formatar manualmente as strings e, do lado do servidor, teve que fazer a leitura e as verificações do texto, fazendo com que todo o detalhe de transporte e montagem de mensagem ficasse exposto para o desenvolvedor.

3. Se o servidor mudasse de máquina amanhã, o cliente no TCP, UDP e WebSocket parariam de funcionar, pois eles tentariam se conectar ao endereço antigo (localhost) e receberiam erros de conexão recusada ou ficariam travados esperando resposta. A única solução que sobreviveria sem alterar o código do cliente é a de Multicast. Isso acontece porque o cliente multicast não se conecta ao endereço IP físico da máquina do servidor, mas sim a um endereço IP de grupo (230.0.0.1). Assim, se o servidor fosse transferido para outro computador dentro da mesma rede local e continuasse mandando mensagens para o mesmo grupo, os clientes continuariam recebendo os avisos normalmente, sem precisar mudar alguma linha de código.

## 4.3

1. Dentre os 8 tipos de transparência, a mais visível para o programador que está usando um serviço remoto é a transparência de acesso, já que ela está ligada diretamente à forma como o código é escrito. Isso porque, quando há transparência de acesso, o programador somente chama os métodos que precisa, sem ter que lidar com a comunicação de rede por trás. Sem ela, ele teria que escrever várias linhas de código a mais só para interpretar as mensagens trocadas.

2. Transparência total nem sempre é desejável. Um exemplo é quando, por esconder que uma operação é remota, o programador coloca essa operação dentro de um laço de repetição for que será executado milhares de vezes. Assim, o programa irá demorar muito tempo para responder (latência), já que a cada iteração os dados terão que viajar pela rede inteira, diferentemente de uma operação local, que é rápida por se consultar os dados na memória.

# Parte B

## 5.5

1. A vantagem de ter esse contrato explícito e gerado automaticamente é a eliminação dos erros manuais, já que, quando se define o formato por comentários, qualquer pequeno erro de digitação ou diferença de maiúsculas e minúsculas faz dar erro na comunicação. Enquanto isso, com o arquivo .proto, é validado os tipos de dados e nomes de campos antes de rodar, além do compilador gerar todo o código automaticamente.

2. O mesmo arquivo central.proto ter gerado o código para diferentes linguagens sugere que, em sistemas distribuídos reais, cada equipe pode escolher a linguagem de programação mais adequada para o seu serviço em específico, de forma que tudo continue se comunicando perfeitamente.

3. Mesmo sem entender todo o código gerado, é possível identificar onde ficam definidas as operações ConsultarHorario e AcompanharAvisos (linhas 52 e 59). Uma classe que pude reconhecer é a CentralAtendimentoServicer, que contém os métodos ConsultarHorario e AcompanharAvisos.