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
	<%--script language="JavaScript" src="/SecurityApp/scripts/menu_functions.js"></script--%>
	<%--script language="JavaScript" src="/SecurityApp/scripts/collectionform.js"></script--%>

	<TITLE>Физические лица</TITLE>
</HEAD>
<BODY class="content">

<%String gColSpan = "9";
	PeopleLookupListForm listForm = (PeopleLookupListForm) session.getAttribute("PeopleLookupListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.PEOPLE_LOOKUP_LIST);
	int posListSize = posList.size();//кол-во позиций.
%>

<html:form action="/peopleLookupList.do" styleId="listForm">
	<html:errors/>
	<html:hidden property="orderBy" />
	<html:hidden property="selectedID" value="0" />
	<%@include file="../secure/layouts/tableJS.jspf"%>
	
	<html:hidden property="formName"/>
	<html:hidden property="fieldNames"/>	
	
<script language="javascript">
	function switchName(state) {
		if(state) {
			listForm.name.className = 'editdisabled';
			listForm.name.disabled = true;
		} else {
			listForm.name.className = 'editsearch';
			listForm.name.disabled = false;
		}
	}
	function toggleStateALL(){
		if(document.all.isName[0].checked){
			document.all.isName[0].checked =false;
			switchName(false);
		}else{
			document.all.isName[0].checked = true;
			listForm.submit();
		}
	}
function Go(strval) {
	var thisform = document.listForm;
	var outform = window.opener.document.forms[thisform.formName.value];
	
	if(outform != null)
	{
		var names = thisform.fieldNames.value.split('|'), values = strval.split('|');
		for(var i in names) {
			if(names[i].length > 0)
				outform[names[i]].value = unescape(values[i]);
		}
	}
	Close();
}
function Close(){
	var thisform = document.listForm;
	var outform = window.opener.document.forms[thisform.formName.value];
	if(outform != null) {
		document.body.style.cursor="wait";
		window.opener.focus();
	}
	window.close();
}	
</script>
	<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

		<TR class="layout-manager">
			<TD colspan="<%=gColSpan%>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">Физические лица: </th>
					<td class="find-filter" nowrap="nowrap">
						<html:text styleClass="search" property="name" size="25" styleId="searchStr"/>
						<%--july:searchbutton/--%>
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>
					</td>
					<td class="find-filter" nowrap>
						<%	String[] a = { "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Щ", "Э", "Ю", "Я" };
							for (int i = 0; i < a.length; i++) {%>
								<A href="javascript:toggleA('<%=a[i]%>')"><%=a[i]%></A>
								<%if (a[i].equals("Н")) {%><BR>
						<%}%> <%}%>&nbsp;&nbsp;&nbsp;<A href="javascript:toggleA('')">Все</A>	
					</td>
				</tr>
				<tr>
					<th class="find-filter" colspan="3">
						<html:radio property="activeState" value="ALL" />Все 
						<html:radio	property="activeState" value="Y" />Активные 
						<html:radio property="activeState" value="N" />Не активные
					</th>
				</tr>
			</table>
			</TD>
		</TR>

		<july:separator colspan="<%=gColSpan%>" />

		<tr class="layout-manager">
			<td colspan="<%=gColSpan%>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
				<TR>
					<TD class="find-filter">
						<%--html:link page="/peopleDialog.do?action=Add">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
						</html:link--%>
						<july:backbutton page="/main.do" />
					</TD>
					<TH class="find-filter" align="right">отобрано записей: <%=posListSize%></TH>
					<TD class="find-filter"><july:navigator /></TD>
				</TR>
			</TABLE>
			</TD>
		</tr>

		<july:separator colspan="<%=gColSpan%>" />

		<!-- Table header -->
		<tr class="title">
			<TD class="column-head-name" nowrap="nowrap"><A title="Сортировать по полю 'man'"
				href="javascript:SortBy('man')">Код</A> <%=isUp(sortBy, "man")%></TD>
			<TD class="column-head-name" nowrap="nowrap"><A title="Сортировать по полю 'lastname'"
				href="javascript:SortBy('lastname')">Фамилия</A> <%=isUp(sortBy, "lastname")%>
			</TD>
			<TD class="column-head-name" nowrap="nowrap"><A title="Сортировать по полю 'firstname'"
				href="javascript:SortBy('firstname')">Имя</A> <%=isUp(sortBy, "firstname")%>
			</TD>
			<TD class="column-head-name" nowrap="nowrap"><A title="Сортировать по полю 'middlename'"
				href="javascript:SortBy('middlename')">Отчество</A> <%=isUp(sortBy, "middlename")%>
			</TD>
			<TD class="column-head-name" nowrap="nowrap"><A title="Сортировать по полю 'passportser'"
				href="javascript:SortBy('passportser')">Паспорт</A> <%=isUp(sortBy, "passportser")%>
			</TD>
			<TD class="column-head-name"><B>Операторы</B></TD>
			<TD class="column-head-name"><B>Штат</B></TD>
			<TD class="column-head-name"><B>НФС</B></TD>
			<%--TD class="column-head-name">&nbsp;</TD--%>
		</tr>

		<july:separator colspan="<%=gColSpan%>" />


		<!-- Table body -->
		<logic:iterate id="it" name="<%=BeanKeys.PEOPLE_LOOKUP_LIST%>" type="com.nri.domain.People">
			<logic:present name="it">
				<tr id='<bean:write name="it" property="man" filter="true"/>'
					class="normal" onMouseOver="className='select'"
					onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
					<td class="text">
						<%--html:link page="/peopleDialog.do?action=Edit" paramId="man" paramName="it" paramProperty="man" paramScope="page"--%>
							<bean:write name="it" property="man" filter="true" /><%--/html:link--%>
					</td>
					<td class="text">
						<A href='javascript:Go("<bean:write name="it" property="man" filter="true"/>|<bean:write name="it" property="lastName" filter="true"/>")' title="Выберите запись">                
							<bean:write name="it" property="lastName" filter="true" /></A>
					</td>
					<td class="text">
						<bean:write name="it" property="firstName"
						filter="true" /></td>
					<td class="text">
						<bean:write name="it" property="middleName"
						filter="true" /></td>
					<td class="text">
						<bean:write name="it" property="passportSer"
						filter="true" /></td>
					<td class="text">
						<july:link page="/ShowOperatorList.do"
						paramId="man" paramName="it" paramProperty="man" paramScope="page"
						alttext="msg.operators">
						Операторы
					</july:link></td>
					<td class="text"><july:link page="/ShowWorkerList.do" paramId="man"
						paramName="it" paramProperty="man" paramScope="page"
						alttext="msg.workers">
						Штат
					</july:link></td>
					<td class="text"><july:link page="/PeopleToNfsUserList.do"
						paramId="man" paramName="it" paramProperty="man" paramScope="page">
                        связь
                    </july:link></td>
					<%--td class="text">
						<html:link 
						page="/peopleDialog.do?action=Delete" paramId="man" paramName="it"
						paramProperty="man" paramScope="page">
							<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить запись'/>
						</html:link>
					</td--%>
				</tr>

				<july:separator colspan="<%=gColSpan%>" />

			</logic:present>
		</logic:iterate>

		<tr class="layout-manager">
			<td colspan="<%=gColSpan%>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
				<TR>
					<TD class="find-filter">
						<%--html:link page="/peopleDialog.do?action=Add">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
						</html:link--%>
						<july:backbutton page="/main.do" />
					</TD>
					<TH class="find-filter" align="right">отобрано записей: <%=posListSize%></TH>
					<TD class="find-filter"><july:navigator /></TD>
				</TR>
			</TABLE>
			</TD>
		</tr>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>