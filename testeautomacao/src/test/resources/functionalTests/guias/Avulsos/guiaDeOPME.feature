@guiaOPMEtest
Feature: Cenário de Negócio - GUIA DE OPME

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "auto_prest865" e senha "baleia@!"
    #pronto socorro - 10101039

  @guiaOPME1
  Scenario Outline: Cadastrar guia SP/SADT - OPME - EM ANÁLISE
    #GUIA SPSADT
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And informar campo e-mail como "<email>"
    And informar campo telefone "<ddd>" "<tel>"
    And devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "AUTORIZADA"
    And acionar opção de anexo
    And acionar opção de novo anexo
    And acionar opção sim para anexo
    And informar campo telefone "<tel2>"
    And informar campo justificativa tecnica "<justTecnica>"
    And selecionar o campo tabela "<tabela2>"
    And informar campo Cód como "<cod>"
    And informar campo Opção como "<opcao>"
    And informar campo Qtd Solic como "<qtdSolic>"
    Then devo acionar opção para gravar
    And o sistema deverá apresentar mensagem: "EM ANÁLISE"


    Examples:

      | numeroDaCarteira | codigoNaOperadora                                 | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | data       | horaInicio | horaFim | qtdRealizada | tipoDeguia | numeroGuia | tel2           | justTecnica                           | tabela2           | cod      | opcao | qtdSolic |
      | 865              | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 0001873805105   | Eletiva            | 10101039        | 11000603       | 1               | Pronto Socorro    | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | 25/11/2020 | 08:00      | 12:00   | 1            | SP/SADT    | 2123692406 | (61)98181-2558 | justificativa para realização do OPME | TUSS -- Materiais | 70000239 | 1     | 1        |

#2104425382
  @guiaOPME2
  Scenario Outline: Cadastrar guia De OPME
    #GUIA DE OPME
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia de OPME
    And acionar opção de pesquisar Guia Referenciada
    And selecionar campo tipo de guia "<tipoDeguia>"
    And informar campo Número Guia como "<numeroGuia>"
    And acionar botão para pesquisar
    And acionar opção de realização do vinculo
    And informar campo telefone "<tel>"
    And informar campo justificativa tecnica "<justTecnica>"
    And selecionar o campo tabela "<tabela>"
    And informar campo Cód como "<cod>"
    And informar campo Opção como "<opcao>"
    And informar campo Qtd Solic como "<qtdSolic>"
    Then devo acionar opção para gravar
    #And o sistema deverá apresentar mensagem: "CADASTRADA"

    Examples:

      | tipoDeguia | numeroGuia | tel2           | justTecnica                           | tabela2           | cod      | opcao | qtdSolic |
      | SP/SADT    | 2123692406 | (61)98181-2558 | justificativa para realização do OPME | TUSS -- Materiais | 70000239 | 1     | 1        |