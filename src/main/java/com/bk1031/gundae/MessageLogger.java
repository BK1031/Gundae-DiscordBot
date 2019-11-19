package com.bk1031.gundae;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class MessageLogger extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        System.out.print("[" + event.getGuild().getName());
        System.out.print(" $" + event.getChannel().getName() + "] ");
        System.out.print(event.getAuthor().getName());
        System.out.printf(" - ");
        System.out.println(event.getMessage().getContentRaw());
    }
}
