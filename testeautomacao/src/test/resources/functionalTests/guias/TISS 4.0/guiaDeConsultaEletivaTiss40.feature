@TISS40Eletiva
Feature: Cenário de Negócio - GUIA DE CONSULTA ELETIVA TISS 4.0

  Background:
    Given que eu acesse o sistema SAW
    And informe o usuario "teste_prest865" e senha "tanque@!"
    #And informe usuario "uni865" e senha "ancora@!"
    #And informe usuario "uni865" e senha "baleia@!"


  @TISS40Eletiva
  Scenario Outline: GUIA DE CONSULTA ELETIVA - AUTORIZADA - Operadora 865
    #GUIA DE CONSULTA ELETIVA
    #When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia consulta eletiva
    And selecionar grupo de atendimento "<grupoAtendimento>"
    And informar campo numero da carteira utilizar cartão "<numeroDaCarteira>"
    And informar codigo do beneficiario "<codBeneficiario>"
    And informar codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante "<nomeProfExecutante>"
    And selecionar campo de indicação de acidente como "<indicacaoAcidente>"
    And informar tipo de consulta "<tipoDeConsulta>"
    And selecionar campo Código CBO-c como "<CBO>"
    #And informar o campo telefone "<ddd>" "<telefone>"
    And selecionar campo tabela "<tabela>"
    Then devo acionar opção que permite gravar865
    And o sistema deverá apresentar mensagem: "AUTORIZADA"
    #And o sistema deverá apresentar mensagem: "AGUARDANDO"

    Examples:

      | numeroDaCarteira | codNaOperadora | nomeProfExecutante         | indicacaoAcidente | tipoDeConsulta    | tabela                                   | codBeneficiario | ddd | telefone  | CBO                    | procedimento                                                             |  grupoAtendimento  |
      | 865              | 11000947       | ANA REGINA FRANCHI TRÁVOLO | Não Acidente      | Primeira Consulta | TUSS -- Procedimentos e eventos em saúde | 0002674865009   | 61  | 981812557 | Médico cirurgião geral | 10101012 -- CONSULTA EM CONSULTÓRIO (NO HORÁRIO NORMAL OU PREESTABELECID |  REDE BRASILIA     |
