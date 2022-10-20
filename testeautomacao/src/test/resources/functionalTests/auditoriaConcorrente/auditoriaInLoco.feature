@sawCuritiba
Feature: Cenário de Negócio - Auditoria In-loco

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "auto_auditor32" e senha "Antena@!1"

  @inlocoLp
  Scenario Outline: Auditoria de LP In-loco - Solicitar Parecer
    #EXECUTAR AUDITORIA
    ##When acionar o menu auditar internados
    ##And selecionar campo status como "<status>"
    ##And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
    ##And acionar opção pesquisar
    ##And selecionar um internado
    # SOLICITAR PARECER
   # And acionar botao acoes solicitar parecer
    #And marcar checkBox Usuario
    #And informar campo usuario "<usuarioParecer>"
    #And acionar botao solicitar
    #And acionar botao sair
    #RESPONDER PARECER
    #And informe usuario "g.auditor" e senha "estagio@!"
    #And acionar o menu auditar internados
    #And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
    #And acionar opção pesquisar
    #And selecionar um internado
    #And informar campo descrição do parecer "<descricaoParecer>"
    #And acionar opção finalizar
    #And acionar botao sair
   # DEFINIR FREQUENCIA DE VISITAS APÓS O MATCH DO AUDITOR
   # And informe usuario "robson.auditor" e senha "estagio@!"
   # And acionar o menu auditar internados
   # And selecionar campo status como "<status>"
   # And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
   # And acionar opção pesquisar
   # And selecionar um internado
    ##And acionar botao frequencia visita
    ##And informar campo Frequência da visita "<auditoriaDeLongaPermanencia>"
    ##And acionar botao salvar
    #ENCAMINAR AUDITORIA
    ##And acionar opção encaminhar
    ##And acionar radioButton tipo de auditor usuario
    ##And informar usuario como "<encaminharUser>"
    ##And selecionar tipo de auditoria "<nomeTipoAuditoria>"
    ##And informar data de atendimento como "<dtAtendimento>"
    ##And acionar opção que permite agendar
    #REENCAMINAR AUDITORIA
    ##And acionar botao sair
    ##And informe usuario "teste_32a" e senha "Antena@!1"
    ##And acionar o menu auditar internados
    ##And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
    ##And acionar opção pesquisar
    ##And selecionar um internado
    ##And acionar opção encaminhar
    ##And acionar radioButton tipo de auditor usuario
    ##And informar usuario como "<encaminharUser2>"
    ##And selecionar tipo de auditoria "<nomeTipoAuditoria>"
    ##And informar data de atendimento como "<dtAtendimento>"
    ##And acionar opção que permite agendar
    And acionar botao sair
    And informe usuario "auto_auditor32" e senha "Antena@!1"
    And acionar o menu auditar internados
    And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
    And acionar opção pesquisar
    And selecionar um internado
    #AUDITAR INTERNADO E PREENCHER FORMULARIO DE AUDITORIA DE LONGA PERMANENCIA
    And acessar formulário de LP
    And informar campo patologia como "<patologia>"
    And informar campo diagnostico do internado "<diagnostico>"
    And informar campo evolução clinica "<evolucaoClinica>"
    And infrmar campo parecer enfermagem "<parecerEnf>"
    And infrmar campo parecer medico "<parecerMedico>"
    ##And marcar todos os checkBox do SETOR RESPONSÁVEL
    ##And informar campo retorno setor "<retornoSetor>"
    Then devo acionar opção que permite encerar
    And o sistema deverá apresentar mensagem:  Visita realizada com sucesso! " Visita realizada com sucesso!"
    #ALTA
    ##And acionar opção para alta
    ##And informar campo descrição "<descricaoAlta>"
    ##And infromar campo data alta "<dataAlta>"
    ##And selecionar campo tipo de alta "<tipoAlta>"
    ##And acionar botão para confirmar a alta
    ##And o sistema deverá apresentar mensagem:  Visita realizada com sucesso! " Visita realizada com sucesso!"
    ##And acionar opção que permite atualizar


    Examples:

      | nomeDoWorkflow  | dataInocioworkflow | dataAgendamento | descricao                             | tempMaximoAtendimento | campoAuditor     | dataInocioAuditoria | dataFimAuditoris | inicioDoExpediente | fimDoExpediente | inicioDoExpedFimDeSemana | fimDoExpedFimDeSemana | nomeDoFormularioPadrao | nomeDoFormularioPersonalizado | configEstatica    | usuarioParecer | usuario   | nomeTipoAuditoria              | tipoDeAuditoria    | status     | codOperadora | codBeneficiario | descricaoParecer | auditoriaDeLongaPermanencia | dtAtendimento | encaminharUser | encaminharUser2 | patologia    | diagnostico  | evolucaoClinica | parecerEnf                        | parecerMedico  | retornoSetor                                      | descricaoAlta              | dataAlta   | tipoAlta    |
      | Workflow Cardio | 11/02/2020         | 19/02/2020      | Workflow para auditoria de internação | 4                     | robson.auditor32 | 11/02/2020          | 15/02/2020       | 0800               | 1800            | 0800                     | 1200                  | formulario padrão      | formulario personalizado      | formulario padrão | g.auditor      | g.auditor | Auditoria de Longa Permanência | Auditoria Cardíaca | AGUARDANDO | 32           | 0000076102963   | Parecer ok       | 10                          | 01/04/2022    | teste_32a      | auto_auditor32  | corona virus | corona virus | sem evolução    | febre alta e pneumonia necrosante | morte iminente | no momento não foi recomendado a alta do paciente | melhora súbita após elixir | 12/03/2020 | Alta Curado |