# BestRoute Spring Boot Application

This repository contains a Spring Boot application that calculates and returns the best route for transportation based on weight and cost.


## Building the Application

1. Clone the repository:
   ```bash
   git clone https://github.com/ratianiBeqa/best-route-springboot.git
   cd best-route-springboot
   ```

2. Build the project using Maven:
   ```bash
   ./gradlew build
   ```

3. Run the application:
   ```bash
   java -jar build/libs/demo-0.0.1-SNAPSHOT.jar
   ```


## Running the Application

Once the application is running, access the API at `http://localhost:8080/best-route`.

## Example CURL Requests and Responses

#### Request 1:
```bash
curl -X GET http://localhost:8080/api/bestroute \
     -H "Content-Type: application/json" \
     -d '{
           "maxWeight": 20,
           "availableTransfers": [
             { "weight": 6, "cost": 12 },
             { "weight": 11, "cost": 22 },
             { "weight": 3, "cost": 5 },
             { "weight": 9, "cost": 18 }
           ]
         }'
```

#### Response:
```json
{
    "totalCost": 40,
    "totalWeight": 20,
    "selectedTransfers": [
        {
            "weight": 11,
            "cost": 22
        },
        {
            "weight": 9,
            "cost": 18
        }
    ]
}
```


#### Request 2:
```bash
curl -X GET http://localhost:8080/api/bestroute \
     -H "Content-Type: application/json" \
     -d '{
           "maxWeight": 15,
           "availableTransfers": [
             { "weight": 5, "cost": 10 },
             { "weight": 8, "cost": 15 },
             { "weight": 3, "cost": 5 },
             { "weight": 6, "cost": 12 }
           ]
         }'

```

#### Response:
```json
{
    "totalCost": 27,
    "totalWeight": 14,
    "selectedTransfers": [
        {
            "weight": 5,
            "cost": 10
        },
        {
            "weight": 3,
            "cost": 5
        },
        {
            "weight": 6,
            "cost": 12
        }
    ]
}
```


#### Request 3:
```bash
curl -X GET http://localhost:8080/api/bestroute \
     -H "Content-Type: application/json" \
     -d '{
           "maxWeight": 10,
           "availableTransfers": [
             { "weight": 4, "cost": 8 },
             { "weight": 7, "cost": 14 },
             { "weight": 3, "cost": 6 },
             { "weight": 5, "cost": 10 }
           ]
         }'
```

#### Response:
```json
{
    "totalCost": 20,
    "totalWeight": 10,
    "selectedTransfers": [
        {
            "weight": 7,
            "cost": 14
        },
        {
            "weight": 3,
            "cost": 6
        }
    ]
}
```


#### Request 4:
```bash
curl -X GET http://localhost:8080/api/bestroute \
     -H "Content-Type: application/json" \
     -d '{
           "maxWeight": 25,
           "availableTransfers": [
             { "weight": 7, "cost": 14 },
             { "weight": 9, "cost": 18 },
             { "weight": 6, "cost": 12 },
             { "weight": 5, "cost": 10 }
           ]
         }'
```

#### Response:
```json
{
    "totalCost": 44,
    "totalWeight": 22,
    "selectedTransfers": [
        {
            "weight": 7,
            "cost": 14
        },
        {
            "weight": 9,
            "cost": 18
        },
        {
            "weight": 6,
            "cost": 12
        }
    ]
}
```


#### Request 5:
```bash
curl -X GET http://localhost:8080/api/bestroute \
     -H "Content-Type: application/json" \
     -d '{
           "maxWeight": 30,
           "availableTransfers": [
             { "weight": 8, "cost": 16 },
             { "weight": 10, "cost": 20 },
             { "weight": 5, "cost": 10 },
             { "weight": 12, "cost": 24 }
           ]
         }'
```

#### Response:
```json
{
    "totalCost": 60,
    "totalWeight": 30,
    "selectedTransfers": [
        {
            "weight": 8,
            "cost": 16
        },
        {
            "weight": 10,
            "cost": 20
        },
        {
            "weight": 12,
            "cost": 24
        }
    ]
}
```
