package chapter_1_1_SampleAlgorithmProblem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class chapter_1_1_SampleAlgorithmProblem {
        
        /**
         *      An algorithmic problem is specified by describing the complete set of instances it must work on and of its output
                after running on one of these instances. This distinction, between a problem and an instance of a problem, is
                fundamental. The algorithmic problem known as sorting is defined as follows: [Skiena:2008:ADM:1410219]
                Problem: Sorting
                Input: A sequence of n keys, a_1, a_2, ..., a_n.
                Output: The reordering of the input sequence such that a'_1 <= a'_2 <= ... <= a'_{n-1} <= a'_n
                An instance of sorting might be an array of strings, such as { Haskell, Emacs } or a sequence of numbers such as
                { 154, 245, 1337 }.
         * 
         */

         public static void main(String[] args){

                String[] strings = new String[] { "A", "B", "C" };
                int[] ints = new int[] { 1, 2, 3, 4 };
               
                int index = Arrays.asList(strings).indexOf("B"); //Arrays.binarySearch(ints, "B")
                int index2 = Arrays.asList(ints).indexOf(1); //Arrays.binarySearch(ints, 2)

                int indexStream = IntStream.range(0, strings.length).filter(i -> "A".equals(strings[i])).findFirst().orElse(-1);

                int indexFor = -1;

                int[] array = {12, 32, 11, 22};

                for( int i=0; i<array.length; i++ ){
                        System.out.println(i);
                        if( "A".equals(array[i]) ){  
                                System.out.println(array[i]);                              
                                index = i;
                                System.out.println(index);
                                break;
                        }
                }
        
                System.out.println("Resultado index: " + index);  
                System.out.println("Resultado index2: " + index2);        
                System.out.println("result indexStream : " + indexStream);
                System.out.println("result array: " + array);

         }



}
