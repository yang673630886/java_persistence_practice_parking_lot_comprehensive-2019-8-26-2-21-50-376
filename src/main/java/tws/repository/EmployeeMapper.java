package tws.repository;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import tws.entity.Employee;

import java.util.List;

@Mapper
public interface EmployeeMapper {
	
	@Select("select * from parkingboy")
    List<Employee> selectAll();
   void insert(@Param("employee") Employee employee);
}
