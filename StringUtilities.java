
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String answer = baseValue + valueToBeAdded;
        return answer;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        
        String answer = "";
        for(int x = valueToBeReversed.length() - 1; x >= 0; x--){
            answer += valueToBeReversed.charAt(x);
        }
        
        return answer;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int minus1ANDdiv2 = (word.length() -1) / 2;
        int midChar = minus1ANDdiv2 + 1;
        Character answer = word.charAt(midChar - 1);
        return answer;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
     String answer = "";
     String holder = "";
     String badChar = "";
     badChar += charToRemove;
     for(int x = 0; x <= value.length() - 1; x++){
         holder += value.charAt(x);
           
         if(holder.equals(badChar)){
             holder = "";
         }else if(! holder.equals(badChar)){
             answer += holder;
         }
         holder = "";
     }
        
     return answer;       
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        String answer = "";
      
        String holder = "";
        for(int x = sentence.length() - 1; x >= 0; x--){
           holder += sentence.charAt(x);
           
           if(holder.equals(" ")){
                x = -1;
           }else{
                answer += holder;
           }
           holder = "";
        }
        String answer2 = "";
        for(int x = answer.length() - 1; x >= 0; x--){
            answer2 += answer.charAt(x);
        }
        
        return answer2;
    }
}
