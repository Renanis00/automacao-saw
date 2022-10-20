@174Internacao
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "uni174" e senha "ancora@!"
    And informe usuario "uni174" e senha "baleia@!"

  @174InternacaoAutorizada
  Scenario Outline: SAW - Guia De Internação - AUTORIZADA
    #GUIA DE INTERNAÇÃO
    When acionar o menu TISS Painel de execucao
    And acionar opção Internação
    And informar Número da Carteira como "<operadora>""<numCarteira>"
    And informar campo codigo na operadora "<codNaoperadora>"
    And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
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
    #And armazenar numero da guia de internação autorizada
    #And armazenar numero da guia de internação autorizada campo grande
    And acionar opção Clique aqui para verificar a auditoria!
   # And acionar opção para atender
  ########################  And acionar opção para autorizar todos
    And devo acionar opção que permite encerrar
    And acionar opção para autorizar todos
    And informar a ressalva e acionar opção de autorizar "<resalva>"
    And devo acionar opção que permite encerrar

 ##   And informar ressalva e acionar opção de autorizar "<resalva>"

    #And acionar opção Clique aqui para aprovar solicitação
  ###################  And devo acionar opção que permite encerrar
 #   And o sistema deverá apresentar mensagem: "AUTORIZADA"
 #   And acionar opção internação alta
 #   And selecionar campo Motivo Encerramento como "<motivoEncerramento>"
 #   And infromar Data Evento como "<dataEvent>"
  #  And acionar opção Tipo Evento como Internacao
   # And acionar a opção que permite cadastrar

   # And acionar a opção que permite cadastrar


    Examples:

      | operadora | numCarteira   | codNaoperadora | nomeProfExecutante | codDaOperadora | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente | tabela                                                          | codTabela                                                           | qtd | tabelaProc                               | codTabelaProc | qtd2 | email         | ddd | tel       | tabelaProc                               | dataEvent | motivoEncerramento | resalva |
      | 174       | 3780000065094 | 110000334      | 53054              | hospital       | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | Indicação    | Não Acidente      | DIÁRIA - TUSS -- Taxas hospitalares, diárias e gases medicinais | 60000694 - DIÁRIA DE  ENFERMARIA DE 3 LEITOS COM BANHEIRO PRIVATIVO | 1   | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1    | trix@trix.com | 61  | 987877777 | TUSS -- Procedimentos e eventos em saúde |           | Outros motivos     | teste   |
