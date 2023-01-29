package com.github.atomiclord.goromi.commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

// my attempt at figuring out how to make this more modular by separating each command into its own class
// though this command is really only a placeholder and a tutorial for me.
public class PingListener implements MessageCreateListener {
    @Override
    public void onMessageCreate(MessageCreateEvent event) { // TODO Document how this class is supposed to work
        if (event.getMessageContent().equalsIgnoreCase("!ping")) {
            event.getChannel().sendMessage("Pong!");
            System.out.println("Received a ping message, sending a pong message.");
        }
    }
}
