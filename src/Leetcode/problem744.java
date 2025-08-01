package Leetcode;

public class problem744 {
    public static void main(String[] args) {
       char[] letters = {'b','f','j'};
        char target = 'd';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);

    }
    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target < letters[mid]){
                end = mid - 1;
            } else{
                start = mid + 1 ;
            }

        }
        return letters[start % letters.length ];
        // as if the answer is index 2 then by modulo length of an array, it is not affected
        // but if the target is greater than letter.length- 1 then modulo make it zero
        // as at that time start = letters.length
        // else we can use if start == letter.length return 0

    }
}
