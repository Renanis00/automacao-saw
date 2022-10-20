@guias
Feature: Cenário de Negócio - GUIA DE INTERNAÇÃO

  Beneficiario deve ter plano com acomodação para apartamento.

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "auto_prest865" e senha "baleia@!"
    #And informe usuario "auto_prest35" e senha "cama@!"
   # And informe usuario "teste_prest35" e senha "webinar@!"

  @guiaInternacao
  Scenario Outline: SAW - Guia De Internação
    #GUIA DE INTERNAÇÃO
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar opção Internação
    And informar Número da Carteira como "<operadora>""<numCarteira>"
    And informar campo codigo na operadora "<codNaoperadora>"
    And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
    ###############################################################
    And informar campo codigo da operadora como "<codDaOperadora>"
    And informar campo data sugerida para internaçõa "<dataSugeInternacao>"
    And selecionar campo carater de internação como "<caraterInternacao>"
    And selecionar campo Tipo internação "<selTipoDeInternacao>"
    And selecionar campo regime de internação como "<regimeInternacao>"
    And selecionar previsao de uso de OPME como não
    And selecionar previsao de uso de quimioterapia como não
    And informar Indicação Clínica como "<indicClinica>"
    And selecionar indicação de acidente como "<indicacaoAcidente>"
    And selecionar o campo tabela como "<tabela>"
    And selecionar codigo da tabela "<codTabela>"
    And informar campo quantidade diaria "<qtd>"
    And selecionar o campo tabela procedimentos "<tabelaProc>"
    And selecionar codigo procedimento da tabela "<codTabelaProc>"
    And informar campo quantidade procedimento "<qtd2>"
    And informar campo Data Provável da Admissão Hospitalar "<data2>"
    And informar campo e-mail "<email>"
    And informar campo telefone como "<ddd>" "<tel>"
    Then deve acionar o botão gravar


    Examples:

      | operadora | numCarteira   | codNaoperadora                             | nomeProfExecutante | codDaOperadora   | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente | tabela                                                          | codTabela                                      | qtd | tabelaProc                               | codTabelaProc | qtd2 | email         | ddd | tel       |
      | 35        | 3147000054006 | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | adalto             | 11000603 -- AACD | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | Indicação    | Não Acidente      | DIÁRIA - TUSS -- Taxas hospitalares, diárias e gases medicinais | 60000775 - DIÁRIA DE  HOSPITAL DIA APARTAMENTO | 1   | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1    | trix@trix.com | 61  | 987877777 |

