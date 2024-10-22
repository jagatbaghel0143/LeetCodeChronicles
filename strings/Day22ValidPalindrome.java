package strings;

public class Day22ValidPalindrome {
    private static boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int left = 0;
        int right = cleaned.length() -1;
        while(left < right) {
            if(cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main (String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Boolean res = isPalindrome(s);
        System.out.println(res);
    }
}
