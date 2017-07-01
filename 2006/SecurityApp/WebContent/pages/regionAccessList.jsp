<%@ page language = "java" %>
<%@ page contentType = "text/html; charset=windows-1251" %>
<%@ taglib uri="/WEB-INF/struts-logic.tld" prefix="logic" %>
<%@ taglib uri="/WEB-INF/struts-bean.tld" prefix="bean" %>
<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="html" %>
<%--@ taglib uri="/WEB-INF/july.tld" prefix="july" --%>
<%@ page import = "com.nri.security.forms.*, com.nri.value.*, com.nri.security.actions.*, com.nri.custom.*"%>
<HTML>
<HEAD>
	<%--link rel="stylesheet" type="text/css" href="/theme/main.css"--%>
	<link rel="stylesheet" type="text/css" href="/SecurityApp/theme/Master.css">
	<jsp:include page = "/secure/layouts/browser_detection.jsp" flush="true"/>
	<TITLE>Филиалы для оператора</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT> 
<%
	String gColSpan = "9";
	RegionAccessListForm listForm = (RegionAccessListForm)request.getAttribute("RegionAccessListForm");
	String sortBy = listForm.getOrderBy();
%>
<H3 id='bread-crumb'>
	<html:link page="/peopleList.do">Физические лица</html:link> &gt;
	<html:link page="/operatorList.do" paramId="man" paramName="RegionAccessListForm" paramProperty="operatorVO.man" paramScope="request">
		Операторы для: <I><bean:write name="RegionAccessListForm" property="peopleVO.name"/></I></html:link>  &gt;
		Доступные Филиалы  &gt;
</H3><BR>

<html:form action="/regionAccessList.do" styleId="listForm">
<html:hidden property="operator"/>
<html:hidden property="orderBy"/>
<html:hidden property="operation" value=""/>

<%@include file="../secure/layouts/tableJS.jspf"%>

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



<!---buttons and navigator begin -->
<tr class="title">
     <td class="text">
          <INPUT TYPE="IMAGE" NAME="submit" SRC="<%=request.getContextPath()%>/images/save.gif"  ALT="Сохранить" onclick="operation.value='save';"></td>
     <th class="text" colspan="<%= gColSpan %>">Текущие права на филиалы:</th>
</tr>
<!---buttons and navigator end-->

<!-- Table header  begin :-->
<tr class="title">
       <td  class="text" rowspan='2' nowrap="nowrap">
			<A title="Сортировать по полю 'Код'" href="javascript:SortBy('regionid')">Код</A><%=isUp(sortBy, "regionid")%></td>
       <td  class="text" rowspan='2' nowrap="nowrap">
			<A title="Сортировать по полю 'Регион'" href="javascript:SortBy('supregname')">Регион</A><%=isUp(sortBy, "supregname")%></td>
       <td  class="text" rowspan='2' nowrap="nowrap">
			<A title="Сортировать по полю 'Филиал'" href="javascript:SortBy('regname')">Филиал</A><%=isUp(sortBy, "regname")%></td>
       <td  colspan='2' class="text">Плановые данные</td>
       <td  colspan='2' class="text">Фактические данные</td>
	   <td  colspan='2' class="text" align="center">Аренда</td>
</tr>
<tr class="title">
       <td class="text">чтение</td><td class="text">правка</td>
       <td class="text">чтение</td><td class="text">правка</td>
       <td class="text">чтение</td><td class="text">правка</td>
</tr>



<!-- Table header  end :-->        


        <!-- Table body begin-->
        
        <logic:iterate id="it" name="<%=BeanKeys.OPERATOR_TO_REGION_LIST %>" indexId="index" type="RegionAccessTO">
            <logic:present name="it">
			<% String regionId = String.valueOf(((RegionAccessTO)it).getVo().getRegionId()); %>
            <tr class="include" onMouseOver="className='select'" onMouseOut="className='include'">
                <td class="text">
                      <bean:write name="it" property="vo.regionId" filter="true"/>
                </td>
                <td class="text">
                      <bean:write name="it" property="supRegName" filter="true"/>
                </td>
                <td class="text">
                      <bean:write name="it" property="regionName" filter="true"/>
                </td>                
                <td class="text">
                  <html:checkbox property="viewPlan" onclick="if (!this.checked) document.all.item('EP' + this.id.substr(2), 0).checked=false;"styleId='<%= "VP" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="editPlan" onclick="if (this.checked) document.all.item('VP' + this.id.substr(2), 0).checked=true;"styleId='<%= "EP" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="viewFact" onclick="if (!this.checked) document.all.item('EF' + this.id.substr(2), 0).checked=false;"styleId='<%= "VF" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="editFact" onclick="if (this.checked) document.all.item('VF' + this.id.substr(2), 0).checked=true;"styleId='<%= "EF" + index  %>' name="it" value="<%= regionId %>"/> 
                </td>
                <td class="link">
                  <html:checkbox property="viewArenda" onclick="if (!this.checked) document.all.item('EA' + this.id.substr(2), 0).checked=false;"styleId='<%= "VA" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="editArenda" onclick="if (this.checked) document.all.item('VA' + this.id.substr(2), 0).checked=true;"styleId='<%= "EA" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
            </tr>
	    </logic:present>
        </logic:iterate>
        <!-- Table body end-->

