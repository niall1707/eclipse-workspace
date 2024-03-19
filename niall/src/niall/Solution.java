package niall;

import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value for num: ");
        int num = scanner.nextInt();
        
        Solution solution = new Solution();
        int result = solution.addDigits(num);
        
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
    public int addDigits(int num) {
        while (num >= 10) {
            int sum = 0;
            
            // Sum the digits of num
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}
