# Usando uma imagem base do OpenJDK 22
FROM openjdk:22-jdk-slim AS builder

# Instalando o Maven
RUN apt-get update && apt-get install -y maven && apt-get clean

# Definindo o diretório de trabalho
WORKDIR /app

# Copiando o arquivo pom.xml e o diretório src
COPY pom.xml .
COPY src ./src

# Executando o Maven para construir o aplicativo
RUN mvn clean package

# Usando uma imagem leve do OpenJDK 22 para executar o aplicativo
FROM openjdk:22-jdk-slim

# Definindo o diretório de trabalho para o runtime
WORKDIR /app

# Copiando o arquivo JAR gerado da fase de build
COPY --from=builder /app/target/*.jar app.jar

# Comando para executar o aplicativo
ENTRYPOINT ["java", "-jar", "/app.jar"]
