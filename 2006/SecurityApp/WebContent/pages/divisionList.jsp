<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.nri.security.forms.*, com.nri.value.*, com.nri.domain.*"%>

<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Подразделения</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="../common/dialog.js" type="text/javascript"></SCRIPT> 
	
<%
	java.lang.String gColSpan = "8";
	DivisionListForm listForm = (DivisionListForm)session.getAttribute("DivisionListForm");
	String sortBy = listForm.getOrderBy();
	java.util.List posList = (java.util.List)request.getAttribute(BeanKeys.DIVISION_LIST);
	int posListSize = posList.size();//кол-во позиций.
	boolean canEdit = request.isUserInRole("administrator");
	java.util.List typesList = DivisionType.TYPE_LIST;
	pageContext.setAttribute("typesList", typesList);	
%>

<H3 id='bread-crumb'>
	<html:link page="/companyList.do">Компании</html:link> &gt;
		Подразделения компании <I><bean:write name="DivisionListForm" property="companyVO.name"/></I>  &gt;
</H3><BR>

<html:form action="/divisionList.do" styleId="listForm">
<html:errors/>
<html:hidden property="orderBy"/>
<html:hidden property="selectedID" value="0"/>
<%@include file="../secure/layouts/tableJS.jspf"%>

<html:hidden property="company"/>

<table class="framing-table" id="tableID" BORDER="0" CELLPADDING="3" CELLSPACING="1" width="100%">

	<TR class="layout-manager">
		<TD colspan="<%= gColSpan %>">
			<table class="framing-table">
				<tr>
					<th class="find-filter">Компания:</th>
					<td class="find-filter" colspan="2"><%= listForm.getCompanyVO().getName()%></td>
				</tr>			
				<tr>
					<th class="find-filter">Наименование:</th>
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
					<th class="find-filter">Подразделения:</th>
					<td class="find-filter">
						<html:radio property="activeState" value="ALL"/>Все
						<html:radio property="activeState" value="Y"/>Активные
						<html:radio property="activeState" value="N"/>Не активные
					</td>
					<th class="find-filter">Тип:
						<html:select property="type" styleId="type">
							<html:option value="ALL">все типы</html:option>
							<html:options collection="typesList" property="type" labelProperty="typeName"/>
						</html:select>
						&nbsp;&nbsp;
						<INPUT TYPE='image' src='<%=request.getContextPath()%>/images/refresh.gif'  onclick='document.body.style.cursor="wait"' border='0' alt='Искать'>						
					</th>
				</tr>
			</table>
		</TD>
	</TR>
	
	
		<tr class="layout-manager">
			<td colspan="<%= gColSpan %>">
			<TABLE BORDER="0" CELLSPACING="0" CELLPADDING="1">
				<TR>
					<TD class="find-filter">
						<html:link page="/divisionDialog.do?action=Add&forwardName=divisionList" paramId="company" paramName="DivisionListForm" paramProperty="company">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
						</html:link>				
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
	 		<TD class="column-head-name" align="center" valign="middle">
	 			<img src="<%=request.getContextPath()%>/images/empty.gif" width="1" height="1" />
			</TD>        
            <%--july:headercolumn key="label.code" colType="number"/--%>
			<TD class="column-head-name" nowrap>
				<A title="Сортировать по полю 'division'" href="javascript:SortBy('division')">Код</A>
				<%=isUp(sortBy, "division")%>
			</TD>
			<TD class="column-head-name">
				<A title="Сортировать по полю 'type'" href="javascript:SortBy('type')">Тип</A>
				<%=isUp(sortBy, "type")%>
			</TD>			            
            <%--july:sortcolumn ascFinder="1" descFinder="2" key="label.name" colType="string"/--%>
			<TD class="column-head-name">
				<A title="Сортировать по полю 'name'" href="javascript:SortBy('name')">Наименование</A>
				<%=isUp(sortBy, "name")%>
			</TD>
            <%--july:headercolumn key="label.services" colType="link"/--%>
            <TD class="column-head-name">Подразделения</TD>
            <%--july:headercolumn key="label.workers" colType="link"/--%>
            <TD class="column-head-name">Штат</TD>
			<TD class="column-head-name">Транспорт</TD>
<% if(canEdit) { %>
	     <TD class="column-head-name">&nbsp;</TD>
<% } %>
        </tr>


        <!-- Table body -->
        <logic:iterate id="dir" name="<%=BeanKeys.DIVISION_LIST%>" type="com.nri.domain.Division">
            <logic:present name="dir">
            <tr id='<bean:write name="dir" property="division" filter="true"/>' class="normal" onMouseOver="className='select'" onMouseOut="onMouseOutRow(this.id);" onclick="onClickRow(this.id);">
            	<td class="text">
                    <html:link page="/divisionDialog.do?action=Edit&forwardName=divisionList" paramId="division" paramName="dir" paramProperty="division" paramScope="page">            	
                    	<IMG SRC="<%=request.getContextPath()%>/images/izmena.gif" BORDER='0' ALT='Изменить запись'></html:link>
            	</td>            
                <td class="text">
                      <bean:write name="dir" property="division" filter="true"/>
                </td>
                <td class="text">
                      <bean:write name="dir" property="type" filter="true"/>
                </td>                
                <td class="text">
                   	<bean:write name="dir" property="name" filter="true"/>
                </td>
                <td class="text">
                    <html:link page="/divisionHierarchyList.do" paramId="encloser" paramName="dir" paramProperty="division" paramScope="page">
                        <%--bean:message key="label.services"/--%>Подразделения
                    </html:link>
                </td>
                <td class="text">
                    <html:link page="/workerHierarchyList.do" paramId="division" paramName="dir" paramProperty="division" paramScope="page">                    
                        <%--bean:message key="label.workers"/--%>штат
                    </html:link>
                </td>
                <td class="text">
                    <july:link page="/ShowDirectionCarsList.do" paramId="division" paramName="dir" paramProperty="division" paramScope="page" alttext="label.car.full">
                        <%--bean:message key="label.cars"/--%>cars
                    </july:link>
                </td>
<% if(canEdit) { %>
                <td class="text">
                    <%--july:delbutton page="/divisionDialog.do?action=Delete" paramId="direction" paramName="dir" paramProperty="division" paramScope="page"/--%>
					<html:link page="/divisionDialog.do?action=Delete&forwardName=divisionList" paramId="division"
						paramName="dir" paramProperty="division" paramScope="page">
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
						<html:link page="/divisionDialog.do?action=Add&forwardName=divisionList" paramId="company" paramName="DivisionListForm" paramProperty="company">
							<IMG SRC="<%=request.getContextPath()%>/images/plus.gif" BORDER='0' ALT='Добавить запись'/>
						</html:link>				
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
