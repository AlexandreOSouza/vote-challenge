package com.vote.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vote.demo.model.Ruling;
import com.vote.demo.repository.RulingRepository;

@Service
public class RulingService {

    RulingRepository rulingRepository;

    public RulingService(RulingRepository rulingRepository) {
        this.rulingRepository = rulingRepository;
    }
    
    public Ruling createRuling(Ruling newRuling) {
        return rulingRepository.save(newRuling);
    }

    public List<Ruling> getAllRuling() {
        return rulingRepository.findAll();
    }
}
