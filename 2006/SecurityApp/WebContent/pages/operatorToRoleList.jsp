<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.nri.security.forms.*, com.nri.value.*, com.nri.security.actions.*"%>

<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Роли для оператора</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
	java.lang.String gColSpan = "7";
	String dialogProperty = "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes";
	OperatorToRoleListForm listForm = (OperatorToRoleListForm)request.getAttribute("OperatorToRoleListForm");
	String sortBy = listForm.getOrderBy();
	//paging:
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.OPERATOR_TO_ROLE_ACCESS_LIST);
	int posListSize = posList.size();//кол-во позиций.
	int pageSize = (posListSize > 300)? 20 : 10 ;//кол-во позиций на странице.
	int pages = (posListSize%pageSize == 0) ? (posListSize/pageSize) : (posListSize/pageSize + 1);//кол-во страниц.	
%>
<H3 id='bread-crumb'>
	<html:link page="/peopleList.do">Физические лица</html:link> &gt;
	<html:link page="/operatorList.do" paramId="man" paramName="OperatorToRoleListForm" paramProperty="operatorVO.man" paramScope="request">
		Операторы для: <I><bean:write name="OperatorToRoleListForm" property="peopleVO.name"/></I></html:link>  &gt;
		Роли  &gt;
</H3><BR>

<html:form action="/operatorToRoleList.do" styleId="listForm">
<html:errors/>
<html:hidden property="operator"/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID"/>
<html:hidden property="operation" value=""/>

<%@include file="../secure/layouts/tableJS.jspf"%>

