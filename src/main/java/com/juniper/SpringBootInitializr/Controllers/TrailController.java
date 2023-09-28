package com.juniper.SpringBootInitializr.Controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;
import com.juniper.SpringBootInitializr.Models.Trail;
import com.juniper.SpringBootInitializr.Services.*;

@RestController
@RequestMapping("trail")
public class TrailController {
    
    private final TrailService tService;
    // private final MessagingService mService;
	private final JmsTemplate jmsTemplate;
    private static final String QUEUE_NAME = "busqueue";
    public TrailController(TrailService tService, JmsTemplate jmsTemplate) {
        this.tService = tService;
        this.jmsTemplate = jmsTemplate;

    }

    @GetMapping
    public List<Trail> GetTrails(@RequestParam(required = false) String name, @RequestParam(required = false) String description) {
        if(name != null) {
            return tService.getTrailsByName(name);
        }
        else if(description != null) {
            return tService.getTrailsByDescription(description);
        }
        // mService.sendMessage("getting all trails");
        jmsTemplate.convertAndSend(QUEUE_NAME, "Received Request to /Get Trail endpoint");
        return tService.getAllTrails();
    }

    @GetMapping("{id}")
    public Trail getTrailById(@PathVariable int id) {
        return tService.getTrailById(id);
    }

    @PutMapping
    public Trail updateTrail(@RequestBody Trail trail) {
        return tService.updateTrail(trail);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Trail AddTrail(@RequestBody Trail t) {
        return tService.addTrail(t);
    }
}
