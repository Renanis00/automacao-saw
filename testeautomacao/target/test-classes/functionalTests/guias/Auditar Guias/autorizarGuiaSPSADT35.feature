@35AuditarSADT
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni35" e senha "baleia@!"


  @35SPSADTAuditarGuiaAutorizarTodos
  Scenario Outline: Cadastrar guia SPSADT 35 -  status AGUARDANDO  - EM AUDITORIA - AUTORIZAR TODOS SERVIÇOS - 5 ITENS
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And informar campo codigo executante na operadora como "<codNaOperadora>"
    And selecionar campo tabela materiais I "<tabelaMat1>"
    And informar codigo do material I "<codMat1>"
    And informar quantidade do material I "<qtdMatI>"
#    And selecionar campo tabela materiais II "<tabelaMat2>"
#    And informar codigo do material II "<codMat2>"
#    And informar quantidade do material II "<qtdMatII>"
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
    And informar campo Observação
    Then devo acionar a opção gravar
    And o sistema deverá apresentar mensagem: "AGUARDANDO"
    And armazenar numero da guia com status aguardando
    And acionar opção Clique aqui para verificar a auditoria!
    And acionar opção para atender
    And acionar opção para autorizar todos
    And informar ressalva e acionar opção de autorizar "<ressalva>"
    And devo acionar opção que permite encerrar

    Examples:

      | numeroDaCarteira | codigoNaOperadora   | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora       | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas | ressalva   |
      | 35               | 27408               | 19499              | TUSS -- Procedimentos e eventos em saúde | 5461000127505   | Eletiva            | 40304361        | 110000016            | 1               | Internação        | Não Acidente        | TESTE TRIX       | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        | TESTE TRIX |



  @35SPSADTAuditarGuiaNegarTodos
  Scenario Outline: Cadastrar guia SPSADT 35 -  status AGUARDANDO  - EM AUDITORIA - NEGAR TODOS SERVIÇOS - 5 ITENS
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And informar campo codigo executante na operadora como "<codNaOperadora>"
    And selecionar campo tabela materiais I "<tabelaMat1>"
    And informar codigo do material I "<codMat1>"
    And informar quantidade do material I "<qtdMatI>"
#    And selecionar campo tabela materiais II "<tabelaMat2>"
#    And informar codigo do material II "<codMat2>"
#    And informar quantidade do material II "<qtdMatII>"
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
    Then devo acionar a opção gravar
    And o sistema deverá apresentar mensagem: "AGUARDANDO"
    And armazenar numero da guia com status aguardando
    And acionar opção Clique aqui para verificar a auditoria!
    And acionar opção para atender
    And acionar opção para negar todos
    And informa mensagem e ressalva "<ressalva>"
    And devo acionar opção que permite encerrar

    Examples:

      | numeroDaCarteira | codigoNaOperadora   | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora       | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas | ressalva   |
      | 35               | 27408               | 19499              | TUSS -- Procedimentos e eventos em saúde | 5461000127505   | Eletiva            | 40304361        | 110000016            | 1               | Internação        | Não Acidente        | TESTE TRIX       | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        | TESTE TRIX |



      #@35SPSADTAuditarGuiaAutorizarTodos
  Scenario Outline: Autorizar guia com status em aguardando
    When acionar o menu auditar solicitações
    And informar numero da guia "<numeroGuia>"
    And acionar opção para pesquisar por Nº Guia TISS
    And acioanr opção para detalhar a solicitação
    And acionar opção Clique aqui para verificar a auditoria!
    And acionar opção para atender
    And acionar opção para autorizar todos
    And informar ressalva e acionar opção de autorizar "<ressalva>"
    #And acionar opção Clique aqui para aprovar solicitação
    And devo acionar opção que permite encerrar


    Examples:
      | numeroGuia | ressalva | motivo |
      | 5434213    | teste    | teste  |