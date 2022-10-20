@35Prorrogacao
Feature: Cenário de Negócio - GUIAS

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "uni35" e senha "antena@!"
    And informe usuario "uni35" e senha "baleia@!"

  @35cadastraGuiaDeProrrogacao
  Scenario Outline: Cadastrar guia De Prorrogação
    #GUIA DE PRORROGAÇÃO
    When acionar o menu TISS Painel de execucao
    And acionar a guia de Prorrogação
    And acionar a opção de pesquisar Guia Referenciada
    And selecionar campo tipo de guia "<tipoDeguia>"
    #And informar campo Número Guia como "<numeroGuia>"
    And informar um numero de guia autorizada "<numeroGuia>"
    And selecionar campo operadora ou prestador "<opPrest>"
    And acionar botão para pesquisar
    And acionar opção de realização do vinculo
    And informar campo Código na Operadora "<codNaOperadora>"
    #And informar campo nome do Profissional Solicitante "<nomeProfSolicitnte>"
    And informar campo Indicação Clínica "<indicacaoClinica>"
    And informar o campo Tabela  "<tabela>"
    And informar campo Código do Procedimento "<codProcedimento>"
    And informar campo Qtd Solic "<qtdSolic>"
    Then devo acionar opção para gravar
    And acionar opção Clique aqui para verificar a auditoria!
   # And acionar opção para atender
    And acionar opção para autorizar todos
    And informar ressalva e acionar opção de autorizar "<resalva>"
    And acionar opção Clique aqui para aprovar solicitação
    And devo acionar opção que permite encerrar
    And acionar opção Clique aqui para detalhar guia
    #And o sistema deverá apresentar mensagem: "CADASTRADA"

    Examples:

      | tipoDeguia | numeroGuia | opPrest   | codNaOperadora | nomeProfSolicitnte | indicacaoClinica  | tabela                                   | codProcedimento | qtdSolic | resalva |
      | INTERNAÇÃO | dinamico   | Prestador | 24581          | 558449             | Indicação clinica | TUSS -- Procedimentos e eventos em saúde | 10102019        | 1        | teste   |
