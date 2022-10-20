@spsadt
Feature: Cenário de Negócio - GUIA DE SP/SADT

  Background:
    Given que eu acesse o sistema SAW
   # And informe usuario "teste_medico35" e senha "trixti@!"
    #And informe usuario "novo_medico35" e senha "123@asdfg"
    #And informe usuario "auto_prest865" e senha "cama@!"
   # And informe usuario "teste_medico865" e senha "cama@!"


  #  And informe usuario "teste_prest32" e senha "trixti@!"
  #  And informe usuario "auto_prest35" e senha "cama@!"
  #  And informe usuario "teste_prest35" e senha "cama@!"
   # And informe usuario "nayaracall.super" e senha "cama@!"

    And informe usuario "teste_prest865" e senha "baleia@!"
    #And informe usuario "uni978" e senha "quadro@!"
    #sofa@! <== producao
    #pronto socorro - 10101039
    #auto_Auditor865
  @SpSADT1
  Scenario Outline: Cadastrar guia com procedimentos de baixocusto
    #GUIA DE CONSULTA ELETIVA
    #When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And clicar ok para Já existe um pedido eletrônico para esse beneficiário
    And informar campo codigo na operadora como "<codNaOperadora>"
    #And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
   # And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
  #  Then devo acionar opção que permite gravar
   # And incluir documentos solicitados
   # And devo acionar opção que permite gravar
  #  And acionar opção que permite cancelar
  #  And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora                          | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora                        | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica |
   #  | 865              | 11000603 -- AACD  | 97340              | TUSS -- Procedimentos e eventos em saúde | 0002602386007   | Eletiva            | 40302580        | 11000603       | 3               | Pequena Cirurgia  | Não Acidente        | 1                |
      | 35               | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 42261              | TUSS -- Procedimentos e eventos em saúde | 0450164909007   | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Pequena Cirurgia  | Não Acidente        | 1                |



#anexar laudo <=================== testa isso
  @SpSADT2
  Scenario Outline: Cadastrar guia com procedimentos de baixocusto e com observação
    #GUIA SPSADT
    #When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And clicar ok para Já existe um pedido eletrônico para esse beneficiário
    And informar campo codigo na operadora como "<codNaOperadora>"
   # And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"

   # And informarmar campo observação "<obs>"
    Then devo acionar opção que permite gravar
   # And incluir documentos solicitados
   # And devo acionar opção que permite gravar
 #   And acionar opção que permite cancelar
  #  And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codBeneficiario | codigoNaOperadora                     | nomeProfExecutante | tabela                                   | caraterAtendimento | codProcedimento | codNaOperadora                        | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | obs                             | tipoConsulta |
      | 35               | 3210000044008   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 865              | 0001445822125   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 865              | 0002450939106   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 3035006042000   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
   #   | 35               | 5197000007005   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 3041990608007   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
   #   | 35               | 4335018003009   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
   #   | 35               | 2001007264006   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 5129000001304   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 5129000001304   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 0450139319099   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 3136000056011   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 4337027781007   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 4402003301009   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 3035011450005   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |
    #  | 35               | 8100019022003   | 62840 -- DIEGO NERY BENEVIDES GADELHA | 97340              | TUSS -- Procedimentos e eventos em saúde | Eletiva            | 10101012        | 62840 -- DIEGO NERY BENEVIDES GADELHA | 1               | Consulta          | Não Acidente        | 1                | observação para guia de  SPSADT | Retorno      |





  #  | 865              | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 0002501287011   | Eletiva            | 40302580        | 11000603       | 3               | Pequena Cirurgia  | Não Acidente        | 1                | observação para guia de  SPSADT |


  @SpSADT3
  Scenario Outline: Pedir revisão de procedimento negado
    #GUIA SPSADT
    #When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And clicar ok para Já existe um pedido eletrônico para esse beneficiário
    And informar campo codigo na operadora como "<codNaOperadora>"
    #And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
    And informar codigo do procedimento como "<codProcedimento>"
    And informar quantidade do procedimento como "<qtdProcedimento>"
    And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
    And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
    And informar campo Indicação Clínica como "<indicacaoClinica>"
   # And informarmar campo observação "<obs>"
    Then devo acionar opção que permite gravar
   # And o sistema deverá apresentar mensagem: "NEGADA"
    And acionar opção para pedir revisão
    And informar mensagem e acionar opção para confirmar "<mensagem>"
   # And o sistema deverá apresentar mensagem: "EM ANÁLISE"
   # And acionar opção que permite cancelar
   # And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora                          | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora                             | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | obs                             | mensagem                  |
      | 35               | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 97340              | TUSS -- Procedimentos e eventos em saúde | 0450031739097   | Eletiva            | 40302580        | 27408 -- ANGELA MARIA TARGINO DE ALCANTARA | 1               | Pequena Cirurgia  | Não Acidente        | 1                | observação para guia de  SPSADT | pedido de revisão da guia |
  #   | 865              | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 0002501287011   | Eletiva            | 40302580        | 11000603       | 3               | Pequena Cirurgia  | Não Acidente        | 1                | observação para guia de  SPSADT | pedido de revisão da guia |


  @SpSADT5
  Scenario Outline: Cadastrar guia com procedimentos de alta complexidade / custo
    #GUIA SPSADT
    #When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And clicar ok para Já existe um pedido eletrônico para esse beneficiário
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
    Then devo acionar opção que permite gravar
    And incluir documentos solicitados
    And devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "EM ANÁLISE"
  # And incluir documentos solicitados
  # And devo acionar opção que permite gravar
    And acionar opção que permite cancelar
    And o sistema deverá apresentar mensagem: "CANCELADA"


    Examples:

      | numeroDaCarteira | codigoNaOperadora                                 | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica |
      | 865              | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 0002501287011   | Eletiva            | 30722063        | 11000603       | 3               | Pequena Cirurgia  | Não Acidente        | 1                |

  @SpSADT6
  Scenario Outline: Cadastrar guia com procedimentos de alta complexidade / custo e atendimento de intercâmbio
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
    Then devo acionar opção que permite gravar
    And incluir documentos solicitados
    And devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "EM ANÁLISE"
   # And acionar opção que permite cancelar
   # And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora                                 | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica |
      | 35               | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 8000019235000   | Eletiva            | 30722063        | 11000603       | 3               | Pequena Cirurgia  | Não Acidente        | 1                |

