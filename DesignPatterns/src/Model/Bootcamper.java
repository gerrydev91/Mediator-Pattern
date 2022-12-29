package Model;

import state.NotEnrolledStatus;
import state.Status;

public class Bootcamper {

    public Status status;

    public Bootcamper() {
        status = new NotEnrolledStatus(this);
    }

    public void changeStatus(Status status){
        System.out.println("This is the current status: "+ status);
        this.status=status;
        System.out.println("This is the new status: "+ status);
    }

    public Status getStatus() {
        return status;
    }

    
    
    
    
}
