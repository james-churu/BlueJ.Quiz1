 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer i = 1;
          Integer answer = 1;
          while (i <= number){
               answer *= i;
               i++;   
          }
          return answer;
      }
          
          


      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
         String answer = "";
         String holder = "";
        for(int x = 0; x <= phrase.length() - 1; x++){
            holder += phrase.charAt(x);
            
            if(x == 0){
                answer += holder;
            }else if(holder.equals(" ")){
                answer += phrase.charAt(x+1);
            }
            holder = "";
        }
        return answer.toUpperCase();
   }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
         String answer = "";
         char holder = 'a';
         
        for(int x = 0; x <= word.length() - 1; x++){
            holder = word.charAt(x);
            if (holder == 'x'){
                holder = 'a';
            }else if(holder == 'y'){
                holder = 'b';
            }else if(holder == 'z'){
                holder = 'c';
            }else{
                holder += 3;
            }
            answer += holder;
            holder = 'a';
       }
        return answer;
      }
}
