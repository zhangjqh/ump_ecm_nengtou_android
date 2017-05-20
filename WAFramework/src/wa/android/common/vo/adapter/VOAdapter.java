package wa.android.common.vo.adapter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import nc.vo.oa.component.common.AttachmentDetailVO;
import nc.vo.oa.component.common.AttachmentListVO;
import nc.vo.oa.component.common.AttachmentVO;
import nc.vo.oa.component.common.ContactInfoVO;
import nc.vo.oa.component.common.SearchConditionVO;
import nc.vo.oa.component.contacts.EnterpriseGroupVO;
import nc.vo.oa.component.contacts.EnterpriseVO;
import nc.vo.oa.component.contacts.GroupVO;
import nc.vo.oa.component.contacts.OrgNavListVO;
import nc.vo.oa.component.contacts.OrgNavVO;
import nc.vo.oa.component.contacts.PersonDetailVO;
import nc.vo.oa.component.contacts.PersonGroupVO;
import nc.vo.oa.component.contacts.PersonListByConditionVO;
import nc.vo.oa.component.contacts.PersonListByEntGroupIDVO;
import nc.vo.oa.component.contacts.PersonListVO;
import nc.vo.oa.component.contacts.PersonVO;
import nc.vo.oa.component.login.LoginVO;
import nc.vo.oa.component.messagecenter.MessageButtonListVO;
import nc.vo.oa.component.messagecenter.MessageButtonVO;
import nc.vo.oa.component.messagecenter.MessageGroupVO;
import nc.vo.oa.component.messagecenter.MessageListVO;
import nc.vo.oa.component.messagecenter.MessageVO;
import nc.vo.oa.component.sobill.SOBillListByCustomerVO;
import nc.vo.oa.component.sobill.SOBillVO;
import nc.vo.oa.component.struct.Action;
import nc.vo.oa.component.struct.ChildRowVO;
import nc.vo.oa.component.struct.DataVO;
import nc.vo.oa.component.struct.ItemVO;
import nc.vo.oa.component.struct.ResDataVO;
import nc.vo.oa.component.struct.ResResultVO;
import nc.vo.oa.component.struct.RowVO;
import nc.vo.oa.component.struct.ServiceCodeRes;
import nc.vo.oa.component.struct.ServiceCodesRes;
import nc.vo.oa.component.taskcenter.ApproveHistoryVO;
import nc.vo.oa.component.taskcenter.ApprovedDetailVO;
import nc.vo.oa.component.taskcenter.RejectNodeListVO;
import nc.vo.oa.component.taskcenter.RejectVO;
import nc.vo.oa.component.taskcenter.TaskActionListVO;
import nc.vo.oa.component.taskcenter.TaskActionVO;
import nc.vo.oa.component.taskcenter.TaskBillVO;
import nc.vo.oa.component.taskcenter.TaskButtonInfoVO;
import nc.vo.oa.component.taskcenter.TaskButtonVO;
import nc.vo.oa.component.taskcenter.TaskGroupVO;
import nc.vo.oa.component.taskcenter.TaskListVO;
import nc.vo.oa.component.taskcenter.TaskVO;
import nc.vo.oa.component.taskcenter.UserListVO;
import nc.vo.oa.component.taskcenter.UserVO;
import wa.android.common.network.WAReqActionVO;
import wa.android.common.network.WAResActionVO;
import wa.android.common.network.WAResStructVO;
import wa.android.common.vo.GroupDataVO;
import wa.android.common.vo.GroupListVO;

public class VOAdapter {

	public static void voAdaper(Action action,WAReqActionVO waReqAction) {
		
		WAResActionVO resActionVO = waReqAction.resActionVO;
		if(null != resActionVO){
			action.setActiontype(resActionVO.actiontype);
			
			//鏋勯�action鍐呯殑鍚勪釜灞炴�
			ResResultVO resResult = new ResResultVO();
			resResult.setFlag(resActionVO.flag);
			resResult.setDesc(resActionVO.desc);
			
			ServiceCodesRes serviceCode = new ServiceCodesRes();
			List<ServiceCodeRes> scres = new ArrayList<ServiceCodeRes>();
			
			List<WAResStructVO> listWAResStructVO = resActionVO.responseList;
			Iterator<WAResStructVO> iterator = listWAResStructVO.iterator();
			while(iterator.hasNext()) {
				WAResStructVO waResStructVO = iterator.next();
				ServiceCodeRes aa = new ServiceCodeRes();
				aa.setProductid(waResStructVO.productid);
				aa.setServicecode(waResStructVO.serviceCode);
				ResDataVO resData = processResDataVO(waResStructVO.returnValue,resActionVO.actiontype);
				aa.setResdata(resData);
				scres.add(aa);
			}
			serviceCode.setScres(scres);
			resResult.setServcieCodesRes(serviceCode);
			action.setResresulttags(resResult);
		}
	}
	
