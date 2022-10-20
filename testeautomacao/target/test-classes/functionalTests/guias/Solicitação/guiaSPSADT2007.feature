@2007SPSADT
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni2007" e senha "fazenda@!"


  @2007SPSADTemAnalise
  Scenario Outline: Cadastrar guia SPSADT - economus - EM ANÁLISE
    #GUIA DE SPSADT
    When acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira como "<numeroDaCarteira>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    #And informar campo nome do Profissional Solicitante "<nomeProfSolicitante>"
    And informar o campo nome do Profissional Solicitante "<nomeProfSolicitante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And clicar icone do campo Cód. na Operadora
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    Then devo acionar opção que permite gravar
    And incluir arquivo solicitado
    And acionar opção para incluir
    And devo acionar opção que permite gravar

    Examples:

      | numeroDaCarteira | nomeProfSolicitante | caraterAtendimento | caraterAtendimentocodBeneficiario | nomeProfExecutante | numeroNoConselho | uf | codigoCBOs     |  |  | tabela                                   | conselhoProfissional                 | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento  | indicacaoDeAcidente | indicacaoClinica  | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 0100000735100030 | 132971              | Eletiva            | 5019528903009                     | Augustus Nicodemus | 123              | DF | Médico clínico |  |  | TUSS -- Procedimentos e eventos em saúde | CRM -- Conselho Regional de Medicina | Eletiva            | 40708128        | 60961968000106 | 1               | Exame Ambulatorial | Não Acidente        | TESTE TRIX        | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        |
