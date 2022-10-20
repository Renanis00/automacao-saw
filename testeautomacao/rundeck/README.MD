# Informações gerais sobre os jobs

Após criar o projeto no Rundeck, faça o import dos jobs disponíveis aqui.

Sobre os jobs:

  - Build_container_automacao
    - Este job é responsável pelo build do container.
    - Input: ChromeVersion

  - Execução_por_tag
    - Este job é responsável pela execução do teste BDD baseado no ambiente e tag;
    - Inputs: Ambiente e Tag
    - Antes da execução propriamente dita, este job configura o projeto para que seja possível a execução em container, por exemplo: caminho do chromedriver, url da aplicação, entre outros.

Outras informações:

  - Diretório de clone do repositório: /app/testeautomacao
  - Diretório dos relatórios: /app/reports/RelatoriosDeTestes/
  - Chave SSH do rundeck adicionada ao GIT

