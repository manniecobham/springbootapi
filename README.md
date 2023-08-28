# First Spring Boot API

Welcome to the **First Spring Boot API** project! This is a simple Spring Boot application that demonstrates how to create a REST API to check the status of a website.

## Table of Contents
- [Getting Started](#getting-started)
- [Usage](#usage)
- [Endpoints](#endpoints)
- [Contributing](#contributing)
- [License](#license)

## Getting Started

To run this Spring Boot application, you'll need to have Java and Maven installed on your machine.

```sh
# Clone this repository to your local machine:
git clone https://github.com/manniecobham/springbootapi.git

# Navigate to the project directory:
cd first-spring-boot-api

# Build and run the application using Maven:
mvn spring-boot:run

The application will start, and you can access it at http://localhost:8080.

## Usage

This application provides a simple API endpoint to check the status of a website. You can use tools like `curl` or Postman to interact with the API. Here`s an example using `curl`:

```sh
curl http://localhost:8080/check?url=https://www.example.com

```

## Endpoints
GET / - Returns a simple message indicating that the app checker is working.
GET /check?url={URL} - Checks the status of the provided URL and returns the appropriate status message.

## Contributing
Contributions are welcome! If you find any issues or have improvements to suggest, feel free to open an issue or submit a pull request.

Fork the repository.
Create a new branch: git checkout -b feature/my-feature.
Make your changes and commit them: git commit -m 'Add some feature'.
Push to the branch: git push origin feature/my-feature.
Open a pull request.

## License
This project is licensed under the MIT License.


Please note that some of the formatting might not translate perfectly in this text-based environment, but you can copy and paste the code into your `README.md` file to achieve the intended formatting.
