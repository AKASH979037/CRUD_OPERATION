package com.example.demo.Controller;
import com.example.demo.Service.Service;
import com.example.demo.modl.Details;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class Controller {
    @Autowired
    private Service serv;
       @GetMapping("Students")
       String defau() {
           return serv.show();
       }
       @GetMapping("Students/details")
      public List<Details> ls ()
       {
           return serv.stget();
       }
       @GetMapping("Students/{rno}")
        String defat (@PathVariable("rno") int roll)
    {
        return serv.get(roll);
    }
    @PostMapping("Students")
    String add (@RequestBody Details student)
    {
              return serv.addstudent(student);
    }
    @DeleteMapping("Students/{rno}")
    String fes(@PathVariable("rno") int n)
    {
        return serv.delete(n);
    }
    @PutMapping("Students")
    String update(@RequestBody Details st)
    {
        return serv.update(st);
    }
    
}