	private static ResDataVO processResDataVO(List structList,String actionType) {
		if(null != structList) {
			ResDataVO resdata = new ResDataVO();
			List structList2 = null;
			Map map = (Map)structList.get(0);
			if("login".equals(actionType)) {
				structList2 = processLoginReturnVO((Map)map.get("login"));
			} else if("getPersonGroup".equals(actionType)) {
				structList2 = processLoginReturnVO1((Map)map.get("persongroup"));
			} else if("addPersonGroup".equals(actionType)) {
				structList2 = processLoginReturnVONOReturn();
			} else if("deletePersonGroup".equals(actionType)) {
				structList2 = processLoginReturnVONOReturn();
			} else if("renamePersonGroupName".equals(actionType)) {
				structList2 = processLoginReturnVONOReturn();
			} else if("getPersonListByGroupID".equals(actionType)) {
				structList2 = processLoginReturnVO2((Map)map.get("personlist"));
			} else if("getOrgNavList".equals(actionType)) {
				structList2 = processLoginReturnVO3((Map)map.get("orgnavlist"));
			} else if("getPersonListByNavID".equals(actionType)) {
				structList2 = processLoginReturnVO2((Map)map.get("personlist"));
			} else if("getEnterpriseGroup".equals(actionType)) {
				structList2 = processLoginReturnVO4((Map)map.get("enterprisegrpup"));
			} else if("getPersonListByEntGroupID".equals(actionType)) {
				structList2 = processLoginReturnVO5((Map)map.get("personlistbyentgroupid"));
			} else if("getConditionDescription".equals(actionType)) {
				structList2 = processLoginReturnVO6((Map)map.get("searchcondition"));
			} else if("getPersonListByCondition".equals(actionType)) {
				structList2 = processLoginReturnVO7((Map)map.get("personlistbycondition"));
			} else if("getPersonDetail".equals(actionType)) {
				structList2 = processLoginReturnVO8((Map)map.get("persondetail"));
			} else if("updatePsnGroups".equals(actionType)) {
				structList2 = processLoginReturnVONOReturn();
			} else if("removePersonFromGroup".equals(actionType)) {
				structList2 = processLoginReturnVONOReturn();
			} else if("getCorpList".equals(actionType)) {
				structList2 = processLoginReturnVO99((Map)map.get("grouplist"));
			}
			
			//////
			else if("getMessageButtonList".equals(actionType)) {
				structList2 = processLoginReturnVO9((Map)map.get("messagebuttonlist"));
			} else if("getMessageList".equals(actionType)) {
				structList2 = processLoginReturnVO10((Map)map.get("messages"));
			} else if("getAttachment".equals(actionType)) {
				structList2 = processLoginReturnVO11((Map)map.get("attachmentdetail"));
			}
			//Task
			 else if("getTaskList".equals(actionType)) {
					structList2 = processLoginReturnVO12((Map)map.get("taskstructlist"));
				} else if("getTaskButtonList".equals(actionType)) {
					structList2 = processLoginReturnVO13((Map)map.get("taskbuttonlist"));
				} else if("getTaskBill".equals(actionType)) {
					structList2 = processLoginReturnVO14((List<Map>)map.get("taskbill"));
				} else if("getMessageAttachmentList".equals(actionType)) {
					structList2 = processLoginReturnVO15((Map)map.get("attachmentlist"));
				} else if("getTaskAction".equals(actionType)) {
					structList2 = processLoginReturnVO16((Map)map.get("actionstructlist"));
				} else if("getMessageAttachment".equals(actionType)) {
					structList2 = processLoginReturnVO11((Map)map.get("attachmentdetail"));
				} else if("getApprovedDetail".equals(actionType)) {
					structList2 = processLoginReturnVO17((Map)map.get("approveddetail"));
				} else if("getUserlist".equals(actionType)) {
					structList2 = processLoginReturnVO18((Map)map.get("psnstructlist"));
				} else if("getRejectNoleList".equals(actionType)||"getAssignPsnlist".equals(actionType)) {
					structList2 = processLoginReturnVO19((Map)map.get("psnstructlist"));
				} else if("getPsnDetail".equals(actionType)) {
					structList2 = processLoginReturnVO20((Map)map.get("person"));
				} else if("getConditionDescription".equals(actionType)) {
					structList2 = processLoginReturnVO21((Map)map.get("searchcondition"));
				} else{
					structList2 = processLoginReturnVO98(map);
				}
		
			resdata.setList(structList2);
			return resdata;
		}else
			return null;
	}

	
	private static List processLoginReturnVO8(Map object) {
		List list = new ArrayList();
		if(null != object) {
			PersonDetailVO billDetail = new PersonDetailVO();
			billDetail.setCompany((String)object.get("company"));
			billDetail.setDept((String)object.get("dept"));
			billDetail.setEmail((String)object.get("email"));
			billDetail.setMobileno((String)object.get("mobileno"));
			billDetail.setName((String)object.get("name"));
			billDetail.setOfficephone((String)object.get("officephone"));
			billDetail.setPhoto((String)object.get("photo"));
			billDetail.setPosition((String)object.get("position"));
			billDetail.setPsnid((String)object.get("psnid"));
			billDetail.setSex((String)object.get("sex"));
		
			
			
			List<Map> listMap = (List<Map>)object.get("contactinfo");
			if(null != listMap) {
				List<ContactInfoVO> listgroup = new ArrayList<ContactInfoVO>();
				Iterator<Map> iter = listMap.iterator();
				while(iter.hasNext()) {
					Map map = iter.next();
					ContactInfoVO groupVO = new ContactInfoVO();
					groupVO.setMsgtype((String)map.get("msgtype"));
					groupVO.setPropname((String)map.get("propname"));
					groupVO.setPropvalue((String)map.get("propvalue"));
					//groupVO((String)map.get("ismain")); vo涓繕澶氫竴涓睘鎬�
					listgroup.add(groupVO);
				}
				billDetail.setContactinfolist(listgroup);
			}
			
			List<Map> listMap1 = (List<Map>)object.get("group");
			if(null != listMap1) {
				List<GroupVO> listgroup = new ArrayList<GroupVO>();
				Iterator<Map> iter = listMap1.iterator();
				while(iter.hasNext()) {
					Map map = iter.next();
					GroupVO groupVO = new GroupVO();
					groupVO.setPsngroupid((String)map.get("psngroupid"));
					groupVO.setPsngroupname((String)map.get("psngroupname"));
					groupVO.setPsnnum((String)map.get("psnnum"));
					listgroup.add(groupVO);
				}
				billDetail.setPersongrouplist(listgroup);
			}
			
			//澶勭悊LIst<RowVO>
			List<Map> listMap2 = (List<Map>)object.get("data");
			if(null != listMap2) {
				List<RowVO> listRow = new ArrayList<RowVO>();
				for(Map mapTemp2 : listMap2) {
					listRow.add(processRowVO(mapTemp2));
				}
				billDetail.setData(listRow);
			}
			
			list.add(billDetail);
		}
		return list;
	}

