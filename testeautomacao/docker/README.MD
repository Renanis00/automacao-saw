# Construção e execução - Docker

## Construindo a imagem Docker

Para montar a imagem Docker utilize o comando abaixo:

````
docker build -t maven-automacao .
````

Caso queira construir com alguma versão específica do Chrome, informe o argumento CHROME_VERSION:

````
docker build --build-arg CHROME_VERSION=<NUMERO DA VERSAO> -t maven-automacao .
````

Para saber qual a versão atual e identificar versões anteriores, sugiro esse link:
https://www.ubuntuupdates.org/package/google_chrome/stable/main/base/google-chrome-stable

## Execução do container com base no projeto

A execução é o próprio comando do Maven para que os cenários de testes sejam validados. Para isso, é necessário enviar o diretório raiz do projeto como volume. A opção "--rm" evita que o container exista após a execução e a opção "-w" informa qual o diretório raiz na execução do container. 

````
docker run --rm -v <diretório raiz da aplicacao>:/usr/src -w /usr/src maven-automacao mvn test -Dcucumber.options="--tags '@$tag'"
````





