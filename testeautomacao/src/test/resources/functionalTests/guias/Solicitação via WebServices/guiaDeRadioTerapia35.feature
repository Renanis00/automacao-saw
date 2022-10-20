@guias35
Feature: Cenário de Negócio - GUIA DE RADIOTERAPIA

  Background:
    Given que eu acesse o sistema SAW
    ##And informe usuario "auto_prest865" e senha "coelho@!"
    And informe usuario "auto_prest35" e senha "baleia@!"
    #pronto socorro - 10101039

  @radioTerapia35
  Scenario Outline: Cadastrar guia de radioterapia
    #GUIA SPSADT
    #When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And informar campo e-mail como "<email>"
    And informar campo telefone "<ddd>" "<tel>"
    Then devo acionar opção que permite gravar
    And incluir documentos solicitados
    And devo acionar opção que permite gravar
    #GUIA RADIOTERAPIA
   # And acionar opção de anexo
   # And acionar opção de novo anexo
    And selecionar opção de radioterapia "<radioTerapia>"
    And acionar opção sim
    And informar o campo idade como "<idade>"
    And selecionar sexo como "<sexo>"
    And informar telefone do profissional de saude "<tel2>"
    And selecionar campo Estadiamento como "<Estadiamento>"
    And selecionar o campo ECOG como "<ecog>"
    And selecionar campo Finalidade como "<finalidade>"
    And informar campo Número de Campos como "<numCamp>"
    And informar campo Dose por dia "<qtdDoses>"
    And informar campo Dose Total "<totalDoses>"
    And informar campo Número de Dias "<numDias>"
    And informar Data Prevista para Início de Administração "<data1>"
    And informar Data da Solicitação "<data2>"
    And acionar opção de gravar
  #  And o sistema deverá apresentar mensagem: "AUTORIZADA"


    Examples:

      | numeroDaCarteira | codigoNaOperadora                                 | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | radioTerapia | idade | sexo      | Estadiamento | ecog             | finalidade | numCamp | qtdDoses | totalDoses | numDias | data1 | data2 | tel2        |
      | 35               | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 4403002441018   | Eletiva            | 41203135        | 11000603       | 1               | Pronto Socorro    | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | RADIOTERAPIA | 38    | Masculino | I            | Totalmente ativo | Curativa   | 4       | 10       | 40         | 7       |       |       | 61981812222 |