	private static List processLoginReturnVO7(Map object) {
		List list = new ArrayList();
		if(null != object) {
			PersonListByConditionVO vo = new PersonListByConditionVO();
			List<Map> listmap = (List<Map>)object.get("person");
			if(null != listmap) {
				Iterator<Map> iter = listmap.iterator();
				List<PersonVO> materialLists = new ArrayList<PersonVO>();
				while(iter.hasNext()) {
					Map map = iter.next();
					PersonVO material = new PersonVO();
					material.setDept((String)map.get("dept"));
					material.setEmail((String)map.get("email"));
					material.setMobileno((String)map.get("mobileno"));
					material.setName((String)map.get("name"));
					material.setPosition((String)map.get("position"));
					material.setPsnid((String)map.get("psnid"));
					material.setSex((String)map.get("sex"));
					materialLists.add(material);
				}
				vo.setPersonlist(materialLists);
			}
			list.add(vo);
		}
		return list;
	}

	private static List processLoginReturnVO6(Map object) {
		List list = new ArrayList();
		if(null != object) {
			SearchConditionVO vo = new SearchConditionVO();
			vo.setConditiondesc((String)object.get("conditiondesc"));
			list.add(vo);
		}
		return list;
	}

	private static List processLoginReturnVO5(Map object) {
		List list = new ArrayList();
		if(null != object) {
			PersonListByEntGroupIDVO vo = new PersonListByEntGroupIDVO();
			List<Map> listmap = (List<Map>)object.get("person");
			if(null != listmap) {
				Iterator<Map> iter = listmap.iterator();
				List<PersonVO> materialLists = new ArrayList<PersonVO>();
				while(iter.hasNext()) {
					Map map = iter.next();
					PersonVO material = new PersonVO();
					material.setDept((String)map.get("dept"));
					material.setEmail((String)map.get("email"));
					material.setMobileno((String)map.get("mobileno"));
					material.setName((String)map.get("name"));
					material.setPosition((String)map.get("position"));
					material.setPsnid((String)map.get("psnid"));
					material.setSex((String)map.get("sex"));
					materialLists.add(material);
				}
				vo.setPersonlist(materialLists);
			}
			list.add(vo);
		}
		return list;
	}

