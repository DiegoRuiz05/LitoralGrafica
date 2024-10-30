# Etapa 1: Imagem base do OpenJDK 22 com Maven para construir o projeto
FROM openjdk:22-jdk-slim AS builder

# Instala o Maven e outras dependências necessárias
RUN apt-get update && \
    apt-get install -y maven && \
    rm -rf /var/lib/apt/lists/*

# Define o diretório de trabalho no contêiner para o builder
WORKDIR /app

# Copia os arquivos do projeto (pom.xml e src) para o contêiner
COPY pom.xml .
COPY src ./src

# Compila o projeto e cria o JAR ignorando testes para maior rapidez
RUN mvn clean package -DskipTests

# Etapa 2: Imagem base do OpenJDK 22 para execução do JAR
FROM openjdk:22-jdk-slim

# Define o diretório de trabalho para o contêiner final
WORKDIR /app

# Copia o JAR gerado na etapa de construção para a imagem final
COPY --from=builder /app/target/*.jar app.jar

# Define o comando para executar o JAR
ENTRYPOINT ["java", "-jar", "/app/app.jar"]


