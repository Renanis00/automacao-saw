@fluxoAuditConc
Feature: Cenário de Negócio - Adicionar Beneficiário Internado

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni32" e senha "antena@!"

  @fluxo1
  Scenario Outline: Adicionar Beneficiário Internado - atribuir visita automatica
    #ADICIONAR BENEFICIARIO INTERNADO
    When acionar o menu auditoria concorrente internações
    And acionar botão para adicionar beneficiario internado
    And informar campo codigo beneficiario como "<codBeneficiario1>""<codBeneficiario2>"
    And informar campo codigo prestador como "<codPrestador>"
    And informar campo data da internação como "<dataInternação>"
    And acionar opção Caráter Atendimento como Urgência e Emergência
    And selecionar campo gerarAuditoria como Sim
    And selecionar um tipo de auditoria "<campTipoAuditoria>"
    #And acionar opção não para gerar auditoria
    And selecionar campo Tipo internação clinica
    And informar campo CID como "<cid>"
    Then devo acionar botão cadastrar
    And o sistema deverá apresentar mensagem na modal: "Registro cadastrado com sucesso!!!"
    #ATRIBUIR VISITAS
    And acionar o menu auditoria concorrente gestão de visitas
    And acionar opção filtro de pesquisa
    And informar campo codigo beneficiario "<codBeneficiario2>"
    #And aguardar tempo do match
    And acionar botão que permite pesquisar
    And selecionar um internado botão ações alterar visitas
    And informar auditor "<auditor1>"
    And infromar data inicio "<dtInicio>"
    And infromar data fim "<dtFim>"
    And acionar Gravar para atribuir visita
    And o sistema deverá apresentar mensagem na modal de Alterar Visita: "Registro alterado com sucesso!!!"

    Examples:

      | codBeneficiario1 | codBeneficiario2 | codPrestador | dataInternação | campTipoAuditoria | auditor1       | dtInicio   | dtFim      | cid  |
      | 32               |  0000075604612   | 26840        | 13/03/2020     | Auditoria de UTI  | auto_auditor32 | 13/03/2022 | 29/03/2022 | D600 |

  @fluxo2
  Scenario Outline: Auditoria In-loco - Solicitar Parecer
    #EXECUTAR AUDITORIA
    When acionar o menu auditar internados
    And selecionar campo status como "<status>"
    And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
    And acionar opção pesquisar
    And selecionar um internado
    #SOLICITAR PARECER
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
    #DEFINIR FREQUENCIA DE VISITAS APÓS O MATCH DO AUDITOR
   # And informe usuario "robson.auditor" e senha "estagio@!"
  #  And acionar o menu auditar internados
   # And selecionar campo status como "<status>"
   # And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
   # And acionar opção pesquisar
   # And selecionar um internado
    And acionar botao frequencia visita
    And informar campo Frequência da visita "<auditoriaDeLongaPermanencia>"
    And acionar botao salvar
    #ENCAMINAR AUDITORIA
    And acionar opção encaminhar
    And acionar radioButton tipo de auditor usuario
    And informar usuario como "<encaminharUser>"
    And selecionar tipo de auditoria "<nomeTipoAuditoria>"
    And informar data de atendimento como "<dtAtendimento>"
    And acionar opção que permite agendar
    #REENCAMINAR AUDITORIA
    And acionar botao sair
    And informe usuario "g.auditor" e senha "estagio@!"
    And acionar o menu auditar internados
    And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
    And acionar opção pesquisar
    And selecionar um internado
    And acionar opção encaminhar
    And acionar radioButton tipo de auditor usuario
    And informar usuario como "<encaminharUser2>"
    And selecionar tipo de auditoria "<nomeTipoAuditoria>"
    And informar data de atendimento como "<dtAtendimento>"
    And acionar opção que permite agendar
    And acionar botao sair
    And informe usuario "robson.auditor" e senha "estagio@!"
    And acionar o menu auditar internados
    And informar codigo da operadora e codigo do beneficiario "<codOperadora>""<codBeneficiario>"
    And acionar opção pesquisar
    And selecionar um internado
    #AUDITAR INTERNADO E PREENCHER FORMULARIO DE AUDITORIA DE LONGA PERMANENCIA
    And informar campo patologia como "<patologia>"
    And informar campo diagnostico do internado "<diagnostico>"
    And informar campo evolução clinica "<evolucaoClinica>"
    And infrmar campo parecer enfermagem "<parecerEnf>"
    And infrmar campo parecer medico "<parecerMedico>"
    And marcar todos os checkBox do SETOR RESPONSÁVEL
    And informar campo retorno setor "<retornoSetor>"
    Then devo acionar opção que permite encerar
    And o sistema deverá apresentar mensagem:  Visita realizada com sucesso! " Visita realizada com sucesso!"
    #ALTA
    And acionar opção para alta
    And informar campo descrição "<descricaoAlta>"
    And infromar campo data alta "<dataAlta>"
    And selecionar campo tipo de alta "<tipoAlta>"
    And acionar botão para confirmar a alta



    Examples:

      | nomeDoWorkflow  | dataInocioworkflow | dataAgendamento | descricao                             | tempMaximoAtendimento | campoAuditor     | dataInocioAuditoria | dataFimAuditoris | inicioDoExpediente | fimDoExpediente | inicioDoExpedFimDeSemana | fimDoExpedFimDeSemana | nomeDoFormularioPadrao | nomeDoFormularioPersonalizado | configEstatica    | usuarioParecer | usuario   | nomeTipoAuditoria              | tipoDeAuditoria    | status     | codOperadora | codBeneficiario | descricaoParecer | auditoriaDeLongaPermanencia | dtAtendimento | encaminharUser | encaminharUser2 | patologia    | diagnostico  | evolucaoClinica | parecerEnf                        | parecerMedico  | retornoSetor                                      | descricaoAlta              | dataAlta   | tipoAlta    |
      | Workflow Cardio | 11/02/2020         | 19/02/2020      | Workflow para auditoria de internação | 4                     | robson.auditor32 | 11/02/2020          | 15/02/2020       | 0800               | 1800            | 0800                     | 1200                  | formulario padrão      | formulario personalizado      | formulario padrão | g.auditor      | g.auditor | Auditoria de Longa Permanência | Auditoria Cardíaca | AGUARDANDO | 32           | 0000023595540   | Parecer ok       | 10                          | 13/03/2020    | g.auditor      | robson.auditor  | corona virus | corona virus | sem evolução    | febre alta e pneumonia necrosante | morte iminente | no momento não foi recomendado a alta do paciente | melhora súbita após elixir | 12/03/2020 | Alta Curado |