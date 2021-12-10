import java.util.Scanner;
public class vowelFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word : ");
        String word= sc.nextLine();
        int count=0;
        char vowels[] = {'a','A','e','E','i','I','o','O','u','U'};
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
            for(char j:vowels){
                if (j==c)
                    count++;
            }
        }
        System.out.println("Ther are "+count+" vowels in "+ word);
        sc.close();
    }
}
