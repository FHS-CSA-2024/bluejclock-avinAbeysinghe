
public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change

        
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    private NumberDisplay hours, minutes, seconds;
    private String display;

    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplaySeconds(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    
    public ClockDisplaySeconds(int hours, int mins, int secs){
        this.hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hours, mins, secs);
    }
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    
    public void timeTick(){
        seconds.increment();
        if(seconds.getValue() == 60){
            minutes.increment();
            seconds.setValue(0);
        }
        if(minutes.getValue() == 60){
            hours.increment();
            minutes.setValue(0);
        }

        updateDisplay();
    }
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    
    public void setTime(int hour, int min, int sec){
        hours.setValue(hour);
        minutes.setValue(min);
        seconds.setValue(sec);
        updateDisplay();
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time

    public String getTime(){
        return display;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM

    public void updateDisplay(){
        if(hours.getValue() == 24){hours.setValue(0);}
        String out = "";
        out = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + ":" + seconds.getDisplayValue();
        display = out;
    }
}
