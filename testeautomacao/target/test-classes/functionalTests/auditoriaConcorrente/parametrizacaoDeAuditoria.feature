@sawCuritiba @parametrizacaoDeAuditoria
Feature: Cenário de Negócio - Parametrização De Auditoria

  Background:
    Given que eu acesse o sistema SAW
   # And informe usuario "adm32" e senha "junior@!"
    And informe usuario "g.auditor" e senha "baleia@!"

  Scenario Outline: Parametrização De Auditoria
    #FORMULARIO PADRÃO
    When acionar o menu auditoria concorrente formulario padrão
    And acionar opcao novo
    And informar campo nome como "<nomeDoFormularioPadrao>"
    And acionar botão gravar
    #FORMULARIO PERSONALIZADO
    And acionar o menu auditoria concorrente formulario personalizado
    And acionar opcao novo formulario personalizado
    And informar nome como "<nomeDoFormularioPersonalizado>"
    And acionar opção salvar formulario
    #TIPOS DE AUDITORIA
    And acionar o menu auditoria concorrente tipos
    And acionar opcao novo
    And informar campo nome como "<nomeTipoAuditoria>"
    #And selecionar campo configuração estatica como "<configEstatica>"
    And selecionar campo configuração Dinamica como "<configDinamica>"
    And acionar botão gravar
    #USUÁRIO
    And acionar o menu auditoria concorrente usuário
    And selecionar campo ações como alterar
    And informar campo usuario como "<usuario>"
    And acionar opção para adicionar
    And acionar botão gravar usuario
    #CRIAR WORKFLOW
    And acionar o menu auditoria concorrente workflow
    And acionar opção novo
    And informar campo nome do workflow como "<nomeDoWorkflow>"
    And informar campo data inicio para workflow "<dataInocioworkflow>"
    And informar campo data fim para workflow "<dataFimworkflow>"
    And marcar checkBox Habilitado
   # And marcar checkBox Gerar auditoria
    And informar campo tipo de auditoria como "<tipoDeAuditoria>"
    And informar campo descrição como "<descricao>"
    And informar tempo maximo de atendimento como "<tempMaximoAtendimento>"
  #  And acionar aba auditores
   #VINCULAR AUDITORIA A UM TIPO DE AUDITORIA
   ##########################################
    And informar o campo auditor como "<campoAuditor>"
    And informar campo data inicio para auditoria "<dataInocioAuditoria>"
    And informar campo data fim para auditoria "<dataFimAuditoris>"
    And marcar escala segunda-feira como "<inicioDoExpediente>" "<fimDoExpediente>"
    And marcar escala terça-feira como "<inicioDoExpediente>" "<fimDoExpediente>"
    And marcar escala quarta-feira como "<inicioDoExpediente>" "<fimDoExpediente>"
    And marcar escala quinta-feira como "<inicioDoExpediente>" "<fimDoExpediente>"
    And marcar escala sexta-feira como "<inicioDoExpediente>" "<fimDoExpediente>"
    And marcar escala sabado como "<inicioDoExpedFimDeSemana>" "<fimDoExpedFimDeSemana>"
    And marcar escala domingo como "<inicioDoExpedFimDeSemana>" "<fimDoExpedFimDeSemana>"
    And acionar botão adicionar
    Then devo acionar opção gravar
    And o sistema deverá apresentar mensagem: Registro cadastrado com sucesso "	Registro cadastrado com sucesso!!! "

    Examples:

      | nomeDoWorkflow            | dataInocioworkflow | dataFimworkflow | descricao                             | tempMaximoAtendimento | campoAuditor | dataInocioAuditoria | dataFimAuditoris | inicioDoExpediente | fimDoExpediente | inicioDoExpedFimDeSemana | fimDoExpedFimDeSemana | nomeDoFormularioPadrao | nomeDoFormularioPersonalizado | configEstatica    | configDinamica           | usuario | nomeTipoAuditoria  | tipoDeAuditoria    |
      | Workflow Auditoria De UTI | 11/02/2020         | 15/02/2020      | Workflow para auditoria de internação | 4                     | robson       | 17/02/2020          | 15/03/2020       | 0800               | 1800            | 0800                     | 1200                  | formulario padrão      | formulario personalizado      | formulario padrão | formulario personalizado | robson  | Auditoria Cardíaca | Auditoria Cardíaca |



