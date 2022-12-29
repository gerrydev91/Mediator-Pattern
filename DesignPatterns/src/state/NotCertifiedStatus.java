package state;

import Model.Bootcamper;

public class NotCertifiedStatus extends Status{

    public NotCertifiedStatus(Bootcamper bootcamper){
        super(bootcamper);
    }

    @Override
    public String getCertified() {
        bootcamper.changeStatus(new CertifiedStatus(bootcamper));
        return "Congratulations on getting certified!!!";
    }

    @Override
    public String applyforJob() {
        
        return "You must be certified to apply for a Job";
    }

    @Override
    public String enrollToCourse() {
       
        return "You must enroll to a course to get certified.";
    }
    
}
