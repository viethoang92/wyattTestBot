package listeners;

import net.dv8tion.jda.core.entities.Guild;
import net.dv8tion.jda.core.events.ReadyEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class ReadyListener extends ListenerAdapter {

    public void onReady(ReadyEvent event) {

//        BOT SERVER LIST
//        String out = "\nThis bot is running on following servers: \n";
//        for( Guild g: event.getJDA().getGuilds()) {
//            out += g.getName() + " (" + g.getId() + ") \n";
//        }
//        System.out.println(out);
//
//
//        for( Guild g: event.getJDA().getGuilds()) {
//            g.getTextChannels().get(0).sendMessage(
//                    out
//            ).queue();
//        }

        for( Guild g: event.getJDA().getGuilds()) {
            g.getTextChannels().get(1).sendMessage(
                    "WyattTestBot is ready."
            ).queue();
        }

    }
}
