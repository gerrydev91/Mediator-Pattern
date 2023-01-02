package state;

import Model.Bootcamper;

public class CertifiedStatus extends Status {

    //This line makes sure the Bootcamper 
    public CertifiedStatus(Bootcamper bootcamper) {
        super(bootcamper);
    }

    //Since the status is already certified, they no longer need to get certified. 
    @Override
    public String getCertified() {
        bootcamper.changeStatus(new CertifiedStatus(bootcamper));
        return "You are already certified, apply for a job!" +
                "We wish you the best";
    }

    //When bootcamper has been certified, they can now apply for a dev job. 
    @Override
    public String applyforJob() {

        return "We hope you enjoy this opportunity!!! OpenBootcamp Te desea lo mejor";
    }

    //When Bootcamper has been certified, they no longer need to enroll.
    @Override
    public String enrollToCourse() {

        return "You are already certified, apply for a job!";
    }

}
