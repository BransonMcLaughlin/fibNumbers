
public class TimeToCompute{

private static long fib(long n){// recursive method to find the fibonacciNumbers / found in notes
    if (n == 0 || n == 1)
        return 1;
    else    
        return fib(n-1) + fib(n-2);
    
}
private static long fib2(long n){// loop method to find the fibonacciNumbers / found in assignment
    long prev = 1;
    long current = 1;
    for(int i = 2; i <= n; i++){
        long temp = current;
        current = prev + current;
        prev = temp;
    }
    return current;
}
public static void main(String[] args) {
    long[] fibNum = {10,20,30,40,50};// array of the 10th, 20th, 30th.... fibonacci numbers

    System.out.println("Fibonacci numbers recursive and loop");// prints out a heading

    for(long n : fibNum){// for statement
        long startTime, endTime;// creating long time variables

        startTime = System.nanoTime();// setting the start time for the recursive
        fib(n);// calling the recursive method
        endTime = System.nanoTime();// setting the end time for the recursive
        long timeRecursive = endTime - startTime;// getting the total time by taking difference in end and start


        startTime = System.nanoTime();// creating the start time for the loop
        fib2(n);// calling the loop method
        endTime = System.nanoTime();// creating the end time for the loop
        long timeLoop = endTime - startTime;// getting the total time by taking the difference in end and start

        System.out.println(n + "\t" + timeRecursive + "\t\t\t\t" + timeLoop);// printing out the output to the console
    
    }
}
}