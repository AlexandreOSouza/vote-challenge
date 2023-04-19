package com.vote.demo.resource;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vote.demo.model.Ruling;
import com.vote.demo.service.RulingService;

@RestController
@RequestMapping("/ruling")
public class RulingController {

    private RulingService service;

    public RulingController(RulingService service) {
        this.service = service;
    }
    
    @GetMapping("/create")
	public Ruling greeting(@RequestParam(value = "title", defaultValue = "") String title) {
        Ruling ruling = new Ruling(title);

		return service.createRuling(ruling);
	}

    @GetMapping("/all")
    public List<Ruling> getAllRuling() {
        return service.getAllRuling();
    }
}
