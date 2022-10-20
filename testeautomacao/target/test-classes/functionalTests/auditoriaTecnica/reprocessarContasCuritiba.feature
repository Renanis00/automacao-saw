@reprocessar32
Feature: Cenário de Negócio - Auditoria de contas

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "Auditor_QA" e senha "abelha@!"

    @reprocessarAuditoriaCuritiba
    Scenario Outline: AUDITORIA DE INTERNAÇÃO

      When acessar listagem de auditorias
      And reprocessar auditoria de numero "<numeroAuditoria>"


      Examples:
        | numeroAuditoria |