	private static List processLoginReturnVO4(Map object) {
		List list = new ArrayList();
		if(null != object) {
			EnterpriseGroupVO billDetail = new EnterpriseGroupVO();
			List<Map> listMap = (List<Map>)object.get("enterprise");
			if(null != listMap) {
				List<EnterpriseVO> listgroup = new ArrayList<EnterpriseVO>();
				Iterator<Map> iter = listMap.iterator();
				while(iter.hasNext()) {
					Map map = iter.next();
					EnterpriseVO groupVO = new EnterpriseVO();
					groupVO.setEgroupid((String)map.get("egroupid"));
					groupVO.setGroupname((String)map.get("groupname"));
					groupVO.setPsnnum((String)map.get("psnnum"));
					listgroup.add(groupVO);
				}
				billDetail.setEnterprisegrouplist(listgroup);
			}
			list.add(billDetail);
		}
		return list;
	}

	private static List processLoginReturnVONOReturn() {
		List list = new ArrayList();
		return list;
	}

	

	
	private static List processLoginReturnVO(Map object) {
		
		List list = new ArrayList();
		if(null != object) {
			LoginVO loginVO = new LoginVO();
			loginVO.setGroupid((String)object.get("groupid"));
			loginVO.setGroupname((String)object.get("groupname"));
			loginVO.setUsrid((String)object.get("usrid"));
			loginVO.setUsrname((String)object.get("usrname"));
			loginVO.setAttsize((String)object.get("attsize"));
			list.add(loginVO);
		}
		return list;
		
	}
	
	private static List processLoginReturnVO1(Map object) {
		List list = new ArrayList();
		if(null != object) {
			PersonGroupVO billDetail = new PersonGroupVO();
			List<Map> listMap = (List<Map>)object.get("group");
			if(null != listMap) {
				List<GroupVO> listgroup = new ArrayList<GroupVO>();
				Iterator<Map> iter = listMap.iterator();
				while(iter.hasNext()) {
					Map map = iter.next();
					GroupVO groupVO = new GroupVO();
					groupVO.setPsngroupid((String)map.get("psngroupid"));
					groupVO.setPsngroupname((String)map.get("psngroupname"));
					groupVO.setPsnnum((String)map.get("psnnum"));
					listgroup.add(groupVO);
				}
				billDetail.setPersongrouplist(listgroup);
			}
			list.add(billDetail);
		}
		return list;
	}
	
	private static List processLoginReturnVO2(Map object) {
		
		List list = new ArrayList();
		if(null != object) {
			PersonListVO vo = new PersonListVO();
			List<Map> listmap = (List<Map>)object.get("person");
			if(null != listmap) {
				Iterator<Map> iter = listmap.iterator();
				List<PersonVO> materialLists = new ArrayList<PersonVO>();
				while(iter.hasNext()) {
					Map map = iter.next();
					PersonVO material = new PersonVO();
					material.setDept((String)map.get("dept"));
					material.setEmail((String)map.get("email"));
					material.setMobileno((String)map.get("mobileno"));
					material.setName((String)map.get("name"));
					material.setPosition((String)map.get("position"));
					material.setPsnid((String)map.get("psnid"));
					material.setSex((String)map.get("sex"));
					materialLists.add(material);
				}
				vo.setPersonlist(materialLists);
			}
			list.add(vo);
		}
		return list;
	}
	
	private static List processLoginReturnVO3(Map object) {
		List list = new ArrayList();
		if(null != object) {
			OrgNavListVO billDetail = new OrgNavListVO();
			billDetail.setResultpsncnt((String)object.get("resultpsncnt"));
			List<Map> listMap = (List<Map>)object.get("orgnav");
			if(null != listMap) {
				List<OrgNavVO> listgroup = new ArrayList<OrgNavVO>();
				Iterator<Map> iter = listMap.iterator();
				while(iter.hasNext()) {
					Map map = iter.next();
					OrgNavVO groupVO = new OrgNavVO();
					groupVO.setDept((String)map.get("dept"));
					groupVO.setEmail((String)map.get("email"));
					groupVO.setEnd((String)map.get("end"));
					groupVO.setMobileno((String)map.get("mobileno"));
					groupVO.setNavid((String)map.get("navid"));
					groupVO.setNavname((String)map.get("navname"));
					groupVO.setNavtype((String)map.get("navtype"));
					groupVO.setPosition((String)map.get("position"));
					groupVO.setPsncnt((String)map.get("psncnt"));
					groupVO.setSex((String)map.get("sex"));
					listgroup.add(groupVO);
				}
				billDetail.setOrgnavlist(listgroup);
			}
			list.add(billDetail);
		}
		return list;
	}
	
