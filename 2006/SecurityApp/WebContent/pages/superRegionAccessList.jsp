<%@ page language = "java" %>
<%@ page import="org.apache.struts.util.*" %>
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
	<TITLE>Регионы для оператора</TITLE>
</HEAD>
<BODY class="content">
	<SCRIPT language=javascript src="<%=request.getContextPath()%>/common/dialog.js" type="text/javascript"></SCRIPT>
	<SCRIPT>
		function checkAll(select , objname) {
		    for (var i = 0; i < document.forms.length; i++) {
		        for (var j = 0; j < document.forms[i].elements.length; j++) {
		            if (document.forms[i].elements[j].name == objname) {
		                document.forms[i].elements[j].checked = select;
		            }
		        }
		    }
		}
		
		function selectCheckBoxes(type){
		    if(type.name == 'planReadAll'){
		        checkAll(type.checked , 'viewPlan');
				if (!type.checked) {
					checkAll(false , 'editPlan');
					document.all.item('planWriteAll', 0).checked = false;
				}
		    }
		    if(type.name == 'planWriteAll'){
		        checkAll(type.checked , 'editPlan');
				if (type.checked) {
					checkAll(true , 'viewPlan');
					document.all.item('planReadAll', 0).checked = true;
				}
		    }
		    if(type.name == 'factReadAll'){
		        checkAll(type.checked , 'viewFact');
				if (!type.checked) {
					checkAll(false , 'editFact');
					document.all.item('factWriteAll', 0).checked = false;
				}
		    }
		    if(type.name == 'factWriteAll'){
		        checkAll(type.checked , 'editFact');
				if (type.checked) {
					checkAll(true , 'viewFact');
					document.all.item('factReadAll', 0).checked = true;
				}
		    }
		}
	</SCRIPT>	 
<%
	String gColSpan = "6";
	SuperRegionAccessListForm listForm = (SuperRegionAccessListForm)request.getAttribute("SuperRegionAccessListForm");
	String sortBy = listForm.getOrderBy();	
%>
<H3 id='bread-crumb'>
	<html:link page="/peopleList.do">Физические лица</html:link> &gt;
	<html:link page="/operatorList.do" paramId="man" paramName="SuperRegionAccessListForm" paramProperty="operatorVO.man" paramScope="request">
		Операторы для: <I><bean:write name="SuperRegionAccessListForm" property="peopleVO.name"/></I></html:link>  &gt;
		Доступные регионы  &gt;
</H3><BR>

<html:form action="/superRegionAccessList.do" styleId="listForm">
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

<!--upperMenu begin : Phisicals > Operators > Operators roles > SuperRegion access -->
<tr class="title">
     <td class="text">
          <INPUT TYPE="IMAGE" NAME="submit" SRC="<%=request.getContextPath()%>/images/save.gif"  ALT="Сохранить" onclick="operation.value='save';"></td>
     <th class="text" colspan="<%= gColSpan %>">Текущие права на регион:</th>
</tr>
<!--upperMenu end-->

<!-- Table header  begin :-->
<tr class="title">
       <td  class="text" rowspan='2' nowrap="nowrap">
			<A title="Сортировать по полю 'Код'" href="javascript:SortBy('supRegionId')">Код</A><%=isUp(sortBy, "supRegionId")%></td>
       <td  class="text" rowspan='2' nowrap="nowrap">
			<A title="Сортировать по полю 'Регион'" href="javascript:SortBy('supregname')">Регион</A><%=isUp(sortBy, "supregname")%></td>
       <td  colspan='2' class="text">Плановые данные</td>
       <td  colspan='2' class="text">Фактические данные</td>
</tr>
<tr class="title">
       <td class="text">чтение<input type="checkbox" name='planReadAll' onclick="selectCheckBoxes(this);"></td>
       <td class="text">правка<input type="checkbox" name='planWriteAll' onclick="selectCheckBoxes(this);"></td>
       <td class="text">чтение<input type="checkbox" name='factReadAll' onclick="selectCheckBoxes(this);"></td>
       <td class="text">правка<input type="checkbox" name='factWriteAll' onclick="selectCheckBoxes(this);"></td>
