class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (l < r && !Character.isLetterOrDigit(s.charAt(l))) ++l;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r))) --r;
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) return false;
            ++l;
            --r;
        }
        return true;
    }
}
//-------------use for update--------------------
//git status //file show red
//git add .
//git status //fill show green now
//git commit -m " message"
//git push -u origin main

// add in git hub
//git status
//git init
//git remote add origin //url
//git branch -M main
//git add .
//git status //fill show green now
//git commit -m " message"
//git push -u origin main