import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class BotRunner extends TelegramLongPollingBot {
    private final static String BOT_NAME = "thebodybook_bot";
    private final static String BOT_TOKEN = "6726383463:AAFQU6fu3QD7tx1autBoN6eJyuTbeWbhuBY";

    @Override
    public void onUpdateReceived(Update update) {

    }

    @Override
    public String getBotUsername() {
        return BOT_NAME;
    }

    @Override
    public String getBotToken() {
        return BOT_TOKEN;
    }
}