#########################################################################################################################3
  @SpSADT7
  Scenario Outline: Cadastrar guia com procedimentos de baixo custo - Autorizada e com serviços "EXECUTADOS"
    #GUIA SPSADT
   # When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOperadora>"
  #  And informar Cód. na Operadora como "<codigoNaOperadora>"
   # And informar campo nome do profissional executante como "<nomeProfExecutante>"
 #   And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"

 #   And selecionar campo tabela como "<tabela>"
  #  And informar codigo do procedimento como "<codProcedimento>"
 #   And informar quantidade do procedimento como "<qtdProcedimento>"
  #  And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
  #  And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
 #   And informar campo Indicação Clínica como "<indicacaoClinica>"
 #   And informar campo e-mail como "<email>"
 #   And informar campo telefone "<ddd>" "<tel>"
#    Then devo acionar opção que permite gravar
#    And o sistema deverá apresentar mensagem: "AUTORIZADA"
   # And acionar opção para realizar procedimento
   # And informar campo data para realizar serviço "<data>"
    #And informar campo Hora Inicial e Final "<horaInicio>" "<horaFim>"
   # And informar campo Quantidade realizada "<qtdRealizada>"
   # And acionar botao executar


    Examples:

      | numeroDaCarteira | codigoNaOperadora | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | data              | horaInicio | horaFim | qtdRealizada |
      | 32               | 29034775000160    | ALDA LUCIA BARBOZA | TUSS -- Procedimentos e eventos em saúde | 0000076912825   | Eletiva            | 10101012        | 29034775000160 | 1               | Consulta          | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 22         | 1       | 1            |


    #  | 865              | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | 97340              | TUSS -- Procedimentos e eventos em saúde | 0002396372000   | Eletiva            | 10101039        | 11000603       | 1               | Pronto Socorro    | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | 22/03/2020 | 08:00      | 12:00   | 1            |


  @SpSADT8
  Scenario Outline: Cadastrar guia com procedimentos de baixo custo - Autorizada e com serviços "EXECUTADOS"
    #GUIA SPSADT
   # When fechar o informativo rede credenciada
    And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    #And informar campo codigo na operadora como "<codNaOperadora>"
    And selecionar campo codigo na operadora como "<codNaOperadora>"
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
    #And informar campo telefone "<ddd>" "<tel>"
  #  Then devo acionar opção que permite gravar
    And o sistema deverá apresentar mensagem: "AUTORIZADA"
    And acionar opção para realizar procedimento
    And informar campo data para realizar serviço "<data>"
    And informar campo Hora Inicial e Final "<horaInicio>" "<horaFim>"
    And informar campo Quantidade realizada "<qtdRealizada>"
    And acionar botao executar

    Examples:

      | numeroDaCarteira | codigoNaOperadora                                 | nomeProfExecutante                | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora                      | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | data       | horaInicio | horaFim | qtdRealizada |
      | 35               | 10012417 -- CIRUR CARDIOVASCULAR PROF DR L B PUIG | ALANA ABRANTES NOGUEIRA DE PONTES | TUSS -- Procedimentos e eventos em saúde | 4300003163010   | Eletiva            | 10101039        | 15566 -- JULIO CESAR DA SILVA COSTA | 1               | Pronto Socorro    | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | 22/03/2020 | 08:00      | 12:00   | 1            |

