
public class ClockDisplay12Hour
{

    private NumberDisplay hours, minutes;
    private String display;
    private String range;
    private boolean pastMid = false; //checks if time is past mid-day

    public ClockDisplay12Hour(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        
        updateDisplay();
    }

    
    public ClockDisplay12Hour(int hours, int mins){
        this.hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        setTime(hours, mins);
    }

    
    public void timeTick(){
        minutes.increment();
        if(minutes.getValue() == 60){
            hours.increment();
            minutes.setValue(0);
        }

        if(hours.getValue() >= 12 && pastMid == false){ //if it's almost midday it switches to PM
            if(hours.getValue() != 12){hours.setValue(hours.getValue()-12);} //incase if it's switching to 12PM
            range = "PM";
        }
        else if(hours.getValue() < 12 && pastMid == true){range = "PM";} //if it's already mid-day 
        else {range = "AM";} // if it meets neither of the conditions, then it stays AM

        updateDisplay();
    }

    
    public void setTime(int hour, int min){
        if(hour > 12){ //Detects if the hour inserted in ClockDriver is greater than 12, it helps determine PM/AM output
            hour -= 12;
            range = "PM";
            pastMid = true;
        } else {
            pastMid = false;
            range = "AM";
        }
        hours.setValue(hour);
        minutes.setValue(min);
        updateDisplay();
    }


    public String getTime(){
        return display;
    }


    public void updateDisplay(){
        String out = "";
        out = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + range;
        if(hours.getValue() == 0 && minutes.getValue() == 0){ out = "12:00AM";}
        display = out;
    }
}
