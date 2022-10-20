@workflow
Feature: Cenário de Negócio - Auditoria Técnica

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "adm33" e senha "agulha@!"
    And informe o usuario "adm33" e senha "baleia@!"


  @paramWorkflowDeTrabalho
  Scenario Outline: Auditoria Técnica - Parametrizar Workflow de Trabalho

    When acionar o menu Auditoria Técnica Workflow de Trabalho
    And acionar opção Novo Workflow de Trabalho
    And infromar campo Nome como "<nome>"
    And acionar opção para cadastrar Workflow
    And acionar opção para editar
    And acionar opção nova etapa
    And infromar campo Nome da Etapa como "<nomeEtapa>"
    And selecionar campo Grupo de Usuario como "<grupoUsuario>"
    And informar campo prazo dias como "<prazoDias>"
    And selecionar campo Ação Automática como "<acaoAutomatica>"
    Then devo acionar opção para gravar nova etapa


    Examples:

      | nome                             | nomeEtapa               | grupoUsuario                  | prazoDias | acaoAutomatica         |
      | Workflow da Auditoria Técnica 02 | Auditoria De Enfermagem | Grupo de Auditoria Enfermagem | 96        | Envia Alerta de Atraso |