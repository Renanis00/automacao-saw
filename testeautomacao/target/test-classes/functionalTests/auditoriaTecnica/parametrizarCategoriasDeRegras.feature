@workflow
Feature: Cenário de Negócio - Auditoria Técnica

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "adm33" e senha "agulha@!"
    And informe o usuario "adm33" e senha "baleia@!"


  @paramCategoriasDeRegras
  Scenario Outline: Auditoria Técnica - parametrizar Categorias De Regras

    When acionar o menu Auditoria Técnica Categorias De Regras
    And acionar opção Nova categoria
    And infromar campo Descrição como "<descricao>"
    And selecionar campo Workflow como "<workflow>"
    And acionar opção Habilitado como sim
    And infromar campo Data Início como "<dataInicio>"
    And devo acionar opção para gravar categoria
    Then devo acionar opção regras
    And acionar checkbox RESUMO DE INTERNAÇÃO
    And acionar opção gravar regra
    And acionar aba contratados
    And acionar opção para adicionar contratados
    And informar um contratado válido coo "<contratadoValido>"
    And acionar opção gravar contratado


    Examples:

      | descricao         | dataInicio | workflow                      | contratadoValido                                            |
      | Categoria Auto 02 | 08/10/2020 | Workflow da Auditoria Técnica | 63967 -- FUND DE EST DAS DOENCAS DO FIGADO KOUTOULA RIBEIRO |