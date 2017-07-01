<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ page import="com.nri.security.forms.*" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<SCRIPT language=javascript src="/SecurityApp/common/validate.js" type="text/javascript"></SCRIPT> 
	<TITLE>Роли</TITLE>
</HEAD>
<BODY class="content">

<% java.lang.String gColSpan = "2"; %>

<%
	String form = "RoleDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<html:errors property="org.apache.struts.action.GLOBAL_ERROR"/>

<html:form action="/roleProcess.do" styleId="<%= form %>" focus="sortOrder">
<html:hidden property="action"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>

<script language="javascript">
	function Close()
		{
			if(window.opener) {
				opener.storeSelectedRow(document.all.role.value);
				//opener.location.reload(true);
				window.opener.window.document.forms(0).submit();
				//window.opener.window.location.href=window.opener.window.location.href;
				window.opener.focus();
			}
			window.close();
		}
	function Check()
	{
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm.role, 'Код', 0, true)) return false;
			if(!field_check(theForm.rolename, 'Роль', 0, true)) return false;
			if(!field_check(theForm.sortOrder, 'Номер сортировки', 3, true)) return false;			
			//if(!field_check(theForm.planSumStr,'Планируемая стоимость',6,true)) return false;
			//if(!field_check(theForm['to.vo.owner'], 'Инициатор(из справочника)',0,true)) return false;
			//if(!field_check(theForm.otherMan, 'Кто принимал', 0, true)) return false;
		}
		return true;
	}
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">


    <tr>
    	<td class="column-head-name" colspan="<%= gColSpan %>">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			&nbsp;<july:closebutton page="/"/>
        </td>
    </tr>


    <%--tr>
        <td class="title" colspan="<%= gColSpan %>"><july:actionalert/></td>
    </tr--%>

	
	<tr>
		<td class="text"><july:reqmark>Код:</july:reqmark></td> 
		<td class="text" nowrap="nowrap">
			<html:text size="25" property="vo.role" styleId="role"/>&nbsp;&nbsp;&nbsp;
			№ сортировки: <html:text size="5" style="width: 40pt" property="vo.sortOrder" styleId="sortOrder"/>
		</td>
    </tr>
    
	
	<tr>
		<td class="text"><july:reqmark>Роль:</july:reqmark></td> 
		<td class="text">
			<html:text size="40" style="width: 300pt" property="vo.roleName" styleId="rolename"/>
			<%--Дата:<july:date property="dateActStr" size="20" insertable="true" updatable="true" required="false" styleId="dateActStr"/> --%>
		</td>
    </tr>
    
	
	<tr>
		<td class="text">Модуль:</td> 
		<td class="text">
			<html:text size="40" style="width: 300pt" property="vo.taskComment" styleId="taskComment"/>
			<%--Дата:<july:date property="dateActStr" size="20" insertable="true" updatable="true" required="false" styleId="dateActStr"/> --%>
		</td>
    </tr>
    
	
	<tr>
		<td class="text" colspan="2">
			&nbsp;<B style="text-align: center;">Описание:<B>
			&nbsp;<html:textarea style="width: 460;" cols="30" rows="6" property="vo.comment"/>		
		</td>
    </tr>           
    

    <tr>
    	<td class="column-head-name" colspan="<%= gColSpan %>">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
			&nbsp;<july:closebutton page="/"/>
        </td>
    </tr>

	
</table>

<logic:equal name="<%=form%>" property="flagOperation" value="true">
	<script language="javascript" type="text/javascript">
		 Close();
	</script>
</logic:equal>

</html:form>

</BODY>
</HTML>