	private static RowVO processRowVO(Map mapTemp2) {
		RowVO row = null;
		if(null != mapTemp2) {
			row = new RowVO();
			
			//澶勭悊List<ItemVO>
			List<Map> listItem = (List<Map>)mapTemp2.get("item");
			if(null != listItem) {
				row.setItem(processListItem(listItem));
			}
			
			//澶勭悊List<ChildRowVO>
			List<Map> listChild = (List<Map>)mapTemp2.get("child");
			if(null != listChild) {
				List<ChildRowVO> childRowList = new ArrayList<ChildRowVO>();
				for(Map mapTemp3 : listChild) {
					List<Map> listItem3 = (List<Map>)mapTemp3.get("row");
					if(null != listItem3) {
						for(Map mapItem : listItem3) {
							ChildRowVO childRow = new ChildRowVO();
							List<Map> listItem4 = (List<Map>)mapItem.get("item");
							if(null != listItem4) {
								childRow.setItem(processListItem(listItem4));
								childRowList.add(childRow);
							}
						}
					}
				}
				row.setChild(childRowList);
			}
			
			//澶勭悊style
			row.setStyle((String)mapTemp2.get("style"));
			
			//澶勭悊style
			row.setId((String)mapTemp2.get("id"));
		}
		return row;
	}
	
	//澶勭悊List<ItemVO>,(杩欓噷鍙�鐢ㄤ簬RowVO涓嬮潰鐨凩ist<ItemVO>)
		private static List<ItemVO> processListItem(List<Map> listItem) {
			List<ItemVO> itemlist = null;
			if(null != listItem) {
				itemlist = new ArrayList<ItemVO>();
				for(Map mapTemp3 : listItem) {
					ItemVO item = new ItemVO((String)mapTemp3.get("@name"),(String)mapTemp3.get("value"));
					item.id = (String)mapTemp3.get("@id");
					item.setCheckstatus((String)mapTemp3.get("checkstatus"));
					item.setMode((String)mapTemp3.get("mode"));
					item.setReadonly((String)mapTemp3.get("readonly"));
					item.setReferid((String)mapTemp3.get("referid"));
					item.setRefertype((String)mapTemp3.get("refertype"));
					item.setValuedesc((String)mapTemp3.get("valuedesc"));
					itemlist.add(item);
				}
			}
			return itemlist;
		}
		
		private static List processLoginReturnVO9(Map object) {
			List list = new ArrayList();
			if(null != object) {
				MessageButtonListVO billDetail = new MessageButtonListVO();
				
				List<Map> listMap = (List<Map>)object.get("button");
				if(null != listMap) {
					Iterator<Map> iter = listMap.iterator();
					List<MessageButtonVO> materialLists = new ArrayList<MessageButtonVO>();
					while(iter.hasNext()) {
						Map map = iter.next();
						MessageButtonVO material = new MessageButtonVO();
						material.setStatuscode((String)map.get("statuscode"));
						material.setStatuskey((String)map.get("statuskey"));
						material.setStatusname((String)map.get("statusname"));
						materialLists.add(material);
					}
					billDetail.setButtonList(materialLists);
				}
				list.add(billDetail);
			}
			return list;
		}
		private static List processLoginReturnVO10(Map object) {
			
			List list = new ArrayList();
			if(null != object) {
				MessageListVO vo = new MessageListVO();
				
				List<Map> listmap = (List<Map>)object.get("group");
				if(null != listmap) {
					Iterator<Map> iter = listmap.iterator();
					List<MessageGroupVO> materialLists = new ArrayList<MessageGroupVO>();
					while(iter.hasNext()) {
						Map map = iter.next();
						MessageGroupVO material = new MessageGroupVO();
						material.setName((String)map.get("name"));
						
						
						
						List<Map> listmap2 = (List<Map>)map.get("message");
						if(null != listmap2) {
							Iterator<Map> iter2 = listmap2.iterator();
							List<MessageVO> messageList = new ArrayList<MessageVO>();
							while(iter2.hasNext()) {
								Map map2 = iter2.next();
								MessageVO message = new MessageVO();
								message.setDate((String)map2.get("date"));
								message.setIsread((String)map2.get("isread"));
								message.setMessageid((String)map2.get("msgid"));
								message.setPriority((String)map2.get("priority"));
								message.setSenderid((String)map2.get("senderid"));
								message.setSendername((String)map2.get("sendername"));
								message.setTitle((String)map2.get("title"));
								message.setType((String)map2.get("type"));
								
								
								messageList.add(message);
							}
							material.setMessage(messageList);
						}
						
						materialLists.add(material);
					}
					vo.setGroup(materialLists);
				}
				list.add(vo);
			}
			return list;
		}
		
		
		
