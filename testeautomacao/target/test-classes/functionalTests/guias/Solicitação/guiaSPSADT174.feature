@174SPSADT
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni174" e senha "brasil@!"


  @174SPSADTAutorizada
  Scenario Outline: Cadastrar guia SPSADT - operadora: 174 - AUTORIZADA
    #GUIA DE SPSADT
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOpradora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"

   # And selecionar campo tabela materiais I "<tabelaMat1>"
   # And informar codigo do material I "<codMat1>"
   # And informar quantidade do material I "<qtdMatI>"

    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    Then devo acionar opção que permite gravar
    And acionar opção Clique aqui para verificar a auditoria!
   # And acionar opção para atender

    And acionar opção para autorizar
    #And acionar opção para autorizar todos
    And informar ressalva e acionar a opção de autorizar "<resalva>"

    #And informar uma ressalva e acionar opção de autorizar "<resalva>"


    #And informar ressalva e acionar opção de autorizar "<resalva>"
    #And acionar opção Clique aqui para aprovar solicitação
    And devo acionar opção que permite encerrar
    And o sistema deverá apresentar mensagem: "AUTORIZADA"

    Examples:

      | numeroDaCarteira | codBeneficiario | nomeProfExecutante | tabelaMat1           | codMat1 | qtdMatI | nomeProfExecutante | numeroNoConselho | uf | codigoCBOs     | codNaOpradora | resalva | tabela                                   | conselhoProfissional                 | caraterAtendimento | codProcedimento | codNaOperadora                             | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 174              | 5007010912003   | ana                 | TUSS -- Medicamentos | agulha  | 1       | Augustus Nicodemus | 123              | DF | Médico clínico | 110000334     | teste   | TUSS -- Procedimentos e eventos em saúde | CRM -- Conselho Regional de Medicina | Eletiva            | 10101012        | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        |


  @174SPSADTEmAnalise
  Scenario Outline: Cadastrar guia SPSADT - operadora: 174 - Em Analise
    #GUIA DE SPSADT
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar Cód. na Operadora como "<codNaOperadora>"
    And informar nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo Conselho Profissional como "<conselhoProfissional>"
    And informar campo Número no Conselho como "<numeroNoConselho>"
    And selecionar campo UF como "<uf>"
    And selecionar campo Código CBO-s como "<codigoCBOs>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And informar campo codigo na operadora como "<codNaOpradora>"
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    Then devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "EM ANÁLISE"


    Examples:

      | numeroDaCarteira | codBeneficiario | nomeProfExecutante | numeroNoConselho | uf | codigoCBOs     | codNaOperadora | resalva | tabela                                   | conselhoProfissional                 | caraterAtendimento | codProcedimento | codNaOperadora                             | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 174              | 5019528903009   | Augustus Nicodemus | 123              | DF | Médico clínico | 110000334      | teste   | TUSS -- Procedimentos e eventos em saúde | CRM -- Conselho Regional de Medicina | Eletiva            | 10101012        | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        |

  @174SPSADTNegada
  Scenario Outline: Cadastrar guia SPSADT - operadora: 174 - Negada
    #GUIA DE SPSADT
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo Conselho Profissional como "<conselhoProfissional>"
    And informar campo Número no Conselho como "<numeroNoConselho>"
    And selecionar campo UF como "<uf>"
    And selecionar campo Código CBO-s como "<codigoCBOs>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And informar campo codigo na operadora como "<codNaOpradora>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    Then devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "NEGADA"


    Examples:

      | numeroDaCarteira | codBeneficiario | nomeProfExecutante | numeroNoConselho | uf | codigoCBOs     | codNaOpradora | resalva | tabela                                   | conselhoProfissional                 | caraterAtendimento | codProcedimento | codNaOperadora                             | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 35               | 4101001090003   | Augustus Nicodemus | 123              | DF | Médico clínico | 110000334     | teste   | TUSS -- Procedimentos e eventos em saúde | CRM -- Conselho Regional de Medicina | Eletiva            | 10101012        | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        |
