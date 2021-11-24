#language: pt

@challenge
Funcionalidade: Validação dos metodos do MS DummyAPI

  @create
  Cenario: Criação de funcionário
    Dado que vou criar um novo funcionario
    Quando enviar a requisicao com nome <name>, salario <salary> e idade <age>
    Entao servico retorna status duzentos com response para validacao

  @consult
  Cenario: Consultar funcionário criado
    Dado que realizei a criacao de um funcionario
    Quando vou conulstar seus dados criados
    Entao servico retorna status 200 com os dados para validacao

  @alter
  Cenario: Alterar dados de um funcionario
    Dado que vou alterar os dados de um funcionario
    Quando envio o dados para alteracao
    Entao servico retorna status duzentos com response alterado para validacao

  @delete
  Cenario: Deletar funcionario criado
    Dado que vou excluir um funcionario da base
    Quando envio os dados para exclusao
    Entao sistema retorna mensagem de exlcusao efetuada com sucesso

  @aleatoryConsult
    Cenario: Consultar funcionario aleatorio
    Dado que vou consultar um funcionario ja cadastrado
    Quando enviar a requisicao com o id
    Entao o servico deve retornar os dados desse funcionario