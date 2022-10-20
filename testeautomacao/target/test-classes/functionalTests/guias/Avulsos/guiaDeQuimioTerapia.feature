@guias
Feature: Cenário de Negócio - GUIA DE QUIMIOTERAPIA

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni106" e senha "mexico@!"


  @865quimioterapiaEmAnalise
  Scenario Outline: SAW - Guia De Internação - EM ANÁLISE
    #GUIA DE INTERNAÇÃO
    #When fechar o informativo rede credenciada
    ##And acionar o menu TISS Painel de execucao
    ##And acionar opção Internação
    ##And informar Número da Carteira como "<operadora>""<numCarteira>"
    ##And informar campo codigo na operadora "<codNaoperadora>"
    ##And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
    ##And informar campo codigo da operadora como "<codDaOperadora>"

    ##And informar campo data sugerida para internaçõa "<dataSugeInternacao>"
    ##And selecionar campo carater de internação como "<caraterInternacao>"
    ##And selecionar campo Tipo internação "<selTipoDeInternacao>"
    ##And selecionar campo regime de internação como "<regimeInternacao>"
    #==================================================
    ##And selecionar previsao de uso de OPME como não
    ##And selecionar previsao de uso de quimioterapia como não
    #==================================================
    ##And informar Indicação Clínica como "<indicClinica>"
    ##And selecionar indicação de acidente como "<indicacaoAcidente>"
    ##And selecionar o campo tabela como "<tabela>"
    ##And selecionar codigo da tabela "<codTabela>"

    ##And informar campo quantidade diaria "<qtd>"
    ##And selecionar o campo tabela procedimentos "<tabelaProc>"
    ##And selecionar codigo procedimento da tabela "<codTabelaProc>"
    ##And informar campo quantidade procedimento "<qtd2>"
    ##And informar campo Data Provável da Admissão Hospitalar "<data2>"
    #==================================================
    #And informar campo e-mail "<email>"
    #And informar campo telefone como "<ddd>" "<tel>"
    #==================================================
    ##Then deve acionar o botão gravar
    ##And o sistema deverá apresentar mensagem: "AUTORIZADA"
    ##And armazenar numero da guia de internação autorizada
    ##And alternar pagina
    And acionar o menu TISS Painel de execucao
    And acionar a guia de quimioterapia
   ## And acionar opção internação alta
  ##  And selecionar campo Motivo Encerramento como "<motivoEncerramento>"
   ## And infromar Data Evento como "<dataEvent>"
   ## And acionar opção Tipo Evento como Internacao
   ## And acionar a opção que permite cadastrar
   # And acionar a opção que permite cadastrar
    And acionar campo numero guia referenciada
    And selecionar um tipo de quia como "<tipoDeGuia>"
    And selecionar campo operadora ou prestador "<operadoraOUprestador>"
    And informar campo numero guia como "<numeroGuia>"
    And acionar opção que permite pesquisar
    And acionar opção para realização do vinculo
    And informar campo peso como "<peso>"
    And informar campo altura como "<altura>"
    And acionar campo Superfície Corporal
    And informar campo idade como "<idade>"
 #   And selecionar campo sexo como "<sexo>"
    And selecionar campo estadiamento como "<estabelecimento>"
    And selecionar um tipo de estabelecimento "<estabelecimento2>"
    And selecionar campo finalidade como "<finalidade>"
    And selecionar campo ECOG como "<ecog>"
    And selecionar campo tumor como "<tumor>"
    And selecionar campo nodulo como "<nodulo>"
    And selecionar campo metastase como "<metastase>"
    And informar campo plano terapeutico como "<planoTerapeutico>"
    And informar campo data prevista para administração como "<dataPreviAdm>"
    And selacionar campo tabela como "<tabela2>"
    And informar campo codigo medicamento como "<codMedicamento>"
    And informar campo frequência como "<frequencia>"
    And informar campo dosagem total do ciculo como "<dosagemTotalCiculo>"
    And selecionar campo unidade de medida como "<unidMedida>"
    And selecionar campo via admin como "<viaAdmin>"
    And informar campo numero de ciculos previstos como "<numCiculosPrevist>"
    And informar campo ciculo atual como "<ciculoAtual>"
    And informar numero de dias do ciculo atual "<numDiasCiculoAtual>"
    And informar campo intervalo entre os ciculos como "<intervaloEntreCiculos>"
    And informar campo data da solicitação "<dataSolicitacao>"
    And informar campo telefone como "<telefone>"
    Then devo acionar opção que permite gravar guia
 #   And o sistema deverá apresentar mensagem: "AGUARDANDO" 10574609 1151783


    Examples:

      | operadora | numCarteira   | numeroGuia | codNaoperadora | nomeProfExecutante | codDaOperadora | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente | tabela                            | codTabela                                                           | qtd | tabelaProc                               | codTabelaProc | qtd2 | email         | ddd | tel       | tabelaProc                               | dataEvent | motivoEncerramento |  | tipoDeGuia | operadoraOUprestador | peso | altura | idade | sexo      | telefone     | estabelecimento2 | finalidade | ecog             | tumor | nodulo | metastase | planoTerapeutico | dataPreviAdm | tabela2              | dosagemTotalCiculo | unidMedida | viaAdmin | numCiculosPrevist | ciculoAtual | numDiasCiculoAtual | intervaloEntreCiculos | dataSolicitacao | estabelecimento | codMedicamento | frequencia |
      | 106       | 7975228983115 | 1109406    | 110000027      | maria              | 110000027      | 17/02/2022         | Clínica             | Eletiva           | Hospitalar       | Indicação    | Não Acidente      | DIÁRIA - Outras -- Outras Tabelas | 60000694 - DIÁRIA DE  ENFERMARIA DE 3 LEITOS COM BANHEIRO PRIVATIVO | 1   | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1    | trix@trix.com | 61  | 987877777 | TUSS -- Procedimentos e eventos em saúde |           | Outros motivos     |  | INTERNAÇÃO | Prestador            | 80   | 17000  | 20    | Masculino | 6198181-2222 | 1ª linha         | Curativa   | Totalmente ativo | T1    | N1     | M1        | PlanoTerapêutico | 15/04/2020   | TUSS -- Medicamentos | 1                  | Ampola     | Bucal    | 1                 | 1           | 1                  | 1                     | 17/02/2022      | I               | 90000021       | 32         |


