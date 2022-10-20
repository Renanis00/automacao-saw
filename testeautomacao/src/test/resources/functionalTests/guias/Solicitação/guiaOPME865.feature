@guiaOPMEII
Feature: Cenário de Negócio - GUIA DE OPME

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "auto_prest865" e senha "fazenda@!"
    And informe usuario "auto_prest865" e senha "brasil@!1"
    #pronto socorro - 10101039

  @guiaOPMEemAnalise
  Scenario Outline: Cadastrar guia SP/SADT - OPME - EM ANÁLISE
    #GUIA SPSADT
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar Cód. na Operadora como "<codigoSolicitante>"
    And selecionar campo codigo na operadora como "<codigoExecutante>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And informar campo e-mail como "<email>"
    And informar campo telefone "<ddd>" "<tel>"
    And informar campo Código CBO-c como "<CBO>"
    Then devo acionar opção para gravar
    And o sistema deverá apresentar mensagem: "AUTORIZADA"
    And acionar opção de anexo
    And acionar opção de novo anexo
    And acionar opção sim para anexo
    And informar campo telefone "<tel2>"
    And informar campo justificativa tecnica "<justTecnica>"
    And selecionar o campo tabela "<tabela2>"
    And informar campo Cód como "<cod>"
    And informar campo Opção como "<opcao>"
    #And informar campo Qtd Solic como "<qtdSolic>
    Then devo acionar opção para gravar
    And o sistema deverá apresentar mensagem: "EM ANÁLISE"


    Examples:

      | numeroDaCarteira | codigoExecutante                                  | codigoSolicitante  |nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | data       | horaInicio | horaFim | qtdRealizada | tipoDeguia | numeroGuia | tel2           | justTecnica                           | tabela2           | cod      | opcao | qtdSolic | CBO                    |
      | 865              | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 10012417           |97340              | TUSS -- Procedimentos e eventos em saúde | 0002400367001   | Eletiva            | 10101039        | 11000603       | 1               | Pronto Socorro    | Não Acidente        | TESTE TRIX       | robson.cardoso@gmail.com | 61  | 981812233 | 25/11/2020 | 08:00      | 12:00   | 1            | SP/SADT    | 2123692406 | (61)98181-2558 | justificativa para realização do OPME | TUSS -- Materiais | 70000239 | 1     | 1        | Médico cirurgião geral |
