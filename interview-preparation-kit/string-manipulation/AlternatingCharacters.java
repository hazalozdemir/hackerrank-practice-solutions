class AlternatingCharacter {

    public static int alternatingCharacters(String s) {
        // Write your code here
        char firstChar = s.charAt(0);
        int deleteCounter = 0;
        for(int i = 1;i < s.length();i++){
            char secondChar = s.charAt(i);
            if(firstChar == secondChar){
                deleteCounter+=1;
            }
            firstChar = secondChar;
        }
        return deleteCounter;
    }

}
