package za.ac.cput.schoolmanagement.controller;

import ch.qos.logback.classic.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import za.ac.cput.schoolmanagement.domain.EmployeeAddress;
import za.ac.cput.schoolmanagement.factory.EmployeeAddressFactory;
import za.ac.cput.schoolmanagement.service.employeeaddress.IEmployeeAddressService;

import java.util.List;


@RestController
@RequestMapping("school-management/employee-address/")
public class EmployeeAddressController {

    private final IEmployeeAddressService service;
    private Logger log;

    @Autowired public EmployeeAddressController(IEmployeeAddressService service)
    {
        this.service = service;
    }

    @PostMapping("save")
    public ResponseEntity<EmployeeAddress> save(@RequestBody EmployeeAddress employeeAddress)
    {
        EmployeeAddress employeeAddressAlt = null;
        try
        {
            employeeAddressAlt = service.save(EmployeeAddressFactory.build(
                    employeeAddress.getStaffId(),
                    employeeAddress.getAddress()
            ));
        }catch(IllegalArgumentException exception)
        {

            log.info("EmployeeAddress Save : {}", exception);
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }

        return ResponseEntity.ok(employeeAddressAlt);
    }

    @GetMapping("read/{id}")
    public ResponseEntity<EmployeeAddress> read(@PathVariable String id)
    {
        EmployeeAddress employeeAddress = service.read(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        return ResponseEntity.ok(employeeAddress);
    }

    @GetMapping("find-all")
    public ResponseEntity<List<EmployeeAddress>> findAll()
    {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("delete")
    public ResponseEntity<Void> delete(@RequestBody EmployeeAddress object)
    {
        service.delete(object);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("delete-by-id/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable String id)
    {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}

