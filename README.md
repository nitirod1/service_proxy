# service_proxy
Port in service (port computer):(port docker)
service1 8081:8081
service2 8080:8080

#GET <br/>service1
http://localhost:8081/message 

#GET <br/>service2
http://localhost:8080/ew

#POST <br/>service2
http://localhost:8080/addRes

JSON Format for post 
<pre>
{
  "id": 1,
  "status":"OK"
}
</pre>

#command Docker
<pre>
docker-compose up
</pre>