<script language="javascript">
//отображение страницы позиций:
var numEndRow = 1;
function showPage(page) {
	var posListSize = <%= posListSize%>;
	var pageSize = <%= pageSize%>;
	var end = tableID.rows.length - numEndRow;
	var start = end - posListSize;
	for(var i = start; i < end; i++){
		if(i >= start + (page-1)*pageSize && i < start + page*pageSize){
			tableID.rows[i].style.setAttribute("display", "block");			 
	 	}else{
			tableID.rows[i].style.setAttribute("display", "none");
		}
	}
	listForm.pageNumber.value = page;
}
//отображение всех страниц позиций:
function showAllPage() {
	var posListSize = <%= posListSize%>;
	var end = tableID.rows.length - numEndRow;
	var start = end - posListSize;
	for(var i = start; i < end; i++){
		tableID.rows[i].style.setAttribute("display", "block");			 
	}
	listForm.pageNumber.value = "все";
}
function DeleteLink(id) {
	if(confirm('Удалить роль '+ id +'?')) {
		document.body.style.cursor="wait";
		listForm.selectedID.value = id;
		listForm.operation.value = "<%= OperatorToRoleListAction.DELETE_LINK%>";
		listForm.submit();

		return false;
	}
}
function AddLink(id) {
	listForm.selectedID.value = id;
	listForm.operation.value = "<%= OperatorToRoleListAction.ADD_LINK%>";
	document.body.style.cursor="wait";
	listForm.submit();
}
</script>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">
	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<td class="find-filter">
						<B>ФИО :</B> <%= listForm.getPeopleVO().getName()%>
					</td>
					<td class="find-filter">
						<B>оператор :</B> <%= listForm.getOperatorVO().getLoginID()%>
					</td>
					<td class="find-filter">
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>					
					</td>
				</tr>							
			</table>
		</TD>
	</TR>
	
        <!-- Table header -->
        <tr class="title">
			<TD><%--july:backbutton page="/ShowOperatorList.do"/--%></TD>
			<%--TD><A href='Operator2roleDialog.do?action=Add' onclick='return openDialog(this.href, "Operator2roleDialog", "top=100, left=350, width=500, height=310, scrollbars=yes, resizable=yes");'><IMG SRC="/images/plus.gif" BORDER='0' ALT='Добавить роль'></A></TD--%>
			<TH class="text" colspan="<%= gColSpan %>">Текущие роли:</TH>
		</tr>

        <tr class="include">
        	<TD class="text" nowrap></TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю '№'" href="javascript:SortBy('sortOrder')">№</A>
				<%=isUp(sortBy, "sortOrder")%>
			</TD>        
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Код'" href="javascript:SortBy('role')">Код</A>
				<%=isUp(sortBy, "role")%>
			</TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Роль'" href="javascript:SortBy(' rolename')">Роль</A>
				<%=isUp(sortBy, " rolename")%>
			</TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Модуль'" href="javascript:SortBy('taskComment')">Модуль</A>
				<%=isUp(sortBy, "taskComment")%>
			</TD>
			<TD class="text" title="Описание роли" align="center"><B>!</B></TD>			
            <TD class="text" title="Роли для включения">&nbsp;</TD>
        </tr>



        
        <!-- Table body -->
        <logic:iterate id="orlist" name="<%=BeanKeys.OPERATOR_TO_ROLE_LIST%>">
            <logic:present name="orlist">
            <tr id='<bean:write name="orlist" property="role" filter="true"/>' class="normal" onMouseOver="className='select';" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
				<td class="text" style="background-color:#A5F3C6">
					<A href='<%=request.getContextPath()%>/roleDialog.do?action=Edit&role=<bean:write name="orlist" property="role" filter="true"/>' onclick='return openDialog(this.href, "roleDialog", "<%= dialogProperty %>");'><IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></A>
				</td>            
                <td class="text">
                	<bean:write name="orlist" property="sortOrder" filter="true"/>
                </td>            
                <td class="text">
                	<B><bean:write name="orlist" property="role" filter="true"/></B>
                </td>
                <td class="text">
                	<bean:write name="orlist" property="roleName" filter="true"/>
                </td>
                <td class="text">
                	<bean:write name="orlist" property="taskComment" filter="true"/>
                </td>
                <td class="text">
                  	<IMG SRC="<%=request.getContextPath()%>/images/doc.gif" BORDER='0' ALT='Описание' title="<bean:write name="orlist" property="comment" filter="true"/>">                
                </td>
                <td class="text" style="background-color:#A5F3C6">
                    <%--july:excludebutton page="/ProcessOperator2role.do?action=Delete" paramId="roles_role" paramName="orlist" paramProperty="role" paramScope="page"/--%>
					<A href='javascript:DeleteLink("<bean:write name="orlist" property="role" filter="true"/>")' title="Удалить роль">
						<IMG SRC="<%=request.getContextPath()%>/images/iskl.gif" BORDER='0' ALT='Удалить роль'></A>                   
                </td>
            </tr>

            <%--july:separator colspan="<%= gColSpan %>" /--%>

	        </logic:present>
        </logic:iterate>

        <!-- Table "listAnoveRoleForOperator" header -->
        <tr class="title">
			<TD><%--july:backbutton page="/ShowOperatorList.do"/--%></TD>
			<TH class="text" colspan="<%= gColSpan %>">
				Роли для включения:
				Всего: <%= posListSize%>.&nbsp;&nbsp; 
				<%if(posListSize > 0){%>
					Страница: <INPUT TYPE="TEXT" NAME="pageNumber" VALUE="все" READONLY="readonly" class="editdisabled" style="width: 19pt; font-size: 80%;">
					<% for(int i = 1; i <= pages; i++){ %>
						<%--A name="pagePos_<%=i%>" class="button" onclick="showPage(<%=i%>);" style="vertical-align: bottom;"><%=i%></A--%>
						<INPUT type=button value=" <%=i%> " onclick="showPage(<%=i%>);" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
					<% } %>
					<%--A name="pagePos_ALL" class="button" onclick="showAllPage();" style="vertical-align: bottom;">все</A--%>
					<INPUT type=button value="все" onclick="showAllPage();" class="buttons" style="font-size: 80%; background-color:#336699; color: white;">
				<% } %>				
			</TH>
		</tr>

        <tr class="layout-manager">
        	<TD class="text" nowrap></TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю '№'" href="javascript:SortBy('sortOrder')">№</A>
				<%=isUp(sortBy, "sortOrder")%>
			</TD>        
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Код'" href="javascript:SortBy('role')">Код</A>
				<%=isUp(sortBy, "role")%>
			</TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Роль'" href="javascript:SortBy(' rolename')">Роль</A>
				<%=isUp(sortBy, " rolename")%>
			</TD>
			<TD class="text" align="center" nowrap="nowrap">
				<A title="Сортировать по полю 'Модуль'" href="javascript:SortBy('taskComment')">Модуль</A>
				<%=isUp(sortBy, "taskComment")%>
			</TD>
			<TD class="text" title="Описание роли" align="center"><B>!</B></TD>			
            <TD class="text" title="Роли для включения">&nbsp;</TD>
        </tr>
         
        <!-- Table "listAnoveRoleForOperator"  body -->
        <logic:iterate id="item" name="<%=BeanKeys.OPERATOR_TO_ROLE_ACCESS_LIST %>">
            <logic:present name="item">
            <tr id='<bean:write name="item" property="role" filter="true"/>' class="normal" onMouseOver="className='select';" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
				<td class="text" style="background-color:#F0F0F0">
					<A href='<%=request.getContextPath()%>/roleDialog.do?action=Edit&role=<bean:write name="item" property="role" filter="true"/>' onclick='return openDialog(this.href, "roleDialog", "<%= dialogProperty %>");'><IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></A>
				</td>            
                <td class="text">
                	<bean:write name="item" property="sortOrder" filter="true"/>
                </td>            
                <td class="text">
                	<bean:write name="item" property="role" filter="true"/>
                </td>
                <td class="text">
                	<bean:write name="item" property="roleName" filter="true"/>
                </td>
                <td class="text">
                	<bean:write name="item" property="taskComment" filter="true"/>
                </td>
                <td class="text">
                  	<IMG SRC="<%=request.getContextPath()%>/images/doc.gif" BORDER='0' ALT='Описание' title="<bean:write name="item" property="comment" filter="true"/>">                
                </td>
                <td class="text" style="background-color:#F0F0F0">
                	<%--july:includebutton page="/ProcessOperator2role.do?action=Add" paramId="roles_role" paramName="item" paramProperty="role" paramScope="page"/--%>
					<A href='javascript:AddLink("<bean:write name="item" property="role" filter="true"/>")' title="Добавить роль">
						<IMG SRC="<%=request.getContextPath()%>/images/vkl2.gif" BORDER='0' ALT='Добавить роль'></A>                   
                </td>
            </tr>

            <%--july:separator colspan="<%= gColSpan %>" /--%>

	        </logic:present>
        </logic:iterate>

        <TR class="title">
          	<TD class="text"><july:backbutton page="/main.do"/></TD>
          	<%--TD><A href='roleDialog.do?action=Add' onclick='return openDialog(this.href, "roleDialog", "<%= dialogProperty%>");'><IMG SRC="/images/plus.gif" BORDER='0' ALT='Добавить роль'></A></TD--%>
          	<TD class="text" colspan="<%= gColSpan %>">&nbsp;</TD>
        </TR>
        
    </table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	//window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>