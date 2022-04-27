

public final class CommandSerializer  {

    private static CommandSerializer commandSerializer;

    private CommandSerializer() {
        super();
    }
    
    public static synchronized CommandSerializer instance() {
        if (CommandSerializer.commandSerializer == null) {
            CommandSerializer.commandSerializer = new CommandSerializer();
        }
        return CommandSerializer;
    }

}
