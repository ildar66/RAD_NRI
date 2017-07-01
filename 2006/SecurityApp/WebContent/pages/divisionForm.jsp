<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ page import="com.nri.domain.*, com.nri.value.*" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>

	<TITLE>Подразделения</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
	String form = "DivisionDialogForm";
	String src = request.getContextPath() + "/images/save.gif";
	String alt = "Сохранить запись";
	java.util.List typesList = DivisionType.TYPE_LIST;
	pageContext.setAttribute("typesList", typesList);
	String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes";
%>

<H3 id='bread-crumb'>
	<html:link page="/companyList.do">Компании</html:link> &gt;
	<html:link page="/divisionList.do" paramId="company" paramName="<%= form%>" paramProperty="vo.company" paramScope="request">
		Подразделения компании <I><bean:write name="<%= form%>" property="companyVO.name"/></I></html:link>  &gt;
	<bean:write name="<%= form%>"/> :
</H3><br>

	<table class="framing-table">
		<tr>
			<th class="find-filter">
				Компания:
				<br>
				   	<html:link page="/divisionList.do" paramId="company" paramName="<%= form %>" paramProperty="companyVO.company" paramScope="request">
                		<I><bean:write name="<%= form%>" property="companyVO.name"/></I></html:link>
			</th>
			<logic:present name="<%=BeanKeys.ENCLOSER_HIERARCHY%>">
			<td class="find-filter" colspan="2">
				<UL>
				<logic:iterate id="dir" name="<%=BeanKeys.ENCLOSER_HIERARCHY%>"
					type="com.nri.domain.Division">
					<logic:present name="dir">
						<UL><LI>
							<html:link page="/divisionDialog.do?action=Edit" paramId="division"
								paramName="dir" paramProperty="division" paramScope="page">
								<bean:write name="dir" property="type" filter="true" />: <I><bean:write
									name="dir" property="name" filter="true" /></I>
							</html:link>
						</LI>
					</logic:present>
					<br>
				</logic:iterate> 
				</UL>		           						
			</td>
			</logic:present>
		</tr>			
	</table>	    
			
<html:form action="/divisionProcess.do">
<html:errors/>
<html:hidden property="action"/>
<html:hidden property="forwardName"/>
<html:hidden property="company"/>
<html:hidden property="encloser"/>

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
		document.cookie = "DivisionListForm=" + document.<%= form %>['vo.division'].value;
		document.cookie = "DivisionHierarchyListForm=" + document.<%= form %>['vo.division'].value;
	}	
</script>

<table class="wizard-table" border="0" cellpadding="3" cellspacing="0">
    <%--tr class="title">
    	<td class="title" colspan="2">
           <html:link page="/ShowCompanyList.do" styleClass="navigator"><bean:message key="label.companies"/></html:link> 
           <july:sepmark/>
           <html:link page="/ShowDirectionList.do" styleClass="navigator"><bean:message key="label.directions"/></html:link> 
           <july:sepmark/>
           <july:actionname/></td>
    </tr--%>
    
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
        <td class="text"><%--bean:message key="label.code"/--%>Код:</td>
        <td class="text">
          	<html:text property="vo.division" styleId="division" size="5" readonly="true"/>
        </td>
    </tr>
    
    <tr>
        <td class="text"><%--bean:message key="label.code"/--%>Тип:</td>
        <td class="text">
			<html:select property="type" styleId="type" style="width:120; font-size:9pt">
				<html:options collection="typesList" property="type" labelProperty="typeName"/>
			</html:select>
        </td>
    </tr>    
    
    <tr>
        <td class="text"><%--bean:message key="label.name"/--%>Наименование:</td>
        <td class="text">
          <html:text property="vo.name" size="25" />
        </td>
    </tr>
    
    <tr>
        <td class="text"><%--bean:message key="label.division.shortname"/--%>Краткое наименование:</td>
        <td class="text">
          <html:text property="vo.shortName" size="25" />
        </td>
    </tr>
    
    <tr>
        <td class="text"><%--bean:message key="label.division.boss"/--%>Руководитель:</td>
        <td class="text">
          <html:text property="boss" styleId="boss" size="5" readonly="true" />
          <html:text property="bossName" styleId="bossName" size="10"  />
          <%--july:lookupbutton action="/ShowWorkerLookupList.do" styleId="wlp" onclick="set_opt_params_wlp('?searchby=D&divcode='+document.all.division.value)" fieldNames="boss;bossname"  /--%>
          <%--html:text size="30" property="bossname" styleId="bossname"/--%>
          <logic:notEqual name="<%= form %>" property="action" value="Add">
			 <A href='<%=request.getContextPath()%>/workerLookupList.do?formName=<%= form %>&fieldNames=boss|bossName' onclick='return openDialog(this.href + "&division=" + document.all.division.value, "workerLookupList", "<%= dialogProperty%>");'><IMG SRC="<%=request.getContextPath()%>/images/more.gif" BORDER='0' ALT='Справочник работников'></A>
	  	  </logic:notEqual>
          <logic:equal name="<%= form %>" property="action" value="Add">
			 <A href='<%=request.getContextPath()%>/workerLookupList.do?formName=<%= form %>&fieldNames=boss|bossName' onclick='return openDialog(this.href + "&company=" + document.all.company.value, "workerLookupList", "<%= dialogProperty%>");'><IMG SRC="<%=request.getContextPath()%>/images/more.gif" BORDER='0' ALT='Справочник работников'></A>
	  	  </logic:equal>	  	  	
        </td>
    </tr>
	
    <tr>
        <td class="text"><%--bean:message key="label.division.active"/--%>Активное:</td>
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

