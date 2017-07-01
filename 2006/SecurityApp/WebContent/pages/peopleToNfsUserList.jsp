<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.nri.security.forms.*, com.nri.custom.*, com.nri.value.*"%>

<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Связь с NFS для физ. лица</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
	String gColSpan = "5";
	PeopleToNfsUserListForm listForm = (PeopleToNfsUserListForm)request.getAttribute("PeopleToNfsUserListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.PEOPLE_TO_NFS_USER_LIST);	
	int posListSize = posList.size();//кол-во позиций.
	//String dialogProperty = "top=80, left=200, width=750, height=500, scrollbars=yes, resizable=yes";	
%>
<H3 id='bread-crumb'>
	<html:link page="/peopleList.do">Физические лица</html:link> &gt;
		 Связь с НФС для: <I><bean:write name="PeopleToNfsUserListForm" property="peopleVO.name"/></I>
</H3><br>

<html:form action="/peopleToNfsUserList.do" styleId="listForm">
<html:errors/>
<html:hidden property="man"/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID"/>
<html:hidden property="operation" value=""/>

<%@include file="../secure/layouts/tableJS.jspf"%>

<%--html:hidden property="operation" value=""/--%>

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
	function toggleFilter(n){
		document.all.activestate[n].checked = true;
	    document.body.style.cursor="wait";
		listForm.submit();
	}
	function toggleA(a){
		//document.all.isName[0].checked =false;
		//listForm.name.disabled = false;
		listForm.name.value=a+'*';
		listForm.submit();
	}
	function DeleteLink(id) {
		if(confirm('Удалить связь c пользователем НФС ?')) {
			document.body.style.cursor="wait";
			listForm.selectedID.value = id;
			listForm.operation.value = "deleteLink";
			listForm.submit();
	
			return false;
		}
	}
	function SetMainLink(id) {
		document.body.style.cursor="wait";
		listForm.selectedID.value = id;
		listForm.operation.value = "setMainLink";
		listForm.submit();
	}
	function toggleALL(){
		//document.all.isName[0].checked =false;
		//listForm.name.disabled = false;
		listForm.name.value='*';
		listForm.submit();
	}
</script>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">ФИО :</th>
					<td class="find-filter" colspan="2">
						<%= listForm.getPeopleVO().getName()%>
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>	
					</td>
				</tr>			
			</table>
		</TD>
	</TR>	
	
	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
			<TR>
				<TD class="find-filter">
              		<html:link page="/nfsUserLookupList.do?formName=PeopleToNfsUserListForm&fieldNames=selectedID" onclick="return openDialog(this.href, 'nfsUserLookupList', 'top=80, left=200, width=750, height=500, scrollbars=yes, resizable=yes');" title="справочник пользователей НФС">
              			<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='справочник пользователей НФС'></html:link>				
					<%--july:backbutton page="/main.do"/--%>
				</TD>
				<TH class="find-filter" align="right">отобрано записей:&nbsp;<%= posListSize %></TH>
				<TD class="find-filter"><%--july:navigator/--%></TD>
            </TR>
		</TABLE>
		</td>
	</tr>    
  
    <!-- Table header -->
    <tr class="title">
		<TD class="column-head-name">
			<A title="Сортировать по полю 'personID'" href="javascript:SortBy('personID')">код НФС</A>
			<%=isUp(sortBy, "personID")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'login'" href="javascript:SortBy('login')">login НФС</A>
			<%=isUp(sortBy, "login")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'fullName'" href="javascript:SortBy('fullName')">ФИО пользователя НФС</A>
			<%=isUp(sortBy, "fullName")%>
		</TD>
		<TD class="column-head-name">
			<A title="Сортировать по полю 'признак гл. пользователя(flagMain)'" href="javascript:SortBy('flagMain')">признак</A>
			<%=isUp(sortBy, "flagMain")%>
		</TD>
        <TD class="column-head-name">&nbsp;</TD>
    </tr>
    
    <!-- Table body -->
    <logic:iterate id="it" name="<%=BeanKeys.PEOPLE_TO_NFS_USER_LIST%>" type="PeopleToNfsUserTO"> 
        <logic:present name="it">
		<%
		    PeopleToNfsUserTO to = (PeopleToNfsUserTO)it;
			String className = "normal";
			boolean isFlagMain = false;
			if( to.getRecordStatus().equals("D") )
				className = "gray";
			if( to.getFlagMain().equals("Y") )
				isFlagMain = true;
		%>        
            <%--tr class="<%= className%>" onMouseOver="className='select'" onMouseOut="className='<%= className%>'"--%>
            <tr id='<bean:write name="it" property="personID" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">            
                <td class="text">
                    <bean:write name="it" property="personID" filter="true"/>
                </td>
                <td class="text">
                    <bean:write name="it" property="login" filter="true"/>
                </td>
                <td class="text">
                    <bean:write name="it" property="fullName" filter="true"/>
                </td>
                <td class="text">
                	<% if(isFlagMain){ %>
                		<IMG SRC="<%=request.getContextPath()%>/images/check_on.gif" BORDER='0' ALT='Главный пользователь'>
                	<% } else if (className == "normal"){ %>
                	<A href='javascript:SetMainLink("<bean:write name="it" property="personID" filter="true"/>")' title="установить Главного пользователя">
                		<IMG SRC="<%=request.getContextPath()%>/images/check_off.gif" BORDER='0'></A>
                	<% } else if (className == "gray"){ %>
                		<B style="color: red;">не активен</B>
                	<% } %>
                </td>
                <td class="text">
					<A href='javascript:DeleteLink("<bean:write name="it" property="personID" filter="true"/>")' title="Удалить связь с пользователем НФС">
						<IMG SRC="<%=request.getContextPath()%>/images/del.gif" BORDER='0' ALT='Удалить связь с пользователем НФС'></A>                   
                </td>
            </tr>

            

	      </logic:present>
      </logic:iterate>

	<tr class="layout-manager">
		<td colspan="<%= gColSpan %>">
		<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
			<TR>
				<TD class="find-filter">
					<%--july:backbutton page="/main.do"/--%>
				</TD>
				<TH class="find-filter" align="right">отобрано записей:&nbsp;<%= posListSize %></TH>
				<TD class="find-filter"><%--july:navigator/--%></TD>
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

