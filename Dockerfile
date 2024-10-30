# Etapa 1: Utiliza uma imagem base com o Maven para compilar o projeto
FROM maven:3.8.8-openjdk-22 AS builder

# Define o diretório de trabalho no contêiner
WORKDIR /app

# Copia os arquivos necessários para o Maven construir o projeto
COPY pom.xml ./
COPY src ./src

# Executa o comando Maven para construir o projeto e gerar o JAR
RUN mvn clean package -DskipTests

# Etapa 2: Utiliza uma imagem base leve do OpenJDK para executar o JAR
FROM openjdk:22-jdk-slim

# Define o diretório de trabalho no contêiner final
WORKDIR /app

# Copia o JAR gerado na etapa de construção
COPY --from=builder /app/target/*.jar app.jar

# Define o comando de execução da aplicação
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

