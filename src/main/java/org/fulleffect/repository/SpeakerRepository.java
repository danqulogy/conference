package org.fulleffect.repository;

import org.fulleffect.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
