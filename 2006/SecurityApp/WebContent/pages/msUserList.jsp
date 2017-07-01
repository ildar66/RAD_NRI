<%@ page language = "java"%>
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
	<%--script language="JavaScript" src="/SecurityApp/scripts/menu_functions.js"></script--%>
	<%--script language="JavaScript" src="/SecurityApp/scripts/collectionform.js"></script--%>

	<TITLE>Пользователи MS</TITLE>
</HEAD>
<BODY class="content">
<%
	java.lang.String gColSpan = "4";
	MsUserListForm listForm = (MsUserListForm)session.getAttribute("MsUserListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.MS_USER_LIST);
	int posListSize = posList.size();//кол-во позиций.	
%>
<H3 id='bread-crumb'>
	Пользователи MS &gt;
</H3><br>
<html:form action="/msUserList.do" styleId="listForm" focus="searchStr">
	<html:errors />
	<html:hidden property="orderBy" />
	<html:hidden property="selectedID" value="0" />
	<%@include file="../secure/layouts/tableJS.jspf"%>

	<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1">

		<july:separator colspan="<%= gColSpan %>" />

		<TR CLASS="layout-manager">
			<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">Логин :</th>
					<td class="find-filter">
						<html:text styleClass="search" property="searchStr" size="25" /> &nbsp;&nbsp;&nbsp;
						<A href="javascript:toggleA('')">Все</A> &nbsp;&nbsp;
						<INPUT TYPE='image'	src='<%=request.getContextPath()%>/images/refresh.gif' onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
					</td>
				</tr>
			</table>
			</TD>
		</TR>

		<july:separator colspan="<%= gColSpan %>" />

		<tr CLASS="layout-manager">
			<td colspan="<%= gColSpan %>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
				<TR>
					<TD class="find-filter"><%--july:addbutton page="/EditMSUsers.do?action=Add" modelName="list" selectable="1"/--%>
					<html:link page="/msUserDialog.do?action=Add">
						<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись' />
					</html:link> <july:backbutton page="/main.do" /></TD>
					<TH class="find-filter">&nbsp;&nbsp;&nbsp;&nbsp;</TH>
					<TD class="find-filter" align="right">отобрано записей:<%=posListSize%></TD>
				</TR>
			</TABLE>
			</td>
		</tr>

		<july:separator colspan="<%= gColSpan %>" />

		<!-- Table header -->
		<tr class="title">
			<td class="column-head-name" align="center" valign="middle"><img
				src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" /></td>
			<td class="column-head-name" align="center" valign="middle"><A
				title="Сортировать по полю 'msUser'"
				href="javascript:SortBy('msUser')">Логин пользователя Microstrategy</A>
			<%=isUp(sortBy, "msUser")%></td>
			<td class="column-head-name" align="center" valign="middle"><img
				src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" /></td>
		</tr>

		<july:separator colspan="<%= gColSpan %>" />

		<!-- Table body -->
		<logic:iterate id="msu" name="<%=BeanKeys.MS_USER_LIST%>"
			type="com.nri.domain.MsUser">
			<logic:present name="msu">
				<tr id='<bean:write name="msu" property="msuCode" filter="true"/>'
					class="normal" onMouseOver="className='select'"
					onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
					<td class="text" style="text-align: center; vertical-align: middle">
					<html:link page="/msUserDialog.do?action=Edit" paramId="msuCode"
						paramName="msu" paramProperty="msuCode" paramScope="page">
						<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'>
					</html:link></td>
					<td class="text" style="text-align: left; vertical-align: middle">
					<bean:write name="msu" property="msUser" /></td>
					<td class="text" style="text-align: center; vertical-align: middle">
					<%--july:delbutton page="<%= delPage %>" modelName="list" selectable="1"/--%>
					<html:link page="/msUserDialog.do?action=Delete" paramId="msuCode"
						paramName="msu" paramProperty="msuCode" paramScope="page">
						<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить запись' />
					</html:link></td>
				</tr>

				<july:separator colspan="<%= gColSpan %>" />

			</logic:present>
		</logic:iterate>

		<tr CLASS="layout-manager">
			<td colspan="<%= gColSpan %>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
				<TR>
					<TD class="find-filter"><%--july:addbutton page="/EditMSUsers.do?action=Add" modelName="list" selectable="1"/--%>
					<html:link page="/msUserDialog.do?action=Add">
						<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись' />
					</html:link> <july:backbutton page="/main.do" /></TD>
					<TD class="find-filter">&nbsp;</TD>
					<TD class="find-filter" align="right">отобрано записей:<%=posListSize%></TD>
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
	window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>