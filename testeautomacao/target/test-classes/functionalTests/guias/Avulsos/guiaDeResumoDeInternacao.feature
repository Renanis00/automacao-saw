@fluxoResumoInternacao
Feature: Cenário de Negócio - GUIA DE RESUMO DE INTERNAÇÃO

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "auto_prest865" e senha "Cidade@!1"


  @resumoInternacao1
  Scenario Outline: SAW - Guia De Internação
    #GUIA DE INTERNAÇÃO
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar opção Internação
    And informar Número da Carteira como "<operadora>""<numCarteira>"
    And informar campo codigo na operadora "<codNaoperadora>"
    And informar campo Nome do Profissional Solicitante como "<nomeProfExecutante>"
    And selecionar campo Código CBO como "<codCBO>"
    And informar campo codigo da operadora como "<codDaOperadora>"
    And informar campo data sugerida para internaçõa "<dataSugeInternacao>"
    And selecionar campo carater de internação como "<caraterInternacao>"
    And selecionar campo Tipo internação "<selTipoDeInternacao>"
    And selecionar campo regime de internação como "<regimeInternacao>"
    #==================================================
    And selecionar previsao de uso de OPME como não
    And selecionar previsao de uso de quimioterapia como não
    #==================================================
    And informar Indicação Clínica como "<indicClinica>"
    And selecionar indicação de acidente como "<indicacaoAcidente>"
    And selecionar o campo tabela como "<tabela>"
    And selecionar codigo da tabela "<codTabela>"
    And informar campo quantidade diaria "<qtd>"
    And selecionar o campo tabela procedimentos "<tabelaProc>"
    And selecionar codigo procedimento da tabela "<codTabelaProc>"
    And informar campo quantidade procedimento "<qtd2>"
    And informar campo Data Provável da Admissão Hospitalar "<data2>"
    And informar campo e-mail "<email>"
    And informar campo telefone como "<ddd>" "<tel>"
    Then deve acionar o botão gravar
    #GUIA DE RESUMO DE INTERNAÇÃO
    And acionar opção solicitar resumo de internação
    And acionar opção  Cadastrar guia de Resumo de internação
    And selecionar campo Tipo Faturamento como "<tipoFaturamento>"
    And informar campo data inicio do faturamento "<dataInicioFat>"
    And informar campo hora inicio do faturamento "<horaInicioFat>"
    And informar campo data fim do faturamento "<dataFimFat>"
    And informar campo hora final do faturamento "<horaFinalFat>"
    And selecionar campo tipo de internação como "<tipoDeInternacao>"
    And informar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And selecionar campo Motivo Encerramento Internação "<motivoEncerramento>"
    And selecionar check Procedimentos e Exames Realizados
    And selecionar data Procedimentos e Exames Realizados "<datProcRealizado>"
    And informar Hora Inicial e Final "<horaInicioFat>" "<horaFinalFat>"
    And selecionar tabela do procedimento "<tabelaProc>"
    And informar campo Cód Proced "<codProced>"
    And informar campo Qtde Proced "<qtde>"
    And selecionar campo Fator de Reducao e Acrescimo "<fatorRedAcresc>"
    And informar campo Valor Unitário-R$ como "<valorUnit>"
    And acionar botao para gravar guia de resumo de internação

    Examples:

      | operadora | numCarteira   | codNaoperadora | nomeProfExecutante | codDaOperadora              | dataSugeInternacao | selTipoDeInternacao | caraterInternacao | regimeInternacao | indicClinica | indicacaoAcidente | tabela                                                          | codTabela                                      | qtd | tabelaProc                               | codTabelaProc | qtd2 | email         | ddd | tel       | tipoFaturamento | dataInicioFat | horaInicioFat | dataFimFat | horaFinalFat | tipoDeInternacao | indicacaoDeAcidente | motivoEncerramento | datProcRealizado | tabelaProc                               | codProced | fatorRedAcresc | valorUnit | codCBO                 |
      | 865       | 0002001208511 | 11000947       | adalto             | 11000947 -- HOSPITAL SEPACO | 16/04/2020         | Clínica             | Eletiva           | Hospitalar       | Indicação    | Não Acidente      | DIÁRIA - TUSS -- Taxas hospitalares, diárias e gases medicinais | 60000775 - DIÁRIA DE  HOSPITAL DIA APARTAMENTO | 1   | TUSS -- Procedimentos e eventos em saúde | 10102019      | 1    | trix@trix.com | 61  | 987877777 | Parcial         |               | 08:00         |            | 09:00        | Clínica          | Não Acidente        | Alta Melhorado     |                  | TUSS -- Procedimentos e eventos em saúde |           | 0.7            | 10000     | Médico cirurgião geral |


  @resumoInternacao2
  Scenario Outline: aws
    #GUIA DE RESUMO DE INTERNAÇÃO
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar opção Resumo Internação
    And acionar campo guia de Solicitação de Internação Pesquisar
    And selecionar um tipo de guia "<tipoDeGuia>"
    And informar o numero da  guia "<numeroDaGuia>"
    And acionar botão pesquisar
    And acionar opção para realização do vinculo
    And selecionar campo tipo de faturamento como "<tipoDeFaturamento>"
    And informar campo data do inicio do faturamento como "<dataInicioFaturamento>"
    And informar campo hora inicio faturamento como "<horaInicioFaturamento>"
    And informar campo hora fim faturamento como "<horaFimFaturamento>"
    And informar campo data do fim do faturamento como "<dataFimFaturamento>"
    And selecionar campo indicação de acidente como "<indicacaoAcidente>"
    And selecionar campo Motivo Encerramento Internação como "<motivoEncerramentoInternacao>"
    And acionar checkbox procedimentos e exames realizados
    And informar Data para o procedimento ou exames realizados "<dataProcedimento>"
    And informar hora inicio para procedimentos e exames realizados "<horaInicio>"
    And informar hora fim para procedimentos e exames realizados "<horaFim>"
    And infrmar tabela para procedimentos e exames realizados "<tabela>"
    And informar campo Cód. Proced. como "<codidoProcedimento>"  


   # Then
    Examples:

      | tipoDeGuia | numeroDaGuia | tipoDeFaturamento | dataInicioFaturamento | horaInicioFaturamento | dataFimFaturamento | horaFimFaturamento | indicacaoAcidente | motivoEncerramentoInternacao | dataProcedimento | horaInicio | horaFim | tabela                                   | codidoProcedimento |
      | INTERNAÇÃO | 51028871     | Parcial           | 15/01/2020            | 10:00                 | 20/01/2020         | 11:00              | Não Acidente      | Alta Melhorado               | 20/01/2020       | 10:00      | 11:00   | TUSS -- Procedimentos e eventos em saúde | 30906105           |