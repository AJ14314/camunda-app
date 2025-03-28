```markdown
# Camunda Spring Boot Application

This project is a Spring Boot application integrated with Camunda BPM for process automation. It includes REST endpoints to interact with BPMN processes.

## Prerequisites

- Java 17
- Gradle 7.0+
- An IDE (e.g., IntelliJ IDEA)

## Project Structure

- `src/main/java/com/anand/controllers/HomeController.java`: Contains REST endpoints for home and process execution.
- `src/main/java/com/anand/services/UserDepartmentService.java`: A service component that provides user department information.
- `build.gradle`: Gradle configuration file with dependencies and plugins.

## Dependencies

The project uses the following dependencies:

- Spring Boot
- Camunda BPM
- H2 Database
- Nashorn Core

## Building the Project

To build the project, run the following command:

```sh
gradle clean build
```

## Converting Maven to Gradle

To initialize gradle in a Maven project, use the following command:

```sh
gradle init --type pom
```

## Running the Application

To run the application, use the following command:

```sh
gradle bootRun
```

## REST Endpoints

### Home Endpoint

- **URL**: `/home`
- **Method**: GET
- **Description**: Returns a welcome message.

### Execute Process Endpoint

- **URL**: `/execute/{processKey}`
- **Method**: GET
- **Description**: Executes a BPMN process with the given process key.
- **Path Variable**: `processKey` - The key of the BPMN process to execute.

## Example Usage

To execute a process with the key `myProcess`, send a GET request to:

```
http://localhost:8080/execute/myProcess
```

## License

This project is licensed under the MIT License.
```