<!---buttons and navigator begin -->
<tr class="title">
	<td class="text">
		<INPUT TYPE="IMAGE" NAME="submit" SRC="<%=request.getContextPath()%>/images/save.gif"  ALT="Сохранить" onclick="operation.value='save';"></td>
	<th class="text" colspan="<%= gColSpan %>">Доступные права на филиалы:</th>
</tr>
<!---buttons and navigator end-->

        <!-- Table "listAnoveAccessForOperator"  body -->
        <logic:iterate id="it" name="<%=BeanKeys.OPERATOR_TO_REGION_ACCESS_LIST %>" indexId="index" type="RegionAccessTO">
            <logic:present name="it">
            <tr class="exclude" onMouseOver="className='select'" onMouseOut="className='exclude'">
			<% String regionId = String.valueOf(((RegionAccessTO)it).getVo().getRegionId()); %>
                <td class="text">
                      <bean:write name="it" property="vo.regionId" filter="true"/>
                </td>
                <td class="text">
                      <bean:write name="it" property="supRegName" filter="true"/>
                </td>
                <td class="text">
                      <bean:write name="it" property="regionName" filter="true"/>
                </td>
                <td class="text">
                  <html:checkbox property="viewPlan" onclick="if (!this.checked) document.all.item('EP1' + this.id.substr(3), 0).checked=false;" styleId='<%= "VP1" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="editPlan" onclick="if (this.checked) document.all.item('VP1' + this.id.substr(3), 0).checked=true;" styleId='<%= "EP1" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="viewFact" onclick="if (!this.checked) document.all.item('EF1' + this.id.substr(3), 0).checked=false;" styleId='<%= "VF1" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="editFact" onclick="if (this.checked) document.all.item('VF1' + this.id.substr(3), 0).checked=true;" styleId='<%= "EF1" + index  %>' name="it" value="<%= regionId %>"/> 
                </td>
                <td class="link">
                  <html:checkbox property="viewArenda" onclick="if (!this.checked) document.all.item('EA1' + this.id.substr(3), 0).checked=false;" styleId='<%= "VA1" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
                <td class="link">
                  <html:checkbox property="editArenda" onclick="if (this.checked) document.all.item('VA1' + this.id.substr(3), 0).checked=true;" styleId='<%= "EA1" + index  %>' name="it" value="<%= regionId %>"/>
                </td>
            </tr>
	        </logic:present>
        </logic:iterate>
		<!-- Table "listAnoveAccessForOperator"  body end-->

<!---buttons and navigator begin -->
<tr class="title">
	<td class="text">
		<INPUT TYPE="IMAGE" NAME="submit" SRC="<%=request.getContextPath()%>/images/save.gif"  ALT="Сохранить" onclick="operation.value='save';"></td>
	<th class="text" colspan="<%= gColSpan %>">&nbsp;</th>
</tr>
<!---buttons and navigator end-->
     
<!--underMenu begin : Phisicals > Operators > Operators roles > Region access -->
<tr class="title">
       <td class="title" colspan="<%= gColSpan %>">
           <%--html:link page="/ShowPeopleList.do" styleClass="navigator"><bean:message key="label.people"/></html:link> 
           <july:sepmark/>
           <html:link page="/ShowOperatorList.do" styleClass="navigator"><bean:message key="label.operators"/></html:link> 
           <july:sepmark/>
           <july:currmark><bean:message key="label.regions"/></july:currmark--%>
       </td>
</tr>
<!--underMenu end-->
        
</table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	//window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>