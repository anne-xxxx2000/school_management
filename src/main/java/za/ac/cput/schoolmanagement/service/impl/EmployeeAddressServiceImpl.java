package za.ac.cput.schoolmanagement.service.impl;


import org.springframework.stereotype.Service;
import za.ac.cput.schoolmanagement.domain.EmployeeAddress;

import za.ac.cput.schoolmanagement.repository.employeeaddress.IEmployeeAddressRepository;

import za.ac.cput.schoolmanagement.service.employeeaddress.IEmployeeAddressService;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeAddressServiceImpl implements IEmployeeAddressService {

    private final IEmployeeAddressRepository repository;

    public EmployeeAddressServiceImpl(IEmployeeAddressRepository repo)
    {
        this.repository = repo;
    }

    @Override
    public EmployeeAddress save(EmployeeAddress employeeAddress) throws IllegalArgumentException
    {
        return repository.save(employeeAddress);
    }

    @Override
    public Optional<EmployeeAddress> read(String employeeId)
    {
        return repository.findById(employeeId);
    }

    @Override
    public void delete(String s) {

    }

    @Override
    public List<EmployeeAddress> findAll()
    {
        return repository.findAll();
    }

    @Override
    public void deleteById(String employeeId)
    {
        Optional<EmployeeAddress> employeeAddress = read(employeeId);
        employeeAddress.ifPresent(this::delete);
    }

    @Override
    public void delete(EmployeeAddress object)
    {
        repository.delete(object);
    }

}
