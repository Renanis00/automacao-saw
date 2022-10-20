@importarGuia32
Feature: Cenário de Negócio - Auditoria de contas

  Background:
    Given que eu acesse o sistema SAW
    And informe usuario "adm32" e senha "abelha@!"

    @importarAutorizacaoCuritiba
    Scenario Outline: AUDITORIA DE INTERNAÇÃO

      When acessar listagem de transações SCE
      And resgatar e importar número de autorização do lote "<numeroLote>"


      Examples:
        | numeroLote |
        |	100591554	|
        |	12628	|
        |	12631	|
        |	12695	|
        |	12703	|
        |	12715	|
        |	12719	|
        |	1292702	|
        |	131625	|
        |	13907866|
        |	1439400	|
        |	1486772	|
        |	1486773	|
        |	1486774	|
        |	1616835	|
        |	1684990	|
        |	1685692	|
        |	1688624	|
        |	1689402	|
        |	1691689	|
        |	1696271	|
        |	1696464	|
        |	1701191	|
        |	1708972	|
        |	1723145	|
        |	174832	|
        |	178890	|
        |	180522	|
        |	1828550	|
        |	1828552	|
        |	1828553	|
        |	1911906	|
        |	203490	|
        |	2047	|
        |	223216	|
        |	231205	|
        |	231208	|
        |	308728	|
        |	437153	|
        |	44925	|
        |	449533	|
        |	4864487	|
        |	5052022	|
        |	5820312	|
        |	63096	|
        |	63099	|
        |	709118	|
        |	927569	|
        |	927639	|
        |	928144	|
        |	928228	|

