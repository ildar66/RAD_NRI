<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%--@ page import="com.hps.july.web.util.*,com.hps.july.security.*" --%>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>

	<TITLE>Работник предприятия</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
	String form = "WorkerDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
	boolean admin = request.isUserInRole("administrator");	
	String updatable = String.valueOf(admin);
	String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes";
%>

<H3 id='bread-crumb'>
<logic:equal name="<%= form%>" property="forwardName" value="peopleStaffList">
	<html:link page="/peopleList.do">Физические лица</html:link> &gt;
	<html:link page="/peopleStaffList.do" paramId="man" paramName="<%= form%>" paramProperty="peopleVO.man" paramScope="request">	
		 Штат для: <I><bean:write name="<%= form%>" property="peopleVO.name"/></I></html:link>  &gt;
</logic:equal>
<logic:equal name="<%= form%>" property="forwardName" value="workerList">
	<html:link page="/companyList.do">Компании</html:link> &gt;
	<html:link page="/workerList.do" paramId="company" paramName="<%= form%>" paramProperty="vo.company" paramScope="request">
		Штат компании <I><bean:write name="<%= form%>" property="companyVO.name"/></I></html:link>  &gt;
</logic:equal>
<logic:equal name="<%= form%>" property="forwardName" value="workerHierarchyList">
	<html:link page="/companyList.do">Компании</html:link> &gt;
	<html:link page="/workerList.do" paramId="company" paramName="<%= form%>" paramProperty="vo.company" paramScope="request">
		Штат компании <I><bean:write name="<%= form%>" property="companyVO.name"/></I></html:link>  &gt;
</logic:equal>		
	<bean:write name="<%= form%>"/> :
</H3><BR>

