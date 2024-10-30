# Imagem base do OpenJDK 22
FROM openjdk:22-jdk-slim

# Define o diretório de trabalho dentro do contêiner
WORKDIR /app

# Copia o arquivo JAR da sua máquina local para o contêiner
COPY target/*.jar app.jar

# Define o comando de execução do JAR
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

