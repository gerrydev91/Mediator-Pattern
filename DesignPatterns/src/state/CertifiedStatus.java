package state;

import Model.Bootcamper;

public class CertifiedStatus extends Status {

    public CertifiedStatus(Bootcamper bootcamper) {
        super(bootcamper);
    }

    @Override
    public String getCertified() {
        bootcamper.changeStatus(new CertifiedStatus(bootcamper));
        return "You are already certified, apply for a job!" +
                "We wish you the best";
    }

    @Override
    public String applyforJob() {

        return "We hope you enjoy this opportunity!!! OpenBootcamp Te desea lo mejor";
    }

    @Override
    public String enrollToCourse() {

        return "You are already certified, apply for a job!";
    }

}
