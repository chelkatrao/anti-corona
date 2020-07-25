package org.chelkatrao;

import org.telegram.telegrambots.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class AntiCorona extends TelegramLongPollingBot {

    @Override
    public void onUpdateReceived(Update update) {
        String message = "";
        if (update.getMessage().getText() != null) {
            message = update.getMessage().getText().toUpperCase();
        }
        if (update.getMessage().getCaption() != null) {
            message += update.getMessage().getCaption().toUpperCase();
        }

        String finalMessage = message;
        AtomicBoolean isBadWord = new AtomicBoolean(false);
        Stream.of(Corona.values()).forEach(corona -> {
            if (finalMessage.contains(corona.getCorona())) {
                isBadWord.set(true);
            }
        });

        if (isBadWord.get()) {
            DeleteMessage deleteMessage = new DeleteMessage(
                    update.getMessage().getChat().getId(),
                    update.getMessage().getMessageId());
            try {
                execute(deleteMessage);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "@deletecovidbot";
    }

    @Override
    public String getBotToken() {
        return "1351413714:AAF_czCI70C2W0ryi8Pm9J3JrGNIHoXXETQ";
    }
}