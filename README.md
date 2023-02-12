# spring-boot-serviceDiscovery_Eureka
microservice inter-communication using Eureka server and Rest Template/Feign Client 




Testing API - 

POST - http://localhost:8081/movie_app/v1/bookings/movie 

Body - 

{
    "movie":{
        "movieId":1
    },
    "user":{
        "userId":1,
        "firstName":"Jigar"
    },
    "theatre":{
        "theatreId":1,
        "movieId":1
    }
}
