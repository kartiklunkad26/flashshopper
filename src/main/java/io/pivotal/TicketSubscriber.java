package io.pivotal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

import java.io.IOException;

/**
 * Created by pivotal on 3/21/17.
 */

@EnableBinding(Sink.class)
public class TicketSubscriber {

    @Autowired
    WishlistItemRepo wishlistItemRepo;

    @StreamListener(Sink.INPUT)
    public void getNewTickets(Tickets tickets) throws IOException {

        System.out.println("RECEIVED NEW TICKET RELEASE:");
        System.out.println(tickets.toString());

//        wishlistItemRepo.findAll().forEach((WishlistItem) -> {
//            if () {}
//        });

    }

}

