//Week 3 StringCounter
package pse1.wk3;

/**
 *
 * @author peterrosner
 */
public class StringCounter {
    private int vowelCount  = 0;
    private int charCount = 0;
    private int lineCount = 0;
    private int redCount = 0;

    public StringCounter(){
    }

    public void addString(String newString){
        System.out.println("Adding : " + newString);
        this.lineCount++;
        this.charCount += newString.length();
        newString = newString.toLowerCase();
        if (newString.equals("red")){
            this.redCount++;
        }
        String vowels = "aeiou";
        for (int i = 0;i < newString.length();i ++){
            for (int j = 0; j < vowels.length(); j++){
                if (newString.charAt(i) == vowels.charAt(j)){
                   this.vowelCount++;
                }
            }
        }

    }

    @Override
    public String toString(){
        return ("chars = " + charCount +
                " lines = " + lineCount +
                " reds = "  + redCount +
                " vowels =" + vowelCount);
    }
}
