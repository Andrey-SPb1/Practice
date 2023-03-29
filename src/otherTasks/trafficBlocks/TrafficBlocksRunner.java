package otherTasks.trafficBlocks;

import java.io.*;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TrafficBlocksRunner {

    public static void main(String[] args) {

        File file = Path.of("src","otherTasks","trafficBlocks",
                "Dannye-ob-ogranichenii-dvizheniya-transporta-na-period-proizvodstva-rabot.csv").toFile();

        LocalDate date = LocalDate.of(2018,12,18); // 7

        System.out.println(numberOfRoadRestrictions(file,date));

    }

    private static int numberOfRoadRestrictions(File file, LocalDate date) {
        int result = 0;

        String dateFormat = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        String regex = "\\d{2}\\.\\d{2}\\.\\d{4}";

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                Pattern pattern = Pattern.compile(regex);
                Matcher matcher = pattern.matcher(line);
                while(matcher.find()) {
                    if(matcher.group().equals(dateFormat)) result++;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return result;
    }
}
