public class StopWatch {
    double startTime,endTime;
    public void stat(){
        this.startTime = System.currentTimeMillis()/1000;
    }
    public void end(){
        this.endTime = System.currentTimeMillis()/1000;
    }

    public double getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
