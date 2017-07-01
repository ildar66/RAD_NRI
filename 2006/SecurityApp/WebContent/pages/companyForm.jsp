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

	<TITLE>Компании</TITLE>
</HEAD>
<BODY class="content">
<%
	String form = "CompanyDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
%>

<H3 id='bread-crumb'><html:link page="/companyList.do" styleClass="navigator">Компании</html:link> &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

<html:form action="/companyProcess.do">
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
			if(!field_check(theForm['vo.shortName'], 'Краткое наименование',0,true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "CompanyListForm=" + document.<%= form %>['vo.company'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">
    
	<%--july:formbuttons/--%>
    <tr class="title">
    	<td class="column-head-name" colspan="2">
    		<logic:notEqual name="<%= form %>" property="action" value="View">    	
				<INPUT TYPE="IMAGE" NAME="submit" SRC="<%= src%>"  ALT="<%= alt %>" onclick="return Check();">
			</logic:notEqual>
        </td>
    </tr>

    <tr>
        <td class="title" colspan="2"><july:actionalert/></td>
    </tr>
    
    <tr>
        <td class="text"><july:reqmark>Код:</july:reqmark></td>
        <td class="text">
           <html:text property="vo.company" size="5" readonly="true" />
        </td>
    </tr>
    
    <tr>
        <td class="text"><july:reqmark>Наименование:</july:reqmark></td>
        <td class="text">
          <html:text property="vo.name" size="35" />
        </td>
    </tr>
    
    <tr>
        <td class="text"><july:reqmark>Краткое наименование:</july:reqmark></td>
        <td class="text">
          <html:text property="vo.shortName" size="35" />
        </td>
    </tr>

	<%--july:formbuttons/--%>
    <tr class="title">
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
