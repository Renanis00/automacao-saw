@grupoDeUsuario
Feature: Cenário de Negócio - Auditoria Técnica

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "adm33" e senha "agulha@!"
    And informe o usuario "adm33" e senha "quente@!"


  @paramGrupoDeUsuarioAaudAdmin
  Scenario Outline: Auditoria Técnica - Parametrizar Grupo de Usuarios - Auditoria Administrativa

    When acionar o menu Auditoria Técnica Grupo de usuários
    And acionar opção  Novo Grupo de Usuários
    And infromar Nome do Grupo como "<nomeDoGrupo>"
    And marcar checkBox Permite participar da auditoria técnica
    And marcar Tipo de Auditoria Administravia
    And infromar a Descrição do Grupo como "<decricaoDoGrupo>"
    Then devo acionar opção para cadastrar
    And infromar auditor como "<auditor>"
    And infromar data inicial e final "<dataInicio>" "<dataFinal>"
    And acionar opção para cadastrar


    Examples:

      | nomeDoGrupo                          | decricaoDoGrupo                   | auditor        | dataInicio | dataFinal  |
      | Grupo de Auditoria Administrativa 02 | Grupo de Auditoria Administrativa | robson.auditor | 01/10/2020 | 31/10/2020 |