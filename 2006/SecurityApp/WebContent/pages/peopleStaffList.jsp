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
	<TITLE>Штат для физ. лица</TITLE>
</HEAD>
<BODY class="content">

<%
	java.lang.String gColSpan = "7";
 	PeopleStaffListForm listForm = (PeopleStaffListForm)request.getAttribute("PeopleStaffListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.PEOPLE_STAFF_LIST);
	int posListSize = posList.size();//кол-во позиций.
	boolean canEdit = request.isUserInRole("administrator");
%>
<H3 id='bread-crumb'>
	<html:link page="/peopleList.do">Физические лица</html:link> &gt;
		 Штат для: <I><bean:write name="PeopleStaffListForm" property="peopleVO.name"/></I>
</H3><br>

<html:form action="/peopleStaffList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>

<html:hidden property="query.man"/>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
				<tr>
					<th class="find-filter">ФИО :</th>
					<td class="find-filter" colspan="2"><%= listForm.getPeopleVO().getName()%></td>
				</tr>			
				<tr>
					<th class="find-filter">
						Штат физ. лица:
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
					</th>
					<td class="find-filter" colspan="2">
						<html:radio property="activeState" value="ALL"/>Все
						<html:radio property="activeState" value="Y"/>Активные
						<html:radio property="activeState" value="N"/>Не активные
					</td>
				</tr>
			</table>
		</TD>
	</TR>

        <%--tr class="title">
          <td colspan="<%= gColSpan %>">
          	<TABLE class="buttons">
	            <TR class="title">
	              <TD class="buttons"><% if(canEdit) { %><july:addbutton page="/EditWorkerDr.do?action=Add"/><% } %><july:backbutton page="/ShowDirectionList.do"/></TD>
	              <TD class="navigator"><july:navigator/></TD>
	            </TR>
            </TABLE></TD>
        </tr--%>
        
		<tr class="layout-manager">
			<td colspan="<%= gColSpan %>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
				<TR>
					<TD class="find-filter">
						<% if(canEdit) { %>
							<html:link page="/workerDialog.do?action=Add&forwardName=peopleStaffList" paramId="man" paramName="PeopleStaffListForm" paramProperty="query.man">
								<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
							</html:link>
						<% } %>				
						<july:backbutton page="/main.do"/>
					</TD>
					<TH class="find-filter" align="right">отобрано записей:&nbsp;<%= posListSize %></TH>
					<TD class="find-filter"><july:navigator/></TD>
	            </TR>
			</TABLE>
			</td>
		</tr>         

        <!-- Table header -->
        <tr class="title">
	 		<TD class="column-head-name" align="center" valign="middle">
	 			<img src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" />
			</TD>        
            <%--july:headercolumn key="label.code" colType="number"/--%>
			<TD class="column-head-name" nowrap>
				<A title="Сортировать по полю 'worker'" href="javascript:SortBy('worker')">Код</A>
				<%=isUp(sortBy, "worker")%>
			</TD>            
            <%--july:headercolumn key="label.people.fullname" colType="string"/--%>
			<TD class="column-head-name" nowrap>
				<A title="Сортировать по полю 'fullName'" href="javascript:SortBy('fullName')">ФИО</A>
				<%=isUp(sortBy, "fullName")%>
			</TD>            
            <%--july:headercolumn key="label.worker.workposition" colType="string"/--%>
			<TD class="column-head-name" nowrap>
				<A title="Сортировать по полю 'wpName'" href="javascript:SortBy('wpName')">Должность</A>
				<%=isUp(sortBy, "wpName")%>
			</TD>            
            <%--july:headercolumn key="label.isservicestuff" colType="string"/--%>
			<TD class="column-head-name" nowrap>
				<A title="Сортировать по полю 'isServiceStuff'" href="javascript:SortBy('isServiceStuff')">Выездной</A>
				<%=isUp(sortBy, "isServiceStuff")%>
			</TD>            
            <%--july:headercolumn key="label.worker.isenabled" colType="string"/--%>
			<TD class="column-head-name" nowrap>
				<A title="Сортировать по полю 'isActive'" href="javascript:SortBy('isActive')">Разр/Запр</A>
				<%=isUp(sortBy, "isActive")%>
			</TD>             
<% if(canEdit) { %>
            <TD class="column-head-name">&nbsp;</TD>
<% } %>
        </tr>

        <!-- Table body -->
        <logic:iterate id="worker" name="<%=BeanKeys.PEOPLE_STAFF_LIST%>" type="com.nri.custom.WorkerTO"> 
            <logic:present name="worker">
            <tr id='<bean:write name="worker" property="worker" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
            	<td class="text">
                    <html:link page="/workerDialog.do?action=Edit&forwardName=peopleStaffList" paramId="worker" paramName="worker" paramProperty="worker" paramScope="page">            	
                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>
            	</td>            
                <td class="text">
                      <bean:write name="worker" property="worker" filter="true"/>
                </td>
                <td class="text">
                    <bean:write name="worker" property="fullNamePeople" filter="true"/>
                </td>
                <td class="text">
                    <bean:write name="worker" property="workPositionsName" filter="true"/>
                </td>
		<td class="text" align="center">
<%
			Boolean check = worker.getIsServiceStuff();
			if(check != null && check.booleanValue()) {
				%><img src="<%=request.getContextPath()%>/images/yes.gif" width=16 height=16 border=0><%
			}
%>
		</td>
                <td class="text">
                    <logic:present name="worker" property="isActive">
                        <logic:equal name="worker" property="isActive" value="true">
                            <%--bean:message key="label.worker.enabled"/--%>Разрешен
                        </logic:equal>
                        <logic:equal name="worker" property="isActive" value="false">
                            <%--bean:message key="label.worker.disabled"/--%>Запрещен
                        </logic:equal>
                    </logic:present>
                    <logic:notPresent name="worker" property="isActive">
                        <%--bean:message key="label.worker.disabled"/--%>Запрещен
                    </logic:notPresent>
                </td>
<% if(canEdit) { %>
                <td class="text">
                    <%--july:delbutton page="/EditWorkerDr.do?action=Delete" paramId="worker" paramName="worker" paramProperty="worker" paramScope="page"/--%>
					<html:link page="/workerDialog.do?action=Delete&forwardName=peopleStaffList" paramId="worker"
						paramName="worker" paramProperty="worker" paramScope="page">
						<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить запись' />
					</html:link>                    
                </td>
<% } %>
            </tr>

	        </logic:present>
        </logic:iterate>

		<tr class="layout-manager">
			<td colspan="<%= gColSpan %>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
				<TR>
					<TD class="find-filter">
						<% if(canEdit) { %>
							<html:link page="/workerDialog.do?action=Add&forwardName=peopleStaffList" paramId="man" paramName="PeopleStaffListForm" paramProperty="query.man">
								<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
							</html:link>
						<% } %>				
						<july:backbutton page="/main.do"/>
					</TD>
					<TH class="find-filter" align="right">отобрано записей:&nbsp;<%= posListSize %></TH>
					<TD class="find-filter"><july:navigator/></TD>
	            </TR>
			</TABLE>
			</td>
		</tr> 
        
    </table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>

