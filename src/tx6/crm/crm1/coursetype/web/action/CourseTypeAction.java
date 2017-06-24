package tx6.crm.crm1.coursetype.web.action;

import java.util.List;

import com.itheima.crm.coursetype.domain.CrmCourseType;
import com.itheima.crm.coursetype.service.CourseTypeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class CourseTypeAction extends ActionSupport implements ModelDriven<CrmCourseType> {
	//封装数据
	private CrmCourseType courseType = new CrmCourseType();
	@Override
	public CrmCourseType getModel() {
		return courseType ;
	}
	//service
	private CourseTypeService courseTypeService;
	public void setCourseTypeService(CourseTypeService courseTypeService) {
		this.courseTypeService = courseTypeService;
	}
	//////////////////////////////////////////////////
	/**
	 * 查询所有
	 * @return
	 */
	public String findAll(){
		//1简单查询
		List<CrmCourseType> allCourseType = this.courseTypeService.findAll();
		// * 查询结果存在值栈 , jsp 通过“#key”获得
		ActionContext.getContext().put("allCourseType", allCourseType);
		
		
		return "findAll";
	}
	

}
