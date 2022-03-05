package org.fulleffect.service;

import org.fulleffect.model.Speaker;
import org.fulleffect.repository.HibernateSpeakerRepositoryImpl;
import org.fulleffect.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private final SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();



    @Override
    public List<Speaker> findAll(){
        return  repository.findAll();
    }
}
