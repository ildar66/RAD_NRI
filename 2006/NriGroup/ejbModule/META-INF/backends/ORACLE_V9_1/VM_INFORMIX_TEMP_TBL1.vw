<?xml version="1.0"?>

<View name="TEMP_TBL1">
<Database>ejbModule/META-INF/backends/ORACLE_V9_1/VM.dbxmi</Database>
<Schema>ejbModule/META-INF/backends/ORACLE_V9_1/VM_INFORMIX.schxmi</Schema>
<StatementType>SelectStatement</StatementType>

<![CDATA[


-- Generated by Relational Schema Center on Fri May 23 16:08:45 MSD 2008 for Oracle9i


CREATE VIEW INFORMIX.TEMP_TBL1
  (INTTABNUM,
   VCHLASTNAME,
   VCHFIRSTNAME,
   VCHMIDDLENAME,
   VCHPOSITION,
   VCHTELW,
   VCHEMAIL,
   VCHFULLPATHNAME)
  AS SELECT 
   x0.INTTABNUM, 
   x0.VCHLASTNAME, 
   x0.VCHFIRSTNAME, 
   x0.VCHMIDDLENAME, 
   x0.VCHPOSITION, 
   x0.VCHTELW, 
   x0.VCHEMAIL, 
   x1.VCHFULLPATHNAME
FROM
   INFORMIX.TBLUSERS x0, INFORMIX.TBLDEPARTMENTS x1
WHERE
   x0.INTDEPARTMENTID = x1.INTDEPARTMENTID ;
]]>
</View>