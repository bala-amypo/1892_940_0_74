package com.example.demo.Serviceimpl;
import org.springframework.stereotype.service;
import com.example
import com.example.demo.Service.StudentService;
@Service
public class StudentServiceimple implements StudentService{
    private final StudentRepository studentRepository;
    public StudentServiceimple(StudentRepository studentRepository){
        this.studentRepository=studentRepository;
    }
    public Student saveStudent(Student student){
        return studentRepository.save()
    }
}
