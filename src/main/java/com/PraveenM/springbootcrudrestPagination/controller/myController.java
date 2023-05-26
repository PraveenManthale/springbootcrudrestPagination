package com.PraveenM.springbootcrudrestPagination.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.PraveenM.springbootcrudrestPagination.entity.Students;
import com.PraveenM.springbootcrudrestPagination.repository.StudentRepository;
import com.PraveenM.springbootcrudrestPagination.service.IStudentService;

@RestController
@RequestMapping("Student")
public class myController {
@Autowired
private IStudentService studentService;
@Autowired
StudentRepository studentrepo;
@GetMapping("/{pageNo}/{pageSize}")
public List<Students>getPaginated(@PathVariable int pageNo,@PathVariable int pageSize){
return studentService.findPaginated(pageNo, pageSize);
}
//sorting
@GetMapping("/sorting")
public Iterable<Students>getAllByCols (@RequestParam String field1) {
return studentrepo.findAll(Sort.by(Direction.ASC, field1));
}
}
