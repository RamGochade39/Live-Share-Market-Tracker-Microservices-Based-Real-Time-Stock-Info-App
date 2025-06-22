# Stock-Price-In-Real-Time-Using-finnhub.io-Api
See The Stocks INfo In Real Time With Ticker Symbols (Unique Codes) 
# Live Share Market Tracker  
Microservices-Based Real-Time Stock Info App

A Spring-Boot microservices application that lets you track live stock prices and basic company details using the [finnhub.io](https://finnhub.io/) API. It demonstrates service discovery (Eureka), inter-service communication (Feign & WebClient), and a simple JSP-powered UI.

---

## 🏗️ Architecture

┌──────────────────┐ ┌────────────────────────┐
│ │ Eureka │ Stock-Details-API │
│ Stock-Price │ <------> │ (Feign client) │
│ Enquiry App │ Server └────────────────────────┘
│ (JSP + WebClient)│
└──────────────────┘
│
▼
┌────────────────────────┐
│ finnhub.io REST API │
└────────────────────────┘


1. **EurekaServer**  
   - Service registry for all Spring Boot microservices.  
2. **Stock-Details-Api-Caller**  
   - Feign-based microservice that fetches company info and basic metrics from finnhub.io.  
3. **Stock-Price-Enquiry-App**  
   - A JSP frontend + Spring MVC controller. Uses WebClient to call the details service and display live quotes.

---

## 🚀 Getting Started

### Prerequisites

- Java 11 or later  
- Maven 3.6+  
- A free [finnhub.io API key](https://finnhub.io/)  

cd EurekaServer
mvn spring-boot:run

cd ../Stock-Details-Api-Caller
mvn spring-boot:run

cd ../Stock-Details-Api-Caller
mvn spring-boot:run

🛠️ Technologies
Spring Boot – Microservice framework

Spring Cloud Netflix Eureka – Service discovery

Spring Cloud OpenFeign – Declarative REST client

Spring WebClient – Reactive HTTP client

JSP & Servlets – Simple web UI

Lombok – Boilerplate reduction

Maven – Build and dependency management
