@sawCuritiba
Feature: Cenário de Negócio - Adicionar Beneficiário Internado

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni32" e senha "brasil@!"

  @atribuirVisitaManual
  Scenario Outline: Adicionar Beneficiário Internado - atribuir visita manual
    ADICIONAR BENEFICIARIO INTERNADO
    When acionar o menu auditoria concorrente internações
    And acionar botão para adicionar beneficiario internado
    And informar campo codigo beneficiario como "<codBeneficiario1>""<codBeneficiario2>"
    And informar campo codigo prestador como "<codPrestador>"
    And informar campo data da internação como "<dataInternação>"
    And acionar opção Caráter Atendimento como Urgência e Emergência
    And selecionar campo gerarAuditoria como Sim
    And selecionar um tipo de auditoria "<campTipoAuditoria>"
    And selecionar campo Tipo internação clinica
    And informar campo CID como "<cid>"
    Then devo acionar botão cadastrar
    And o sistema deverá apresentar mensagem na modal: "Registro cadastrado com sucesso!!!"
    #ATRIBUIR VISITAS
    And acionar o menu auditoria concorrente gestão de visitas
    And acionar opção filtro de pesquisa
    And informar campo codigo beneficiario "<codBeneficiario2>"
    And acionar botão que permite pesquisar
    And selecionar um internado botão ações alterar visitas
    And informar auditor "<auditor1>"
    And infromar data inicio "<dtInicio>"
    And infromar data fim "<dtFim>"
    And acionar Gravar para atribuir visita
    And o sistema deverá apresentar mensagem na modal de Alterar Visita: "Registro alterado com sucesso!!!"

    Examples:

      | codBeneficiario1 | codBeneficiario2 | codPrestador | dataInternação | campTipoAuditoria | auditor1  | dtInicio   | dtFim      | cid  |
      | 32               | 0000064299090    | 36242        | 03/03/2022     | Auditoria de UTI  | teste_32  | 03/03/2022 | 20/03/2022 | F412 |

  @atribuirVisitaAutomatica
  Scenario Outline: Adicionar Beneficiário Internado - atribuir visita automatica
    #ADICIONAR BENEFICIARIO INTERNADO
    When acionar o menu auditoria concorrente internações
    And acionar botão para adicionar beneficiario internado
    And informar campo codigo beneficiario como "<codBeneficiario1>""<codBeneficiario2>"
    And informar campo codigo prestador como "<codPrestador>"
    And informar campo data da internação como "<dataInternação>"
    And acionar opção Caráter Atendimento como Urgência e Emergência
    #And selecionar campo gerarAuditoria como Sim
    #And selecionar um tipo de auditoria "<campTipoAuditoria>"
    And acionar opção não para gerar auditoria
   # And selecionar campo Tipo internação clinica
    And informar campo CID como "<cid>"
    Then devo acionar botão cadastrar
    And o sistema deverá apresentar mensagem na modal: "Registro cadastrado com sucesso!!!"
    #ATRIBUIR VISITAS
    And acionar o menu auditoria concorrente gestão de visitas
    And acionar opção filtro de pesquisa
    And informar campo codigo beneficiario "<codBeneficiario2>"
    And aguardar tempo do match
    And acionar botão que permite pesquisar
    And selecionar um internado botão ações alterar visitas
    And informar auditor "<auditor1>"
    And infromar data inicio "<dtInicio>"
    And infromar data fim "<dtFim>"
    And acionar Gravar para atribuir visita
    And o sistema deverá apresentar mensagem na modal de Alterar Visita: "Registro alterado com sucesso!!!"

    Examples:

      | codBeneficiario1 | codBeneficiario2 | codPrestador | dataInternação | campTipoAuditoria | auditor1       | dtInicio   | dtFim      | cid  |
      | 32               | 0000080560067    | 26840        | 02/02/2022     | Auditoria de UTI  | robson.auditor | 13/03/2020 | 29/03/2020 | D600 |