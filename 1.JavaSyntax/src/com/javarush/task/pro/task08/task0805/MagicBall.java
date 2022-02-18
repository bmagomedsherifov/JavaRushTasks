package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        String prediction = null;
        Random random = new Random();
        switch (random.nextInt(8)){
            case 0:
                prediction = CERTAIN;
                break;
            case 1:
                prediction = DEFINITELY;
                break;
            case 2:
                prediction = MOST_LIKELY;
                break;
            case 3:
                prediction = OUTLOOK_GOOD;
                break;
            case 4:
                prediction = ASK_AGAIN_LATER;
                break;
            case 5:
                prediction = TRY_AGAIN;
                break;
            case 6:
                prediction = NO;
                break;
            case 7:
                prediction = VERY_DOUBTFUL;
                break;
            default:
                break;
        }
        return prediction;
    }
}
