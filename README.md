High Available AMQP Backed Channels via Spring Integration and RabbitMQ
=======================================================================

Spring Integration message channels store messages in memory by default. This is because memory is fast, easy to implement and it does not create extra network cost. However, in some cases, this can cause problem because all the messages will be lost if the application crashes or the server shuts down accidentally. For such situations, Spring Integration introduces JMS & AMQP backed message channels so the messages are stored within a JMS & AMQP broker instead of in memory.

Advanced Message Queuing Protocol (AMQP) is an open standard for messaging protocol. It allows applications to communicate asynchronously, reliably, and securely. RabbitMQ is an open source message broker that supports the AMQP standard. One of the most important features of RabbitMQ is highly available queues.

In this project, Spring Integration’ s AMQP backed point-to-point message channel approach is explained by creating two messaging nodes and a RabbitMQ cluster covering two RabbitMQ Servers. Two messaging nodes start to process Order messages by using the RabbitMQ cluster. If First Messaging Node and First RabbitMQ Server are shut down accidentally, Second Messaging Node and Second RabbitMQ Server will continue to process Order messages so potential message loosing and service interruption problems can be prevented by using high available AMQP backed channel.

Order Lists are sent to Order Splitter’ s input channel via Order Gateway. Order Splitter splits order list to order messages and sends them to Order Process Service Activator. processChannel is a point-to-point AMQP backed message channel. It creates a ha.rabbit.channel queue managed by RabbitMQ cluster and sends order messages to ha.rabbit.channel Rabbit queue for high availability.

Used Technologies : JDK 1.8.0_25, Spring 4.1.4, Spring Integration 4.1.2, RabbitMQ Server 3.4.2, Maven 3.2.2 and Ubuntu 14.04
