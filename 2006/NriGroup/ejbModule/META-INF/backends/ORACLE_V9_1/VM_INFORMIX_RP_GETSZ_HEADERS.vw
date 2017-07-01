<?xml version="1.0"?>

<View name="RP_GETSZ_HEADERS">
<Database>ejbModule/META-INF/backends/ORACLE_V9_1/VM.dbxmi</Database>
<Schema>ejbModule/META-INF/backends/ORACLE_V9_1/VM_INFORMIX.schxmi</Schema>
<StatementType>SelectStatement</StatementType>

<![CDATA[


-- Generated by Relational Schema Center on Fri May 23 16:08:46 MSD 2008 for Oracle9i


CREATE VIEW INFORMIX.RP_GETSZ_HEADERS
  (IDHEADER,
   NUMBER_SZ,
   DATE_SZ,
   TYPE_SZ,
   USETYPE,
   MAN,
   FIRSTNAME,
   LASTNAME,
   MIDDLENAME,
   BAN,
   DOCDATE,
   DOCNUMBER,
   DOCTYPE,
   EXECNAME,
   ORGEXECUTOR,
   MAINPOSITION,
   DCSID,
   GSMID,
   DAMPSID)
  AS SELECT 
   x0.IDHEADER, 
   x0.NUMBER_SZ, 
   x0.DATE_SZ, 
   x0.TYPE_SZ, 
   x0.USETYPE, 
   x0.MAN, 
   x0.FIRSTNAME, 
   x0.LASTNAME, 
   x0.MIDDLENAME, 
   x0.BAN, 
   x0.DOCDATE, 
   x0.DOCNUMBER, 
   x0.DOCTYPE, 
   x0.EXECNAME, 
   x0.ORGEXECUTOR, 
   x0.MAINPOSITION, 
   x1.DCSID, 
   x1.GSMID, 
   x1.DAMPSID
FROM
   INFORMIX.POSITIONS x1, INFORMIX.RP_GETSZ1 x0
WHERE
   x1.STORAGEPLACE = x0.MAINPOSITION ;
]]>
</View>