<html:form action="/workerProcess.do">
<html:errors/>
<html:hidden property="action"/>
<html:hidden property="forwardName"/>
<html:hidden property="vo.isOur"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>
<SCRIPT language=javascript src="/SecurityApp/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['man'], 'ФИО',0,true)) return false;
			if(!field_check(theForm['vo.workPosition'], 'Должность',0,true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "WorkerListForm=" + document.<%= form %>['vo.worker'].value;
		document.cookie = "WorkerHierarchyListForm=" + document.<%= form %>['vo.worker'].value;
		document.cookie = "PeopleStaffListForm=" + document.<%= form %>['vo.worker'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="2" cellspacing="0">
    
    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
        </td>
    </tr> 
    
    <tr>
        <td class="text"><%--bean:message key="label.code"/--%>* Код:</td>
        <td class="text">
           <html:text property="vo.worker" size="5" readonly="true"/>
        </td>
    </tr>
    
    <tr>
        <td class="text"><%--bean:message key="label.people.fullname"/--%>* ФИО:</td>
        <td class="text">
          <html:text property="man" styleId="man" size="5" readonly="true"/>
          <html:text property="peopleVO.name" styleId="peopleName" size="30" readonly="true"/>
          <%--july:lookupbutton action="/ShowPeopleLookupList.do" styleId="wkl" fieldNames="man;manname" insertable="true" updatable="<%=updatable%>" />
          <html:text size="50" property="manname" styleId="manname" insertable="false" updatable="false" /--%>
          <A href='<%=request.getContextPath()%>/peopleLookupList.do?formName=<%= form %>&fieldNames=man|peopleName' onclick='return openDialog(this.href + "&name=<bean:write name="<%= form%>" property="peopleVO.lastName"/>" , "peopleLookupList", "<%= dialogProperty%>");'><IMG SRC="<%=request.getContextPath()%>/images/more.gif" BORDER='0' ALT='Справочник физических лиц'></A>
        </td>
    </tr>
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.workposition"/--%>* Должность:</td>
        <td class="text">
          <html:text property="vo.workPosition" styleId="wp" size="5" readonly="true"/>
          <html:text property="workPositionVO.name" styleId="workPositionName" size="30" readonly="true"/>
          <%--july:lookupbutton action="/ShowWorkPositionLookupList.do" styleId="wpl" fieldNames="wp;wpname" insertable="true" updatable="<%=updatable%>" />
          <html:text size="50" property="workpositionname" styleId="wpname" insertable="false" updatable="false" /--%>
          <A href='<%=request.getContextPath()%>/workPositionLookupList.do?formName=<%= form %>&fieldNames=wp|workPositionName' onclick='return openDialog(this.href + "&searchStr=" + document.all.workPositionName.value, "workPositionLookupList", "<%= dialogProperty%>");'><IMG SRC="<%=request.getContextPath()%>/images/more.gif" BORDER='0' ALT='Справочник должностей'></A>          
        </td>
    </tr>
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.lotusaddress"/--%>Адрес Lotus Notes:</td>
        <td class="text">
        	<html:text property="vo.lotusAddress" size="35"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.email"/--%>Email:</td>
        <td class="text">
        	<html:text property="vo.email" size="35"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.phone1"/--%>Телефон 1:</td>
        <td class="text">
          <html:text property="vo.phone1" size="25"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.phone2"/--%>Телефон 2:</td>
        <td class="text">
          <html:text property="vo.phone2" size="25"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.localphone"/--%>Локальный номер:</td>
        <td class="text">
          <html:text property="vo.localPhone" size="25"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.fax"/--%>Факс:</td>
        <td class="text">
          <html:text property="vo.fax" size="25"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.mobilephone"/--%>Мобильный:</td>
        <td class="text">
          <html:text property="vo.mobilePhone" size="25"/>
        </td>
    </tr>
    
    
	
    <tr>
        <td class="text"><%--bean:message key="label.worker.isservicestuff"/--%>Выездной:</td>
        <td class="text">
        	<html:checkbox property="vo.isServiceStuff"/>
        	<html:hidden property="vo.isServiceStuff" value="N"/>
        </td>
    </tr>
    
    <tr>
        <td class="text"><%--bean:message key="label.worker.isenabled"/--%>Разр/Запр:</td>
        <td class="text">
        	<html:checkbox property="vo.isActive"/>
        	<html:hidden property="vo.isActive" value="N"/>   
        </td>
    </tr>

    <tr>
        <td class="text"><%--bean:message key="label.company.name"/--%>Компания:</td>
        <td class="text">
          <%--html:text property="company" styleId="cmp" size="5"/>
          <html:text property="companyVO.name" styleId="companyName" size="10"  />
          <july:lookupbutton action="/ShowCompanyLookupList.do" styleId="cmpl" fieldNames="cmp;cmpname" insertable="true" updatable="<%=updatable%>" />
          <html:text size="50" property="companyname" styleId="cmpname" insertable="false" updatable="false" /--%>
			<html:select property="company">
				<html:option value="">___________</html:option>
				<html:options collection="<%= com.nri.value.BeanKeys.COMPANIES%>" property="company"	labelProperty="name"></html:options>
			</html:select>          
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--bean:message key="label.division.name"/--%>Подразделение:</td>
        <td class="text">
          <html:text property="division" styleId="div" size="5" readonly="true"/>
          <html:text property="divisionVO.name" styleId="divisionName" size="30" readonly="true"/>
          <%--july:lookupbutton action="/divisionLookup.do" styleId="divl" fieldNames="div;divname" onclick="set_opt_params_divl('?company='+document.all.cmp.value+'&division='+document.all.div.value)" insertable="true" updatable="<%=updatable%>" />
          <html:text size="50" property="divisionname" styleId="divname" insertable="false" updatable="false" /--%>
          <A href='<%=request.getContextPath()%>/divisionLookupList.do?formName=<%= form %>&fieldNames=div|divisionName' onclick='return openDialog(this.href + "&searchStr=" + document.all.divisionName.value + "&company=" + document.all.company.value, "divisionLookupList", "<%= dialogProperty%>");'><IMG SRC="<%=request.getContextPath()%>/images/more.gif" BORDER='0' ALT='Справочник подразделений'></A>          
        </td>
    </tr>
    
    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
        </td>
    </tr> 
    
</table>

</html:form>

</BODY>
</HTML>
