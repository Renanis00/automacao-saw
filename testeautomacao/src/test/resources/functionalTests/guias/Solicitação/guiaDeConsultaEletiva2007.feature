@2007Consulta
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni2007" e senha "brasil@!"

  @2007Consulta
  Scenario Outline: Cadastrar guia consulta Negada - economus
    #GUIA DE SPSADT
    When acionar o menu TISS Painel de execucao
    And acionar a guia consulta eletiva
    And informar numero da carteira como "<numeroDaCarteira>"
    And informar codigo na operadora como "<codNaOperadora>"
  ##  And informar nome do Profissional Executante "<nomeProfExecutante>"
    And selecionar Indicação de Acidente como "<indicacaoDeAcidente>"
    And selecionar a tabela como "<tabela>"
    Then devo selecionar Tipo de Consulta como "<tipoConsulta>"
    And informar nome do Profissional Executante "<nomeProfExecutante>"
    And devo acionar opção que permite gravar

    Examples:

      | numeroDaCarteira | nomeProfSolicitante | caraterAtendimento | caraterAtendimentocodBeneficiario | nomeProfExecutante | numeroNoConselho | uf | codigoCBOs     |  |  | tabela                                   | conselhoProfissional                 | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento  | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1 | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim | tabelaTaxas                                            | codTaxa  | qtdTaxas |
      | 0100000735100030 | 132971              | Eletiva            | 5019528903009                     | 53250              | 123              | DF | Médico clínico |  |  | TUSS -- Procedimentos e eventos em saúde | CRM -- Conselho Regional de Medicina | Eletiva            | 40708128        | 60961968000106 | 1               | Exame Ambulatorial | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | agulha  | 1       | TUSS -- Materiais | CONECTOR | 1        | TUSS -- Medicamentos | dipirona | 1       | TUSS -- Medicamentos | 90077326 | 1        | 1111     | 1111  | TUSS -- Taxas hospitalares, diárias e gases medicinais | 60023384 | 1        |
