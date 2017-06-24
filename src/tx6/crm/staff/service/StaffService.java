package tx6.crm.staff.service;

import java.util.List;

import com.itheima.crm.staff.domain.CrmStaff;

public interface StaffService {
	
	/**
	 * 登录
	 * @param staff
	 * @return
	 */
	public CrmStaff login(CrmStaff staff);
	
	/**
	 * 查询所有员工
	 * @return
	 */
	public List<CrmStaff> findAllStaff();
	
	/**
	 * 通过id查询
	 * @param staffId
	 * @return
	 */
	public CrmStaff findById(String staffId);

}
