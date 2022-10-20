@865SPSADT
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "auto_prest865" e senha "fazenda@!"
    #And informe usuario "teste.renan1" e senha "brasil@!"
    And informe usuario "teste.renan1" e senha "baleia@!"


  @865SPSADTAutorizada
  Scenario Outline: Cadastrar guia SPSADT - anexar documentos e realizar procedimentos - status AUTORIZADA - operadora: 865 - CNU
    #GUIA DE SPSADT
    When fechar o informativo rede credenciada
    And acionar o menu TISS2 Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    ##And clicar ok para Já existe um pedido eletrônico para esse beneficiário
    And selecionar campo codigo na operadora como "<codExecutante>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo código CBOs como "<CBOs>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codSolicitante>"
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
    And informar quantidade do material I "<qtdMat1>"
    And selecionar campo tabela materiais II "<tabelaMat2>"
    And informar codigo do material II "<codMat2>"
    And informar quantidade do material II "<qtdMat1>"
    And selecionar campo tabela medicamentos I "<tabelaMed1>"
    And informar codigo do medicamento I "<codMed1>"
    And informar quantidade do medicamento I "<qtdMedI>"
    And selecionar campo tabela medicamentos II "<tabelaMed2>"
    And informar codigo do medicamento II "<codMed2>"
    And informar quantidade do medicamento II "<qtdMed2>"
    And acionar opção adicionar
    And selecionar tabela taxas "<tabelaTaxas>"
    And informar codigo taxas "<codTaxa>"
    And informar quantidade de taxas "<qtdTaxas>"
    Then devo acionar opção gravar
    #And acionar opção para Anexar Laudos
    #And incluir documentos solicitados
    #And acionar opção para realizar os procedimentos
    #And informe Hora Inicial e Final "<hdInicio>" "<hsFim>"
    #And marcar todos os procedimentos
    #And acionar opção que permite executar
    #And o sistema deverá apresentar mensagem: "AUTORIZADA"
    #And armazenar numero da guia autorizada
    #And devo acionar opção gravar
   # And acionar opção que permite cancelar
     # And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira  | codSolicitante  | codExecutante                |nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1  | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMed2   | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas | CBOs                   |
      | 865               | 11000947        | 11000947 -- HOSPITAL SEPACO  |453063             | TUSS -- Procedimentos e eventos em saúde | 0000276732002   | Eletiva            | 10102019        | 11000947       | 1               | Consulta          | Não Acidente        | TESTE TRIX       | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70014191 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90282752 | 1       | TUSS -- Medicamentos | 90282744 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023090 | 1        | Médico cirurgião geral |


  @865SPSADTAguardando
  Scenario Outline: Cadastrar guia SPSADT - anexar documentos e realizar procedimentos - status Aguardando - operadora: 865 - CNU
    #GUIA DE SPSADT
    When fechar o informativo rede credenciada
    And acionar o menu TISS2 Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
   ## And clicar ok para Já existe um pedido eletrônico para esse beneficiário
    And informar campo codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo código CBOs como "<CBOs>"
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
    And selecionar campo tabela medicamentos II "<tabelaMed2>"
    And informar codigo do medicamento II "<codMed2>"
    And informar quantidade do medicamento II "<qtdMed2>"
    And acionar opção adicionar
    And selecionar tabela taxas "<tabelaTaxas>"
    And informar codigo taxas "<codTaxa>"
    And informar quantidade de taxas "<qtdTaxas>"
    And acionar opção Dados de Execução / Procedimentos e Exames realizados
    And infromar campo Observação
    Then devo acionar opção que permite gravar
   # And acionar opção para Anexar Laudos
   # And incluir documentos solicitados
   # And acionar opção para realizar os procedimentos
   # And informe Hora Inicial e Final "<hdInicio>" "<hsFim>"
   # And marcar todos os procedimentos
   # And acionar opção que permite executar
    And o sistema deverá apresentar mensagem: "AGUARDANDO"
    And armazenar numero da guia com status aguardando
   # And devo acionar opção que permite gravars
   # And acionar opção que permite cancelar
     # And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1  | qtdMat1 | tabelaMat2        | codMat2  | qtdMat2  | tabelaMed1           | codMed1  | qtdMed1 | tabelaMed2           | codMed2  | qtdMed2  | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas | CBOs                    |
      | 865              | 11000603          | 453063             | TUSS -- Procedimentos e eventos em saúde | 0002420388004   | Eletiva            | 41001370        | 11000959       | 1               | Consulta          | Não Acidente        | TESTE TRIX       | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70014191 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90282752 | 1       | TUSS -- Medicamentos | 90282744 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023090 | 1        | Médico cirurgião geral  |
