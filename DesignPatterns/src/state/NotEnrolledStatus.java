package state;

import Model.Bootcamper;

public class NotEnrolledStatus extends Status {


    public NotEnrolledStatus(Bootcamper bootcamper) {
        super(bootcamper);
        
    }

    @Override
    public String getCertified() {
        
        return "You need to enroll in a course first to get certified. ";
        
    }

    

    @Override
    public String applyforJob() {
        
        return "You need to get certified to apply for a job";
    }

    @Override
    public String enrollToCourse() {
       
        bootcamper.changeStatus(new NotCertifiedStatus(bootcamper));
        return "You can now start learning, Welcome to the bootcamp!";
        
    }
    
}
