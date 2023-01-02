package Model;

import state.NotEnrolledStatus;
import state.Status;

public class Bootcamper {


    public Status status;

    //Creates a Bootcamper with 'Not enrolled status' by default
    public Bootcamper() {
        status = new NotEnrolledStatus(this);
    }

    //To change status on any of the clases that implemnt this one. 
    public void changeStatus(Status status){
        System.out.println("This is the current status: "+ status);
        this.status=status;
        System.out.println("This is the new status: "+ status);
    }

    //returns the status of every object implementing Bootcamper
    public Status getStatus() {
        return status;
    }

    
    
    
    
}
