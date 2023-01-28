package com.github.atomiclord.goromi;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;

public class Goromi {
    public static void main(String[] args) {
        System.out.println("Goromi is initializing.");

        // Log the bot in
        DiscordApi api = new DiscordApiBuilder()
                .setToken("MTA2ODMwNTc2NjE1MjQxMzE4NA.G3Exf1.4lTxpo_qUEwjQW68u2TBBsAZfbr3epVgVrCECg")
                .addIntents(Intent.MESSAGE_CONTENT)
                .login().join();

        // Placeholder Command
        api.addMessageCreateListener(event -> {
            if (event.getMessageContent().equalsIgnoreCase("!ping")) {
                event.getChannel().sendMessage("Pong!");
            }
        });

        // Bot is initialized
        System.out.println("Bot has been initialized.");
        System.out.println("Bot should be online.");

        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }
}
