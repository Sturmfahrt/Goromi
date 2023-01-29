package com.github.atomiclord.goromi;

import com.github.atomiclord.goromi.commands.PingListener;
import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.intent.Intent;

public class Goromi {
    public static void main(String[] args) {
        System.out.println("Goromi is initializing.");

        // Log the bot in
        DiscordApi api = new DiscordApiBuilder()
                .setToken(args[0]) // Sets Discord Token from first argument passed to the program. TODO Make this exception handled so that i can account for future me being dumb.
                .addIntents(Intent.MESSAGE_CONTENT) // Sets intents
                .addListener(new PingListener()) // Sets up a listener that will use the PingListener class I made
                .login().join(); // Logs the bot into discord, no idea what join does but i need it.

        // Bot is initialized
        System.out.println("Bot has been initialized.");
        System.out.println("Bot should be online.");

        // Print the invite url of your bot
        System.out.println("You can invite the bot by using the following url: " + api.createBotInvite());
    }
}
