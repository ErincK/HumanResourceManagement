package com.hrm.mapper;

import com.hrm.dto.request.NewCreateEmployeeRequestDto;
import com.hrm.dto.response.EmployeeDetailResponseDto;
import com.hrm.rabbitmq.model.RegisterEmployeeModel;
import com.hrm.repository.entity.Employee;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IEmployeeMapper {

    IEmployeeMapper INSTANCE = Mappers.getMapper(IEmployeeMapper.class);

    Employee toEmployee(final NewCreateEmployeeRequestDto dto);
    RegisterEmployeeModel toModel(final Employee employe);

    EmployeeDetailResponseDto toEmployeeDetailResponseDto(final Employee employee);


}
