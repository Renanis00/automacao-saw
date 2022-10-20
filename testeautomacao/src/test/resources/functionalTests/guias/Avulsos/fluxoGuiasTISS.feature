@tiss
Feature: Cenário de Negócio - GUIA DE SP/SADT

  Background:
    Given que eu acesse o sistema SAW
    #And informe usuario "auto_prest865" e senha "quadro@!"
    And informe usuario "uni978" e senha "baleia@!"


  @guiaSPSADT
  Scenario Outline: Cadastrar guia com procedimentos de baixocusto
    #GUIA DE CONSULTA ELETIVA
   # When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
    And selecionar campo codigo CBOs como "<codigoCBOs>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    #And informar campo Indicação Clínica como "<indicacaoClinica>"
    Then devo acionar opção que permite gravar
   # And incluir documentos solicitados
   # And devo acionar opção que permite gravar
   # And acionar opção que permite cancelar
   # And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento  | indicacaoDeAcidente | indicacaoClinica | codigoCBOs           |
      | 978              | 220000007         | 12056              | TUSS -- Procedimentos e eventos em saúde | 0100009071000   | Eletiva            | 40101010        | 220000007      | 1               | Exame Ambulatorial | Outros              | 1                | Médico acupunturista |


  @guiaQUIMIOTERAPIA
  Scenario Outline: GUIA DE QUIMIOTERAPIA
    #GUIA DE QUIMIOTERAPIA
    #When fechar o informativo rede credenciada
    When acionar o menu TISS Painel de execucao
    And acionar a guia de quimioterapia
    And acionar campo numero guia referenciada
    And selecionar um tipo de quia como "<tipoDeGuia>"
    And informar campo numero guia como "<numeroGuia>"
    And acionar opção que permite pesquisar
    And acionar opção para realização do vinculo
  #  And informar campo peso como "<peso>"
  #  And informar campo altura como "<altura>"
  #  And acionar campo Superfície Corporal
  #  And informar campo idade como "<idade>"
#     And selecionar campo sexo como "<sexo>"
#     And selecionar campo estadiamento como "<estabelecimento>"
 #    And informar campo telefone como "<telefone>"
 #    And selecionar um tipo de estabelecimento "<estabelecimento2>"
 #    And selecionar campo finalidade como "<finalidade>"
#     And selecionar campo ECOG como "<ecog>"
 #    And selecionar campo tumor como "<tumor>"
 #    And selecionar campo nodulo como "<nodulo>"
  #   And selecionar campo metastase como "<metastase>"
  #   And informar campo plano terapeutico como "<planoTerapeutico>"
  #   And informar campo data prevista para administração como "<dataPreviAdm>"
  #   And selacionar campo tabela como "<tabela>"
 #    And informar campo codigo medicamento como "<codMedicamento>"
#     And informar campo frequência como "<frequencia>"
 #    And informar campo dosagem total do ciculo como "<dosagemTotalCiculo>"
 #    And selecionar campo unidade de medida como "<unidMedida>"
 #    And selecionar campo via admin como "<viaAdmin>"
  #   And informar campo numero de ciculos previstos como "<numCiculosPrevist>"
 #    And informar campo ciculo atual como "<ciculoAtual>"
  #   And informar numero de dias do ciculo atual "<numDiasCiculoAtual>"
 #    And informar campo intervalo entre os ciculos como "<intervaloEntreCiculos>"
  #   And informar campo data da solicitação "<dataSolicitacao>"
  #   Then devo acionar opção que permite gravar guia
  #   And o sistema deverá apresentar mensagem: "AGUARDANDO"

    Examples:


      | tipoDeGuia | numeroGuia | peso | altura | idade | sexo      | telefone    | estabelecimento2 | finalidade | ecog             | tumor | nodulo | metastase | planoTerapeutico | dataPreviAdm | tabela               | dosagemTotalCiculo | unidMedida | viaAdmin | numCiculosPrevist | ciculoAtual | numDiasCiculoAtual | intervaloEntreCiculos | dataSolicitacao | estabelecimento | codMedicamento | frequencia |
      | SP/SADT    | 202585245  | 80   | 17000  | 20    | Masculino | 61989890099 | 1ª linha         | Curativa   | Totalmente ativo | T1    | N1     | M1        | PlanoTerapêutico | 04/02/2020   | TUSS -- Medicamentos | 7                  | Ampola     | Bucal    | 7                 | 2           | 3                  | 4                     | 04/02/2020      | I               | 90000021       | 32         |

