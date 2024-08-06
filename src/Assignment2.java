import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment2 {
    public static void main(String[] args) {
      //   task 1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String s= input.nextLine();
        boolean flag = true;
        for (int i=0 ; i < s.length()/2; i++) {
            if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
                flag = false;
                break;

            }
        }
         if (flag==true){
             System.out.println("Palindrom");
         }

         else
             System.out.println("Not a Palindrom");

        //task # 2

        Pattern pattern = Pattern.compile("[a-zA-Z]+\\d| [a-zA-Z]+|[a-zA-Z]+.[a-zA-z]+@gmail.com");
        Matcher matcher= pattern.matcher(s);
        boolean b= matcher.matches();
        if(b){
            System.out.println("Valid Email");
        }
    else

            System.out.println("Invalid Email");

         //Task # 3

        LocalDate today = LocalDate.now();
        String newDate = today.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println("Before= "+today+"\nAfter= "+newDate);


     // Task # 4
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Date ");
        String s2= input.nextLine();
        LocalDate date = LocalDate.parse(s2);
        date = date.plusDays(30);
       String afterChange = date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println(afterChange);

// Task # 5
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number ");
        String s3 = input.nextLine();
        int num1= Integer.parseInt(s3);
        String [] romans={"M","CM","D","C","XC","L","X","IX","V","I"};
        int [] rValues= {1000,900,500,100,90,50,10,9,5,1};
        String returnValues ="";
        for (int i = 0; i < rValues.length ; i++) {
            int num = num1/rValues[i];
            if (num==0)
                continue;
            returnValues += (num==4 && i>0)? romans[i]+romans[i-1]:romans[i];
            num1 %=rValues[i];
        }
        System.out.println(returnValues);

// Task 6
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Brackets ");
        String s4 = input.nextLine();
       if (Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]").matcher(s4).matches()) {
           System.out.println("valid");
       }
        else
        System.out.println("not valid");

    // Task 7

        String [] arr={"flower","flow","flight"};
        if (arr.length==0){
            System.out.println("Empty String");
        }
        else if (arr.length==1){
            System.out.println(arr[0]);
        }
        else {
            String fStr= arr[0];
            for (int i = 1; i < arr.length ; i++) {
                String newStr= arr[i];
                int j=0;
                while (j<newStr.length() && j<fStr.length() && newStr.charAt(j)==fStr.charAt(j)){
                    j++;

                }
                if (j==0){
                System.out.println("String does not matched");
                break;
                }
                fStr=newStr.substring(0,j);
            }
             System.out.println(fStr);
        }

// Task # 8
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = input.nextLine();
        String newstr = "";
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < i; j++) {
                if (arr[i] == arr[j])
                    break;
            }
            if (i == j) {
                newstr += arr[i];
            }


        }
        System.out.println("before sort" + newstr);

    }

}