		private static List processLoginReturnVO11(Map object) {
			List list = new ArrayList();
			if(null != object) {
				AttachmentDetailVO vo = new AttachmentDetailVO();
				vo.setAttachmentcontent((String)object.get("content"));
				list.add(vo);
			}
			return list;
		}
		
		private static List processLoginReturnVO12(Map object) {
			List list = new ArrayList();
			if(null != object) {
				TaskListVO vo = new TaskListVO();

				List<Map> listmap = (List<Map>)object.get("group");
				if(null != listmap) { 
					Iterator<Map> iter = listmap.iterator();
					List<TaskGroupVO> taskGrouplist = new ArrayList<TaskGroupVO>();
					List<SOBillVO> materialLists = new ArrayList<SOBillVO>();
				
					while(iter.hasNext()) {
						TaskGroupVO taskGroup = new TaskGroupVO();
						Map map = iter.next();
						taskGroup.setGroupname((String)map.get("name"));
						List<Map> childlistmap = (List<Map>)map.get("taskstruct");
						if(null != childlistmap){
							List<TaskVO> tasklist = new ArrayList<TaskVO>();
							Iterator<Map> childiter = childlistmap.iterator();	
							while(childiter.hasNext()){
								Map childmap = childiter.next();
								TaskVO taskvo =new TaskVO();
								taskvo.setDate((String)childmap.get("date"));
								taskvo.setTaskid((String)childmap.get("taskid"));
								taskvo.setTitle((String)childmap.get("title"));
								tasklist.add(taskvo);
							}
							taskGroup.setTask(tasklist);
						}
						taskGrouplist.add(taskGroup);
					}
					vo.setGroup(taskGrouplist);
				}
				list.add(vo);
			}
			return list;
		}
		private static List processLoginReturnVO13(Map object) {
			List list = new ArrayList();
			if(null != object) {
				TaskButtonInfoVO vo = new TaskButtonInfoVO();
				List<Map> listmap = (List<Map>)object.get("statusstruct");
				if(null != listmap) { 
					List<TaskButtonVO> buttonlist = new ArrayList<TaskButtonVO>();
					Iterator<Map> iter = listmap.iterator();
					List<SOBillVO> materialLists = new ArrayList<SOBillVO>();
					while(iter.hasNext()) {
						Map map = iter.next();
						TaskButtonVO button = new TaskButtonVO();
						button.setStatuscode((String)map.get("statuscode"));
						button.setStatusname((String)map.get("statusname"));
						buttonlist.add(button);
					}
					vo.setButtonlist(buttonlist);
				}
				list.add(vo);
			}
			return list;
		}
		private static List processLoginReturnVO14(List<Map> Object) {
			List list = new ArrayList();
			if(null != Object) {
				Map firstmap = Object.get(0);
				if(null!=firstmap){
					TaskBillVO vo = new TaskBillVO();
					vo.setStyle((String)firstmap.get("style"));
					vo.setRowcnt((String)firstmap.get("rowcnt"));
					vo.setTitle((String)firstmap.get("title"));
					vo.setData(processDataVO((Map)firstmap.get("data")));
					List<Map> listMap = (List<Map>)firstmap.get("taskheader");
					if(null != listMap) {
						List<RowVO> listRow = new ArrayList<RowVO>();
						Iterator<Map> iter = listMap.iterator();
						while(iter.hasNext()) {
							
							List<Map> listMap3 = (List<Map>)iter.next().get("row");
							if(null != listMap3) {
								for(Map map3 : listMap3) {
									RowVO row = processRowVO(map3);
									listRow.add(row);
								}
							}
						}
						vo.setListrow(listRow);
				}
				list.add(vo);
			}
			}
			return list;
		}
		private static List processLoginReturnVO15(Map object) {
			List list = new ArrayList();
			if(null != object) {
				AttachmentListVO vo = new AttachmentListVO();
				List<Map> listmap = (List<Map>)object.get("attachment");
				if(null != listmap) { 
					List<AttachmentVO> attachmentlist = new ArrayList<AttachmentVO>();
					Iterator<Map> iter = listmap.iterator();
					List<SOBillVO> materialLists = new ArrayList<SOBillVO>();
					while(iter.hasNext()) {
						Map map = iter.next();
						AttachmentVO attachment = new AttachmentVO();
						attachment.setFileid((String)map.get("fileid"));
						attachment.setFiletype((String)map.get("filetype"));
						attachment.setFilesize((String)map.get("filesize"));
						attachment.setFilename((String)map.get("filename"));
						attachment.setDownflag((String)map.get("downflag"));
						attachmentlist.add(attachment);
					}
					vo.setAttachmentlist(attachmentlist);
				}
				list.add(vo);
			}
			return list;
		}
		private static List processLoginReturnVO16(Map object) {
			List list = new ArrayList();
			if(null != object) {
				TaskActionListVO vo = new TaskActionListVO();
				vo.setHint(object.get("hint")!=null?(String)object.get("hint"):"");
				List<Map> listmap = (List<Map>)object.get("actionstruct");
				if(null != listmap) { 
					List<TaskActionVO> actionlist = new ArrayList<TaskActionVO>();
					Iterator<Map> iter = listmap.iterator();
					List<SOBillVO> materialLists = new ArrayList<SOBillVO>();
					while(iter.hasNext()) {
						Map map = iter.next();
						TaskActionVO ation = new TaskActionVO();
						ation.setActflag((String)map.get("actflag"));
						ation.setCode((String)map.get("code"));
						ation.setName((String)map.get("name"));
						
						actionlist.add(ation);
					}
					vo.setAction(actionlist);
				}
				list.add(vo);
			}
			return list;
		}
		@SuppressWarnings("unchecked")
		private static List processLoginReturnVO17(Map object) {
			
			List list = new ArrayList();
			if(null != object) {
				ApprovedDetailVO vo = new ApprovedDetailVO();
				vo.setBillname((String)object.get("billname"));
				vo.setBilltypename((String)object.get("billtypename"));
				vo.setCode((String)object.get("code"));
				vo.setPsnid((String)object.get("psnid"));
				vo.setSubmitdate((String)object.get("submitdate"));
				vo.setTitle((String)object.get("title"));
				vo.setMakername((String)object.get("makername"));
				List<Map> listmap = (List<Map>)object.get("approvehistoryline");
				if(null != listmap) { 
					List<ApproveHistoryVO> approvedetaillist = new ArrayList<ApproveHistoryVO>();
					Iterator<Map> iter = listmap.iterator();
					while(iter.hasNext()) {
						Map map = iter.next();
						ApproveHistoryVO approvehistory = new ApproveHistoryVO();
						
						approvehistory.setApprovedid((String)map.get("approvedid"));
						approvehistory.setCode((String)map.get("code"));
						approvehistory.setHanderdate((String)map.get("handerdate"));
						approvehistory.setHandername((String)map.get("handername"));
						approvehistory.setNote((String)map.get("note"));
						approvehistory.setPsnid((String)map.get("psnid"));
						approvehistory.setAction((String)map.get("action"));
						
						approvedetaillist.add(approvehistory);
					}
					vo.setList(approvedetaillist);
				}
				list.add(vo);
			}
			return list;
		}
		@SuppressWarnings("unchecked")
		private static List processLoginReturnVO18(Map object) {
//			[{psnstructlist={psnstruct=[{id=e2d5d99f-ae48-11e2-b10f-8d5b9bd4c55a, code=, name=lm}]}}]
			List list = new ArrayList();
			if(null != object) {
				UserListVO vo = new UserListVO();
				List<Map> listmap = (List<Map>)object.get("psnstruct");	
				if(null != listmap) { 
					
					List<UserVO> UserList = new ArrayList<UserVO>();
					Iterator<Map> iter = listmap.iterator();
					while(iter.hasNext()) {
						Map map = iter.next();
						UserVO userVO = new UserVO();
						userVO.setPsnid((String)map.get("id"));
						userVO.setPsncode((String)map.get("code"));
						userVO.setPsnname((String)map.get("name"));

						UserList.add(userVO);
					}
					vo.setUser(UserList);
		
				}
				list.add(vo);
			}
			return list;
		}
		@SuppressWarnings("unchecked")
		private static List processLoginReturnVO19(Map object) {
//			[{psnstructlist={psnstruct=[{id=e2d5d99f-ae48-11e2-b10f-8d5b9bd4c55a, code=, name=lm}]}}]
			List list = new ArrayList();
			if(null != object) {
				RejectNodeListVO vo = new RejectNodeListVO();
				List<Map> listmap = (List<Map>)object.get("psnstruct");	
				if(null != listmap) { 
					
					List<RejectVO> rejectUserList = new ArrayList<RejectVO>();
					Iterator<Map> iter = listmap.iterator();
					while(iter.hasNext()) {
						Map map = iter.next();
						RejectVO rejectVO = new RejectVO();
						rejectVO.setId((String)map.get("id"));
						rejectVO.setNodename((String)map.get("name"));
						rejectVO.setNodeid((String)map.get("code"));
						rejectUserList.add(rejectVO);
					}
					vo.setReject(rejectUserList);	
		
				}
				list.add(vo);
			}
			return list;
		}
		@SuppressWarnings("unchecked")
		private static List processLoginReturnVO20(Map object) {
//			[{person={pname=雷鸣, contactinfo=[{propname=手机, msgtype=0, propvalue=13800138000}, {propname=办公电话, msgtype=1, propvalue=123456}, {propname=家庭电话, msgtype=2, propvalue=654321}, {propname=电子邮件, msgtype=3, propvalue=leiming1@yonyou.com}]}}]
			List list = new ArrayList();
			if(null != object) {
				nc.vo.oa.component.taskcenter.PersonDetailVO vo = new nc.vo.oa.component.taskcenter.PersonDetailVO();
				vo.setCompany((String)object.get("company"));
				vo.setDepartment((String)object.get("department"));
				vo.setDesc((String)object.get("pdes"));
				vo.setPname((String)object.get("pname"));
				vo.setTitle((String)object.get("title"));

				List<Map> listmap = (List<Map>)object.get("contactinfo");
				if(null != listmap) { 
					List<nc.vo.oa.component.taskcenter.ContactInfoVO> contactinfolist = new ArrayList<nc.vo.oa.component.taskcenter.ContactInfoVO>();
					Iterator<Map> iter = listmap.iterator();
					while(iter.hasNext()) {
						Map map = iter.next();
						nc.vo.oa.component.taskcenter.ContactInfoVO contactInfoVO = new nc.vo.oa.component.taskcenter.ContactInfoVO();
						contactInfoVO.setMsgtype((String)map.get("msgtype"));
						contactInfoVO.setPropname((String)map.get("propname"));
						contactInfoVO.setPropvalue((String)map.get("propvalue"));
						contactinfolist.add(contactInfoVO);
					}
					vo.setContactinfo(contactinfolist);	
				}
				list.add(vo);
			}
			return list;
		}
		@SuppressWarnings("unchecked")
		private static List processLoginReturnVO21(Map object) {
			List list = new ArrayList();
			if(null != object) {
		
				SearchConditionVO vo = new SearchConditionVO();
					vo.setConditiondesc((String)object.get("conditiondesc"));
					list.add(vo);
			}
			return list;
		}
		@SuppressWarnings("unchecked")
		private static List processLoginReturnVO98(Map map) {
			List list = new ArrayList();
			list.add(map);
			return list;
		}
		private static List processLoginReturnVO99(Map object) {
			List list = new ArrayList();
			if(null != object) {
				GroupListVO vo = new GroupListVO();
				List<Map> listmap = (List<Map>)object.get("groupdata");
				if(null != listmap) {
					Iterator<Map> iter = listmap.iterator();
					List<GroupDataVO> materialLists = new ArrayList<GroupDataVO>();
					while(iter.hasNext()) {
						Map map = iter.next();
						GroupDataVO material = new GroupDataVO();
						material.setFathergroupid((String)map.get("fathergroupid"));
						material.setGroupcode((String)map.get("groupcode"));
						material.setGroupid((String)map.get("groupid"));
						material.setGroupname((String)map.get("groupname"));
						materialLists.add(material);
					}
					vo.setList(materialLists);
				}
				list.add(vo);
			}
			return list;
			
		}
		//处理DataVO
		private static DataVO processDataVO(Map dataMap) {
			DataVO dataVO = null;
			if(null != dataMap) {
				dataVO = new DataVO();
				
				//处理LIst<RowVO>
				List<Map> listMap2 = (List<Map>)dataMap.get("row");
				if(null != listMap2) {
					List<RowVO> listRow = new ArrayList<RowVO>();
					for(Map mapTemp2 : listMap2) {
						listRow.add(processRowVO(mapTemp2));
						//dataVO.setRow(listRow);
					}
					dataVO.setRow(listRow);
				}
				
				//处理content
				dataVO.setContent((String)dataMap.get("content"));
			}
			return dataVO;
		}
}
