package expert.streams;

import java.util.List;

public class StreamsIntroductionApp
{
    public static void main(String[] args) {


        List<Integer> temperatures = List.of(16,6,6,17,19,19,16);

        System.out.println(temperatures.stream()
                .filter(temperature -> temperature > 16 )
                        .filter(temperature -> temperature<19)
                .count()
        );

    }
}
