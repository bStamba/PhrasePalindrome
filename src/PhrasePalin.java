public class PhrasePalin {

    public boolean isPalindrome(String s) {

        boolean isPalin = true;
        String palin = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int beginIndex = 0;
        int endIndex = palin.length() - 1;
        int middle = palin.length() / 2;

        if(s.length() == 0){ return false; }

        while(beginIndex <= middle && endIndex >= middle){

            //If at any point these chars aren't equal, then we return false because it isnt a palindrome.
            if(palin.charAt(beginIndex) == palin.charAt(endIndex)){
                beginIndex++;
                endIndex--;
            }
            else{
                isPalin = false;
                break;
            }
        }

        return isPalin;
    }
}
