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
	<TITLE>Должности</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="../common/dialog.js" type="text/javascript"></SCRIPT> 
<%
	java.lang.String gColSpan = "4";
	WorkPositionListForm listForm = (WorkPositionListForm)session.getAttribute("WorkPositionListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.WORK_POSITION_LIST);
	int posListSize = posList.size();//кол-во позиций.	
%>
<H3 id='bread-crumb'>
	Должности &gt;
</H3><br>
<html:form action="/workPositionList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	<july:separator colspan="<%= gColSpan %>" />
	
	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">Наименование</th>
					<td class="find-filter">
						<html:text styleClass="search" property="searchStr" size="25"/>
						<%--july:searchbutton/--%>
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
					</td>
					<td class="find-filter" nowrap>
					<%
						String[] a = { "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Э", "Ю", "Я" };
						for (int i = 0; i < a.length; i++) {%>
							<A href="javascript:toggleA('<%= a[i]%>')"><%= a[i]%></A>
							<%if(a[i].equals("Н")){%><BR><%}%>
					<%}%>
					&nbsp;&nbsp;&nbsp;<A href="javascript:toggleA('')">Все</A>
					</td>
				</tr>
				<tr>
					<th class="find-filter">Должности:</th>
					<td class="find-filter" colspan="2">
						<html:radio property="activeState" value="ALL"/>Все
						<html:radio property="activeState" value="Y"/>Активные
						<html:radio property="activeState" value="N"/>Не активные
					</td>
				</tr>
			</table>
		</TD>
	</TR>

	<july:separator colspan="<%= gColSpan %>" />

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
			<TR>
				<TD class="find-filter">
					<html:link page="/workPositionDialog.do?action=Add">
						<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
					</html:link>				
					<%--july:addbutton page="/EditWorkPosition.do?action=Add"/--%>
					<july:backbutton page="/main.do"/>
				</TD>
				<TH class="find-filter" align="right">отобрано записей:<%= posListSize %></TH>
				<TD class="find-filter"><july:navigator/></TD>
            </TR>
		</TABLE>
		</td>
	</tr>
      
      <july:separator colspan="<%= gColSpan %>" />
    
    <!-- Table header -->
    <tr class="title">
 		<TD class="column-head-name" align="center" valign="middle">
 			<img src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" />
		</TD>
		<TD class="column-head-name" nowrap>
			<A title="Сортировать по полю 'workPosition'" href="javascript:SortBy('workPosition')">Код</A>
			<%=isUp(sortBy, "workPosition")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'name'" href="javascript:SortBy('name')">Наименование</A>
			<%=isUp(sortBy, "name")%>
		</TD>
        <TD class="column-head-name">&nbsp;</TD>
    </tr>

<july:separator colspan="<%= gColSpan %>" />


        <!-- Table body -->
    <logic:iterate id="wpl" name="<%=BeanKeys.WORK_POSITION_LIST%>" type="com.nri.domain.WorkPosition">
        <logic:present name="wpl">
            <tr id='<bean:write name="wpl" property="workPosition" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
            	<td class="text">
                    <html:link page="/workPositionDialog.do?action=Edit" paramId="workPosition" paramName="wpl" paramProperty="workPosition" paramScope="page">            	
                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>
            	</td>
                <td class="text">
                    <bean:write name="wpl" property="workPosition" filter="true"/>
                </td>
                <td class="text">
					<bean:write name="wpl" property="name" filter="true"/>
                </td>
                <td class="text">
                    <%--july:delbutton page="/EditWorkPosition.do?action=Delete" paramId="workPosition" paramName="wpl" paramProperty="workPosition" paramScope="page"/--%>
						<html:link 
						page="/workPositionDialog.do?action=Delete" paramId="workPosition" paramName="wpl"
						paramProperty="workPosition" paramScope="page">
							<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить запись'/>
						</html:link>                    
                </td>
            </tr>

            <july:separator colspan="<%= gColSpan %>" />

	      </logic:present>
      </logic:iterate>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
			<TR>
				<TD class="find-filter">
					<html:link page="/workPositionDialog.do?action=Add">
						<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
					</html:link>				
					<%--july:addbutton page="/EditWorkPosition.do?action=Add"/--%>
					<july:backbutton page="/main.do"/>
				</TD>
				<TH class="find-filter" align="right">отобрано записей:<%= posListSize %></TH>
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
