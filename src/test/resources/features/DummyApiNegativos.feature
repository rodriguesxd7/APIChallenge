#language: pt

  Funcionalidade: Validar cenários negativos

    Cenario: Validar que servico nao retorna cliente excluido
      Dado que irei consultar um cliente que foi excluido
      Quando enviar o id do cliente excluido
      Entao servico nao deve retornar nenhum funcionario
