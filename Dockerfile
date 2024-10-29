# Usando uma imagem do Maven com OpenJDK 22
FROM maven:3.8.6-openjdk-22 AS builder

# Definindo o diretório de trabalho
WORKDIR /app

# Copiando o arquivo pom.xml e o diretório src
COPY pom.xml .
COPY src ./src

# Executando o Maven para construir o aplicativo
RUN mvn clean package

# Usando uma imagem leve do OpenJDK 22 para executar o aplicativo
FROM openjdk:22-jdk-slim

# Copiando o arquivo JAR gerado
COPY --from=builder /app/target/*.jar app.jar

# Comando para executar o aplicativo
ENTRYPOINT ["java", "-jar", "/app.jar"]
