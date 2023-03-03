package com.example.qli_spham.controler;

import com.example.qli_spham.model.Product;
import com.example.qli_spham.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/products")
public class ProductApi {

    @Autowired
    IProductService iProductService;

    @GetMapping
    public ResponseEntity<List<Product>> finAll() {
        return new ResponseEntity<>(iProductService.finAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findById(@PathVariable long id) {
        return new ResponseEntity<>(iProductService.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Product product) {
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<?> edit(@RequestBody Product product) {
        iProductService.save(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable long id) {
        iProductService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
