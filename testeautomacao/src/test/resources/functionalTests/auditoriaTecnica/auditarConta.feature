@auditarconta32
Feature: Cenário de Negócio - Auditoria de contas

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "Auditor_QA" e senha "brasil@!"

    @internacaoAuditoriaEnfermagem
    Scenario Outline: AUDITORIA DE INTERNAÇÃO

      When acessar listagem de auditorias
      #And buscar lote "<numeroLote>"
      And selecionar tipo da conta "<tipoAuditoria>"
      And selecionar status da auditoria "<statusAuditoria>"
      And pesquisar
      And acionar a opção Editar Auditoria Técnica "<ordemAuditoria>"
      And abrir tela de auditoria técnica
      And acessar aba de Procedimentos
      And realizar glosa de quantidade "<glosaQtd>"


      Examples:
        | ordemAuditoria  | numeroLote |  tipoAuditoria      | statusAuditoria            | glosaQtd |
        | 1               | 208967     | CONTA DE INTERNAÇÃO | Em Auditoria de Enfermagem | 1        |

