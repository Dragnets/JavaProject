package pse1.wk2;
import java.util.Scanner;
/**
 *
 * @author Raitis
 */
public class Exercisise2 {
    
    public static void main (String[] arg) {
        int[] mylist = {5,2,5,5,15,3,4,2,3,4};
        String[] stringList= {"Alpha","Alpha","Beta","Alpha","Delta","Delta","Uno","Alpha"};
        workout(mylist);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");               
        String myWord = sc.nextLine();
        int appears = countStrings(stringList, myWord);
        System.out.printf("%s appers %d times.\n",myWord, appears);
        float countPercent = calc_percent(stringList, myWord);
        System.out.printf("%s is %%%2.0f of the list. ", myWord, countPercent);
    }
        public static int countStrings(String[] list, String word){
            int mycount = 0;
            for (String str : list){
                if (str.toLowerCase().equals(word.toLowerCase())){
                    mycount++;
                }
            }
        return mycount;
        }
        
        public static float calc_percent(String[] list, String word){
            int mycount = 0;
            float counter = 0.0f;
            for (String str : list){
                if (str.toLowerCase().equals(word.toLowerCase())){
                    mycount++;
                }
                counter++;
            }
            System.out.println(mycount);
            float percentage = (mycount/counter) * 100 ;
            return percentage;
            }
        
        public static void workout(int[] mylist){
        int threeSum = counting(mylist);
        int count = 0;
        int total = 0;
        int smallest = 99;
        int largest = 0;
        for (int num : mylist){
            total +=num;
            smallest = findSmallest(num,smallest);
            largest = findLargest(num,largest);
            count++;
        }           
        
        int average = average(count,total);
        int totalPerc = largestPercOfTotal(largest,total);
        
        System.out.println("Total sum of first three numbers: "+threeSum);
        System.out.println("Largest Number is: "+largest);
        System.out.println("What Percentage of total is made up by the largest nr: "+totalPerc);     
        }
        public static int counting(int[] list){
            int sumOfThree;
            sumOfThree = list[0]+list[1]+list[2];
            
            return sumOfThree;
            }
        
        public static int average(int total, int count){
            int average = total/count;
            return average;
        }
        
        public static int findSmallest(int number, int smallest){
            if (number < smallest){
                return number;
            }else{
                return smallest;
            }
        }
        
        public static int findLargest(int number, int largest){
            if (largest < number){
                return number;
            } else {
                return largest;
            }
        }
        
        public static int largestPercOfTotal(int largest, int total){
            return ((largest * 100) / total);
        }
}