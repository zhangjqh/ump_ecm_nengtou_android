package wa.android.common.vo;

import nc.vo.pub.ValidationException;

import java.util.Map;

import nc.vo.pub.ValueObject; 

import nc.vo.oa.component.IMapToVO ;

import java.util.List;


public class GroupListVO extends ValueObject implements IMapToVO{


	private List<GroupDataVO> list;


	public void setList( List<GroupDataVO> list ) {
		this.list = list;
	}

	public List<GroupDataVO> getList(){
		return list;
	}

	@Override
	public String getVOKey() {
		return null;
	}
	@Override
	public boolean isNeedKey() {
		return false;
	}
	@Override
	public void setAttributes(Map mapvalue) {
		
	}
	@Override
	public Map getAttributesMap() {
		return null;
	}
	@Override
	public IMapToVO getNewVO() {
		return new GroupListVO();
	}
	@Override
	public boolean isNull() {
		return this.isnull;
	}
	@Override
	public String getEntityName() {
		return null;
	}
	@Override
	public void validate() throws ValidationException {
	}
   private boolean isnull = true;
   }
