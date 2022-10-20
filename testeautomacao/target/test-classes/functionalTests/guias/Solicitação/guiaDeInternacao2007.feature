@2007Internacao
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "uni2007" e senha "antena@!"
    And informe usuario "uni2007" e senha "baleia@!"

  @2007InternacaoAutorizada
  Scenario Outline: SAW - Guia De Internação - EM ANÁLISE
    #GUIA DE INTERNAÇÃO
    When acionar o menu TISS Painel de execucao
    And acionar opção Internação
    And informar Número da Carteira como  "<numCarteira>"
    And informar campo codigo na operadora "<codNaoperadora>"
    And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
    #And informar campo codigo da operadora como "<codDaOperadora>"
    And informar o campo codigo da operadora como "<codDaOperadora>"
    And informar campo data sugerida para internaçõa "<dataSugeInternacao>"
    And selecionar campo carater de internação como "<caraterInternacao>"
    And selecionar campo Tipo internação "<selTipoDeInternacao>"
    And selecionar campo regime de internação como "<regimeInternacao>"
    #==================================================
    And selecionar previsao de uso de quimioterapia como não
    And selecionar previsao de uso de OPME como não
    #==================================================
    And informar Indicação Clínica como "<indicClinica>"
    And selecionar indicação de acidente como "<indicacaoAcidente>"
    And selecionar o campo tabela como "<tabela>"
    And selecionar codigo da tabela "<codTabela>"
    And informar campo quantidade diaria "<qtd>"
    And selecionar o campo tabela procedimentos "<tabelaProc>"
    And selecionar codigo procedimento da tabela "<codTabelaProc>"
    And informar campo quantidade procedimento "<qtd2>"
    And informar campo Data Provável da Admissão Hospitalar "<data2>"
    Then deve acionar o botão gravar
    And o sistema deverá apresentar mensagem: "EM ANÁLISE"



    Examples:

      | numCarteira      | codNaoperadora | nomeProfExecutante | codDaOperadora | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica    | indicacaoAcidente | tabela                                                          | codTabela                                                           | qtd | tabelaProc                               | codTabelaProc | qtd2 | email         | ddd | tel       | tabelaProc                               | dataEvent | motivoEncerramento | resalva |
      | 0100000768100033 | 60678604000202 | 87704              | 60678604000202 | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | Indicação Teste | Não Acidente      | DIÁRIA - TUSS -- Taxas hospitalares, diárias e gases medicinais | 60000694 - DIÁRIA DE  ENFERMARIA DE 3 LEITOS COM BANHEIRO PRIVATIVO | 1   | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1    | trix@trix.com | 61  | 987877777 | TUSS -- Procedimentos e eventos em saúde |           | Outros motivos     | teste   |
