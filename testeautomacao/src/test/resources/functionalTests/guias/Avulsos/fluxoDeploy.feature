@fluxoGuia
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "teste_medico35" e senha "123@asdfg"
    #And informe usuario "novo_medico35" e senha "123@asdfg"
   # And informe usuario "teste_prest865" e senha "webinar@!"
    And informe usuario "auto_prest865" e senha "baleia@!"
   # And informe usuario "teste_prest78" e senha "webinar@!"
   # And informe usuario "teste_medico865" e senha "cama@!"
    #And informe usuario "auto_prest35" e senha "cama@!"
    #And informe usuario "teste_prest35" e senha "janela@!"
    #And informe usuario "rob_prest865" e senha "quadro@!"
    #And informe usuario "uni978" e senha "quadro@!"
    #sofa@! <== producao
    #pronto socorro - 10101039
    #auto_Auditor865

  @fluxo33
  Scenario Outline: Cadastrar guia SPSADT - anexar documentos e realizar procedimentos - status AUTORIZADA - operadora: 865 - CNU
    #GUIA DE SPSADT
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And clicar ok para Já existe um pedido eletrônico para esse beneficiário
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
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
    And informar campo e-mail como "<email>"
    And informar campo telefone "<ddd>" "<tel>"
    And selecionar campo tabela materiais I "<tabelaMat1>"
    And informar codigo do material I "<codMat1>"
    And informar quantidade do material I "<qtdMatI>"
    And selecionar campo tabela materiais II "<tabelaMat2>"
    And informar codigo do material II "<codMat2>"
    And informar quantidade do material II "<qtdMatII>"
    And selecionar campo tabela medicamentos I "<tabelaMed1>"
    And informar codigo do medicamento I "<codMed1>"
    And informar quantidade do medicamento I "<qtdMedI>"
    And selecionar campo tabela medicamentos II "<tabelaMedII>"
    And informar codigo do medicamento II "<codMedII>"
    And informar quantidade do medicamento II "<qtdMedII>"
    And acionar opção adicionar
    And selecionar tabela taxas "<tabelaTaxas>"
    And informar codigo taxas "<codTaxa>"
    And informar quantidade de taxas "<qtdTaxas>"
    Then devo acionar opção que permite gravar
    And acionar opção para Anexar Laudos
    And incluir documentos solicitados
    And acionar opção para realizar os procedimentos
    And informe Hora Inicial e Final "<hdInicio>" "<hsFim>"
    And marcar todos os procedimentos
    And acionar opção que permite executar
    And o sistema deverá apresentar mensagem: "AUTORIZADA"
    And armazenar numero da guia autorizada
   # And devo acionar opção que permite gravar
   # And acionar opção que permite cancelar
     # And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1  | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0002420388004   | Eletiva            | 10101039        | 11000959       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70014191 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90282752 | 1       | TUSS -- Medicamentos | 90282744 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023090 | 1        |

  @fluxo34
  Scenario Outline: Cadastrar guia SPSADT - anexar documentos  - status AGUARDANDO  - EM AUDITORIA - operadora: 35 - campina grande
    #GUIA DE SPSADT
    When fechar o informativo rede credenciada
    And acionar opção sair
    And informe usuario "auto_prest35" e senha "coelho@!"
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo codigo na operadora como "<codNaOperadora>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tabela materiais I "<tabelaMat1>"
    And informar codigo do material I "<codMat1>"
    And informar quantidade do material I "<qtdMatI>"
    And selecionar campo tabela materiais II "<tabelaMat2>"
    And informar codigo do material II "<codMat2>"
    And informar quantidade do material II "<qtdMatII>"
    And selecionar campo tabela medicamentos I "<tabelaMed1>"
    And informar codigo do medicamento I "<codMed1>"
    And informar quantidade do medicamento I "<qtdMedI>"
    And selecionar campo tabela medicamentos II "<tabelaMedII>"
    And informar codigo do medicamento II "<codMedII>"
    And informar quantidade do medicamento II "<qtdMedII>"
    And acionar opção adicionar
    And selecionar tabela taxas "<tabelaTaxas>"
    And informar codigo taxas "<codTaxa>"
    And informar quantidade de taxas "<qtdTaxas>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
    And acionar opção Dados de Execução / Procedimentos e Exames realizados
    And infromar campo Observação
    Then devo acionar opção que permite gravar
    And acionar opção para Anexar Laudos
    And incluir documentos solicitados
    And o sistema deverá apresentar mensagem: "AGUARDANDO"
    And armazenar numero da guia com status aguardando
    #And acionar opção para realizar os procedimentos
    #And informe Hora Inicial e Final "<hdInicio>" "<hsFim>"
    #And marcar todos os procedimentos
    #And acionar opção que permite executar

   # And devo acionar opção que permite gravar
   # And acionar opção que permite cancelar
     # And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora                          | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora                             | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 35               | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 62611              | TUSS -- Procedimentos e eventos em saúde | 2001010381000   | Eletiva            | 10101012        | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        |

  @fluxo35
  Scenario Outline: Autorizar guia com status em aguardando - operadora: 35 - campina grande
    #GUIA DE SPSADT
    #When fechar o informativo rede credenciada
    And acionar opção sair
    And informe usuario "uni35" e senha "agulha@!"
    And acionar o menu auditar solicitações
    And informar numero da guia "<numeroGuia>"
    And acionar opção para pesquisar por Nº Guia TISS
    And acioanr opção para detalhar a solicitação
    And acionar opção Clique aqui para verificar a auditoria!
   # And acionar opção para atender
    And acionar opção para autorizar todos
    And informar ressalva e acionar opção de autorizar "<resalva>"
    Then devo acionar opção que permite encerrar
  #  And informar o motivo e confirmar "<motivo>"

    Examples:
      | numeroGuia | resalva | motivo |
      | dinamico   | teste   | teste  |

  @fluxo37
  Scenario Outline: Cadastrar guia De OPME - CNU 865
    #GUIA DE OPME
    #When fechar o informativo rede credenciada
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

      | tipoDeguia | numeroGuia | tel            | justTecnica                           | tabela            | cod      | opcao | qtdSolic |
      | SP/SADT    | 10574439   | (61)98181-2558 | justificativa para realização do OPME | TUSS -- Materiais | 80000029 | 1     | 1        |

  @fluxo38
  Scenario Outline: GUIA DE CONSULTA ELETIVA
    #GUIA DE CONSULTA ELETIVA
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia consulta eletiva
    And informar campo numero da carteira utilizar cartão "<numeroDaCarteira>"
    And informar codigo do beneficiario "<codBeneficiario>"
    And informar campo nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo de indicação de acidente como "<indicacaoAcidente>"
    And informar tipo de consulta "<tipoDeConsulta>"
    And selecionar campo tabela "<tabela>"
  #  And selecionar campo codigo na operadora CNPJCPF "<codNaOperadora>"
    Then devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "AUTORIZADA"
    Examples:

      | numeroDaCarteira | codNaOperadora | nomeProfExecutante | indicacaoAcidente | tipoDeConsulta    | tabela                                   | codBeneficiario |
      | 865              | 67320          | 100001             | Não Acidente      | Primeira Consulta | TUSS -- Procedimentos e eventos em saúde | 0002255049318   |


  @fluxo39
  Scenario Outline: Cadastrar guia De Outras Despesas
    #GUIA DE OUTRAS DESPESAS
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia de Outras Despesas
    And acionar opção para pesquisar Guia Referenciada
    And selecionar campo tipo de guia "<tipoDeguia>"
    And informar campo Número Guia como "<numeroGuia>"
    And acionar botão para pesquisar
    And acionar opção de realização do vinculo
    And selecionar campo CD como "<cd>"
    And informar campo Data "<data>"
    And informar Hora Inicial e Final "<horaInicio>" "<horaFim>"
    And informar campo Tabela  "<tabela>"
    And informar campo Cód Item como "<codItem>"
    And informar campo Qtde como "<qtde>"
    And selecionar campo Fator Red "<fatoRed>"
    And informar campo Valor Unitário "<valorUnit>"
    Then devo acionar opção para gravar
   # And o sistema deverá apresentar mensagem: "CADASTRADA"


    Examples:

      | tipoDeguia | numeroGuia | cd           | data | horaInicio | horaFim | tabela               | codItem  | qtde | fatoRed | valorUnit |
      | SP/SADT    | 2117091625 | Medicamentos |      | 09:00      | 09:30   | TUSS -- Medicamentos | 90019725 | 1    | 0.2     | 10,00     |


  @fluxo40
  Scenario Outline: SAW - Guia De Internação - NEGADA
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
  #  And acionar opção internação alta
  #  And infromar Data Evento como "<dataEvent>"
  #  And acionar opção Tipo Evento como Internacao
  #  And acionar a opção que permite cadastrar
    #And selecionar campo Motivo Encerramento como "<motivoEncerramento>"
    #And acionar a opção que permite cadastrar


    Examples:

      | operadora | numCarteira   | codNaoperadora | nomeProfExecutante | codDaOperadora   | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente | tabela                                                          | codTabela                                      | qtd | tabelaProc                               | codTabelaProc | qtd2 | email         | ddd | tel       | tabelaProc                               | dataEvent | motivoEncerramento |
      | 865       | 0002392408000 | 002494310      | adalto             | 11000603 -- AACD | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | Indicação    | Não Acidente      | DIÁRIA - TUSS -- Taxas hospitalares, diárias e gases medicinais | 60000775 - DIÁRIA DE  HOSPITAL DIA APARTAMENTO | 1   | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1    | trix@trix.com | 61  | 987877777 | TUSS -- Procedimentos e eventos em saúde |           | Outros motivos     |


  @fluxo41
  Scenario Outline: GUIA DE QUIMIOTERAPIA
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
 #   And o sistema deverá apresentar mensagem: "AGUARDANDO"

    Examples:


      | tipoDeGuia | numeroGuia | peso | altura | idade | sexo      | telefone     | estabelecimento2 | finalidade | ecog             | tumor | nodulo | metastase | planoTerapeutico | dataPreviAdm | tabela               | dosagemTotalCiculo | unidMedida | viaAdmin | numCiculosPrevist | ciculoAtual | numDiasCiculoAtual | intervaloEntreCiculos | dataSolicitacao | estabelecimento | codMedicamento | frequencia |
      | SP/SADT    | 2117091625 | 80   | 17000  | 20    | Masculino | 6198181-2223 | 1ª linha         | Curativa   | Totalmente ativo | T1    | N1     | M1        | PlanoTerapêutico | 15/04/2020   | TUSS -- Medicamentos | 1                  | Ampola     | Bucal    | 1                 | 1           | 1                  | 1                     | 15/04/2020      | I               | 90000021       | 32         |