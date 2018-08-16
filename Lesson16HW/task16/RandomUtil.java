package task16;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.util.Random;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class RandomUtil {
    private static final Random RANDOM = new Random();

    public static Detail generate() {
        Detail detail = null;
        int number = RANDOM.nextInt(10);

        switch (number) {
            case 0:
                detail = Detail.HEAD;
                break;
            case 1:
                detail = Detail.BODY;
                break;
            case 2:
                detail = Detail.LEFT_ARM;
                break;
            case 3:
                detail = Detail.RIGHT_ARM;
                break;
            case 4:
                detail = Detail.LEFT_LEG;
                break;
            case 5:
                detail = Detail.LEFT_ARM;
                break;
            case 6:
                detail = Detail.RIGHT_LEG;
                break;
            case 7:
                detail = Detail.CPU;
                break;
            case 8:
                detail = Detail.RAM;
                break;
            case 9:
                detail = Detail.HDD;
                break;
        }
        return detail;
    }
}
