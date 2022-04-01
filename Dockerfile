FROM openjdk:8

EXPOSE 8080

COPY target/gestao-vendas-0.0.1-SNAPSHOT.jar /app/gestao_vendas.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", ""]