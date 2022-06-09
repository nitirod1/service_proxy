# service_proxy

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
