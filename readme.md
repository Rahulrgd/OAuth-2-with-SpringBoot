# OAuth 2 with Spring Security

This project demonstrates OAuth 2 authentication using Google APIs. It leverages the `oauth2client` dependency in Spring Boot.

## Getting Started

1. Clone this repository to your local machine.
2. Configure your Google API credentials:
   - Obtain a **Client ID** and **Client Secret** from the [Google Developer Console](https://console.developers.google.com/).
   - Update the `application.properties` file with your credentials:
     ```properties
     spring.security.oauth2.client.registration.google.client-id=YOUR_CLIENT_ID
     spring.security.oauth2.client.registration.google.client-secret=YOUR_CLIENT_SECRET
     ```
3. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the application at `http://localhost:8080`.

## Features

- OAuth 2 authentication with Google
- Secure endpoints using Spring Security
- ...