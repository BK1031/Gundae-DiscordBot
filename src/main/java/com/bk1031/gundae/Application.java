package com.bk1031.gundae;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;

public class Application {

	public static void main(String[] args) {
		Application app = new Application();
		JDA jda = app.connect();
		jda.addEventListener(new MessageLogger());
	}

	public JDA connect() {
		JDA jda = null;
		try {
			jda = new JDABuilder(AccountType.BOT).setToken(BotConfig.TOKEN).build();
			jda.setAutoReconnect(true);
			jda.getPresence().setPresence(OnlineStatus.ONLINE, Activity.playing("with my pp"));
		} catch (LoginException e) {
			e.printStackTrace();
		}
		return jda;
	}

}
