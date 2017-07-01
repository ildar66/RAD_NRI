<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>

	<TITLE>Физические лица</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "PeopleDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'>
	<html:link page="/peopleList.do" styleClass="navigator">Физические лица</html:link>  &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/peopleProcess.do" focus="vo.lastName">
<html:errors/>
<html:hidden property="action"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>
<SCRIPT language=javascript src="/SecurityApp/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check()
	{
		var theForm = document.<%= form %>;
		with(theForm){
			<logic:notEqual name="<%= form %>" property="action" value="Delete">
				if(!field_check(theForm['vo.lastName'], '<bean:message key="label.people.lastname"/>', 0, true)) return false;
				if(!field_check(theForm.passportDate, '<bean:message key="label.people.passport.date"/>', 7, false)) return false;
				//if(!field_check(theForm.rolename, 'Роль', 0, true)) return false;
				//if(!field_check(theForm.sortOrder, 'Номер сортировки', 3, true)) return false;			
				//if(!field_check(theForm.planSumStr,'Планируемая стоимость',6,true)) return false;
				//if(!field_check(theForm['to.vo.owner'], 'Инициатор(из справочника)',0,true)) return false;
				//if(!field_check(theForm.otherMan, 'Кто принимал', 0, true)) return false;
			</logic:notEqual>			
		}
		storeID();
		return true;
	}
	
	function storeID() {
		document.cookie = "PeopleListForm=" + document.<%= form %>['vo.man'].value;
	}
	
	function popCalInFrame(dateCtrl) {
		var w=gfPop;
		//w.gbFixedPos=true;	// enable fixed positioning
		//w.gPosOffset=[70,0];	// set position
		w.fPopCalendar(dateCtrl);	// pop calendar
	}		
</script>


<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">
   
	<%--july:formbuttons/--%>
    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
        </td>
    </tr>	
    
    

    <%--tr>
        <td class="title" colspan="2"><july:actionalert/></td>
    </tr--%>
    
    
	
	<tr>
		<td colspan="2">
			<table class="main">
			    <tr>
			        <td class="text" colspan="2">* <bean:message key="label.code"/>:</td>
			        <td class="text">
			          <html:text property="vo.man" size="5" readonly="true"/>
			        </td>
			    </tr>
			    
			    
			    
			    <tr>
			        <td class="text" colspan="2">* <bean:message key="label.people.lastname"/>:</td>
			        <td class="text">
			          <html:text property="vo.lastName" size="25" />
			        </td>
			    </tr>
			    
			    
			    
			    <tr>
			        <td class="text" colspan="2">* <bean:message key="label.people.firstname"/>:</td>
			        <td class="text">
			          <html:text property="vo.firstName" size="25"  />
			        </td>
			    </tr>
			    
			    
			    
			    <tr>
			        <td class="text" colspan="2">* <bean:message key="label.people.middlename"/>:</td>
			        <td class="text">
			          <html:text property="vo.middleName" size="25"  />
			        </td>
			    </tr>
			    
			    
			    
			    <tr>
			        <td class="text" width="11%"><bean:message key="label.people.passport"/>:</td>
					<td class="text" width="30%"><bean:message key="label.people.passport.ser"/></td>
			        <td class="text"><html:text property="vo.passportSer" size="25" /></td>
			    </tr>
			    
			    <tr>
			        <td class="text">&nbsp;</td>
					<td class="text"><bean:message key="label.people.passport.date"/></td>
			        <td class="text">
			        	<html:text property="passportDateStr" size="6" styleId="passportDate"/>
						<a href="javascript:void(0)" onclick="popCalInFrame(document.<%= form %>.passportDate);return false;" HIDEFOCUS>
							<img name="popcal" align="absbottom" src="/SecurityApp/images/calbtn.gif" width="34" height="22" border="0" alt=""></a>			
			        </td>
			    </tr>
				
			    <tr>
					<td class="text">&nbsp;</td>
					<td class="text"><bean:message key="label.people.passport.whom"/></td>
			        <td class="text"><html:text property="vo.passportWhom" size="25" /></td>
			    </tr>
				
				
				
			    <tr>
			        <td class="text" colspan="2">* <bean:message key="label.people.isactive"/>:</td>
			        <td class="text">
						<DIV class="edit"><html:radio property="vo.isActive"  value="true"><bean:message key="label.people.isactive.enabled"/></html:radio></DIV>
						<DIV class="edit"><html:radio property="vo.isActive"  value="false"><bean:message key="label.people.isactive.disabled"/></html:radio></DIV>
					</td>
			    </tr>
				
			</table>
		</td>
	</tr>
	
	
	
 	<%--july:formbuttons/--%>
    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
        </td>
    </tr>	
    
    

</table>

</html:form>
<!-- Opera 7.0 has a z-index bug that prevents the calendar panel from floating above the centerIframe.
A workaround is to move the <iframe> calendar tag from the page bottom to page top.
-->
<iframe width=174 height=189 name="gToday:normal:agenda.js" id="gToday:normal:agenda.js" src="/SecurityApp/calendar/ipopeng.jsp" scrolling="no" frameborder="0" style="visibility:visible; z-index:999; position:absolute; left:-500px; top:0px;">
</iframe>

</BODY>
</HTML>
