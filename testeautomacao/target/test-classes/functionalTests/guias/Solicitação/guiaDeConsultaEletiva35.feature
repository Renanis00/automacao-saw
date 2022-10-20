@35Consulta
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "uni35" e senha "baleia@!"
    #And informe usuario "uni35" e senha "antena@!"


  @35ConsultaAutorizada
  Scenario Outline: GUIA DE CONSULTA ELETIVA - AUTORIZADA
    #GUIA DE CONSULTA ELETIVA
    And acionar o menu TISS Painel de execucao
    And acionar a guia consulta eletiva
    And informar campo numero da carteira utilizar cartão "<numeroDaCarteira>"
    And informar codigo do beneficiario "<codBeneficiario>"
    And informar campo Código na OperadoraCNPJCPF "<codNaOperadora>"
   #And informar campo nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo de indicação de acidente como "<indicacaoAcidente>"
    And informar tipo de consulta "<tipoDeConsulta>"
   # And selecionar tipo de consulta "<tipoDeConsulta>"
    And selecionar campo tabela "<tabela>"
   #   And selecionar campo codigo na operadora CNPJCPF "<codNaOperadora>"
    Then devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "AUTORIZADA"

    Examples:

      | numeroDaCarteira | codNaOperadora | nomeProfExecutante | indicacaoAcidente | tipoDeConsulta    | tabela                                   | codBeneficiario |
      | 35               | 67320          | 50842              | Não Acidente      | Primeira Consulta | TUSS -- Procedimentos e eventos em saúde | 5461000127505   |



  @35ConsultaNegada
  Scenario Outline: GUIA DE CONSULTA ELETIVA - NEGADA
    #GUIA DE CONSULTA ELETIVA
    And acionar o menu TISS Painel de execucao
    And acionar a guia consulta eletiva
    And informar campo numero da carteira utilizar cartão "<numeroDaCarteira>"
    And informar codigo do beneficiario "<codBeneficiario>"
    And informar campo Código na OperadoraCNPJCPF "<codNaOperadora>"
   #And informar campo nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo de indicação de acidente como "<indicacaoAcidente>"
    And informar tipo de consulta "<tipoDeConsulta>"
   # And selecionar tipo de consulta "<tipoDeConsulta>"
    And selecionar campo tabela "<tabela>"
   #   And selecionar campo codigo na operadora CNPJCPF "<codNaOperadora>"
    Then devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "NEGADA"
    Examples:

      | numeroDaCarteira | codNaOperadora | nomeProfExecutante | indicacaoAcidente | tipoDeConsulta    | tabela                                   | codBeneficiario |
      | 35               | 67320          | 50842              | Não Acidente      | Pré-natal         | TUSS -- Procedimentos e eventos em saúde | 5461000127505   |