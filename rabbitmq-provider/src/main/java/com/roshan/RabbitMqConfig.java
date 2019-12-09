package com.roshan;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {

    private static final String EXCHANGE = "roshanExchange";
    /** 队列key1*/
    private static final String ROUTINGKEY1 = "*.fast";
    private static final String ROUTINGKEY2 = "blue.*";

    @Bean
    public Queue firstQueue() {
        /**
         durable="true" 持久化 rabbitmq重启的时候不需要创建新的队列
         auto-delete 表示消息队列没有在使用时将被自动删除 默认是false
         exclusive  表示该消息队列是否只在当前connection生效,默认是false
         */
        return new Queue("firstQueue", true, false, false);
    }
    @Bean
    public Queue secondQueue() {
        return new Queue("secondQueue",true,false,false);
    }

    /**
     *   1.定义direct exchange，绑定queueTest
     *   2.durable="true" rabbitmq重启的时候不需要创建新的交换机
     *   3.direct交换器相对来说比较简单，匹配规则为：如果路由键匹配，消息就被投送到相关的队列
     *     fanout交换器中没有路由键的概念，他会把消息发送到所有绑定在此交换器上面的队列中。
     *     topic交换器你采用模糊匹配路由键的原则进行转发消息到队列中
     *   key: queue在该direct-exchange中的key值，当消息发送给direct-exchange中指定key为设置值时，
     *   消息将会转发给queue参数指定的消息队列
     */
    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(EXCHANGE,true,false);
    }

    @Bean
    public Binding bindingFirst() {
        return BindingBuilder.bind(firstQueue()).to(topicExchange()).with(ROUTINGKEY1);
    }
    @Bean
    public Binding bindingSecond() {
        return BindingBuilder.bind(secondQueue()).to(topicExchange()).with(ROUTINGKEY2);
    }
}
