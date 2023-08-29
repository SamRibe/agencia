# agencia

## Criar um projeto no Maven
mvn archetype:generate -DgroupId=br.com.senai -DartifactId=nome_do_projeto -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

## Acessar o projeto
cd nome_do_projeto

## Inicializar o vercionamento
git init - Somente no inicio do projeto

## Adicionar os arquivo do projeto
git add . (o ponto informa que irá adicionar tudo)

## Criar um repositorio na minha conta do GitHub com o nome do projeto
Ex.: agencia | agenciaRh ou agencia-rh
## Captura o link do git remote em ssh
Ex.: git@hithub.com:SamRibe/agencia.git

## Subir o projeto o projeto para o GitHub
git push -u origin main (ou branch atual)