package commands;

import main.ServerCommandReader;

import java.util.Collection;

public class CommandHelp extends Command {

    public CommandHelp(String des) {
        setDescription(des);
    }
    @Override
    public String execute(Collection<Command> avaicm, ServerCommandReader caller) {
        StringBuilder stringBuilder=new StringBuilder();
        for (Command cm:avaicm) {
            stringBuilder.append(cm.getDescription()+"\n");
        }
        return (stringBuilder.append("\1").toString());
    }
}