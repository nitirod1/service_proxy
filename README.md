# service_proxy

#Get service1
http://localhost:8081/message 

#Get service2
http://localhost:8080/ew

#Post service2
http://localhost:8080/addRes

JSON Format for post 
{
  "id": 1,
  "status":"OK"
}

#command
docker-compose up
