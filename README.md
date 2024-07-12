<h1 align="center">Spotify API</h1>

<p align="center">
  <img alt="License" src="https://img.shields.io/static/v1?label=License&message=MIT&color=8257E5&labelColor=000000">
  <img alt="License" src="https://img.shields.io/static/v1?label=Language&message=Java&color=8257E5&labelColor=000000">
  <img alt="License" src="https://img.shields.io/static/v1?label=Version&message=1.0&color=8257E5&labelColor=000000">
</p>

## ✨ Tecnologias

Esse projeto foi desenvolvido com as seguintes tecnologias:

* Java 22
* Spring Boot
* Spring Cloud Open Feign
* Spotify API

## 💻 Projeto

Spotify API é um projeto que visa consumir a API do Spotify para buscar informações de artistas, álbuns e músicas.

## 🚀 Como executar

- Clone o repositório
- Abra o projeto no IntelliJ IDEA
- Crie um arquivo `application.properties` na pasta `src/main/resources`
- Adicione a seguinte linha ao arquivo `application.properties`:
```properties
spotify.api.client.id=YOUR_CLIENT_ID
spotify.api.client.secret=YOUR_CLIENT_SECRET
```
- Substitua `YOUR_CLIENT_ID` e `YOUR CLIENT_SECRET` pelos valores obtidos ao criar um aplicativo no [Spotify Developer Dashboard](https://developer.spotify.com/dashboard/applications)
- Execute o projeto

## 📄 Licença

Esse projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.