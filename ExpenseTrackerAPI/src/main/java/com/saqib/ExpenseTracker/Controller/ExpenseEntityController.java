package com.saqib.ExpenseTracker.Controller;


import com.saqib.ExpenseTracker.Entity.ExpenseEntity;
import com.saqib.ExpenseTracker.Repository.ExpenseEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("expense")
public class ExpenseEntityController {
    @Autowired
    private ExpenseEntityRepository ExpenseEntityRepository;
    @GetMapping
    public ResponseEntity<List<ExpenseEntity>> getAllEntries(){
        List<ExpenseEntity> entries = ExpenseEntityRepository.findAll();
        return new ResponseEntity<>(entries, HttpStatus.OK);
    }
    @GetMapping("id/{myId}")
    public ResponseEntity<ExpenseEntity> getById(@PathVariable Long myId){
        Optional<ExpenseEntity> entry = ExpenseEntityRepository.findById(myId);
        if(entry.isPresent()){
            return new ResponseEntity<>(entry.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ResponseEntity<ExpenseEntity> addNew(@RequestBody ExpenseEntity myEntry){
        ExpenseEntity newEntry = ExpenseEntityRepository.save(myEntry);
        return new ResponseEntity<>(newEntry, HttpStatus.CREATED);
    }
    @PutMapping("id/{myId}")
    public ResponseEntity<ExpenseEntity> UpdateById(@PathVariable Long myId, @RequestBody ExpenseEntity newEntry) {
        Optional<ExpenseEntity> optionalEntity = ExpenseEntityRepository.findById(myId);
        if (optionalEntity.isPresent()) {
            ExpenseEntity existingEntity = optionalEntity.get();
            existingEntity.setTitle(newEntry.getTitle());
            existingEntity.setCategory(newEntry.getCategory());
            existingEntity.setAmount(newEntry.getAmount());
            if (newEntry.getDate() != null) {
                existingEntity.setDate(newEntry.getDate());
            }
            ExpenseEntity updatedEntity = ExpenseEntityRepository.save(existingEntity);
            return new ResponseEntity<>(updatedEntity, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("id/{myId}")
    public ResponseEntity<ExpenseEntity> deleteById(@PathVariable Long myId){
        ExpenseEntityRepository.deleteById(myId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }





}
