package state;

import Model.Bootcamper;

abstract public class Status {

    public Bootcamper bootcamper;

    public Status (Bootcamper bootcamper){
        this.bootcamper=bootcamper;
    }

    abstract public String getCertified();
    abstract public String applyforJob();
    abstract public String enrollToCourse();

    
    
}
