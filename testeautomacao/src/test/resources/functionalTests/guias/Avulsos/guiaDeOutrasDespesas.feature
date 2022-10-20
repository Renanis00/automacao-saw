@outrasDespesas
Feature: Cenário de Negócio - GUIA DE OUTRAS DESPESAS

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "auto_prest865" e senha "baleia@!"
    #And informe usuario "auto_prest35" e senha "veneza@!"
    #And informe usuario "teste_prest35" e senha "veneza@!"
    #And informe usuario "rob_prest865" e senha "veneza@!"
    #And informe usuario "uni978" e senha "veneza@!"
    #pronto socorro - 10101039


  @outrasDespesas1
  Scenario Outline: Cadastrar guia com procedimentos de baixo custo - Autorizada e com serviços "EXECUTADOS"
    #GUIA SPSADT
    When fechar o informativo rede credenciada
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
    And o sistema deverá apresentar mensagem: "AUTORIZADA"
    And acionar opção para realizar procedimento
    And informar campo data para realizar serviço "<data>"
    And informar campo Hora Inicial e Final "<horaInicio>" "<horaFim>"
    And informar campo Quantidade realizada "<qtdRealizada>"
    And acionar botao executar

    Examples:

      | numeroDaCarteira | codigoNaOperadora                                 | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | data       | horaInicio | horaFim | qtdRealizada |
      | 865              | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 0002396372000   | Eletiva            | 10101039        | 11000603       | 1               | Pronto Socorro    | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | 22/03/2020 | 08:00      | 12:00   | 1            |
#2104425382
  @outrasDespesas2
  Scenario Outline: Cadastrar guia De Outras Despesas
    #GUIA DE OUTRAS DESPESAS
    When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia de Outras Despesas
    And acionar opção para pesquisar Guia Referenciada
    And selecionar campo tipo de guia "<tipoDeguia>"
    And informar campo Número Guia como "<numeroGuia>"
    And acionar botão para pesquisar
    And acionar opção de realização do vinculo
    And selecionar campo CD como "<cd>"
    And informar campo Data "<data>"
    And informar Hora Inicial e Final "<horaInicio>" "<horaFim>"
    And informar campo Tabela  "<tabela>"
    And informar campo Cód Item como "<codItem>"
    And informar campo Qtde como "<qtde>"
    And selecionar campo Fator Red "<fatoRed>"
    And informar campo Valor Unitário "<valorUnit>"
    Then devo acionar opção para gravar
   # And o sistema deverá apresentar mensagem: "CADASTRADA"


    Examples:

      | tipoDeguia | numeroGuia | cd           | data | horaInicio | horaFim | tabela               | codItem  | qtde | fatoRed | valorUnit |
      | SP/SADT    | 2104425382 | Medicamentos |      | 09:00      | 09:30   | TUSS -- Medicamentos | 90019415 | 1    | 0.2     | 10,00     |
