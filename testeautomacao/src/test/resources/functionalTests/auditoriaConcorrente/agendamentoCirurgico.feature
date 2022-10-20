@sawCuritiba @AgendamentoCirurgico
Feature: Cenário de Negócio - Cadastrar Agendamento Cirurgico

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "robson.auditor" e senha "baleia@!"

  Scenario Outline: Cadastrar Agendamento Cirurgico
    #AGENDAMENTO CIRURGICO
    When acionar o menu auditoria concorrente internações
    And acionar opcao agendamento cirurgico
    And informar campo prestador como "<codigoPrestador>"
    And informar campo Local de Atendimento como "<localAtendimento>"
    And informar campo Número Guia Prestador como "<numeroGuiaPrestador>"
    And informar campo Centro Cirúrgico como "<numeroGuiaPrestador>"
    And informar campo Prestador Atividade como "<prestadorAtividade>"
    And informar campo sala como "<sala>"
    And informar campo data como "<dataCirurgia>"
    And informar campo Codigo Beneficiário como "<codOperadora>""<codigoBeneficiario>"
    And selecionar tabela como "<tabela>"
    And informar codigo como "<codigoTabela>"
    Then devo acionar botão gravar
    And o sistema deverá apresentar mensagem: Registro cadastrado com sucesso "Agendamento Cadastrado com sucesso!"
    #DETALHAR
    And acionar o menu auditoria mapa cirurgico
    And informar campo prestador "<codigoPrestador>"
    And informar campo Local de Atendimento como "<localAtendimento>"
    And acionar opção para pesquisar
    And acionar opção ações detalhar

    Examples:

      | codigoPrestador | sala | descricao | dataCirurgia | codOperadora | codigoBeneficiario | prestadorAtividade | tabela                                  | codigoTabela | localAtendimento | numeroGuiaPrestador |
      | 36242           | 10   |           | 01/02/2020   | 32           | 0000077197100      | adyr souza rego    | TUSS - Procedimentos e eventos em saúde | 40101029     | Hospital Daher   | 880722398           |


