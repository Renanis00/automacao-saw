@35SPSADT
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "uni35" e senha "antena@!"
    And informe usuario "uni35" e senha "baleia@!"


  @35SPSADTaguardando
  Scenario Outline: Cadastrar guia SPSADT -  status AGUARDANDO  - EM AUDITORIA - operadora: 35 - campina grande
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
  #   And selecionar campo tabela materiais II "<tabelaMat2>"
  #   And informar codigo do material II "<codMat2>"
  #   And informar quantidade do material II "<qtdMatII>"
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
 #    And acionar opção para Anexar Laudos
 #    And incluir documentos solicitados
  #   And o sistema deverá apresentar mensagem: "AGUARDANDO"

    #And acionar opção para realizar os procedimentos
    #And informe Hora Inicial e Final "<hdInicio>" "<hsFim>"
    #And marcar todos os procedimentos
    #And acionar opção que permite executar
   # And devo acionar opção que permite gravar
   # And acionar opção que permite cancelar
    And o sistema deverá apresentar mensagem: "AGUARDANDO"
    And armazenar numero da guia com status aguardando

    Examples:

      | numeroDaCarteira | codigoNaOperadora   | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora       | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 35               | 27408               | 62611              | TUSS -- Procedimentos e eventos em saúde | 5461000127505   | Eletiva            | 40304361        | 110000016            | 1               | Internação        | Não Acidente        | TESTE TRIX       | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        |


  @35SPSADTautorizada
  Scenario Outline: Cadastrar guia SPSADT - status AUTORIZADA  - EM AUDITORIA - operadora: 35 - campina grande
    #GUIA DE SPSADT
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
 ###   And informar campo nome do profissional executante como "<nomeProfExecutante>"
   ## And selecionar campo codigo na operadora como "<codNaOperadora>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"

   ## And selecionar Cód. na Operadora como "<codigoNaOperadora>"
    And clicar icone do campo Cód. na Operadora

    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"

    And informar campo nome do profissional executante como "<nomeProfExecutante>"

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

  #  And acionar opção Dados de Execução / Procedimentos e Exames realizados
  #  And infromar campo Observação
    Then devo acionar a opção gravar
    And acionar opção para pedir revisão
    And informar mensagem e acionar opção para confirmar "<mensagem>"
    And acionar opção Clique aqui para verificar a auditoria!
    And acionar opção para atender
    And acionar opção para autorizar todos
    And informar ressalva e acionar opção de autorizar "<resalva>"
   # And acionar opção Clique aqui para aprovar solicitação
    And devo acionar opção que permite encerrar
  ##  And acionar opção Clique aqui para detalhar guia
 #  And acionar opção para Anexar Laudos
 #  And incluir documentos solicitados
  # And o sistema deverá apresentar mensagem: "AGUARDANDO"
 # And armazenar numero da guia com status aguardando
    #And acionar opção para realizar os procedimentos
    #And informe Hora Inicial e Final "<hdInicio>" "<hsFim>"
    #And marcar todos os procedimentos
    #And acionar opção que permite executar
   # And devo acionar opção que permite gravar
   # And acionar opção que permite cancelar
 ###   And o sistema deverá apresentar mensagem: "AUTORIZADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora                          | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento    | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas | mensagem    | resalva |
      | 35               | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 62611              | TUSS -- Procedimentos e eventos em saúde | 0000000085174   | Urgência / Emergência | 10101039        | 110000130      | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        | teste teste | teste   |

  @35SPSADTnegada
  Scenario Outline: Cadastrar guia SPSADT - status NEGADA  - operadora: 35 - campina grande
    #GUIA DE SPSADT
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
   ## And selecionar campo codigo na operadora como "<codNaOperadora>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
   ## And selecionar Cód. na Operadora como "<codigoNaOperadora>"
    And clicar icone do campo Cód. na Operadora
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
    Then devo acionar a opção gravar
    And o sistema deverá apresentar mensagem: "NEGADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora                          | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento    | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas | mensagem    | resalva |
      | 35               | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 62611              | TUSS -- Procedimentos e eventos em saúde | 0500015642319   | Urgência / Emergência | 10101039        | 110000130      | 1               | Consulta          | Não Acidente        | TESTE TRIX       | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        | teste teste | teste   |


