package by.asyncbtd;

import by.asyncbtd.tll.client.HttpTelegramClient;
import by.asyncbtd.tll.longpoling.LongPollingSingleThreadUpdateConsumer;
import by.asyncbtd.tll.meta.TelegramClient;
import by.asyncbtd.tll.meta.exception.TelegramApiException;
import by.asyncbtd.tll.meta.methods.EditMessageText;
import by.asyncbtd.tll.meta.methods.SendMessage;
import by.asyncbtd.tll.meta.objects.Update;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ExampleBot implements LongPollingSingleThreadUpdateConsumer {

    private final TelegramClient telegramClient;

    public ExampleBot(String botToken) {
        telegramClient = new HttpTelegramClient(botToken);
    }

    public int SCORE_ALL = 0;
    public int SCORE_ONE = 0;
    public int SCORE_TWO = 0;
    public int SCORE_THREE = 0;

    @Override
    public void consume(Update update) {
        Long chatId = update.getMessage().getChatId();

        var startMessage = new SendMessage();
        startMessage.setChatId(chatId);
        startMessage.setText("""
            Запускаем слоты... \uD83C\uDFB0
              [ | | | | | | ]
              [ | | | | | | ]
              [ | | | | | | ]
              [ | | | | | | ]
              [ | | | | | | ]
        """);

        try {
            telegramClient.execute(startMessage);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

        var slotRols = new EditMessageText();

        for (int i = 1; i <= 5; i++) {
            int slotId = update.getMessage().getMessageId() + 1;

            slotRols.setChatId(chatId);
            slotRols.setMessageId(slotId);
            slotRols.setText(
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n" +
                    random() + random() + random() + random() + random() + random() + random() + "\n");
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                telegramClient.execute(slotRols);
            } catch (TelegramApiException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        //score(slotRols.getText());
        System.out.printf(findMatchingStickers(score(slotRols.getText()), "\uD83D\uDC8E", 3, 7) + "Алмазик" + "\n");
        System.out.printf(findMatchingStickers(score(slotRols.getText()), "\uD83C\uDF52", 3, 7) + "Вишенка" + "\n");
        System.out.printf(findMatchingStickers(score(slotRols.getText()), "\uD83C\uDF4B", 3, 7) + "Лимнончик" + "\n");
        System.out.printf(findMatchingStickers(score(slotRols.getText()), "\uD83C\uDF47", 3, 7) + "Виноградик" + "\n");
        System.out.printf(findMatchingStickers(score(slotRols.getText()), "\uD83D\uDD14", 3, 7) + "Звоночек" + "\n");
        var scoreSend = new SendMessage();
        scoreSend.setChatId(update.getMessage().getChatId());
        scoreSend.setText("ВАШ ВЫЙГРЫШ: " + SCORE_ALL);

        try {
            telegramClient.execute(scoreSend);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }
    }

    private String random() {
        var slots = List.of("\uD83D\uDC8E","\uD83C\uDF52","\uD83C\uDF4B","\uD83C\uDF47","\uD83D\uDD14");
        // Алмазик 250, Вишенка 100, Лимнончик 50, Виноградик 25, Звоночек 10

        var random = new Random();
        return slots.get(random.nextInt(slots.size()));
    }

    private String[][] score(String slots) {
        String[] rows = slots.split("\n");

        // Инициализируем матрицу
        String[][] matrix = new String[rows.length][];

        for (int i = 0; i < rows.length; i++) {
            // Разбиваем строку на символы Unicode с использованием codePoints
            matrix[i] = rows[i]
                    .codePoints()                      // получаем поток кодпоинтов
                    .mapToObj(Character::toString)    // преобразуем в строки
                    .toArray(String[]::new);          // собираем в массив строк
        }
        return matrix;
    }

    public String findMatchingStickers(String[][] grid, String sticker, int minLength, int maxLength) {
        int rows = grid.length;
        int cols = grid[0].length;

        //System.out.println("Находятся следующие комбинации одинаковых стикеров от " + minLength + " до " + maxLength + ":");

        // Горизонтальные комбинации
        for (int length = minLength; length <= maxLength; length++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j <= cols - length; j++) {
                    boolean match = true;
                    for (int k = 0; k < length; k++) {
                        if (!grid[i][j + k].equals(sticker)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        if (sticker == "\uD83D\uDC8E") {
                            SCORE_ONE += 250 * length;
                        } else if (sticker == "\uD83C\uDF52") {
                            SCORE_ONE += 100 * length;
                        } else if (sticker == "\uD83C\uDF4B") {
                            SCORE_ONE += 50 * length;
                        } else if (sticker == "\uD83C\uDF47") {
                            SCORE_ONE += 25 * length;
                        } else if (sticker == "\uD83D\uDD14") {
                            SCORE_ONE += 10 * length;
                        }
                        return "Горизонтально на строке " + (i + 1) + ": индексы от " + (j + 1) + " до " + (j + length);
                    }
                }
            }
        }

        // Вертикальные комбинации
        for (int length = minLength; length <= maxLength; length++) {
            for (int j = 0; j < cols; j++) {
                for (int i = 0; i <= rows - length; i++) {
                    boolean match = true;
                    for (int k = 0; k < length; k++) {
                        if (!grid[i + k][j].equals(sticker)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        if (sticker == "\uD83D\uDC8E") {
                            SCORE_TWO += 250 * length;
                        } else if (sticker == "\uD83C\uDF52") {
                            SCORE_TWO += 100 * length;
                        } else if (sticker == "\uD83C\uDF4B") {
                            SCORE_TWO += 50 * length;
                        } else if (sticker == "\uD83C\uDF47") {
                            SCORE_TWO += 25 * length;
                        } else if (sticker == "\uD83D\uDD14") {
                            SCORE_TWO += 10 * length;
                        }
                        return "Вертикально на колонке " + (j + 1) + ": индексы от " + (i + 1) + " до " + (i + length);
                    }
                }
            }
        }

        // Параллельные диагонали
        for (int length = minLength; length <= maxLength; length++) {
            // Диагональ ↘
            for (int i = 0; i <= rows - length; i++) {
                for (int j = 0; j <= cols - length; j++) {
                    boolean match = true;
                    for (int k = 0; k < length; k++) {
                        if (!grid[i + k][j + k].equals(sticker)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        if (sticker == "\uD83D\uDC8E") {
                            SCORE_THREE += 250 * length;
                        } else if (sticker == "\uD83C\uDF52") {
                            SCORE_THREE += 100 * length;
                        } else if (sticker == "\uD83C\uDF4B") {
                            SCORE_THREE += 50 * length;
                        } else if (sticker == "\uD83C\uDF47") {
                            SCORE_THREE += 25 * length;
                        } else if (sticker == "\uD83D\uDD14") {
                            SCORE_THREE += 10 * length;
                        }
                        return "Диагональ (↘) начиная с строки " + (i + 1) + ", колонки " + (j + 1) + " длина: " + length;
                    }
                }
            }

            // Диагональ ↖
            for (int i = 0; i <= rows - length; i++) {
                for (int j = length - 1; j < cols; j++) {
                    boolean match = true;
                    for (int k = 0; k < length; k++) {
                        if (!grid[i + k][j - k].equals(sticker)) {
                            match = false;
                            break;
                        }
                    }
                    if (match) {
                        if (sticker == "\uD83D\uDC8E") {
                            SCORE_ALL += 250;
                        } else if (sticker == "\uD83C\uDF52") {
                            SCORE_ALL += 100;
                        } else if (sticker == "\uD83C\uDF4B") {
                            SCORE_ALL += 50;
                        } else if (sticker == "\uD83C\uDF47") {
                            SCORE_ALL += 25;
                        } else if (sticker == "\uD83D\uDD14") {
                            SCORE_ALL += 10;
                        }
                        return "Диагональ (↖) начиная с строки " + (i + 1) + ", колонки " + (j + 1) + " длина: " + length;
                    }
                }
            }
        }
        return null;
    }
    /*
    public String findMatchingStickers(String[][] grid, String sticker) {
        int rows = grid.length;
        int cols = grid[0].length;

        //System.out.println("Находятся следующие комбинации трёх одинаковых стикеров: ");

        // Горизонтальные комбинации
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols - 2; j++) {
                if (grid[i][j].equals(sticker) && grid[i][j + 1].equals(sticker) && grid[i][j + 2].equals(sticker)) {
                    return "Горизонтально на строке " + (i + 1) + ": индексы " + (j + 1) + ", " + (j + 2) + ", " + (j + 3);
                }
            }
        }

        // Вертикальные комбинации
        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 2; i++) {
                if (grid[i][j].equals(sticker) && grid[i + 1][j].equals(sticker) && grid[i + 2][j].equals(sticker)) {
                    return "Вертикально на колонке " + (j + 1) + ": индексы " + (i + 1) + ", " + (i + 2) + ", " + (i + 3);
                }
            }
        }

        // Параллельные диагонали
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                if (grid[i][j].equals(sticker) && grid[i + 1][j + 1].equals(sticker) && grid[i + 2][j + 2].equals(sticker)) {
                    return"Диагональ (↘) на строках " + (i + 1) + " и колонках " + (j + 1);
                }

                if (grid[i][j + 2].equals(sticker) && grid[i + 1][j + 1].equals(sticker) && grid[i + 2][j].equals(sticker)) {
                    return "Диагональ (↖) на строках " + (i + 1) + " и колонках " + (j + 3);
                }
            }
        }
        return null;
    }

     */
}
