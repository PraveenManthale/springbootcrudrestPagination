package com.PraveenM.springbootcrudrestPagination.service;
import java.util.List;
import org.springframework.stereotype.Service;
import com.PraveenM.springbootcrudrestPagination.entity.Students;
@Service
public interface IStudentService {
List<Students>findPaginated(int pageNo,int PigeSize);
}
