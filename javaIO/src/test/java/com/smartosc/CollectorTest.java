package com.smartosc;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectorTest {
    @Test
    public static void main(String[] args) throws IOException {
//        File file = new File("./src/main/resources/test.txt");
//        InputStream inputStream = new FileInputStream(file);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
//        String line;
//        while ((line = bufferedReader.readLine()) != null) {
//            System.out.println(line);
//        }
//        Path path = Paths.get("C", "home");
//        byte[] bytes = Files.readAllBytes(path);
//        String s = new String(bytes, StandardCharsets.UTF_8);
//        Files.write(path, s.getBytes());
        String input = "Hello world world world";
        String regex = "^([A-Z]{1})+([a-z\\s])+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("OK");
            return;
        }
        System.out.println("Not match!");
    }
}
