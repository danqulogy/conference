package org.fulleffect;

import org.fulleffect.service.SpeakerService;
import org.fulleffect.service.SpeakerServiceImpl;

public class Application {
    public static void main(){
        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());
    }
}
