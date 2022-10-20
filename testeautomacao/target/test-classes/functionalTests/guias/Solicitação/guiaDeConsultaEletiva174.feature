@174Consulta
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "teste_prest174" e senha "baleia@!"
    #And informe usuario "teste_prest174" e senha "antena@!"

  @174ConsultaAutorizada
  Scenario Outline: GUIA DE CONSULTA ELETIVA - AUTORIZADA
    #GUIA DE CONSULTA ELETIVA
    And acionar o menu TISS2 Painel de execucao
    And acionar a guia consulta eletiva
    And informar campo numero da carteira utilizar cartão "<numeroDaCarteira>"
    And informar codigo do beneficiario "<codBeneficiario>"
   # And informar campo Código na OperadoraCNPJCPF "<codNaOperadora>"
    And informar campo nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo de indicação de acidente como "<indicacaoAcidente>"
    And informar tipo de consulta "<tipoDeConsulta>"
   # And selecionar tipo de consulta "<tipoDeConsulta>"
    And selecionar campo tabela "<tabela>"
   #   And selecionar campo codigo na operadora CNPJCPF "<codNaOperadora>"
    Then devo acionar opção que permite gravar
 #   And o sistema deverá apresentar mensagem: "AUTORIZADA"
    Examples:

      | numeroDaCarteira | codNaOperadora | nomeProfExecutante | indicacaoAcidente | tipoDeConsulta    | tabela                                   | codBeneficiario |
      | 174              | 67320          | 81574              | Não Acidente      | Primeira Consulta | TUSS -- Procedimentos e eventos em saúde | 5019528903009   |

  @174ConsultaNegada
  Scenario Outline: GUIA DE CONSULTA ELETIVA 174 - NEGADA
    #GUIA DE CONSULTA ELETIVA
    And acionar o menu TISS2 Painel de execucao
    And acionar a guia consulta eletiva
    And informar campo numero da carteira utilizar cartão "<numeroDaCarteira>"
    And informar codigo do beneficiario "<codBeneficiario>"
    #And informar campo Código na OperadoraCNPJCPF "<codNaOperadora>"
    And informar campo nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo de indicação de acidente como "<indicacaoAcidente>"
    And informar tipo de consulta "<tipoDeConsulta>"
   # And selecionar tipo de consulta "<tipoDeConsulta>"
    And selecionar campo tabela "<tabela>"
   #   And selecionar campo codigo na operadora CNPJCPF "<codNaOperadora>"
    Then devo acionar opção que permite gravar
 #   And o sistema deverá apresentar mensagem: "AUTORIZADA"
    Examples:

      | numeroDaCarteira | codNaOperadora | nomeProfExecutante | indicacaoAcidente | tipoDeConsulta    | tabela                                   | codBeneficiario |
      | 35               | 67320          | 81574              | Não Acidente      | Primeira Consulta | TUSS -- Procedimentos e eventos em saúde | 4101001090003   |