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

	<TITLE>Оператор NRI</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
	String form = "OperatorDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
	//String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes";
%>

<H3 id='bread-crumb'>
	<html:link page="/peopleList.do">Физические лица</html:link> &gt;
	<html:link page="/operatorList.do" paramId="man" paramName="<%= form%>" paramProperty="vo.man" paramScope="request">
		Операторы для: <I><bean:write name="<%= form%>" property="peopleVO.name"/></I></html:link>  &gt;
	<bean:write name="<%= form%>"/> :
</H3><BR>

<html:form action="/operatorProcess.do">
<html:errors/>
<html:hidden property="action"/>
<html:hidden property="forwardName"/>

<logic:equal name="<%= form %>" property="action" value="Delete">
		<% src = request.getContextPath() + "/images/delconf.gif"; alt = "Удалить запись"; %>
</logic:equal>
<SCRIPT language=javascript src="/SecurityApp/common/validate.js" type="text/javascript"></SCRIPT> 
<script language="javascript">
	function Check(){
		var theForm = document.<%= form %>;
		with(theForm){
			if(!field_check(theForm['vo.loginID'], 'Оператор',0,true)) return false;
			if(!field_check(theForm['vo.password'], 'Пароль',0,true)) return false;
		}
		storeID();
		return true;
	}
	function storeID() {
		document.cookie = "OperatorListForm=" + document.<%= form %>['vo.operator'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="5" cellspacing="0">
    
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
        <td class="text"><%--bean:message key="label.people.lastname"/--%>Фамилия:</td>
        <td class="text">
        	<bean:write name="<%= form%>" property="peopleVO.name"/>
        	<html:hidden property="man"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--july:reqmark><bean:message key="label.code"/>:</july:reqmark--%>* Код:</td>
        <td class="text">
            <%--july:string property="vo.operator" size="5" insertable="false" updatable="false" /--%>
            <html:text property="vo.operator" size="10" readonly="true"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--july:reqmark><bean:message key="label.operator.loginid"/>:</july:reqmark--%>* Оператор:</td>
        <td class="text">
            <%--july:string property="login" size="25" insertable="true" updatable="true" /--%>
            <html:text property="vo.loginID" size="10"/>
        </td>
    </tr>
    
    
    
    <tr>
        <td class="text"><%--july:reqmark><bean:message key="label.operator.password"/>:</july:reqmark--%>* Пароль:</td>
        <%--td>
        	<logic:present name="OperatorForm" property="notInCipherPassword">
        	    <july:string property="notInCipherPassword" size="25" insertable="true" updatable="true"/>
        	</logic:present>
        	<logic:notPresent name="OperatorForm" property="notInCipherPassword">
        	    <july:string property="notInCipherPassword" value="********" size="25" disabled="true"/>
        	</logic:notPresent>
       	    &nbsp;&nbsp;
       	    <logic:notEqual name="OperatorForm" property="action" value="Delete">
	       	    <INPUT TYPE="IMAGE" NAME="generatePassword" SRC="/images/izmena.gif" ALT='Изменить пароль'/>        	
        	</logic:notEqual>
        </td--%>
        <td class="text"><html:password property="vo.password" size="10"/></td>
    </tr>
    
    
    
    <tr>
        <td class="text">Логин MicroStrategy:</td>
        <td class="text">
			<html:select property="msuCode">
				<html:option value="">_________</html:option>
				<html:options collection="<%= com.nri.value.BeanKeys.MS_USERS%>" property="msuCode"	labelProperty="msUser"></html:options>
			</html:select>			
        </td>
    </tr>
    
    <tr>
        <td class="text">Сервер TerraByte:</td>
        <td class="text">
			<html:select property="idTerrabyteServer">
				<html:option value="">_________</html:option>
				<html:options collection="<%= com.nri.value.BeanKeys.TERRABYTE_SERVERS%>" property="id" labelProperty="location"></html:options>
			</html:select>			
        </td>
    </tr>    

    <tr>
        <td class="text">Разр/Запр:</td>
        <td class="text">
        	<html:checkbox property="vo.isEnabled"/>
        	<html:hidden property="vo.isEnabled" value="N"/>   
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

