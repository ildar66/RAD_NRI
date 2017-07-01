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

	<TITLE>Пользователь MS</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "MsUserDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'><html:link page="/msUserList.do" styleClass="navigator">Пользователи MS</html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/msUserProcess.do">
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
			if(!field_check(theForm['vo.msUser'], 'Логин',0,true)) return false;
			if(!field_check(theForm['vo.msPassword'], 'Пароль',0,true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "MsUserListForm=" + document.<%= form %>['vo.msuCode'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">

    <tr>
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
        </td>
    </tr>

	<tr>
		<td colspan="2">
			<table>
			    <tr>
			        <td class="text" colspan="2">Код :</td>
			        <td class="text">
			          <html:text property="vo.msuCode" size="5" readonly="true"/>
			        </td>
			    </tr>

			    <tr>
			        <td class="text" colspan="2">Логин :</td>
			        <td class="text">
			          <html:text property="vo.msUser" size="25" />
			        </td>
			    </tr>

			    <tr>
			        <td class="text" colspan="2">Пароль :</td>
			        <td class="text">
			          <html:text property="vo.msPassword" size="25" />
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

</BODY>
</HTML>