#51086875
  @SpSADT9
  Scenario Outline: Cadastrar guia com procedimentos de baixo custo -  Telemedicina Autorizada - CNU865
    When fechar o informativo rede credenciada
    #And acionar um local de atendimento
    #And acionar opção painel de execução
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
   #And informar campo e-mail como "<email>"
   #And informar campo telefone "<ddd>" "<tel>"
 #   And selecionar campo Tipo Atendimento como "<tipoAtendimento>"
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
   # Then devo acionar opção que permite gravar
#    And o sistema deverá apresentar mensagem: "AUTORIZADA"
#    And acionar opção para tele Saúde
#    And informar campo Celular do Médico como "<celularM>"
#    And infromar Email do Médico como "<emailM>"
#    And marcar checkBox envio da solicitação Médico Email
#    And marcar checkBox envio da solicitação Médico SMS
 #   And informar campo Celular do Beneficiário como "<celularB>"
#    And infromar Email do Beneficiário como "<emailB>"
 #   And marcar checkBox envio da solicitação Beneficiário Email
 #   And marcar checkBox envio da solicitação Beneficiário SMS
 #  And acionar opção para prosseguir


    Examples:

      | numeroDaCarteira | codigoNaOperadora                       | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | tipoAtendimento | tipoConsulta      | celularM  | emailM                       | celularB  | emailB    |
      | 865              | 39457 -- FABIO KENEDY ALMEIDA TRIGUEIRO | 49509              | TUSS -- Procedimentos e eventos em saúde | 0000429669000   | Eletiva            | 10101012        | 110000040      | 1               | Telessaude        | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | Telessaude      | Primeira Consulta | 981812553 | robson.cardoso@trixti.com.br | 981812553 | 981812553 |

  @SpSADT10
  Scenario Outline: Cadastrar guia com procedimentos de baixo custo -  Telemedicina Autorizada - campina Grande 35
    #When fechar o informativo rede credenciada
    #And acionar um local de atendimento
    And acionar a opção painel de execução
    #And acionar o menu TISS Painel de execucao
    And acionar a guia SPSADT
    And informar campo numero da carteira "<numeroDaCarteira>"
    And informar codigo do beneficiario para SPSADT "<codBeneficiario>"
    And informar campo codigo na operadora como "<codNaOperadora>"
    And informar campo nome do profissional executante como "<nomeProfExecutante>"
    And selecionar campo Caráter do Atendimento como "<caraterAtendimento>"
    And informar Cód. na Operadora como "<codigoNaOperadora>"
    And selecionar campo tabela como "<tabela>"
  #  And informar codigo do procedimento como "<codProcedimento>"
  #  And informar campo Indicação Clínica como "<indicacaoClinica>"
  #  And informar quantidade do procedimento como "<qtdProcedimento>"
   # And selecionar campo tipo de atendimento como "<tipoDeAtendimento>"
   # And selecionar campo Indicação de Acidente como "<indicacaoDeAcidente>"
   # And selecionar campo Tipo de Consulta como "<tipoConsulta>"
   # Then devo acionar opção que permite gravar
   # And o sistema deverá apresentar mensagem: "AUTORIZADA"

    #And acionar opção para tele Saúde
    #And informar campo Celular do Médico como "<celularM>"
    #And infromar Email do Médico como "<emailM>"
    #And marcar checkBox envio da solicitação Médico Email
    #And marcar checkBox envio da solicitação Médico SMS
    #And informar campo Celular do Beneficiário como "<celularB>"
    #And infromar Email do Beneficiário como "<emailB>"
    #And marcar checkBox envio da solicitação Beneficiário Email
    #And marcar checkBox envio da solicitação Beneficiário SMS
    #And acionar opção para prosseguir

    Examples:

      | numeroDaCarteira | codigoNaOperadora           | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | email                    | ddd | tel       | tipoAtendimento   | tipoConsulta | celularM | emailM            | celularB | emailB |
      | 865              | 11000947 -- HOSPITAL SEPACO | 62611              | TUSS -- Procedimentos e eventos em saúde | 0002630607004   | Eletiva            | 10101012        | 110000040      | 1               | Telessaude        | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | Retorno      | 1        | TUSS -- Materiais | 70177350 | 1      |

      #| 35               | 39457 -- FABIO KENEDY ALMEIDA TRIGUEIRO | 62611              | TUSS -- Procedimentos e eventos em saúde | 2001008331009   | Eletiva            | 10101012        | 110000040      | 1               | Telessaude        | Não Acidente        | 1                | robson.cardoso@gmail.com | 61  | 981812233 | Telessaude      | Retorno      | 981812553 | robson.cardoso@trixti.com.br | 981812553 | 981812553 |


  @SpSADT865
  Scenario Outline: Cadastrar guia com procedimentos de baixocusto
    #GUIA DE CONSULTA ELETIVA
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
    And selecionar campo Tipo de Consulta como "<tipoConsulta>"
    And informar campo e-mail como "<email>"
   # And informar campo telefone "<ddd>" "<tel>"
  #  And selecionar campo tabela materiais I "<tabelaMat1>"
  #  And informar codigo do material I "<codMat1>"
 #   And informar quantidade do material I "<qtdMatI>"
  #  And selecionar campo tabela materiais II "<tabelaMat2>"
 #   And informar codigo do material II "<codMat2>"
 #   And informar quantidade do material II "<qtdMatII>"
 #   And selecionar campo tabela medicamentos I "<tabelaMed1>"
 #   And informar codigo do medicamento I "<codMed1>"
 #   And informar quantidade do medicamento I "<qtdMedI>"
 #   And selecionar campo tabela medicamentos II "<tabelaMedII>"
