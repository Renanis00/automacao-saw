@guiaHonorarios
Feature: Cenário de Negócio - GUIA DE HONORARIOS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "auto_prest865" e senha "Cidade@!1"
    #And informe usuario "auto_prest35" e senha "cama@!"
    #And informe usuario "teste_prest35" e senha "cama@!"
    #And informe usuario "rob_prest865" e senha "veneza@!"
    #And informe usuario "uni978" e senha "veneza@!"
    #pronto socorro - 10101039

  @guiaHonorarios1
  Scenario Outline: SAW - Guia De Internação - Informa a data de internação/alta do beneficiário!
    #GUIA DE INTERNAÇÃO
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar opção Internação
    And informar Número da Carteira como "<operadora>""<numCarteira>"
    And informar campo codigo na operadora "<codNaoperadora>"
    And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
    And informar campo codigo da operadora como "<codDaOperadora>"
    And informar campo data sugerida para internaçõa "<dataSugeInternacao>"
    And selecionar campo carater de internação como "<caraterInternacao>"
    And selecionar campo Tipo internação "<selTipoDeInternacao>"
    And selecionar campo regime de internação como "<regimeInternacao>"
    #==================================================
    And selecionar previsao de uso de OPME como não
    And selecionar previsao de uso de quimioterapia como não
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
   # And informar campo e-mail "<email>"
   # And informar campo telefone como "<ddd>" "<tel>"
    Then deve acionar o botão gravar
    And acionar opção internação alta
    And infromar Data Evento como "<dataEvent>"
    And acionar opção Tipo Evento como Internacao
    And acionar a opção que permite cadastrar
    #And selecionar campo Motivo Encerramento como "<motivoEncerramento>"
    #And acionar a opção que permite cadastrar


    Examples:

      | operadora | numCarteira   | codNaoperadora | nomeProfExecutante | codDaOperadora              | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente | tabela                                                          | codTabela                                      | qtd | tabelaProc                               | codTabelaProc | qtd2 | email         | ddd | tel       | tabelaProc                               | dataEvent | motivoEncerramento |
      | 865       | 0002392408000 | 11000947       | adalto             | 11000947 -- HOSPITAL SEPACO | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | TESTE TRIX   | Não Acidente      | DIÁRIA - TUSS -- Taxas hospitalares, diárias e gases medicinais | 60000775 - DIÁRIA DE  HOSPITAL DIA APARTAMENTO | 1   | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1    | trix@trix.com | 61  | 987877777 | TUSS -- Procedimentos e eventos em saúde |           | Outros motivos     |

#51029008
  @guiaHonorarios2
  Scenario Outline: Cadastrar guia De Honorários
    #GUIA DE HONORÁRIOS
    #When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia de Honorários
    And acionar opção pesquisar Guia Referenciada
    And selecionar campo tipo de guia "<tipoDeguia>"
    And informar campo Número Guia como "<numeroGuia>"
    And selecionar campo operadora ou prestador "<opPrest>"
    And acionar botão para pesquisar
    And acionar opção de realização do vinculo
    #And informar campo Código na Operadora "<codNaOperadora>"
    And informar opção Código na Operadora "<codNaOperadora>"



    #And informar campo nome do Profissional Solicitante "<nomeProfSolicitnte>"
    #And informar campo Indicação Clínica "<indicacaoClinica>"
    #And informar o campo Tabela  "<tabela>"
    #And informar campo Código do Procedimento "<codProcedimento>"
    #And informar campo Qtd Solic "<qtdSolic>"
   # Then devo acionar opção para gravar
    #And o sistema deverá apresentar mensagem: "CADASTRADA"

    Examples:

      | tipoDeguia | numeroGuia | opPrest   | codNaOperadora | nomeProfSolicitnte | indicacaoClinica  | tabela                                   | codProcedimento | qtdSolic |
      | INTERNAÇÃO | 51029008   | Prestador | 11000947       | 558449             | Indicação clinica | TUSS -- Procedimentos e eventos em saúde | 10102019        | 1        |