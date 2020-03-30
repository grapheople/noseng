package com.grapheople.noseng;

import com.google.common.collect.Maps;
import com.grapheople.noseng.model.RaidManager;
import com.grapheople.noseng.model.Team;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
import java.util.Map;

public class MessageListener extends ListenerAdapter
{

    public static void main(String[] args) throws LoginException {
        JDA jda = new JDABuilder("Njg0NjM4MDMwNTM1MTk2ODk0.Xl9NGg.5u6EwiGn9ndnI4AAhThWYfrnS9Q").build();
        jda.addEventListener(new MessageListener());
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        System.out.printf("[%s][%s] %s: %s\n", event.getGuild().getName(),
                event.getTextChannel().getName(), event.getMember().getEffectiveName(),
                event.getMessage().getContentDisplay());

        MessageChannel channel = event.getChannel();
        long channelId = channel.getIdLong();

        String inputMessage = event.getMessage().getContentDisplay();

        if (inputMessage.startsWith("!")) {
            String responseMessage = "왈왈!";
            if (inputMessage.startsWith("!현재현황")) {
                responseMessage = RaidManager.getInstance().getTeam(channelId).toString();
            }
            channel.sendMessage(responseMessage).queue();
        }
    }



}
