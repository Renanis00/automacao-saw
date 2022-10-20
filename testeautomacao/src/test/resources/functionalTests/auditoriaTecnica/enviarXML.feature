@audtTecnica
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "teste_prest33" e senha "baleia@!"


  @enviarXML
  Scenario Outline: Auditoria Técnica - Enviar XML - Resumo de internação

    When acionar o menu TISS Faturamento Eletrônico
    And modificar parametros do arquivo XML
    And acionar Validar Estrutura Hash
    And acionar opção para escolher arquivo
    And acionar opção validar Estrutura e Hash de arquivo XML
    Then devo atualizar o XML com o Hash Correto
    And acionar opção Enviar XML
    And selecionar um prestador Financeiro "<prestadorFinanceiro>"
    And acionar opção para escolher Arquivo XML
    And acionar opção para enviar arquivo

    Examples:

      | prestadorFinanceiro                                         |
      | 63967 -- FUND DE EST DAS DOENCAS DO FIGADO KOUTOULA RIBEIRO |




