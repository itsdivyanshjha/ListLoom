# ListLoom
Weave your tasks into productivity with ListLoom.
# ListLoom: To-Do List Application

ListLoom is a Java-based To-Do List application designed to help users manage their tasks efficiently. This application allows users to create, update, delete, and view tasks in a to-do list.

## Features

- **Add Task:** Users can add new tasks with a title and description.
- **Mark Task as Completed:** Users can mark tasks as completed.
- **Update Task Details:** Users can update the details of existing tasks.
- **Delete Task:** Users can delete tasks from the list.
- **View Tasks:** Users can view the list of all tasks.

## Getting Started

### Prerequisites

- Java 8 or later
- Maven 3.x
- (Optional) Apache Tomcat for deployment

### Installation

1. Clone the repository:
git clone https://github.com/wazooinc/spring-boot-todo-application.git
2. Navigate to the project directory:
cd spring-boot-todo-application
3. Grant execute permissions to the Maven Wrapper script:
chmod +x ./mvnw
4. Build the project:
./mvnw clean install
5. Run the application:
./mvnw spring-boot:run


### Usage

Once the application is running, you can access it via a web browser at `http://localhost:8080`.

## Deployment

To deploy the application to a production environment using Apache Tomcat, follow these steps:

1. Package the application as a WAR file:
./mvnw clean package -Pprod

2. Deploy the generated WAR file to your Tomcat server.

## Contributing

Contributions are welcome. Please feel free to submit pull requests or open issues for any improvements or bug fixes.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details.

## Contact

For any questions or support, please contact the project maintainers.