#10574142
  @865quimioterapiaNegada
  Scenario Outline: GUIA DE QUIMIOTERAPIA - NEGADA
    #GUIA DE QUIMIOTERAPIA
    When fechar o informativo rede credenciada
    When acionar o menu TISS Painel de execucao
    And acionar a guia de quimioterapia
    And acionar campo numero guia referenciada
    And selecionar um tipo de quia como "<tipoDeGuia>"
    And informar campo numero guia como "<numeroGuia>"
    And acionar opção que permite pesquisar
    And acionar opção para realização do vinculo
    And informar campo peso como "<peso>"
    And informar campo altura como "<altura>"
    And acionar campo Superfície Corporal
    And informar campo idade como "<idade>"
 #   And selecionar campo sexo como "<sexo>"
    And selecionar campo estadiamento como "<estabelecimento>"
    And selecionar um tipo de estabelecimento "<estabelecimento2>"
    And selecionar campo finalidade como "<finalidade>"
    And selecionar campo ECOG como "<ecog>"
    And selecionar campo tumor como "<tumor>"
    And selecionar campo nodulo como "<nodulo>"
    And selecionar campo metastase como "<metastase>"
    And informar campo plano terapeutico como "<planoTerapeutico>"
    And informar campo data prevista para administração como "<dataPreviAdm>"
    And selacionar campo tabela como "<tabela>"
    And informar campo codigo medicamento como "<codMedicamento>"
    And informar campo frequência como "<frequencia>"
    And informar campo dosagem total do ciculo como "<dosagemTotalCiculo>"
    And selecionar campo unidade de medida como "<unidMedida>"
    And selecionar campo via admin como "<viaAdmin>"
    And informar campo numero de ciculos previstos como "<numCiculosPrevist>"
    And informar campo ciculo atual como "<ciculoAtual>"
    And informar numero de dias do ciculo atual "<numDiasCiculoAtual>"
    And informar campo intervalo entre os ciculos como "<intervaloEntreCiculos>"
    And informar campo data da solicitação "<dataSolicitacao>"
    And informar campo telefone como "<telefone>"
    Then devo acionar opção que permite gravar guia
 #   And o sistema deverá apresentar mensagem: "EM ANÁLISE"

    Examples:


      | tipoDeGuia | numeroGuia | peso | altura | idade | sexo      | telefone     | estabelecimento2 | finalidade | ecog             | tumor | nodulo | metastase | planoTerapeutico | dataPreviAdm | tabela               | dosagemTotalCiculo | unidMedida | viaAdmin | numCiculosPrevist | ciculoAtual | numDiasCiculoAtual | intervaloEntreCiculos | dataSolicitacao | estabelecimento | codMedicamento | frequencia |
      | SP/SADT    | 1109406    | 80   | 17000  | 20    | Masculino | 6198181-2222 | 1ª linha         | Curativa   | Totalmente ativo | T1    | N1     | M1        | PlanoTerapêutico | 15/04/2020   | TUSS -- Medicamentos | 1                  | Ampola     | Bucal    | 1                 | 1           | 1                  | 1                     | 15/04/2020      | I               | 90000021       | 32         |



