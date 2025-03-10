package tn.esprit.adelbettaiebarctic3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.adelbettaiebarctic3.entites.skier;
import tn.esprit.adelbettaiebarctic3.services.ISkierService;

import java.util.List;

@RestController
@RequestMapping("skier")
public class SkierController {
    @Autowired
    private ISkierService skierService;

    @PostMapping("add")
    public skier addSkier(@RequestBody skier s){
        return skierService.addSkier(s);
    }

    @PutMapping("update")
    public skier update(@RequestBody skier s){
        return skierService.update(s);
    }

    @GetMapping("get/{numSkier}")
    public skier retrieveSkier(@PathVariable int numSkier){
        return skierService.retrieveSkier(numSkier);
    }

    @GetMapping("getall")
    public List<skier> retrieveAll(){

        return skierService.retrieveAll();
    }

    @DeleteMapping ("delete/{numSkier}")
    public void deleteSkier(@PathVariable int numSkier){
        skierService.deleteSkier(numSkier);
    }

}
