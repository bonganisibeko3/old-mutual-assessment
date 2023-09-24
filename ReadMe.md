# Old Mutual Assessment

The Character Copier is a Java application that demonstrates the use of test-doubles and mocking libraries (such as Mockito) to copy characters from a source to a destination. The application reads characters from an `ISource` interface and copies them one at a time to an `IDestination` interface. The copying process continues until a newline character (`'\n'`) is encountered, at which point the copying stops without writing the newline character.

## Table of Contents

- [Requirements](#requirements)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Requirements

- Java 1.8 or higher
- A mocking library (e.g., Mockito)

## Usage

1. Clone the repository to your local machine:

bash
git clone https://github.com/bonganisibeko3/old-mutual-assessment.git


2. Open the project in your preferred Java development environment (e.g., IntelliJ IDEA, Eclipse).

3. Customize the `ISource` and `IDestination` interfaces and the `Copier` class according to your requirements.

4. Implement the methods in the `ISource` and `IDestination` interfaces to read and write characters as needed.

5. Write unit tests for the `Copier` class using a mocking library (e.g., Mockito). Sample tests have been provided in the `CopierTest` class.

6. Run the unit tests to verify the functionality of the `Copier` class.

7. Extend the `ISource` and `IDestination` interfaces to support reading and writing multiple characters at a time, as specified in the bonus requirements.

8. Update the `Copier` class to use the extended interfaces and modify the `copy()` method as necessary.

9. Write additional unit tests to cover the new functionality.

10. Run the updated unit tests to ensure everything works as expected.

## Project Structure

The project structure is organized as follows:


old-mutual-assessment/
├── src/
│   ├── main/
│   │   └── java/
│   │       ├── za/
│   │       │   └── co/
│   │       │       └── oldmutual/
│   │       │           └── assessment/
│   │       │               ├── ISource.java     # ISource interface definition
│   │       │               ├── IDestination.java # IDestination interface definition
│   │       │               └── Copier.java      # Copier class implementation
│   └── test/
│       └── java/
│           └── za/
│               └── co/
│                   └── oldmutual/
│                       └── assessment/
│                           └── CopierTest.java  # Unit tests for the Copier class
├── .gitignore                   # Git ignore file
└── README.md                    # This README file

## Testing

To run the unit tests for the `Copier` class, you can use your preferred Java testing framework (e.g., JUnit). Ensure that you have configured your development environment to work with your chosen testing framework and mocking library (e.g., Mockito).

Run the tests using your IDE or build tool. The provided `CopierTest` class contains sample test cases for the `Copier` class.