/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mitrais.cdc.java;

/**
 *
 * @author Yudistyra_OP355
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.Map;

public class StreamExample {
    public static void main(String[] args) {
        System.out.println("Using Java 7: ");
        
        // count empty string
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        System.out.println("List: " + strings);
        long count = getCountEmptyStringUsingJava7(strings);
        System.out.println("Empty Strings: " + count);
        
        // count string length
        count = getCountLengthStringUsingJava7(strings);
        System.out.println("Strings of length 3: " + count);
        
        // eliminate empty string
        List<String> filtered = deleteEmptyStringUsingJava7(strings);
        System.out.println("Filtered String: " + filtered);
        
        // eleminate empty string and join using comma.
        String mergedString = getMergedStringUsingJava7(strings,", ");
        System.out.println("Merged string: " + mergedString);
        
        //get list of square of distinct numbers
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        List<Integer> squaresList = getSquares(numbers);
        System.out.println("Squares List: " + squaresList);
        List<Integer> integers = Arrays.asList(1, 2, 13, 4, 15, 6, 17, 8, 19);

        System.out.println("List: " + integers);
        System.out.println("Highest number in List : " + getMax(integers));
        System.out.println("Lowest number in List : " + getMin(integers));
        System.out.println("Sum of all numbers : " + getSum(integers));
        System.out.println("Average of all numbers : " + getAverage(integers));
        System.out.println("Random Numbers: ");

        //print ten random numbers
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
        
        System.out.println("==================================");
        System.out.println("Using Java 8: ");
        System.out.println("String: " + strings);
        
        count = strings.stream().filter(s -> s.isEmpty()).count();
        System.out.println("Empty string: " + count);
        
        count = strings.stream().filter(s->s.length()==3).count();
        System.out.println("String of length 3: " + count);
        
        filtered = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered list: " + filtered);
        
        mergedString = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);
        
        squaresList = numbers.stream().map(i->i*i).distinct().collect(Collectors.toList());
        System.out.println("Squares: " + squaresList);
        
        System.out.println("Integers: " + integers);
        IntSummaryStatistics stats = integers.stream().mapToInt(i->i).summaryStatistics();
        
        System.out.println("Highest number in list: " + stats.getMax());
        System.out.println("Lowest number in list: " + stats.getMin());
        System.out.println("Sum of all numbers: " + stats.getSum());
        System.out.println("Average of all numbers: " + stats.getAverage());
        System.out.println("Random numbers: ");
        
        random.ints().limit(10).sorted().forEach(System.out::println);
        
    }
    
    private static int getCountEmptyStringUsingJava7(List<String> strings) {
        int count = 0;
        
        for(String s: strings) {
            if(s.isEmpty())
                count++;
        }
        
        return count;
    }
    
    private static int getCountLengthStringUsingJava7(List<String> strings) {
        int count = 0;
        
        for(String s: strings) {
            if(s.length() == 3)
                count++;
        } 
        
        return count;
    }
    
    private static List<String> deleteEmptyStringUsingJava7(List<String> strings) {
        List<String> filtered = new ArrayList<String>();
        
        for(String s: strings) {
            if(!s.isEmpty())
                filtered.add(s);
        }
        
        return filtered;
    }
    
    private static String getMergedStringUsingJava7(List<String> strings, String separator) {
        StringBuilder sb = new StringBuilder();
        
        for(String s: strings) {
            if(!s.isEmpty()) {
                sb.append(s);
                sb.append(separator);
            }
        }
        
        return sb.toString();
    }
    
    private static List<Integer> getSquares(List<Integer> numbers) {
      List<Integer> squaresList = new ArrayList<Integer>();
		
      for(Integer number: numbers) {
         Integer square = new Integer(number.intValue() * number.intValue());
			
         if(!squaresList.contains(square)) {
            squaresList.add(square);
         }
      }
      return squaresList;
   }
	
   private static int getMax(List<Integer> numbers) {
      int max = numbers.get(0);
		
      for(int i = 1;i < numbers.size();i++) {
		
         Integer number = numbers.get(i);
			
         if(number.intValue() > max) {
            max = number.intValue();
         }
      }
      return max;
   }
	
   private static int getMin(List<Integer> numbers) {
      int min = numbers.get(0);
		
      for(int i= 1;i < numbers.size();i++) {
         Integer number = numbers.get(i);
		
         if(number.intValue() < min) {
            min = number.intValue();
         }
      }
      return min;
   }
	
   private static int getSum(List numbers) {
      int sum = (int)(numbers.get(0));
		
      for(int i = 1;i < numbers.size();i++) {
         sum += (int)numbers.get(i);
      }
      return sum;
   }
	
   private static int getAverage(List<Integer> numbers) {
      return getSum(numbers) / numbers.size();
   }
}