#    And informar codigo do medicamento II "<codMedII>"
#    And informar quantidade do medicamento II "<qtdMedII>"
    Then devo acionar opção que permite gravar
    #And o sistema deverá apresentar mensagem: "AUTORIZADA"
    And acionar opção para realizar os procedimentos
    And informe Hora Inicial e Final "<hdInicio>" "<hsFim>"
    And marcar todos os procedimentos
    And acionar opção que permite executar


   # And incluir documentos solicitados
   # And devo acionar opção que permite gravar
  #  And acionar opção que permite cancelar
  #  And o sistema deverá apresentar mensagem: "CANCELADA"

    Examples:

      | numeroDaCarteira | codigoNaOperadora      | nomeProfExecutante | tabela                                   | codBeneficiario | caraterAtendimento | codProcedimento | codNaOperadora | qtdProcedimento | tipoDeAtendimento | indicacaoDeAcidente | indicacaoClinica | tipoConsulta | email                    | ddd | tel       | tabelaMat1        | codMat1  | qtdMatI | tabelaMat2        | codMat2  | qtdMatII | tabelaMed1           | codMed1  | qtdMedI | tabelaMedII          | codMedII | qtdMedII | hdInicio | hsFim |
     # | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0016029181006   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
    #  | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0002255610850   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
     # | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0002577621001   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
     # | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0002255049318   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
    #  | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0002255049318   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
     # | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0400000117008   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
     # | 865              | 11000603 -- AACD  | 453063             | TUSS -- Procedimentos e eventos em saúde | 0032000868157   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
      | 865              | 002601834 -- A MELUZZI | 453063             | TUSS -- Procedimentos e eventos em saúde | 0002392408000   | Eletiva            | 10101012        | 97497971       | 1               | Consulta          | Não Acidente        | 1                | Retorno      | robson.cardoso@gmail.com | 61  | 981812233 | TUSS -- Materiais | 70224641 | 1       | TUSS -- Materiais | 70177350 | 1        | TUSS -- Medicamentos | 90003705 | 1       | TUSS -- Medicamentos | 90077326 | 1        | 11:11    | 11:11 |
