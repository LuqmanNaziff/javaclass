import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileMathProcessor {
    
    public List<Integer> readFile(String fileName) throws IOException {
        List<Integer> numbers = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    numbers.add(Integer.parseInt(line.trim()));
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format: " + line);
                }
            }
        }
        return numbers;
    }

    public List<String> divideNumbers(List<Integer> numbers, int divisor) {
        List<String> results = new ArrayList<>();
        for (Integer number : numbers) {
            try {
                if (divisor == 0) {
                    throw new ArithmeticException("Division by zero error for number " + number);
                }
                results.add(String.valueOf(number / divisor));
            } catch (ArithmeticException e) {
                results.add(e.getMessage());
            }
        }
        return results;
    }

    
    public void writeFile(String fileName, List<String> results) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (String result : results) {
                writer.write(result);
                writer.newLine();
            }
        }
    }

    public static void main(String[] args) {
        FileMathProcessor processor = new FileMathProcessor();
        Scanner scanner = new Scanner(System.in);

        

        try {
            
            List<Integer> numbers = processor.readFile("input.txt");

            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();
            List<String> results = processor.divideNumbers(numbers, divisor);

            processor.writeFile("output.txt", results);
            System.out.println("Results written to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while processing files: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
