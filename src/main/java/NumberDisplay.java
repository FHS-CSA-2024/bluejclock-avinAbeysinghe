

public class NumberDisplay
{
    //implement 2 private variables, limit and value.
    //  both should be ints
    private int limit, value;
    
    //implement a constructor that sets the limit to a passed in variable rollOverLimit
    //  should set value to 0
    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 0;
    }

    //Implement getter/setter methods for limit and value
    //  The setValue method should check the input for validity
    //      (should not be less than 0, or over the limit)
    public int getLimit(){return limit;}
    public int getValue(){return value;}
    public int setLimit(int limit){return this.limit = limit;}
    public void setValue(int value){
        if (value >= 0 && value < limit){
            this.value = value;
        }
    }

    //Implement a function getDisplayValue that take no parameters and returns a String.
    //  The return string should be formatted as a two digit number
    //  If the number is less than 10 it should return a 0 before the number.
    public String getDisplayValue(){
        String out = Integer.toString(value);
        if(out.length()==1){out = "0" + out;}
        return out;
    }

    //Implement a method increment that takes no parameters and returns nothing. 
    //  This function should increase value by 1, unless it reaches the limit.
    //  It should reset to 0 if the limit is reached
    public void increment(){
        if(value <= limit-1){
            value++;
            
        } else {
            value = 0;
        }
    }
}
