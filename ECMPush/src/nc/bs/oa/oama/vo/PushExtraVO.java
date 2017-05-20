package nc.bs.oa.oama.vo;

import java.util.Map;

/**
 * PushExtraVO.java<br>
 * @author Cuijb Jun 1, 2015
 **/
public class PushExtraVO
{
	/**
	 * 功能节点：A0A000、A0A001、A0A002、A0A003、A0A004、A0A005、A0A006、A0A007
	 */
	private String node;

	/**
	 * 二级功能：协同工作的已发、待发；审批的待审、待阅等
	 */
	private String type;

	/**
	 * 参数列表
	 */
	private Map<String, String> params;

	public String getNode()
	{
		return node;
	}

	public void setNode(String node)
	{
		this.node = node;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public Map<String, String> getParams()
	{
		return params;
	}

	public void setParams(Map<String, String> params)
	{
		this.params = params;
	}
}
