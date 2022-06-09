# service_proxy
Port in service <br/>(port computer):(port docker)
<pre>
service1 8081:8081
service2 8080:8080
</pre>
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
