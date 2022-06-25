# SPRING KAFKA
### Installation
* After downloading the Kafka tar file.
* Extract and cd inside
```bash
tar -xzf kafka_2.13-3.2.0.tgz
cd kafka_2.13-3.2.0/
```
* Run zookeeper in a window
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

* Run kafka in another one
```bash
bin/kafka-server-start.sh config/server.properties
```

* After running project, notification topic will be created.

* Easily consume data from terminal. (if commandLineRunner was commented out)
```bash
bin/kafka-console-consumer.sh --topic notification --from-beginning --bootstrap-server localhost:9092
```

* Or you can see logs when new notification was published.

* Publish new message with request.
```http request
POST http://localhost:8080/api/v1/notification/
Content-Type: application/json
{
  "message": "notify customer 123"
}
```