</tr>
<!-- Table header  end :-->        


        <!-- Table body begin-->
        
        <logic:iterate id="it" name="<%=BeanKeys.OPERATOR_TO_SUPER_REGION_LIST %>" indexId="index"  type="SuperRegionAccessTO">
            <logic:present name="it">
            <% String supregId = String.valueOf(((SuperRegionAccessTO)it).getVo().getSupRegionId()); %>
            <tr class="include" onMouseOver="className='select'" onMouseOut="className='include'">
                <td class="text">
                    <bean:write name="it" property="vo.supRegionId" filter="true"/>
                </td>
                <td class="text">
                    <bean:write name="it" property="supRegName" filter="true"/>
                </td>
                <td class="text">
                	<html:checkbox property="viewPlan" onclick="if (!this.checked) document.all.item('EP' + this.id.substr(2), 0).checked=false;" name="it" value="<%= supregId %>" styleId='<%= "VP" + index  %>' />
                </td>
                <td class="text">
                  	<html:checkbox property="editPlan" onclick="if (this.checked) document.all.item('VP' + this.id.substr(2), 0).checked=true;" name="it" value="<%= supregId %>" styleId='<%= "EP" + index  %>' />
                </td>
                <td class="text">
                  	<html:checkbox property="viewFact" onclick="if (!this.checked) document.all.item('EF' + this.id.substr(2), 0).checked=false;" name="it" value="<%= supregId %>" styleId='<%= "VF" + index  %>' />
                </td>
                <td class="text">
                  	<html:checkbox property="editFact" onclick="if (this.checked) document.all.item('VF' + this.id.substr(2), 0).checked=true;" name="it" value="<%= supregId %>" styleId='<%= "EF" + index  %>' />
                </td>
            </tr>
            <july:separator colspan="<%= gColSpan %>" />
	    </logic:present>
        </logic:iterate>
        <!-- Table body end-->

<!---buttons and navigator begin -->
<tr class="title">
	<td class="text">
		<INPUT TYPE="IMAGE" NAME="submit" SRC="<%=request.getContextPath()%>/images/save.gif"  ALT="Сохранить" onclick="operation.value='save';"></td>
	<th class="text" colspan="<%= gColSpan %>">Доступные права на регион:</th>
</tr>
<!---buttons and navigator end-->
        
       <!-- Table "listAnoveAccessForOperator"  body -->
        <logic:iterate id="it" name="<%=BeanKeys.OPERATOR_TO_SUPER_REGION_ACCESS_LIST %>" indexId="index" type="SuperRegionAccessTO">
            <logic:present name="it">
            <tr class="exclude" onMouseOver="className='select'" onMouseOut="className='exclude'">
            <% String supregId = String.valueOf(((SuperRegionAccessTO)it).getVo().getSupRegionId()); %>
                <td class="text">
                    <bean:write name="it" property="vo.supRegionId" filter="true"/>
                </td>
                <td class="text">
                    <bean:write name="it" property="supRegName" filter="true"/>
                </td>
                <td class="text">
                  	<html:checkbox property="viewPlan" onclick="if (!this.checked) document.all.item('EP1' + this.id.substr(3), 0).checked=false;" styleId='<%= "VP1" + index  %>' name="it" value="<%= supregId %>"/>
                </td>
                <td class="link">
                  	<html:checkbox property="editPlan" onclick="if (this.checked) document.all.item('VP1' + this.id.substr(3), 0).checked=true;" styleId='<%= "EP1" + index  %>' name="it" value="<%= supregId %>"/>
                </td>
                <td class="link">
                  	<html:checkbox property="viewFact" onclick="if (!this.checked) document.all.item('EF1' + this.id.substr(3), 0).checked=false;" styleId='<%= "VF1" + index  %>' name="it" value="<%= supregId %>"/>
                </td>
                <td class="link">
                  	<html:checkbox property="editFact" onclick="if (this.checked) document.all.item('VF1' + this.id.substr(3), 0).checked=true;" styleId='<%= "EF1" + index  %>' name="it" value="<%= supregId %>"/> 
                </td>
            </tr>
	        </logic:present>
        </logic:iterate>
		<!-- Table "listAnoveAccessForOperator"  body end-->
        
</table>

</html:form>
<script language="javascript">
	//switchFilter();
	loadSelectedRow();
	//window.location.hash=document.all.selectedID.value;
</script>
</BODY>
</HTML>
