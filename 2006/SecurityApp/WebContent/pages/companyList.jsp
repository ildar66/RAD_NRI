<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.nri.security.forms.*, com.nri.value.*"%> 
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Компании</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 

<% 
	java.lang.String gColSpan = "6";
	CompanyListForm listForm = (CompanyListForm)session.getAttribute("CompanyListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.COMPANY_LIST);
	int posListSize = posList.size();//кол-во позиций.		
%>

<%
	boolean canEdit = request.isUserInRole("administrator");
%>
<H3 id='bread-crumb'>
	Компании &gt;
</H3><BR>

<html:form action="/companyList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1">

<%--TR class="layout-manager">
 <TD colspan="<%= gColSpan %>">
 
    <table class="framing-table">
     <TR>
       <td class="find-filter">&nbsp;</td>
       <td class="find-filter">&nbsp;</td>
     </TR>        
     </table>
    
  </TD>
</TR--%>

<july:separator colspan="<%= gColSpan %>" />

        <tr class="layout-manager">
          <td colspan="<%= gColSpan %>">
          <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
            <TR>
              <TD class="find-filter">
	              <% if(canEdit) { %>
	              	<%--july:addbutton page="/EditCompany.do?action=Add"/--%>
					<html:link page="/companyDialog.do?action=Add">
						<IMG SRC="/SecurityApp/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
					</html:link>		              	
	              <% } %>
	              <july:backbutton page="/main.do"/>
              </TD>
              <TD class="find-filter"><july:navigator/></TD>
            </TR>
            </TABLE>
           </td>
        </tr>
        
      <july:separator colspan="<%= gColSpan %>" />

        <!-- Table header -->
        <tr class="title">
        	<TD class="column-head-name">&nbsp;</TD>
			<TD class="column-head-name">Код</TD>
			<TD class="column-head-name">
				Наименование
				<INPUT TYPE='image'	src='<%=request.getContextPath()%>/images/refresh.gif' onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
			</TD>
			<TD class="column-head-name">Подразделения</TD>
			<TD class="column-head-name">Штат</TD>
<% if(canEdit) { %>
            <TD class="column-head-name">&nbsp;</TD>
<% } %>
        </tr>


<july:separator colspan="<%= gColSpan %>" />

    
        <!-- Table body -->
        <logic:iterate id="cl" name="<%=BeanKeys.COMPANY_LIST%>">
	      <logic:present name="cl">
            <tr id='<bean:write name="cl" property="company" filter="true"/>'
					class="normal" onMouseOver="className='select'"
					onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
				<td class="text">
                    <html:link page="/companyDialog.do?action=Edit" paramId="company" paramName="cl" paramProperty="company" paramScope="page">
             			<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>				
				</td>
                <td class="text">
                      <bean:write name="cl" property="company" filter="true"/>
                </td>
                <td class="text">
                    <%--july:editlink page="/EditCompany.do" action='<%=(canEdit?"Edit":"View")%>' paramId="company" paramName="cl" paramProperty="company" paramScope="page"--%>
             			<bean:write name="cl" property="name" filter="true"/>
                    <%--/july:editlink--%>
                </td>
                <td class="text">
                    <html:link page="/divisionList.do" paramId="company" paramName="cl" paramProperty="company" paramScope="page">
                        Подразделения</html:link>
                </td>
                <td class="text">
                	<html:link page="/workerList.do" paramId="company" paramName="cl" paramProperty="company" paramScope="page">
                        Штат</html:link>
                </td>
<% if(canEdit) { %>
                <td class="text">
                   <%--july:delbutton page="/EditCompany.do?action=Delete" paramId="company" paramName="cl" paramProperty="company" paramScope="page"/--%>
					<html:link page="/companyDialog.do?action=Delete" paramId="company" paramName="cl"	paramProperty="company" paramScope="page">
						<IMG SRC="/SecurityApp/images/del.gif" BORDER='0' ALT='Удалить запись'/>
					</html:link>                    
                </td>
<% } %>
            </tr>

            <july:separator colspan="<%= gColSpan %>" />

	      </logic:present>
        </logic:iterate>

        <tr class="layout-manager">
          <td colspan="<%= gColSpan %>">
          <TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
            <TR>
              <TD class="find-filter">
	              <% if(canEdit) { %>
	              	<%--july:addbutton page="/EditCompany.do?action=Add"/--%>
					<html:link page="/companyDialog.do?action=Add">
						<IMG SRC="/SecurityApp/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
					</html:link>		              	
	              <% } %>
	              <july:backbutton page="/main.do"/>
              </TD>
              <TD class="find-filter"><july:navigator/></TD>
            </TR>
            </TABLE>
           </td>
        </tr>
        
      <july:separator colspan="<%= gColSpan %>" />
      
    </table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	//window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>