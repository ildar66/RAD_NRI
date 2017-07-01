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

	<TITLE>Должности</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "WorkPositionDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'>
	<html:link page="/workPositionList.do" styleClass="navigator">Должности</html:link>  &gt;
	<bean:write name="<%= form%>"/> :
</H3>
<br>
<html:form action="/workPositionProcess.do">
<html:errors/>
<html:hidden property="action"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>
<SCRIPT language=javascript src="/SecurityApp/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['vo.name'], 'Наименование',0,true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "WorkPositionListForm=" + document.<%= form %>['vo.workPosition'].value;
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

    <tr>
        <td class="text"><july:reqmark>Код<%--bean:message key="label.code"/--%>:</july:reqmark></td>
        <td class="text">
          <html:text property="vo.workPosition" size="5" readonly="true"/>
        </td>
    </tr>
    
    <tr>
        <td class="text"><july:reqmark>Наименование<%--bean:message key="label.name"/--%>:</july:reqmark></td>
        <td class="text">
          <html:text property="vo.name" size="35" />
        </td>
    </tr>
	
    <tr>
        <td class="text"><july:reqmark>Активная<%--bean:message key="label.workposition.active"/--%>:</july:reqmark></td>
        <td class="text">
        	<html:checkbox property="vo.isActive"/>
        	<html:hidden property="vo.isActive" value="N"/>        	
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

</BODY>
</HTML>
