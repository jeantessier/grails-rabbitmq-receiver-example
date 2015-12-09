package rabbitreceiver2311

import com.budjb.rabbitmq.consumer.MessageContext

class RabbitMQConsumer {

   static rabbitConfig = [
        exchange: "some.exchange",
    ]

    def handleMessage(def body, MessageContext context) {
        log.info "Received message:\n${body}"
    }

}
