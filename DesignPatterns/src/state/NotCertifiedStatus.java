package state;

import Model.Bootcamper;

public class NotCertifiedStatus extends Status{

    public NotCertifiedStatus(Bootcamper bootcamper){
        super(bootcamper);
    }
    
    //This method changes the status of bootcampers
    @Override
    public String getCertified() {
        bootcamper.changeStatus(new CertifiedStatus(bootcamper));
        return "Congratulations on getting certified!!!";
    }

    //When applying for a job with no certification, this sends a message that they need to get certified before. 
    @Override
    public String applyforJob() {
        
        return "You must be certified to apply for a Job";
    }

    //If status happens to be NotEnrolled, they are prompted to enroll to a course. 
    @Override
    public String enrollToCourse() {
       
        return "You must enroll to a course to get certified.";
    }
    
}
