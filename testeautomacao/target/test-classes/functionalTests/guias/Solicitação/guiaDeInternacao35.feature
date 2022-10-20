@35Internacao
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "uni35" e senha "antena@!"
    And informe usuario "uni35" e senha "baleia@!"

  @35InternacaoAutorizada
  Scenario Outline: SAW - Guia De Internação - AUTORIZADA
    #GUIA DE INTERNAÇÃO
    When acionar o menu TISS Painel de execucao
    And acionar opção Internação
    And informar Número da Carteira como "<operadora>""<numCarteira>"
    And informar campo codigo na operadora "<codNaoperadora>"
   # And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
    #And informar campo codigo da operadora como "<codDaOperadora>"
    And informar o campo codigo da operadora como "<codDaOperadora>"
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
    And selecionar o campo tabela taxa como "<tabela1>"
    And informar codigo da tabela taxa "<codTabela1>"
    And informar campo quantidade taxa "<qtd1>"
    And selecionar o campo tabela procedimentos "<tabela2>"
    And informar codigo procedimento da tabela "<codTabela2>"
    And informar campo quantidade procedimento "<qtd2>"
    And selecionar o campo tabela procedimentos "<tabela3>"
    And informar codigo procedimento da tabela "<codTabela3>"
    And informar campo quantidade procedimento "<qtd3>"
    And informar campo Data Provável da Admissão Hospitalar "<data2>"
   # And informar campo e-mail "<email>"
   # And informar campo telefone como "<ddd>" "<tel>"
    Then deve acionar o botão gravar
    #And armazenar numero da guia de internação autorizada
    And armazenar numero da guia de internação autorizada campo grande
    And acionar opção Clique aqui para verificar a auditoria!
   # And acionar opção para atender
    And acionar opção para autorizar todos
    And informar ressalva e acionar opção de autorizar "<resalva>"
    And acionar opção Clique aqui para aprovar solicitação
    And devo acionar opção que permite encerrar
 #   And o sistema deverá apresentar mensagem: "AUTORIZADA"
 #   And acionar opção internação alta
 #   And selecionar campo Motivo Encerramento como "<motivoEncerramento>"
 #   And infromar Data Evento como "<dataEvent>"
  #  And acionar opção Tipo Evento como Internacao
   # And acionar a opção que permite cadastrar

   # And acionar a opção que permite cadastrar


    Examples:

      | operadora | numCarteira   | codNaoperadora | nomeProfExecutante | codDaOperadora | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente  | tabela1                                                  | codTabela1 | qtd1 | tabela2                                  | codTabela2    | qtd2    | tabela3                                  | codTabela3 | qtd3 |email         | ddd | tel       | tabelaProc                               | dataEvent | motivoEncerramento | resalva | data2      |
      | 35        | 4335017017006 | 42105          | adalto             | 750300011      | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | Indicação    | Não Acidente       | TUSS -- Taxas hospitalares, diárias e gases medicinais   | 60000333   | 1    | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1       | TUSS -- Procedimentos e eventos em saúde |  30203015  |  1   |trix@trix.com | 61  | 987877777 | TUSS -- Procedimentos e eventos em saúde |           | Outros motivos     | teste   | 22/04/2022 |


  @35InternacaoItensAdicionais
  Scenario Outline: SAW - Guia De Internação - AUTORIZADA
    #GUIA DE INTERNAÇÃO
    When acionar o menu TISS Painel de execucao
    And acionar opção Internação
    And informar Número da Carteira como "<operadora>""<numCarteira>"
    And informar campo codigo na operadora "<codNaoperadora>"
   # And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
    #And informar campo codigo da operadora como "<codDaOperadora>"
    And informar o campo codigo da operadora como "<codDaOperadora>"
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
    And apagar linhas de procedimentos
    And selecionar o campo tabela taxa como "<tabela1>"
    And informar codigo da tabela taxa "<codTabela1>"
    And informar campo quantidade taxa "<qtd1>"
    And selecionar o campo tabela procedimentos "<tabela2>"
    And informar codigo procedimento da tabela "<codTabela2>"
    And informar campo quantidade procedimento "<qtd2>"
    And adicionar e selecionar o campo tabela3 procedimentos "<tabela3>"
    And informar codigo procedimento3 da tabela "<codTabela3>"
    And informar campo quantidade3 procedimento "<qtd3>"
    And adicionar e selecionar o campo tabela4 procedimentos "<tabela4>"
    And informar codigo procedimento4 da tabela "<codTabela4>"
    And informar campo quantidade4 procedimento "<qtd4>"
    And adicionar e selecionar o campo tabela5 procedimentos "<tabela5>"
    And informar codigo procedimento5 da tabela "<codTabela5>"
    And informar campo quantidade5 procedimento "<qtd5>"
    And adicionar e selecionar o campo tabela6 procedimentos "<tabela6>"
    And informar codigo procedimento6 da tabela "<codTabela6>"
    And informar campo quantidade6 procedimento "<qtd6>"
    And informar campo Data Provável da Admissão Hospitalar "<data2>"
   # And informar campo e-mail "<email>"
   # And informar campo telefone como "<ddd>" "<tel>"
    Then deve acionar o botão gravar
    #And armazenar numero da guia de internação autorizada
    And armazenar numero da guia de internação autorizada campo grande
    And acionar opção Clique aqui para verificar a auditoria!
   # And acionar opção para atender
    And acionar opção para autorizar todos
    And informar ressalva e acionar opção de autorizar "<resalva>"
    And acionar opção Clique aqui para aprovar solicitação
    And devo acionar opção que permite encerrar
 #   And o sistema deverá apresentar mensagem: "AUTORIZADA"
 #   And acionar opção internação alta
 #   And selecionar campo Motivo Encerramento como "<motivoEncerramento>"
 #   And infromar Data Evento como "<dataEvent>"
  #  And acionar opção Tipo Evento como Internacao
   # And acionar a opção que permite cadastrar

   # And acionar a opção que permite cadastrar


    Examples:

      | operadora | numCarteira   | codNaoperadora | nomeProfExecutante | codDaOperadora | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente  | tabela1                                                  | codTabela1 | qtd1 | tabela2                                  | codTabela2    | qtd2    | tabela3                                  | codTabela3 | qtd3 | tabela4                                  | codTabela4 | qtd4| tabela5                                   | codTabela5 |  qtd5 | tabela6                                  | codTabela6  | qtd6 |email         | ddd | tel       | tabelaProc                               | dataEvent | motivoEncerramento | resalva | data2      |
      | 35        | 4335017017006 | 42105          | adalto             | 750300011      | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | Indicação    | Não Acidente       | TUSS -- Taxas hospitalares, diárias e gases medicinais   | 60000333   | 1    | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1       | TUSS -- Procedimentos e eventos em saúde |  30203015  |  1   | TUSS -- Procedimentos e eventos em saúde |  31102360  |  1  | TUSS -- Procedimentos e eventos em saúde  |  31102077  |  1    | TUSS -- Procedimentos e eventos em saúde | 31403220    |   1  |trix@trix.com | 61  | 987877777 | TUSS -- Procedimentos e eventos em saúde |           | Outros motivos     | teste   | 22/04/2022 |


