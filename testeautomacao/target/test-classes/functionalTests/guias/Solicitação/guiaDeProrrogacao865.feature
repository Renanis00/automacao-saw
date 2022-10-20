@865Prorrogacao
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "auto_prest865" e senha "fazenda@!"
    #And informe usuario "teste.renan1" e senha "antena@!"
    And informe usuario "teste.renan1" e senha "baleia@!"

  @865cadastraGuiaDeProrrogacao
  Scenario Outline: Cadastrar guia De Prorrogação
    #GUIA DE PRORROGAÇÃO
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia de Prorrogação
    And acionar a opção de pesquisar Guia Referenciada
    And selecionar campo tipo de guia "<tipoDeguia>"
    And informar campo Número Guia como "<numeroGuia>"
    And selecionar campo operadora ou prestador "<opPrest>"
    And acionar botão para pesquisar
    And acionar opção de realização do vinculo
    And informar campo Código na Operadora "<codNaOperadora>"
    And informar campo nome do Profissional Solicitante "<nomeProfSolicitnte>"
    And informar campo Indicação Clínica "<indicacaoClinica>"
    And informar o campo Tabela  "<tabela>"
    And informar campo Código do Procedimento "<codProcedimento>"
    And informar campo Qtd Solic "<qtdSolic>"
    Then devo acionar opção para gravar
    #And o sistema deverá apresentar mensagem: "CADASTRADA"

    Examples:

      | tipoDeguia | numeroGuia | opPrest   | codNaOperadora | nomeProfSolicitnte | indicacaoClinica  | tabela                                   | codProcedimento | qtdSolic |
      | INTERNAÇÃO | 1243271    | Prestador | 11000947       | 558449             | Indicação clinica | TUSS -- Procedimentos e eventos em saúde | 10102019        | 1        |
