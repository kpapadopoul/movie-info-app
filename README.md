# Getting Started

## What you’ll need
* [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
* [Maven 3.2+](https://maven.apache.org/download.cgi)

## Build, run and use the application

### Build an executable JAR with Maven
```bash
./mvnw clean package
```

### Run the JAR file
```bash
java -jar target/movie-info-app-1.0.0.1-SNAPSHOT.jar
```

### Validate proper execution of the service
```bash
curl http://localhost:8080
```

### Retrieve currently-in-theaters data and store them to the DB
```bash
curl http://localhost:8080/now-playing
```

### Calculate previous month movie count per country and store figures to the DB
```bash
curl http://localhost:8080/previous-month-count
```




