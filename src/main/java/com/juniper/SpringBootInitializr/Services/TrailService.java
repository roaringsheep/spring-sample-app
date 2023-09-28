package com.juniper.SpringBootInitializr.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.juniper.SpringBootInitializr.Dao.TrailDAO;
import com.juniper.SpringBootInitializr.Models.Trail;
import com.juniper.SpringBootInitializr.Exceptions.*;



@Service
public class TrailService {
    private final TrailDAO tDao;

    public TrailService(TrailDAO tDao) {
        this.tDao = tDao;
    }

    public List<Trail> getAllTrails() {
        return this.tDao.findAll();
    }

    public Trail addTrail(Trail t) {
        return this.tDao.saveAndFlush(t);
    }

    public Trail getTrailById(long id) {
        return tDao.findById(id).orElseThrow(() -> new TrailNotFoundException("No Trail found with id: " + id));
    }

    public List<Trail> getTrailsByName(String name) {
        return tDao.findByNameContainingIgnoreCase(name);
    }

    public List<Trail> getTrailsByDescription(String pattern) {
        return tDao.findByDescriptionContainsIgnoringCase(pattern);
    }

    public Trail updateTrail(Trail trail) {
        return tDao.save(trail);
    }

    public Trail deleteTrail(long id){
        Optional<Trail> t = tDao.findById(id);

        if(t.isPresent()) {
            tDao.deleteById(id);
            return t.get();
        }
        else {
            return null;
        }
    }
}
