# Overview

This project is a Java-based car rental decision system that recommends the most suitable car based on user requirements such as:

1. Number of passengers
2. Number of rental days
3. Estimated trip mileage

The system selects the optimal car by minimizing total cost (rental + fuel) and then maximizing comfort level.

# Objective

The goal of this project is to:

- Apply object-oriented design principles
- Implement algorithmic decision-making
- Integrate secure software design practices
- Provide a simple and efficient car recommendation system

# How It Works
User inputs:
1. Number of passengers
2. Rental duration (days)
3. Trip mileage
   
The system:
Filters cars based on passenger capacity

Calculates total trip cost:
```bash
Total Cost = Rental Cost + Fuel Cost
Fuel Cost = (Mileage / MPG) × 2.25
```
Selects the car with:
- Lowest cost
- Highest comfort (if tie)


Displays:
- Car make and model
- Passenger capacity
- Total cost

You can find more details in the project report attatched to this repository.
